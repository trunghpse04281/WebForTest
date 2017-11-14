<%-- 
    Document   : headerForTeacher
    Created on : Nov 14, 2017, 2:36:46 PM
    Author     : Pet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
            <!-- Brand/logo -->
            <a class="navbar-brand" href="#">WFT 1.0</a>

            <!-- Links -->
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" href="#"> Hello, ${sessionScope.t.name}</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="TeacherLogout"> Logout</a>
                </li>
            </ul>
        </nav>
    </body>
</html>
