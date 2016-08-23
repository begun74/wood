<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
        
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand">
                    <a href="admin?act=1" ><spring:message code="admin.add.color"/></a>
                </li>
                <li class="sidebar-brand">
                    <a href="admin?act=2" ><spring:message code="admin.add.particleboard"/></a>
                </li>
                <li class="sidebar-brand">
                    <a href="admin?act=3" ><spring:message code="admin.add.info.from.file"/></a>
                </li>
                <li class="sidebar-brand">
                    <a href="admin?act=4" ><spring:message code="admin.add.pics.from.file"/></a>
                </li>
            </ul>
        </div>

