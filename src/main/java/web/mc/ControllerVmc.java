package web.mc;

import com.mc.parser.VmcParser;
import com.mc.compare.CompareCart;
import com.mc.dao.enters.Enters;
import com.mc.dao.enters.EntersDaoImpl;
import com.mc.dao.vmc.Vmc;
import com.mc.dao.vmc.VmcDaoImpl;
import com.mc.dao.message.Message;
import com.mc.dao.orders.Order;
import com.mc.dao.orders.OrderDaoImpl;
import com.mc.select.Select;
import com.mc.shopcart.ShoppingCart;
import com.mc.shopcart.ShoppingCartItem;
import com.mc.wishlist.WishlistCart;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import javax.validation.Valid;
import org.springframework.http.HttpRequest;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
//@SessionAttributes({
//    "chDmg", "chMazak", "chHaas", "chSpiner", "x", "y", "z", 
//    "page_nomber"})
public class ControllerVmc  {

    
public static final int NOMBER_PRODUCTS_ON_PAGE = 10;

    @Autowired
    VmcDaoImpl vmcDaoImpl;
    
    @Autowired
    EntersDaoImpl entersDaoImpl;
    
    @Autowired
    OrderDaoImpl orderJDBCTemplate;
//    @Autowired
//    CompareCart compareCart ;
    
    
    @RequestMapping(value = "/login1" , method = RequestMethod.GET)
    public String userSorexInfo() {
     
        return "hmc/login1";
    }
    

    
   @RequestMapping(value = "/vmc{id}-{type}-{model}", method = RequestMethod.GET)
    public ModelAndView getSorexInfo(
            @PathVariable ("id") int id, 
            @PathVariable ("type") String type, 
            @PathVariable ("model") String model, 
            HttpSession session) {   
        
                     ModelAndView mv = new ModelAndView("hmc/one_vmc");
                 Vmc vmc = vmcDaoImpl.getVmc(id);
                printInFile("HMC exeption21.txt", vmc.toString());
                mv.addObject("vmc", vmc);
                
                 session.setAttribute("page", "vmc"+id+"-"+type+"-"+model);

        return mv;
    }
    
    

           @RequestMapping(value = "/cnc-milling-machine" , method = RequestMethod.GET)
           public ModelAndView mc(  
                    @RequestParam(value = "dmg",   defaultValue = "0") int dmg, 
                    @RequestParam(value = "brends",   defaultValue = "0") String brends, // new
                    @RequestParam(value = "moriseiki",   defaultValue = "0") int moriseiki, 
                    @RequestParam(value = "mazak", defaultValue = "0") int mazak,
                    @RequestParam(value = "grob", defaultValue = "0") int grob,
                    @RequestParam(value = "haas",  defaultValue = "0") int haas,
                    @RequestParam(value = "spiner",defaultValue = "0") int spiner,
//                @RequestParam(value = "checkboxUsa",   defaultValue = "0") int chUsa, 
//                @RequestParam(value = "checkboxGermany",   defaultValue = "0") int chGermany     
                @RequestParam(value = "x",   defaultValue = "n") String x,    
                @RequestParam(value = "y",   defaultValue = "n") String y,   
                @RequestParam(value = "z",   defaultValue = "n") String z  ,
                @RequestParam(value = "page",   defaultValue = "1") int page  ,
                HttpSession session  
//            ,ModelAndView mv
                )  {
    Select select = new Select();
     select.setChDmg(dmg);
     select.setChMoriseiki(moriseiki);
     select.setChHaas(haas);
     select.setGrob(grob);
     select.setChMazak(mazak);
     select.setChSpiner(spiner);
     select.setX(x);
     select.setY(y);
     select.setZ(z);
     
 ModelAndView mv = new ModelAndView("hmc/all_vmc");
//     mv.setViewName("hmc/all_vmc");
         List <Vmc> listVmc= vmcDaoImpl.listVmc(select, page);
        mv.addObject("listProduct", listVmc); // 
      
        mv.addObject("kol_vo_page", vmcDaoImpl.getKol_vo_page_itogo());
        mv.addObject("kol_vo_prod", vmcDaoImpl.getKol_vo_product());
        mv.addObject("kol_vo_on_page", vmcDaoImpl.getNOMBER_PRODUCTS_ON_PAGE());
        mv.addObject("page_nomber", page);
        
        
        mv.addObject("dmg", dmg);
        mv.addObject("moriseiki", moriseiki);
        mv.addObject("grob", grob);
        mv.addObject("haas", haas);
        mv.addObject("mazak", mazak);
        mv.addObject("spiner", spiner);
        mv.addObject("x", x);
        mv.addObject("y", y);
        mv.addObject("z", z);

               printInFile("firm", brends);
        
session.setAttribute("page", "cnc-milling-machine?dmg="+dmg+"&moriseiki="+moriseiki+"&grob="+grob+"&mazak="+mazak+
        "&haas="+haas+"&spiner="+spiner+"&x="+x+"&y="+y+"&z="+z+"&page="+page);
     
//        session.setAttribute("page_nomber", 1);

//   http://localhost:8084/vmc-cnc-programmer-test/cnc-milling-machine?dmg=1&haas=1&page=2
    
     return mv;

 
    }

    
 
         @RequestMapping(value = "/searchmvc", method = RequestMethod.GET)
    public ModelAndView vmc_select( 
//                 @RequestParam(value = "page") String page,
                    @RequestParam(value = "search") String search,
            HttpSession session
    ) {
     
        ModelAndView mv = new ModelAndView ("hmc/all_vmc");

       
     List <Vmc> listVmc = vmcDaoImpl.getListFromSearch(search);
      mv.addObject("listProduct", listVmc);
      
      session.setAttribute("page", "searchmvc?search="+search);
     
     return mv ;
    } 
     
    
    
    //-------------   Contact    ------

           @RequestMapping(value = "/contact", method = RequestMethod.GET)
     public ModelAndView contact (HttpSession session) {
       ModelAndView mv = new ModelAndView("hmc/contact"); 
       mv.addObject("message", new Message());
       session.setAttribute("page", "contact");
       return mv;  
    }  
    
     
     //Send message from Contact 
           @RequestMapping(value = "/contact", method = RequestMethod.POST)
    public ModelAndView contactPOST (@Valid @ModelAttribute ("message") Message message, 
                                     BindingResult result, HttpSession session ) {
    ModelAndView mv = new ModelAndView("hmc/contact"); 
       
      if(result.hasErrors()){
    mv = new ModelAndView("hmc/contact");
    mv.addObject("message", message);
    return mv;             
    }  
       
       orderJDBCTemplate.addOrderFromContact(message);
                  
       mv.addObject("messageItogo", "Your message has sent! Thank you!");
        mv.addObject("message", new Message());
       session.setAttribute("page", "contact");
       return mv;  
    }  
    
  //-------------  End : Contact    ------
    


   
    
    
    
    // Print in File
     protected void printInFile(String fileName, String str){    // For Check 
            
         File file = new File("d:\\2\\"+fileName);
         
//            File file = new File("HMC exeption2.txt");
        try {
        	FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write("-------> "+new Date()+"): \n");
            fileWriter.write(str + "\n\n");
        } catch (IOException ex) {
//            Logger.getLogger(ControllerMachine.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        } 
    
    
}
