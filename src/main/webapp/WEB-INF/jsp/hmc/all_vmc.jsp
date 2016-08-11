<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <!-- Meta -->
        <meta charset="utf-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
        <meta name="description" content="Here you can find wide rage of models of CNC milling machines for the best prices.">
        <meta name="author" content="">
        <meta name="keywords" content="Deckel mano, mori seiki, haas, cnc machines for sale, horizontal milling machine for sale, buy cnc machine, vertical milling machine for sale, cnc machine price, cnc machine cost, buy cnc machine, cnc machining center for sale ">
        <meta name="robots" content="all">

        <title>CNC milling machine catalog | VMC & HMC</title>

        <!-- Bootstrap Core CSS -->
        <link rel="stylesheet" href="resources/assets/css/bootstrap.min.css">
        
        <!-- Customizable CSS -->
        <link rel="stylesheet" href="resources/assets/css/main.css">
        <link rel="stylesheet" href="resources/assets/css/green.css">
        <link rel="stylesheet" href="resources/assets/css/owl.carousel.css">
        <link rel="stylesheet" href="resources/assets/css/owl.transitions.css">
        <link rel="stylesheet" href="resources/assets/css/animate.min.css">

        <!-- Demo Purpose Only. Should be removed in production -->
        <link rel="stylesheet" href="resources/assets/css/config.css">

        <link href="resources/assets/css/green.css" rel="alternate stylesheet" title="Green color">
        <link href="resources/assets/css/blue.css" rel="alternate stylesheet" title="Blue color">
        <link href="resources/assets/css/red.css" rel="alternate stylesheet" title="Red color">
        <link href="resources/assets/css/orange.css" rel="alternate stylesheet" title="Orange color">
        <link href="resources/assets/css/navy.css" rel="alternate stylesheet" title="Navy color">
        <link href="resources/assets/css/dark-green.css" rel="alternate stylesheet" title="Darkgreen color">
        <!-- Demo Purpose Only. Should be removed in production : END -->

        <!-- Fonts -->
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800' rel='stylesheet' type='text/css'>
        
        <!-- Icons/Glyphs -->
        <link rel="stylesheet" href="resources/assets/css/font-awesome.min.css">
        
        <!-- Favicon -->
        <link rel="shortcut icon" href="resources/assets/images/favicon.ico">

        <!-- HTML5 elements and media queries Support for IE8 : HTML5 shim and Respond.js -->
        <!--[if lt IE 9]>
            <script src="assets/js/html5shiv.js"></script>
            <script src="assets/js/respond.min.js"></script>
        <![endif]-->


    </head>
    
    
    
    
<body>

    
    <div class="wrapper">

        
<!-- ============================================================= TOP NAVIGATION ============================================================= -->

<%@include file="in/nav.jsp" %>        
 <!--============================================================= TOP NAVIGATION : END =============================================================         ============================================================= HEADER =============================================================--> 
<%@include file="in/header.jsp" %>


<!-- ============================================================= HEADER : END ============================================================= --><div class="animate-dropdown"><!-- ========================================= BREADCRUMB ========================================= -->

    
    <div id="top-mega-nav">
    <div class="container">
        <nav>
            <ul class="inline">
<!--                <li class="dropdown le-dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <i class="fa fa-list"></i> shop by department
                    </a>
                    
                    <ul class="dropdown-menu">
                        <li><a href="vmc.htm">Vertical machine centers</a></li>
                        <li><a href="#">Horizontal machine centers</a></li>
                        <li><a href="lathe.htm">Lathe CNC</a></li>

                    </ul>
                </li>-->
<%@include file="in/dropdown_le_dropdown.jsp" %>

              <li class="breadcrumb-nav-holder"> 
                   <ul>
   <!--                       <li class="dropdown breadcrumb-item">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">laptops &amp; computers </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="#">PDA</a>
                                    <a href="#">accesories</a>
                                    <a href="#">tablets</a>
                                    <a href="#">games</a>
                                    <a href="#">consoles</a>
                                </li>
                            </ul>
                        </li> 
                        /.breadcrumb-item 

                        <li class="dropdown breadcrumb-item">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Desktop PC </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="#">PDA</a>
                                    <a href="#">accesories</a>
                                    <a href="#">tablets</a>
                                    <a href="#">games</a>
                                    <a href="#">consoles</a>
                                </li>
                            </ul>
                        </li> 
                        /.breadcrumb-item 

-->                        <li class="breadcrumb-item">
                            <a href="index">Home</a>
                        </li> 
                        <!--/.breadcrumb-item--> 

                        <li class="breadcrumb-item current">
                            <a href="#">Vertical machining centers</a>
                        </li> 
                        <!--/.breadcrumb-item--> 
                    </ul>
                </li> 
                <!--/.breadcrumb-nav-holder--> 

            </ul> 
            <!--/.inline--> 
        </nav>

    </div> 
        <!--/.container--> 
</div> 
    <!--/#top-mega-nav--> 






<!-- ========================================= BREADCRUMB : END ========================================= --></div>     <section id="category-grid">
    <div class="container">
     
        <!-- ========================================= SIDEBAR ========================================= -->
        <div class="col-xs-12 col-sm-3 no-margin sidebar narrow">

            <!-- ========================================= PRODUCT FILTER ========================================= -->
<div class="widget">
    <h1>Product Filters</h1>
    
    <form action="cnc-milling-machine" method="GET">
         <!--<input type="hidden" name="page" value="allmachine">-->
        
    <div class="body bordered">
        <div class="category-filter">
            <h2>Brands</h2>
            <hr>
            <ul>
                <!--<li><input checked="checked" class="le-checkbox" type="checkbox"  /> <label>Deckel Maho</label> <span class="pull-right">(2)</span></li>-->
   <li><input class="le-checkbox" type="checkbox"  name = "brends"   value="dmg" /> <label>DECKEL MAHO</label> </li>              
   <li><input class="le-checkbox" type="checkbox"  name = "brends"   value="mory" /> <label>Mory</label> </li>              
   <li><input class="le-checkbox" type="checkbox"  name = "brends"   value="haas" /> <label>Haas</label> </li>              
            <c:choose>
                <c:when test="${dmg==1}">
                  <li><input checked="checked" class="le-checkbox" type="checkbox"  name = 'dmg'   value='1' /> <label>DECKEL MAHO</label> </li>
                </c:when>
                <c:otherwise>
                     <li><input  class="le-checkbox" type="checkbox"  name = 'dmg'   value='1' /> <label>DECKEL MAHO</label> </li>
                </c:otherwise>
            </c:choose>
                <c:choose>
                    <c:when test="${moriseiki==1}">
                      <li><input checked="checked" class="le-checkbox" type="checkbox"  name = 'moriseiki'   value='1' /> <label>MORI SEIKI</label> </li>
                    </c:when>
                    <c:otherwise>
                         <li><input  class="le-checkbox" type="checkbox"  name = 'moriseiki'   value='1' /> <label>MORI SEIKI</label> </li>
                    </c:otherwise>
                </c:choose>
