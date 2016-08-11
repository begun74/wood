/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.add;

import com.mc.dao.vmc.Vmc;
import com.mc.dao.vmc.VmcDaoImpl;
import com.mc.wishlist.WishlistCart;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Admin
 */
@Controller
public class ControllerWishList {
    
    @Autowired
    VmcDaoImpl vmcJDBCTemplate;
    
     
     
    //         --------------   Wish list  ---------------
                    @RequestMapping(value = "/wishlist", method = RequestMethod.GET)
    public ModelAndView wishlist(HttpSession session) {
       ModelAndView mv = new ModelAndView("hmc/wishlist");
        
       WishlistCart wishlistCart = (WishlistCart) session.getAttribute("wishlistCart");
       if (wishlistCart==null)  wishlistCart = new WishlistCart();

       mv.addObject("wishlistCart", wishlistCart);
       session.setAttribute("page", "wishlist");
       return mv; 
    }
   

    
           @RequestMapping("/add-product-to-wish-list")
    public String addProductToWishList( @RequestParam(value = "id") int id, HttpSession session ) {
    
  WishlistCart wishlistCart = (WishlistCart) session.getAttribute("wishlistCart");
 if (wishlistCart==null)  wishlistCart = new WishlistCart();
   
  Vmc vmc =   vmcJDBCTemplate.getVmc(id);
  wishlistCart.addItem(vmc);
  session.setAttribute("wishlistCart", wishlistCart);
         
  String page ;
           try {
          page =  (String)session.getAttribute("page");              
           } catch (Exception e) {
               page = "index";
           }
      return "redirect:/"+page;   
    } 


    
       @RequestMapping(value = "/del-from-wishlist", method = RequestMethod.GET)
    public String wishlist(@RequestParam (value = "id") int id,  HttpSession session) {
       WishlistCart wishlistCart = (WishlistCart) session.getAttribute("wishlistCart");
       if (wishlistCart==null)  wishlistCart = new WishlistCart();
       Vmc hmc =   vmcJDBCTemplate.getVmc(id);
       wishlistCart.update(hmc, "0"); // delete from compare
       session.setAttribute("wishlistCart", wishlistCart);

       String page ;
           try {
          page =  (String)session.getAttribute("page");              
           } catch (Exception e) {
               page = "index";
           }
       return "redirect:/"+page;  
    }  
    
    
     
    
}
