package wood.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.web.filter.CharacterEncodingFilter;


@Configuration
@EnableWebSecurity
public class WoodSecurityConfig extends WebSecurityConfigurerAdapter {

	
	@Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("bill").password("123").roles("USER");
        auth.inMemoryAuthentication().withUser("admin").password("123").roles("ADMIN");
        auth.inMemoryAuthentication().withUser("dba").password("123").roles("ADMIN","DBA");//dba have two roles.
    }
     
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	//For russian charset
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        filter.setForceEncoding(true);
        http.addFilterBefore(filter,CsrfFilter.class);

      http.authorizeRequests()
        .antMatchers("/upload", "/uploadFile", "/", "/loginPage").permitAll() 
        .antMatchers("/manage/**").access("hasRole('ADMIN')")
        .antMatchers("/db/**").access("hasRole('ADMIN') and hasRole('DBA')")
        .and().formLogin()
        	.loginPage("/loginPage")
			.defaultSuccessUrl("/manage")
			.failureUrl("/loginPage?error")
			.usernameParameter("username").passwordParameter("password")				
			.and()
			.logout().logoutSuccessUrl("/loginPage?logout")
        .and()
        	.exceptionHandling().accessDeniedPage("/500");
  
    }
}