<!--                     
                    <c:choose>
                        <c:when test="${mazak==1}">
                          <li><input checked="checked"  class="le-checkbox" type="checkbox"  name = 'mazak' value='1' /> <label>Mazak</label> </li>
                        </c:when>
                        <c:otherwise>
                             <li><input  class="le-checkbox" type="checkbox"  name = 'mazak' value='1' /> <label>Mazak</label> </li>
                        </c:otherwise>
                    </c:choose>
-->
                             <c:choose>
                                <c:when test="${grob==1}">
                                  <li><input checked="checked"  class="le-checkbox" type="checkbox"  name = 'grob'  value='1' /> <label>GROB</label></li>
                                </c:when>
                                <c:otherwise>
                                    <li><input  class="le-checkbox" type="checkbox"  name = 'grob'  value='1' /> <label>GROB</label></li>
                                </c:otherwise>
                            </c:choose>
             <c:choose>
                <c:when test="${haas==1}">
                  <li><input checked="checked"  class="le-checkbox" type="checkbox"  name = 'haas'  value='1' /> <label>HAAS</label></li>
                </c:when>
                <c:otherwise>
                    <li><input  class="le-checkbox" type="checkbox"  name = 'haas'  value='1' /> <label>HAAS</label></li>
                </c:otherwise>
            </c:choose>
<!--                                    
                                             <c:choose>
                                                <c:when test="${spiner==1}">
                                                  <li><input checked="checked"  class="le-checkbox" type="checkbox"  name = 'spiner' value='1'/> <label>Spinner</label> </li>
                                                </c:when>
                                                <c:otherwise>
                                                    <li><input  class="le-checkbox" type="checkbox"  name = 'spiner' value='1'/> <label>Spinner</label> </li>
                                                </c:otherwise>
                                            </c:choose>
                     -->
                     
                <!--<li><input  class="le-checkbox" type="checkbox"  name = 'checkboxdmg'   value='1' /> <label>Deckel Maho</label> </li>-->
<!--                <li><input  class="le-checkbox" type="checkbox"  name = 'checkboxmazak' value='1' /> <label>Mazak</label> </li>
                <li><input  class="le-checkbox" type="checkbox"  name = 'checkboxhaas'  value='1' /> <label>HAAS</label></li>
                <li><input  class="le-checkbox" type="checkbox"  name = 'checkboxspiner' value='1'/> <label>Spiner</label> </li>-->
            </ul>
        </div><!-- /.category-filter -->
        
      
        
<!--        <div class="category-filter">
            <h2>Condition</h2>
            <hr>
            <ul>
                <li><input checked="checked" class="le-checkbox" type="checkbox"  /> <label>New</label> <span class="pull-right">(2)</span></li>
                <li><input  class="le-checkbox" type="checkbox" /> <label>Used</label> <span class="pull-right">(8)</span></li>
                <li><input  class="le-checkbox" type="checkbox" /> <label>Exebition</label> <span class="pull-right">(1)</span></li>
              
            </ul>
        </div> /.category-filter 
-->        
        
<!--        <div class="category-filter">
            <h2>Location</h2>
            <hr>
            <ul>
            <c:choose>
                <c:when test="${chUsa==1}">
                  <li><input checked="checked" class="le-checkbox" type="checkbox"  name = 'checkboxUsa'   value='1' /> <label>USA</label> </li>
                </c:when>
                <c:otherwise>
                     <li><input  class="le-checkbox" type="checkbox"  name = 'checkboxUsa'   value='1' /> <label>USA</label> </li>
                </c:otherwise>
            </c:choose>        
                    <c:choose>
                        <c:when test="${chGermany==1}">
                          <li><input checked="checked" class="le-checkbox" type="checkbox"  name = 'checkboxGermany'   value='1' /> <label>Germany</label> </li>
                        </c:when>
                        <c:otherwise>
                             <li><input  class="le-checkbox" type="checkbox"  name = 'checkboxGermany'   value='1' /> <label>Germany</label> </li>
                        </c:otherwise>
                    </c:choose>        
                
                
                <li><input checked="checked" class="le-checkbox" type="checkbox"  /> <label>Germany</label> <span class="pull-right">(2)</span></li>
                <li><input  checked="checked"  class="le-checkbox" type="checkbox" /> <label>USA</label> <span class="pull-right">(8)</span></li>
                <li><input  class="le-checkbox" type="checkbox" /> <label>Russia</label> <span class="pull-right">(1)</span></li>
                <li><input  class="le-checkbox" type="checkbox" /> <label>Poland</label> <span class="pull-right">(1)</span></li>
              
            </ul>
        </div> -->



<!--/.category-filter--> 
<!--
        
        <div class="price-filter">
            <h2>Премещение по Х</h2>
            <hr>
            <div class="price-range-holder">

                <input type="text" class="price-slider" value="" >

                <span class="min-max">
                    Year: 500 - 1600
                </span>
            </div>
        </div> /.price-filter 
                            <div class="price-filter">
                                <h2>Премещение по Y</h2>
                                <hr>
                                <div class="price-range-holder">

                                    <input type="text" class="price-slider" value="" >

                                    <span class="min-max">
                                        Year: 300 - 1000
                                    </span>
                                </div>
                            </div> /.price-filter 



-->
                        <div class="price-filter">
                            <h2>Travel X </h2>
                            <hr>
                             <div id="item-count" class="le-select">
                               <%--<form:select path="c


