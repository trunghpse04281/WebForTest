<%-- 
    Document   : logIn
    Created on : Nov 14, 2017, 11:04:09 AM
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
        <title>Log In</title>
    </head>
    <body>
        <div id="fullscreen_bg" class="fullscreen_bg"/>

        <div class="container">

            <form class="form-signin" method="POST" action="TeacherLogIn">
                <h4 class="form-signin-heading text-muted" style="color: #ffffff !important;">Web For Test 1.0</h4>
                <h2 class="form-signin-heading text-muted" style="color: #ffffff !important;">Teacher Sign In</h2>
                <c:if test="${requestScope.error != null}">
                    <div class="alert alert-danger">
                        ${requestScope.error}
                    </div>
                </c:if>
                <input name="user" type="text" class="form-control" placeholder="User name" required="" autofocus=""/>
                <input name="pass" type="password" class="form-control" placeholder="Password" required=""/>
                <button class="btn btn-lg btn-primary btn-block" type="submit" style="cursor: pointer;">
                    Sign In
                </button>
            </form>

        </div>
    </body>
</html>
