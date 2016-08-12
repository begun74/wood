package wood.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class WoodSecurityConfig extends WebSecurityConfigurerAdapter {

	
	@Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("bill").password("abc123").roles("USER");
        auth.inMemoryAuthentication().withUser("admin").password("root123").roles("ADMIN");
        auth.inMemoryAuthentication().withUser("dba").password("root123").roles("ADMIN","DBA");//dba have two roles.
    }
     
    @Override
    protected void configure(HttpSecurity http) throws Exception {
  
      http.authorizeRequests()
        .antMatchers("/", "/loginPage").permitAll() 
        .antMatchers("/admin/**").access("hasRole('ADMIN')")
        .antMatchers("/db/**").access("hasRole('ADMIN') and hasRole('DBA')")
        .and().formLogin()
        	.loginPage("/loginPage")
			.defaultSuccessUrl("/")
			.failureUrl("/loginPage?error")
			.usernameParameter("username").passwordParameter("password")				
			.and()
			.logout().logoutSuccessUrl("/loginPage?logout")
        .and()
        	.exceptionHandling().accessDeniedPage("/Access_Denied");
  
    }
}