-->
                        <div class="price-filter">ountry" items="${listTravelX}" />--%>

                                 
 <select name="x">  
          <option disabled>Select X</option>  
    
     <c:choose>
        <c:when test="${x=='n'}">
          <option selected value="n">Not important</option>  
        </c:when>
        <c:otherwise>
             <option  value="n">Not important</option> 
        </c:otherwise>
    </c:choose>   
             
            <c:choose>
                <c:when test="${x=='xmotion<500'}">
                  <option selected value="xmotion<500" >...500 mm</option>  
                </c:when>
                <c:otherwise>
                     <option  value="xmotion<500" >...500 mm</option> 
                </c:otherwise>
            </c:choose>   
                     
                <c:choose>
                    <c:when test="${x=='xmotion between 500 and 600'}">
                      <option selected value="xmotion between 500 and 600" >500...600 mm</option>  
                    </c:when>
                    <c:otherwise>
                         <option  value="xmotion between 500 and 600" >500...600 mm</option> 
                    </c:otherwise>
                </c:choose>   
                         
                    <c:choose>
                        <c:when test="${x=='xmotion between 600 and 700'}">
                          <option selected value="xmotion between 600 and 700" >600...700 mm</option>  
                        </c:when>
                        <c:otherwise>
                             <option  value="xmotion between 600 and 700" >600...700 mm</option> 
                        </c:otherwise>
                    </c:choose>  
                             
                    <c:choose>
                        <c:when test="${x=='xmotion between 700 and 800'}">
                          <option selected value="xmotion between 700 and 800" >700...800 mm</option>  
                        </c:when>
                        <c:otherwise>
                             <option  value="xmotion between 700 and 800" >700...800 mm</option> 
                        </c:otherwise>
                    </c:choose>   

                        <c:choose>
                            <c:when test="${x=='xmotion between 800 and 1000'}">
                              <option selected value="xmotion between 800 and 1000">800...1000 mm</option>  
                            </c:when>
                            <c:otherwise>
                                 <option  value="xmotion between 800 and 1000">800...1000 mm</option> 
                            </c:otherwise>
                        </c:choose> 
                                 
                                <c:choose>
                                    <c:when test="${x=='xmotion between 1000 and 1200'}">
                                      <option selected value="xmotion between 1000 and 1200">1000...1200 mm</option>  
                                    </c:when>
                                    <c:otherwise>
                                         <option  value="xmotion between 1000 and 1200">1000...1200 mm</option> 
                                    </c:otherwise>
                                </c:choose> 

                                        <c:choose>
                                            <c:when test="${x=='xmotion between 1200 and 1500'}">
                                              <option selected value="xmotion between 1200 and 1500">1200...1500 mm</option>  
                                            </c:when>
                                            <c:otherwise>
                                                 <option  value="xmotion between 1200 and 1500">1200...1500 mm</option> 
                                            </c:otherwise>
                                        </c:choose> 
                                                                                 
                                <c:choose>
                                    <c:when test="${x=='xmotion between 1500 and 2000'}">
                                      <option selected value="xmotion between 1500 and 2000">1500...2000 mm</option>  
                                    </c:when>
                                    <c:otherwise>
                                         <option  value="xmotion between 1500 and 2000">1500...2000 mm</option> 
                                    </c:otherwise>
                                </c:choose> 

                                        <c:choose>
                                            <c:when test="${x=='xmotion>2000'}">
                                              <option selected value="xmotion>2000">2000 and more mm</option>  
                                            </c:when>
                                            <c:otherwise>
                                                 <option  value="xmotion>2000">2000 and more mm</option> 
                                            </c:otherwise>
                                        </c:choose> 

                                </select>
                            </div>
                        </div> 
                                     
<div class="price-filter">
    <h2>Travel Y</h2>
    <hr>
     <div id="item-count" class="le-select">
        <select name="y">  
            <option disabled>Select Y</option>                                              
 <c:choose>
    <c:when test="${y=='n'}">
      <option selected value="n">Not important</option>  
    </c:when>
    <c:otherwise>
         <option  value="n">Not important</option> 
    </c:otherwise>
</c:choose>  

         <c:choose>
            <c:when test="${y=='ymotion <300'}">
              <option selected value="ymotion <300"> < 300 mm</option>  
            </c:when>
            <c:otherwise>
                 <option  value="ymotion <300"> < 300 mm </option> 
            </c:otherwise>
        </c:choose>  
                                             
                <c:choose>
                    <c:when test="${y=='ymotion between 300 and 400'}">
                      <option selected value="ymotion between 300 and 400" >300...400 mm</option>  
                    </c:when>
                    <c:otherwise>
                         <option  value="ymotion between 300 and 400" >300...400 mm</option> 
                    </c:otherwise>
                </c:choose>  
                         
                <c:choose>
                    <c:when test="${y=='ymotion between 400 and 500'}">
                      <option selected value="ymotion between 400 and 500" >400...500 mm</option>  
                    </c:when>
                    <c:otherwise>
                         <option  value="ymotion between 400 and 500" >400...500 mm</option> 
                    </c:otherwise>
                </c:choose>      

                <c:choose>
                    <c:when test="${y=='ymotion between 500 and 600'}">
                      <option selected value="ymotion between 500 and 600" >500...600 mm</option>  
                    </c:when>
                    <c:otherwise>
                         <option  value="ymotion between 500 and 600" >500...600 mm</option> 
                    </c:otherwise>
                </c:choose>      

                <c:choose>
                    <c:when test="${y=='ymotion between 600 and 700'}">
                      <option selected value="ymotion between 600 and 700" >600...700 mm</option>  
                    </c:when>
                    <c:otherwise>
                         <option  value="ymotion between 600 and 700" >600...700 mm</option> 
                    </c:otherwise>
                </c:choose>      
                         
                        <c:choose>
                            <c:when test="${y=='ymotion between 700 and 800'}">
                              <option selected value="ymotion between 700 and 800" >700...800 mm</option>  
                            </c:when>
                            <c:otherwise>
                                 <option  value="ymotion between 700 and 800" >700...800 mm</option> 
                            </c:otherwise>
                        </c:choose>     
                                 
                                <c:choose>
                                    <c:when test="${y=='ymotion > 800'}">
                                      <option selected value="ymotion > 800" > > 800 mm </option>  
                                    </c:when>
                                    <c:otherwise>
                                         <option  value="ymotion > 800" > > 800 mm</option> 
                                    </c:otherwise>
                                </c:choose>      
                                             
<!--                                                    <option value="n">Not important</option>
                                                    <option value="y_motion <300">X < 300   </option>-->

<!--                                                    <option value="3">301 < X < 500</option>
                                                    <option value="3">501 < X < 800</option>
                                                    <option value="3">801 < X < 1000</option>
                                                    <option value="3">1001 < X < 1500</option>
                                                    <option value="3">1501 < X < 2000</option>
                                                    <option value="3">X > 2000</option>-->
                                                </select>
                                            </div>
                                        </div> 

<div class="price-filter">
                                           
    <h2>Travel Z</h2>
    <hr>
     <div id="item-count" class="le-select">
        <select name="z">
         <option disabled>Select Z</option>  

<c:choose>
    <c:when test="${z=='n'}">
      <option selected value="n">Not important</option>  
    </c:when>
    <c:otherwise>
         <option  value="n">Not important</option> 
    </c:otherwise>
