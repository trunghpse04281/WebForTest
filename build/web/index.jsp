<%-- 
    Document   : index
    Created on : Nov 14, 2017, 11:22:02 AM
    Author     : Pet
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="resource/css/logInTeacherCss.css" rel="stylesheet" type="text/css"/>
        <link href="resource/css/boostrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>Index</title>
    </head>
    <body>

        <div id="fullscreen_bg" class="fullscreen_bg"/>

        <div class="container">

            <h1 class="form-signin-heading text-muted" style="color: #ffffff !important;">Please choose your role</h1>
            <form class="form-signin" action="PickRole" method="POST">
                <c:forEach items="${requestScope.listRole}" var="role">
                    <label class="radio-inline" style="color: #ffffff !important; font-size: 30px;"><input name="role" type="radio" value="${role.code}" required=""/> ${role.name}</label>
                    </c:forEach>
                <input class="btn btn-lg btn-primary btn-block" type="submit" style="cursor: pointer;" type="submit" value="Go"/>
            </form>

        </div>
    </div>
</body>
</html>
