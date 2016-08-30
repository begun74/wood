<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

						<table border="0" class="tab tab-drag">
							<c:forEach items="${particleboards}" var="particleboard" varStatus="vs" >
								<c:if test="${vs.count % 3 == 1}" >
									<tr class="top nodrop nodrag">
							    </c:if>							
										<td style="padding: 35px;">
											<div class="product-item-holder hover">
												<img src="resources/pics/${particleboard.id}.jpeg" width="170" height="170" onerror="this.onerror=null;this.src='resources/assets/images/products/nopicture.jpg';"/>
												<br/>${particleboard.thickness}x${particleboard.length}x${particleboard.weight}       <spring:message code="label.price"/> ${particleboard.price}$
												<div class="product-item ">
								    					<div class="hover-area">
						                                    <div class="add-cart-button">
						                                        <a href="add-product-to-customer-basket?id=${particleboard.id}" class="le-button">add to cart</a>
						                                    </div>
						                                    <div class="wish-compare">
						                                        <a class="btn-add-to-wishlist" href="add-product-to-wish-list?id=${particleboard.id}">add to wishlist</a>
						                                        <a class="btn-add-to-compare" href="add-product-to-compare-list?id=${particleboard.id}">compare</a>
						                                    </div>
						                                </div>
												</div>
											</div>
										</td>
								<c:if test="${vsz.count % 2 == 1}" >
							      </tr>
							    </c:if>
							</c:forEach>
						</table>