</c:choose>  

         <c:choose>
            <c:when test="${z=='zmotion <300'}">
              <option selected value="zmotion <300"> < 300 mm</option>  
            </c:when>
            <c:otherwise>
                 <option  value="zmotion <300"> < 300 mm </option> 
            </c:otherwise>
        </c:choose>  
                                             
                <c:choose>
                    <c:when test="${z=='zmotion between 300 and 400'}">
                      <option selected value="zmotion between 300 and 400" >300...400 mm</option>  
                    </c:when>
                    <c:otherwise>
                         <option  value="zmotion between 300 and 400" >300...400 mm</option> 
                    </c:otherwise>
                </c:choose>  
                         
                <c:choose>
                    <c:when test="${z=='zmotion between 400 and 500'}">
                      <option selected value="zmotion between 400 and 500" >400...500 mm</option>  
                    </c:when>
                    <c:otherwise>
                         <option  value="zmotion between 400 and 500" >400...500 mm</option> 
                    </c:otherwise>
                </c:choose>      

                <c:choose>
                    <c:when test="${z=='zmotion between 500 and 600'}">
                      <option selected value="zmotion between 500 and 600" >500...600 mm</option>  
                    </c:when>
                    <c:otherwise>
                         <option  value="zmotion between 500 and 600" >500...600 mm</option> 
                    </c:otherwise>
                </c:choose>      

                <c:choose>
                    <c:when test="${z=='zmotion between 600 and 700'}">
                      <option selected value="zmotion between 600 and 700" >600...700 mm</option>  
                    </c:when>
                    <c:otherwise>
                         <option  value="zmotion between 600 and 700" >600...700 mm</option> 
                    </c:otherwise>
                </c:choose>      
                         
                        <c:choose>
                            <c:when test="${z=='zmotion between 700 and 800'}">
                              <option selected value="zmotion between 700 and 800" >700...800 mm</option>  
                            </c:when>
                            <c:otherwise>
                                 <option  value="zmotion between 700 and 800" >700...800 mm</option> 
                            </c:otherwise>
                        </c:choose>     
                                 
                                <c:choose>
                                    <c:when test="${z=='zmotion > 800'}">
                                      <option selected value="zmotion > 800" > > 800 mm </option>  
                                    </c:when>
                                    <c:otherwise>
                                         <option  value="zmotion > 800" > > 800 mm</option> 
                                    </c:otherwise>
                                </c:choose>                     
                                                    
                         <!--                                                    <option value="n">Not important </option>
                                                    <option value="z_motion < 100">...100 mm </option>
                                                    <option value="z_motion between 101 and 200">101...200 mm </option>
                                                    <option value="3">201...300 mm </option>
                                                    <option value="3">300... mm</option>-->                           
        
                        </select>
                    </div>
                </div> 
 <!--/.price-filter 
        
                <div class="price-filter">
                    <h2>Year</h2>
                    <hr>
                    <div class="price-range-holder">

                        <input type="text" class="price-slider" value="" >

                        <span class="min-max">
                            Year: 1991 - 2016
                        </span>
                        <span class="filter-button">
                            <a href="#">Filter</a>
                        </span>
                    </div>
                </div> /.price-filter -->
  <hr>
       <!--<input  type="submit" name="register" value="Select"/>-->
                 <button class="le-button small">
                   Filter
                </button>      
       
    </div><!-- /.body -->
    </form>
    
</div><!-- /.widget -->
<!-- ========================================= PRODUCT FILTER : END ========================================= -->
<!--            <div class="widget">
    <h1 class="border">Video</h1>
    <ul class="product-list">
        <li>
            <div class="row">
                <div class="col-xs-4 col-sm-4 no-margin">
                    <a href="#" class="thumb-holder">
                        <iframe width="112" height="63"  src="https://www.youtube.com/embed/pR8AATYtAuE" frameborder="0" allowfullscreen></iframe>     
                        <img alt="" src="resources/assets/images/blank.gif" data-echo="resources/assets/images/products/product-small-01.jpg" />
                    </a>
                </div>
                <div class="col-xs-8 col-sm-8 no-margin">
                    <a href="#">Netbook Acer </a>
                    <div class="price">
                        <div class="price-prev">$2000</div>
                        <div class="price-current">$1873</div>
                    </div>
                </div>  
            </div>
        </li>

        <li>
            <div class="row">
                <div class="col-xs-4 col-sm-4 no-margin">
                    <a href="#" class="thumb-holder">
                        <img alt="" src="resources/assets/images/blank.gif" data-echo="resources/assets/images/products/product-small-02.jpg" />
                    </a>
                </div>
                <div class="col-xs-8 col-sm-8 no-margin">
                    <a href="#">PowerShot Elph 115 16MP Digital Camera</a>
                    <div class="price">
                        <div class="price-prev">$2000</div>
                        <div class="price-current">$1873</div>
                    </div>
                </div>  
            </div>
        </li>


    </ul>
</div> /.widget -->
<!--            <div class="widget">
    <div class="simple-banner">
       <iframe width="246" height="138"  src="https://www.youtube.com/embed/pR8AATYtAuE" frameborder="0" allowfullscreen></iframe>   
        <a href="#">How to Take a Screenshot on Your Haas Control </a>
        <iframe width="224" height="126"  src="https://www.youtube.com/embed/pR8AATYtAuE" frameborder="0" allowfullscreen></iframe>   
        <a href="#">tfhwrtgwertg <br></a>
        <iframe width="224" height="126"  src="https://www.youtube.com/embed/pR8AATYtAuE" frameborder="0" allowfullscreen></iframe>   
        <a href="#">tfhwrtgwertg <br></a>
        <a href="#"><iframe width="224" height="126"  src="https://www.youtube.com/embed/pR8AATYtAuE" frameborder="0" allowfullscreen></iframe>     </a>
        <a href="#"><iframe width="224" height="126"  src="https://www.youtube.com/embed/pR8AATYtAuE" frameborder="0" allowfullscreen></iframe>     </a>
       
  <a href="#"><img alt="" class="img-responsive" src="resources/assets/images/blank.gif" data-echo="resources/assets/images/banners/banner-simple.jpg" /></a>
    </div>
</div>-->
            <!-- ========================================= FEATURED PRODUCTS ========================================= -->
