/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.add;

import com.mc.compare.CompareCart;
import com.mc.dao.vmc.Vmc;
import com.mc.dao.vmc.VmcDaoImpl;
import web.mc.PrintInFile;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Admin
 */
@Controller
public class ConlrollerCompare extends PrintInFile{
  
    @Autowired
    VmcDaoImpl vmcJDBCTemplate;
    
    /// ------------ Compare : Start ----------------- 
    
                    @RequestMapping(value = "/compare", method = RequestMethod.GET)
    public ModelAndView compare(HttpSession session) {
       ModelAndView mv = new ModelAndView("hmc/compare");
        
       CompareCart compareCart = (CompareCart) session.getAttribute("compareCart");
       if (compareCart==null)  compareCart = new CompareCart();
  
       mv.addObject("compareCart", compareCart);
//        printInFile("add-product-to-compare-list", compareCart.getItems().get(1).toString());
       session.setAttribute("page", "compare");
       return mv; 
    }
        
        
        @RequestMapping("/add-product-to-compare-list")
    public String addProductToCompareList(  @RequestParam(value = "id") int id, HttpSession session ) {
//            @RequestParam(value = "page") Integer page,           
  CompareCart compareCart = (CompareCart) session.getAttribute("compareCart");
 if (compareCart==null)  compareCart = new CompareCart();
   
 Vmc vmc =   vmcJDBCTemplate.getVmc(id);
    compareCart.addItem(vmc);
    session.setAttribute("compareCart", compareCart);  
    
    // check
//            printInFile("add-product-to-compare-list", (String)session.getAttribute("page"));
//            printInFile("add-product-to-compare-list", vmc.toString());
    
     String page = "index";
           try {
          page =  (String)session.getAttribute("page");              
           } catch (Exception e) {
              page = "index";
           }
      return "redirect:/"+page;   

    }

    
    

    
    
    
                @RequestMapping(value = "/comparedel-{id}", method = RequestMethod.GET)
    public String delfromcompare(@PathVariable("id") int id, HttpSession session) {
//       ModelAndView mv = new ModelAndView("hmc/compare");
    
              CompareCart compareCart = (CompareCart) session.getAttribute("compareCart");
       if (compareCart==null)  compareCart = new CompareCart();
       Vmc hmc =   vmcJDBCTemplate.getVmc(id);
       compareCart.update(hmc, "0"); // delete from compare
       session.setAttribute("compareCart", compareCart);
       
        return "redirect:/compare.htm";  
    }
    
    
}
