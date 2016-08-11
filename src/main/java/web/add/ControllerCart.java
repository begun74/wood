/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.add;

import com.mc.dao.vmc.Vmc;
import com.mc.dao.vmc.VmcDaoImpl;
import com.mc.dao.orders.Order;
import com.mc.dao.orders.OrderDaoImpl;
import com.mc.shopcart.Product;
import com.mc.shopcart.ShoppingCart;
import com.mc.shopcart.ShoppingCartItem;
import web.mc.PrintInFile;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.ui.Model;




@Controller
public class ControllerCart extends PrintInFile{
  
    
    @Autowired
    VmcDaoImpl vmcJDBCTemplate;
    
    @Autowired
    OrderDaoImpl orderJDBCTemplate;
    
    /// ------------   Basket : Start  ---------------  
    
        @RequestMapping(value = "/basket", method = RequestMethod.GET)
    public String cart(HttpSession session) {
        
        ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
        if (cart==null)  cart = new ShoppingCart();
        cart.calculateTotal("0"); // GDP (for example)
         session.setAttribute("cart", cart); 
         session.setAttribute("page", "basket"); //
 
       return "hmc/cart"; 
    }  
    

      @RequestMapping(value = "/add-product-to-customer-basket",  method = RequestMethod.GET)
    public String addProductToShoppingCart( 
            
//            @ModelAttribute ("vmc") Vmc vmc,
            @RequestParam(value = "id") int id, HttpSession session
//            , ModelAndView model
//            @ModelAttribute ("listProduct") List<Vmc> listProduct
            ){
        
//      Map<String, Object> map =   model.getModel();
//      
//     Vmc vmc =  (Vmc) map.get("vmc");
//        
////         Vmc vmc = (Vmc) model.asMap().get("vmc");
////         Vmc vmc = (Vmc) model.
//        printInFile("listProduct", vmc.toString());
        
        ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
        if (cart==null)  cart = new ShoppingCart();
                
        Product product =   vmcJDBCTemplate.getVmc(id);
        cart.addItem(product);
        session.setAttribute("cart", cart); 

    String page;
           try {
          page =  (String)session.getAttribute("page");              
           } catch (Exception e) {
          page = "index";
           }
      return "redirect:/"+page; 
        
    }
 
//       @RequestMapping(value = "/add-product-to-customer-basket",  method = RequestMethod.POST)
//    public String addProductToShoppingCartPOST( 
//            
//            @ModelAttribute ("vmc") Vmc vmc,
////            @RequestParam(value = "id") int id, 
//            HttpSession session, ModelAndView model
////            @ModelAttribute ("listProduct") List<Vmc> listProduct
//            ){
//        
//        
////         Vmc vmc = (Vmc) model.asMap().get("vmc");
////         Vmc vmc = (Vmc) model.
//        printInFile("listProduct", vmc.toString());
//        
//        ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
//        if (cart==null)  cart = new ShoppingCart();
//                
////        Product product =   vmcJDBCTemplate.getVmc(id);
//        cart.addItem(vmc);
//        session.setAttribute("cart", cart); 
//
//    String page = "index";
//           try {
//          page =  (String)session.getAttribute("page");              
//           } catch (Exception e) {
//          page = "index";
//           }
//      return "redirect:/"+page; 
//        
//    }
    
 
     @RequestMapping(value = "/del-from-basket", method = RequestMethod.GET)
    public String del_from_basket1(@RequestParam("id") int id, HttpSession session) {

         ShoppingCart shoppingCart = (ShoppingCart) session.getAttribute("cart");
       if (shoppingCart==null)  shoppingCart = new ShoppingCart();
       Vmc hmc =   vmcJDBCTemplate.getVmc(id);
       shoppingCart.update(hmc, "0"); // delete from compare
       session.setAttribute("cart", shoppingCart);
   
    String page= "index";
         try { 
             page = (String) session.getAttribute("page"); 
         } catch (Exception e) {
             page= "index";
         }
        return "redirect:/"+page;  
    }
    

    
    	@RequestMapping(value = "/updatequantity", method = RequestMethod.GET)
	public String Minus(  @RequestParam(value = "id") int id, 
                @RequestParam(value = "quantity") int quantity, HttpSession session ) {

         ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
        if (cart==null)  cart = new ShoppingCart();
        Vmc hmc = vmcJDBCTemplate.getVmc(id);
        cart.update(hmc, ""+quantity); // We do less on 1 position

         session.setAttribute("cart", cart);
	return "redirect:basket.htm";
	}
    

    /// ------------  </ Basket  :End > ---------------   
    
          
    // -------- ---------  checkout : start ------------- -----------
    
        @RequestMapping(value = "/checkout", method = RequestMethod.GET)
    public ModelAndView checkout(HttpSession session) {
        
        ModelAndView mv = new ModelAndView("hmc/checkout");
        
        ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
        if (cart==null)  cart = new ShoppingCart();
        cart.calculateTotal("0"); // GDP (for example)
         session.setAttribute("cart", cart); 
//         Order order = new Order();
//         order.setFirstname("Dimitry");
        
         mv.addObject("order", new Order()); 
  
         session.setAttribute("page", "checkout");
        
       return mv; 
    }  
    
    
        @RequestMapping(value = "/checkout", method = RequestMethod.POST)
    public ModelAndView checkoutPOST(@Valid @ModelAttribute ("order") Order order, 
            BindingResult result,
            HttpSession session) {
       
         ModelAndView mv = new ModelAndView("hmc/checkoutfinish");
        
           if(result.hasErrors()){
             mv = new ModelAndView("hmc/checkout");
             mv.addObject("order", order);
//           List<TypeStanina> listTypeStanina= typeStaninaDAO.listTypeStanina();
//           mv.addObject("listTypeStanina", listTypeStanina);
             return mv;             
             }  
      
        ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
        if (cart==null)  cart = new ShoppingCart();
//        cart.calculateTotal("0"); // GDP (for example)
//        orderJDBCTemplate
//         session.setAttribute("cart", cart); 
        order.setDatatime("2015-06-02");
        order.setStatus("in");
        
      List <ShoppingCartItem> list =   cart.getItems();
  String query ="";    
      for(ShoppingCartItem ttt: list){
          query += ttt.getProduct().getProductid();
          query += "<br>->" + ttt.getProduct().getModel();
          query += "<br>->" + ttt.getProduct().getCountry();
          query += "<br>";
      }
        
        order.setRequest(query);
        
            printInFile("order 11", order.toString());
        
  orderJDBCTemplate.addOrder(order);
  cart = null;
   session.setAttribute("cart", cart);
         session.setAttribute("page", "checkout");
        
       return mv; 
    }  
    
    
    
    // -------- ---------  checkout : end ------------- -----------
      
        
        
}