<!--<div class="widget">
    <h1 class="border">Featured Products</h1>
    <ul class="product-list">
        
        <li class="sidebar-product-list-item">
            <div class="row">
                <div class="col-xs-4 col-sm-4 no-margin">
                    <a href="#" class="thumb-holder">
                        <img alt="" src="resources/assets/images/blank.gif" data-echo="resources/assets/images/products/product-small-01.jpg" />
                    </a>
                </div>
                <div class="col-xs-8 col-sm-8 no-margin">
                    <a href="#">Netbook Acer </a>
                    <div class="price">
                        <div class="price-prev">$2000</div>
                        <div class="price-current">$1873</div>
                    </div>
                </div>  
            </div>
        </li> /.sidebar-product-list-item 

        <li class="sidebar-product-list-item">
            <div class="row">
                <div class="col-xs-4 col-sm-4 no-margin">
                    <a href="#" class="thumb-holder">
                        <img alt="" src="resources/assets/images/blank.gif" data-echo="resources/assets/images/products/product-small-02.jpg" />
                    </a>
                </div>
                <div class="col-xs-8 col-sm-8 no-margin">
                    <a href="#">PowerShot Elph 115 16MP Digital Camera</a>
                    <div class="price">
                        <div class="price-prev">$2000</div>
                        <div class="price-current">$1873</div>
                    </div>
                </div>  
            </div>
        </li> /.sidebar-product-list-item 

        <li class="sidebar-product-list-item">
            <div class="row">
                <div class="col-xs-4 col-sm-4 no-margin">
                    <a href="#" class="thumb-holder">
                        <img alt="" src="resources/assets/images/blank.gif" data-echo="resources/assets/images/products/product-small-03.jpg" />
                    </a>
                </div>
                <div class="col-xs-8 col-sm-8 no-margin">
                    <a href="#">PowerShot Elph 115 16MP Digital Camera</a>
                    <div class="price">
                        <div class="price-prev">$2000</div>
                        <div class="price-current">$1873</div>
                    </div>
                </div>  
            </div>
        </li> /.sidebar-product-list-item 

        <li class="sidebar-product-list-item">
            <div class="row">
                <div class="col-xs-4 col-sm-4 no-margin">
                    <a href="#" class="thumb-holder">
                        <img alt="" src="resources/assets/images/blank.gif" data-echo="resources/assets/images/products/product-small-01.jpg" />
                    </a>
                </div>
                <div class="col-xs-8 col-sm-8 no-margin">
                    <a href="#">Netbook Acer </a>
                    <div class="price">
                        <div class="price-prev">$2000</div>
                        <div class="price-current">$1873</div>
                    </div>
                </div>  
            </div>
        </li> /.sidebar-product-list-item 
        
        <li class="sidebar-product-list-item">
            <div class="row">
                <div class="col-xs-4 col-sm-4 no-margin">
                    <a href="#" class="thumb-holder">
                        <img alt="" src="resources/assets/images/blank.gif" data-echo="resources/assets/images/products/product-small-02.jpg" />
                    </a>
                </div>
                <div class="col-xs-8 col-sm-8 no-margin">
                    <a href="#">PowerShot Elph 115 16MP Digital Camera</a>
                    <div class="price">
                        <div class="price-prev">$2000</div>
                        <div class="price-current">$1873</div>
                    </div>
                </div>
            </div>
        </li> /.sidebar-product-list-item 

    </ul> /.product-list 
</div> /.widget -->
<!-- ========================================= FEATURED PRODUCTS : END ========================================= -->
        </div>
        <!-- ========================================= SIDEBAR : END ========================================= -->

        <!-- ========================================= CONTENT ========================================= -->

        <div class="col-xs-12 col-sm-9 no-margin wide sidebar">

<!--            <section id="recommended-products" class="carousel-holder hover small">

    <div class="title-nav">
        <h2 class="inverse">Video</h2>
        <div class="nav-holder">
            <a href="#prev" data-target="#owl-recommended-products" class="slider-prev btn-prev fa fa-angle-left"></a>
            <a href="#next" data-target="#owl-recommended-products" class="slider-next btn-next fa fa-angle-right"></a>
        </div>
    </div>
                 /.title-nav 

    <div id="owl-recommended-products" class="owl-carousel product-grid-holder">
        
        
     <div class="product-item">
     <div class="ribbon red"><span>sale</span></div> 
            <div class="image">
             <iframe width="224" height="126"  src="https://www.youtube.com/embed/pR8AATYtAuE" frameborder="0" allowfullscreen></iframe>     
            </div>
            <div class="brand">How to Take a Screenshot on Your Haas Control</div>
     </div>
                
         <div class="product-item">
         <div class="ribbon red"><span>sale</span></div> 
                <div class="image">
                 <iframe width="224" height="126"  src="https://www.youtube.com/embed/Qq4LECgEchc" frameborder="0" allowfullscreen></iframe>     
                </div>
                <div class="brand">Easily Engrave Sequential Serial Numbers – G47 Part 2</div>
         </div>
                
         <div class="product-item">
         <div class="ribbon red"><span>sale</span></div> 
                <div class="image">
                 <iframe width="224" height="126"  src="https://www.youtube.com/embed/dXR2wDDFFm4" frameborder="0" allowfullscreen></iframe>     
                </div>
                <div class="brand">Spindle Speed Variation - Stop chatter on your CNC lathe</div>
                <div class="brand">Haas Automation</div>
         </div>

        
        <div class="no-margin carousel-item product-item-holder hover size-medium">
            <div class="product-item">
                <div class="ribbon red"><span>sale</span></div>
                <div class="ribbon blue"><span>new!</span></div> 
                <div class="image">
                 <iframe width="224" height="126"  src="https://www.youtube.com/embed/pR8AATYtAuE" frameborder="0" allowfullscreen></iframe> 
                    <img alt="" src="resources/assets/images/blank.gif" data-echo="resources/assets/images/products/product-11.jpg" />
                </div>
                <div class="body">
                    <div class="title">
                        <a href="single-product.html">How to Take a Screenshot on Your Haas Control</a>
                    </div>
                    <div class="brand">HAAS</div>
                </div>
            </div>
        </div> 
        /.carousel-item 
        
        
                <div class="no-margin carousel-item product-item-holder hover size-medium">
                    <div class="product-item">
                        <div class="ribbon red"><span>sale</span></div>
                        <div class="ribbon blue"><span>new!</span></div> 
                        <div class="image">
                         <iframe width="224" height="126" src="https://www.youtube.com/embed/Qq4LECgEchc" frameborder="0" allowfullscreen></iframe>
                        </div>
                        <div class="body">
                            <div class="title">
                                <a href="single-product.html">How to Take a Screenshot on Your Haas Control</a>
                            </div>
                            <div class="brand">Haas Automation</div>
                        </div>
                    </div>
                </div> 
  
        

        <div class="no-margin carousel-item product-item-holder hover size-medium">
            <div class="product-item">
                <div class="ribbon blue"><span>new!</span></div> 
                <div class="image">
                    <iframe width="224" height="126" src="https://www.youtube.com/embed/pR8AATYtAuE" frameborder="0" allowfullscreen></iframe>
                    <img alt="" src="resources/assets/images/blank.gif" data-echo="resources/assets/images/products/product-12.jpg" />
                </div>
                <div class="body">
                    <div class="title">
                        <a href="single-product.html">cinemizer OLED 3D virtual reality TV Video</a>
                    </div>
                    <div class="brand">zeiss</div>
                </div>
                <div class="prices">

                    <div class="price-current text-right">$1199.00</div>
                </div>
                <div class="hover-area">
                    <div class="add-cart-button">
                        <a href="single-product.html" class="le-button">add to cart</a>
                    </div>
                    <div class="wish-compare">
                        <a class="btn-add-to-wishlist" href="#">add to wishlist</a>
                        <a class="btn-add-to-compare" href="#">compare</a>
                    </div>
                </div>
            </div>
        </div> /.carousel-item 

        <div class="no-margin carousel-item product-item-holder hover size-medium">
            <div class="product-item">
                <div class="image">
                    <img alt="" src="resources/assets/images/blank.gif" data-echo="resources/assets/images/products/product-13.jpg" />
                </div>
                <div class="body">
                    <div class="title">
                        <a href="single-product.html">s2340T23" full HD multi-Touch Monitor</a>
                    </div>
                    <div class="brand">dell</div>
                </div>
                <div class="prices">
                    <div class="price-current text-right">$1199.00</div>
                </div>
                <div class="hover-area">
                    <div class="add-cart-button">
                        <a href="single-product.html" class="le-button">add to cart</a>
                    </div>
                    <div class="wish-compare">
                        <a class="btn-add-to-wishlist" href="#">add to wishlist</a>
                        <a class="btn-add-to-compare" href="#">compare</a>
                    </div>
                </div>
            </div>
        </div>
