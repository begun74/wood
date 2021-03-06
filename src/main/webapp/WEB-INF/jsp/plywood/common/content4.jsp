<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<script src="resources/js/app.js"></script>



						<c:set var="perPage" value="6"/>
						<c:set var="allItems" value="${fn:length(particleboards)}"/>
						<c:set var="pageNumber" value="${param.pageNumber}"/>
						<c:if test="${empty param.pageNumber}" >
							<c:set var="pageNumber" value="1"/>
						</c:if>
						<c:set var="start" value="${pageNumber*perPage-perPage}"/>
						<c:set var="stop" value="${pageNumber*perPage-1}"/>
						<div>
						<table border="0" class="tab tab-drag">
							<c:forEach items="${particleboards}" var="particleboard" varStatus="vs" begin="${start}" end="${stop}">
									<c:if test="${vs.count % 3 == 1}" >
										<tr class="top nodrop nodrag">
									</c:if> 
										<td style="padding: 35px;">
											<div class="product-item-holder hover">
												<a href="singleProduct?id=${particleboard.id}">
													<img src="resources/pics/${particleboard.id}.jpeg" width="170" height="170" onerror="this.onerror=null;this.src='resources/assets/images/products/nopicture.jpg';"/>
												</a>
												<br/>${particleboard.thickness}x${particleboard.length}x${particleboard.weight}       <spring:message code="label.price"/> ${particleboard.price}$
												<div class="product-item ">
								    					<div class="hover-area">
						                                    <div class="add-cart-button">
						                                        <a href="add-product-to-customer-basket?id=${particleboard.id}" class="le-button"><spring:message code="add.to.cart"/></a>
						                                        <!-- a href="javascript:addToBacket(${particleboard.id});" class="le-button">add to cart</a -->
						                                    </div>
						                                    <div class="wish-compare">
						                                        <a class="btn-add-to-wishlist" href="add-product-to-wish-list?id=${particleboard.id}">add to wishlist</a>
						                                        <a class="btn-add-to-compare" href="javascript:addToCompare(${particleboard.id})"><spring:message code="compare"/></a>
						                                    </div>
						                                </div>
												</div>
											</div>
										</td>
									<c:if test="${vss.count % 3 == 1}" >
										</tr>
									</c:if> 							
								</c:forEach>
						</table>
						</div>
							