/.carousel-item 

        <div class="no-margin carousel-item product-item-holder hover size-medium">
            <div class="product-item">
                <div class="ribbon blue"><span>new!</span></div> 
                <div class="image">
                    <img alt="" src="resources/assets/images/blank.gif" data-echo="resources/assets/images/products/product-14.jpg" />
                </div>
                <div class="body">
                    <div class="title">
                        <a href="single-product.html">kardon BDS 7772/120 integrated 3D</a>
                    </div>
                    <div class="brand">harman</div>
                </div>
                <div class="prices">
                    <div class="price-current text-right">$1199.00</div>
                </div>
                <div class="hover-area">
                    <div class="add-cart-button">
                        <a href="single-product.html" class="le-button">add to cart</a>
                    </div>
                    <div class="wish-compare">
                        <a class="btn-add-to-wishlist" href="#">add to wishlist</a>
                        <a class="btn-add-to-compare" href="#">compare</a>
                    </div>
                </div>
            </div>
        </div> /.carousel-item 

        <div class="no-margin carousel-item product-item-holder hover size-medium">
            <div class="product-item">
                <div class="ribbon green"><span>bestseller</span></div> 
                <div class="image">
                    <img alt="" src="resources/assets/images/blank.gif" data-echo="resources/assets/images/products/product-15.jpg" />
                </div>
                <div class="body">
                    <div class="title">
                        <a href="single-product.html">netbook acer travel B113-E-10072</a>
                    </div>
                    <div class="brand">acer</div>
                </div>
                <div class="prices">
                    <div class="price-current text-right">$1199.00</div>
                </div>
                <div class="hover-area">
                    <div class="add-cart-button">
                        <a href="single-product.html" class="le-button">add to cart</a>
                    </div>
                    <div class="wish-compare">
                        <a class="btn-add-to-wishlist" href="#">add to wishlist</a>
                        <a class="btn-add-to-compare" href="#">compare</a>
                    </div>
                </div>
            </div>
        </div> /.carousel-item 

        <div class="no-margin carousel-item product-item-holder hover size-medium">
            <div class="product-item">
                <div class="image">
                    <img alt="" src="resources/assets/images/blank.gif" data-echo="resources/assets/images/products/product-16.jpg" />
                </div>
                <div class="body">
                    <div class="title">
                        <a href="single-product.html">iPod touch 5th generation,64GB, blue</a>
                    </div>
                    <div class="brand">apple</div>
                </div>
                <div class="prices">
                    <div class="price-current text-right">$1199.00</div>
                </div>
                <div class="hover-area">
                    <div class="add-cart-button">
                        <a href="single-product.html" class="le-button">add to cart</a>
                    </div>
                    <div class="wish-compare">
                        <a class="btn-add-to-wishlist" href="#">add to wishlist</a>
                        <a class="btn-add-to-compare" href="#">compare</a>
                    </div>
                </div>
            </div>
        </div> /.carousel-item 
        
        

        <div class="no-margin carousel-item product-item-holder hover size-medium">
            <div class="product-item">
                <div class="image">
                    <img alt="" src="resources/assets/images/blank.gif" data-echo="resources/assets/images/products/product-13.jpg" />
                </div>
                <div class="body">
                    <div class="title">
                        <a href="single-product.html">s2340T23" full HD multi-Touch Monitor</a>
                    </div>
                    <div class="brand">dell</div>
                </div>
                <div class="prices">
                    <div class="price-current text-right">$1199.00</div>
                </div>
                <div class="hover-area">
                    <div class="add-cart-button">
                        <a href="single-product.html" class="le-button">add to cart</a>
                    </div>
                    <div class="wish-compare">
                        <a class="btn-add-to-wishlist" href="#">add to wishlist</a>
                        <a class="btn-add-to-compare" href="#">compare</a>
                    </div>
                </div>
            </div>
        </div> /.carousel-item 

        <div class="no-margin carousel-item product-item-holder hover size-medium">
            <div class="product-item">
                <div class="ribbon blue"><span>new!</span></div> 
                <div class="image">
                    <img alt="" src="resources/assets/images/blank.gif" data-echo="resources/assets/images/products/product-14.jpg" />
                </div>
                <div class="body">

                    <div class="title">
                        <a href="single-product.html">kardon BDS 7772/120 integrated 3D</a>
                    </div>
                    <div class="brand">harman</div>
                </div>
                <div class="prices">

                    <div class="price-current text-right">$1199.00</div>
                </div>
                <div class="hover-area">
                    <div class="add-cart-button">
                        <a href="single-product.html" class="le-button">add to cart</a>
                    </div>
                    <div class="wish-compare">
                        <a class="btn-add-to-wishlist" href="#">add to wishlist</a>
                        <a class="btn-add-to-compare" href="#">compare</a>
                    </div>
                </div>
            </div>
        </div> /.carousel-item 

    </div>
                
              






 /#recommended-products-carousel .owl-carousel 
</section>-->
            <!--/.carousel-holder-->   



            <section id="gaming">
    <div class="grid-list-products">
        <!--<h2 class="section-title">Gaming</h2>-->
        
        <div class="control-bar">
<!--            <div id="popularity-sort" class="le-select" >
                <select data-placeholder="sort by popularity">
                    <option value="1">1-100 players</option>
                    <option value="2">101-200 players</option>
                    <option value="3">200+ players</option>
                </select>
            </div>
            
            <div id="item-count" class="le-select">
                <select>
                    <option value="1">24 per page</option>
                    <option value="2">48 per page</option>
                    <option value="3">32 per page</option>
                </select>
            </div>-->

            <div class="grid-list-buttons">
                <ul>
                    <li class="grid-list-button-item active"><a data-toggle="tab" href="#grid-view"><i class="fa fa-th-large"></i> Grid</a></li>
                    <!--<li class="grid-list-button-item "><a data-toggle="tab" href="#list-view"><i class="fa fa-th-list"></i> List</a></li>-->
                </ul>
            </div>
        </div><!-- /.control-bar -->
                                
        <div class="tab-content">
            <div id="grid-view" class="products-grid fade tab-pane in active">
                
            <div class="product-grid-holder">
                <div class="row no-margin">

          <!------------***************--------------**********-->              
                              
          
          <c:forEach items="${listProduct}" var="vmc"> 
                        <div class="col-xs-12 col-sm-4 no-margin product-item-holder hover">
                            <div class="product-item">
                             
                                    
                                <div class="ribbon red"><span>sale</span></div> 
                                <div class="image">
                                    <!--<img alt="" src="resources/assets/images/blank.gif" data-echo="resources/assets/images/products/${vmc.photo1}" width="246" height="186" />-->
                                    <a href="vmc${vmc.id}-${vmc.typeurl}-${vmc.modelurl}">
                                     <img alt="${vmc.model}" src="resources/assets/images/blank.gif" data-echo="resources/assets/images/products/${vmc.photo1}" width="246" height="186" />
                                    </a>
                                </div>
                                <div class="body">
                                    <!--<div class="label-discount green">-10 % sale</div>-->
                                    <div class="title">
                                        <a href="vmc${vmc.id}-${vmc.typeurl}-${vmc.modelurl}.htm"> ${vmc.model} / ${vmc.type} / ${vmc.manufacturer}  </a>
                                    </div>
                                    <!--<div class="brand">${vmc.manufacturer} / id: ${vmc.productid}</div>-->
                                    <div class="brand">${vmc.year} / location: ${vmc.machinelocation} / id: ${vmc.productid}</div>
                                    <!--<div class="brand">id: ${vmc.productid}</div>-->
                                    <div class="brand">X*Y*Z: ${vmc.xmotion}*${vmc.ymotion}*${vmc.zmotion} / 
                                        
                    <c:choose>
                        <c:when test="${vmc.xtablesize == 0}">
                           Table: ${vmc.tableroundsize}
                        </c:when>                                                  
                        <c:otherwise>
                        Table: ${vmc.xtablesize}*${vmc.ytablesize}
                            </c:otherwise>
                    </c:choose>
                                        
                                    
                                    </div>
                                    
                                </div>
<!--                                <div class="prices">
                                    <div class="price-prev">${vmc.price}</div>
                                    <div class="price-current pull-right">$1199.00</div>
                                </div>-->
                                <div class="hover-area">
                                    <div class="add-cart-button">
                                        <a href="add-product-to-customer-basket.htm?id=${vmc.id}" class="le-button">add to cart</a>
                                    </div>
                                    <div class="wish-compare">
                                        <a class="btn-add-to-wishlist" href="add-product-to-wish-list.htm?id=${vmc.id}">add to wishlist</a>
                                        <a class="btn-add-to-compare" href="add-product-to-compare-list.htm?id=${vmc.id}">compare</a>
                                    </div>
                                </div>
                                
                                
                            </div><!-- /.product-item -->
                        </div><!-- /.product-item-holder -->
                                </c:forEach>
                        
                        
                        <c:if test="${empty listProduct}"  >
                            <br>
                            <div class="title">Information not found.</div>
                            <div class="brand">Please change parameters.</div>
  
                        </c:if>                 
                        
                        
 <!----------------------End ----------------->


           
                    </div><!-- /.row -->
                </div><!-- /.product-grid-holder -->
                
                <div class="pagination-holder">
                    <div class="row">
                        
                        <div class="col-xs-12 col-sm-6 text-left">
                            <ul class="pagination ">  
                                
    <c:forEach var="i" begin="1" end="${kol_vo_page}">
                    <c:choose>
                        <c:when test="${i == page_nomber}">
                            <!--<li class="current" ><a href="vmc_from_any_page.htm?page_nomber=${i}"><c:out value="${i}"/></a></li>-->
                            <li class="current" ><a href="cnc-milling-machine?dmg=${dmg}&moriseiki=${moriseiki}&mazak=${mazak}&haas=${haas}&spiner=${spiner}&x=${x}&y=${y}&z=${z}&page=${i}"><c:out value="${i}"/></a></li>
                        </c:when>                                                  
                        <c:otherwise>
                            <!--<li><a href="vmc_from_any_page.htm?page_nomber=${i}"><c:out value="${i}"/></a></li>-->
                            <li><a href="cnc-milling-machine?dmg=${dmg}&moriseiki=${moriseiki}&mazak=${mazak}&haas=${haas}&spiner=${spiner}&x=${x}&y=${y}&z=${z}&page=${i}"><c:out value="${i}"/></a></li>
                        </c:otherwise>
                    </c:choose>

    </c:forEach>   
                                

                            </ul>
                        </div>

                        <div class="col-xs-12 col-sm-6">
                            <div class="result-counter">
                                Showing <span> ${kol_vo_on_page*page_nomber-kol_vo_on_page+1} - ${kol_vo_on_page*page_nomber} </span> of <span>${kol_vo_prod}</span> results
                            </div>
                        </div>

                    </div> 
                            <!--/.row--> 
                </div>
                <!-- /.pagination-holder -->
            </div><!-- /.products-grid #grid-view -->

            <div id="list-view" class="products-grid fade tab-pane ">
                <div class="products-list">
                    
                    
                    
                    
                    
        <c:forEach items="${listHmc}" var="hmc">

        <div class="product-item product-item-holder">
            <div class="ribbon red"><span>sale</span></div> 
            <div class="ribbon blue"><span>new!</span></div>
            <div class="row">
                <div class="no-margin col-xs-12 col-sm-4 image-holder">
                    <div class="image">
                        <img alt="" src="resources/assets/images/blank.gif" data-echo="resources/assets/images/products/${hmc.photo1}"  width="246" height="186"/>
                    </div>
                </div><!-- /.image-holder -->
                <div class="no-margin col-xs-12 col-sm-5 body-holder">
                    <div class="body">
                        <div class="label-discount green">-10% sale</div>
                        <div class="title">
                            <a href="hmc${hmc.id}.htm">${hmc.producer} ${hmc.model}</a>
                        </div>
                            <div class="brand">${hmc.year}/ location: ${hmc.benchLocation}
                            <br> X*Y*Z: ${hmc.xMotion}*${hmc.yMotion}*${hmc.zMotion} / Table: ${hmc.descSizeX}*${hmc.descSizeY}
                            </div>
                            <!--<div class="brand"></div>-->
                        <div class="excerpt">
                            <p>${hmc.info1en}</p>
                        </div>
                        <div class="addto-compare">
                            <a class="btn-add-to-compare" href="add-product-to-compare-list.htm?id=${hmc.id}">add to compare list</a>
                        </div>
                    </div>
                </div><!-- /.body-holder -->
                <div class="no-margin col-xs-12 col-sm-3 price-area">
                    <div class="right-clmn">
        <!--                                    <div class="price-current">$1199.00</div>
                        <div class="price-prev">$1399.00</div>-->
                        <div class="availability"><label>availability:</label><span class="available">  in stock</span></div>
                        <a class="le-button" href="add-product-to-customer-basket.htm?id=${hmc.id}">add to cart</a>
                        <a class="btn-add-to-wishlist" href="add-product-to-wish-list.htm?id=${hmc.id}">add to wishlist</a>
                    </div>
                </div><!-- /.price-area -->
            </div><!-- /.row -->
        </div><!-- /.product-item -->

          </c:forEach> 


            </div><!-- /.products-grid #list-view -->

        </div><!-- /.tab-content -->
    </div><!-- /.grid-list-products -->

</section><!-- /#gaming -->            
        </div><!-- /.col -->
        <!-- ========================================= CONTENT : END ========================================= -->    
    </div><!-- /.container -->
    
    
    
    
    
    
    
</section><!-- /#category-grid -->     


<!-- ============================================================= FOOTER ============================================================= -->

<%@include file="in/footer.jsp" %>

<!-- ============================================================= FOOTER : END ============================================================= -->   </div><!-- /.wrapper -->



    <!-- For demo purposes â can be removed on production -->
    
<!--    <div class="config open">
        <div class="config-options">
            <h4>Pages</h4>
            <ul class="list-unstyled animate-dropdown">
                <li class="dropdown">
                    <button class="dropdown-toggle btn le-button btn-block" data-toggle="dropdown">View Pages</button>
                    <ul class="dropdown-menu">
                                                <li><a href="#">Home</a></li>
                                                <li><a href="#">Home Alt</a></li>
                                                <li><a href="category-grid.html">Category - Grid/List</a></li>
                                                <li><a href="category-grid-2.html">Category 2 - Grid/List</a></li>
                                                <li><a href="single-product.html">Single Product</a></li>
                                                <li><a href="single-product-sidebar.html">Single Product with Sidebar</a></li>
                                                <li><a href="cart.html">Shopping Cart</a></li>
                                                <li><a href="checkout.html">Checkout</a></li>
                                                <li><a href="#">About Us</a></li>
                                                <li><a href="#">Contact Us</a></li>
                                                <li><a href="#">Blog</a></li>
                                                <li><a href="#">Blog Full Width</a></li>
                                                <li><a href="blog-post.html">Blog Post</a></li>
                                                <li><a href="faq.html">FAQ</a></li>
                                                <li><a href="terms.html">Terms & Conditions</a></li>
                                                <li><a href="authentication.html">Login/Register</a></li>
                                                <li><a href="404.html">404</a></li>
                                                <li><a href="wishlist.html">Wishlist</a></li>
                                                <li><a href="compare.html">Product Comparison</a></li>
                                                <li><a href="track-your-order.html">Track your Order</a></li>
                                            </ul>   
                </li>
            </ul>
            <h4>Header Styles</h4>
            <ul class="list-unstyled">
                <li><a href="category-grid.html&amp;style=alt1">Header 1</a></li>
                <li><a href="category-grid.html&amp;style=alt">Header 2</a></li>
            </ul>
            <h4>Colors</h4>
            <ul class="list-unstyled">
                <li><a class="changecolor green-text" href="#" title="Green color">Green</a></li>
                <li><a class="changecolor blue-text" href="#" title="Blue color">Blue</a></li>
                <li><a class="changecolor red-text" href="#" title="Red color">Red</a></li>
                <li><a class="changecolor orange-text" href="#" title="Orange color">Orange</a></li>
                <li><a class="changecolor navy-text" href="#" title="Navy color">Navy</a></li>
                <li><a class="changecolor dark-green-text" href="#" title="Darkgreen color">Dark Green</a></li>
            </ul>
        </div>
        <a class="show-theme-options" href="#"><i class="fa fa-wrench"></i></a>
    </div>-->
    <!-- For demo purposes â can be removed on production : End -->

    <!-- JavaScripts placed at the end of the document so the pages load faster -->
    <script src="resources/assets/js/jquery-1.10.2.min.js"></script>
    <script src="resources/assets/js/jquery-migrate-1.2.1.js"></script>
    <script src="resources/assets/js/bootstrap.min.js"></script>
    <script src="http://maps.google.com/maps/api/js?sensor=false&amp;language=en"></script>
    <script src="resources/assets/js/gmap3.min.js"></script>
    <script src="resources/assets/js/bootstrap-hover-dropdown.min.js"></script>
    <script src="resources/assets/js/owl.carousel.min.js"></script>
    <script src="resources/assets/js/css_browser_selector.min.js"></script>
    <script src="resources/assets/js/echo.min.js"></script>
    <script src="resources/assets/js/jquery.easing-1.3.min.js"></script>
    <script src="resources/assets/js/bootstrap-slider.min.js"></script>
    <script src="resources/assets/js/jquery.raty.min.js"></script>
    <script src="resources/assets/js/jquery.prettyPhoto.min.js"></script>
    <script src="resources/assets/js/jquery.customSelect.min.js"></script>
    <script src="resources/assets/js/wow.min.js"></script>
    <script src="resources/assets/js/scripts.js"></script>

    <!-- For demo purposes â can be removed on production -->
    
    <script src="resources/assets/switchstylesheet/switchstylesheet.js"></script>
    
    <script>
        $(document).ready(function(){ 
            $(".changecolor").switchstylesheet( { seperator:"color"} );
            $('.show-theme-options').click(function(){
                $(this).parent().toggleClass('open');
                return false;
            });
        });

        $(window).bind("load", function() {
           $('.show-theme-options').delay(2000).trigger('click');
        });
    </script>
    <!-- For demo purposes â can be removed on production : End -->

    <script src="http://w.sharethis.com/button/buttons.js"></script>

</body>
</html>