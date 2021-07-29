<%--
  Created by IntelliJ IDEA.
  User: hwimer
  Date: 21. 7. 17.
  Time: 오후 5:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
    <title>Title</title>
    <jsp:include page="include/head.jsp"/>
</head>
<body>

<header class="header navbar-area bg-white">
    <div class="container">
        <div class="row align-items-center">
            <div class="col-lg-12">
                <nav class="navbar navbar-expand-lg">
                    <a class="navbar-brand" href="<c:url value='/'/>">
                        <img src="<c:url value='/resources/custom/img/logo/ddanglogo.jpg'/>" alt="Logo">
                    </a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="toggler-icon"></span>
                        <span class="toggler-icon"></span>
                        <span class="toggler-icon"></span>
                    </button>

                    <div class="collapse navbar-collapse sub-menu-bar" id="navbarSupportedContent">
                        <ul id="nav" class="navbar-nav ml-auto">
                            <li class="nav-item">
                                <a class="page-scroll active" href="#portfolio">Instagram</a>
                            </li>
<%--                            <li class="nav-item">--%>
<%--                                <a class="page-scroll" href="#home">Home</a>--%>
<%--                            </li>--%>
                            <li class="nav-item">
                                <a class="page-scroll" href="#about">About</a>
                            </li>
                            <li class="nav-item">
                                <a class="page-scroll" href="#services">Services</a>
                            </li>
<%--                            <li class="nav-item">--%>
<%--                                <a class="page-scroll" href="#team">Team</a>--%>
<%--                            </li>--%>
<%--                            <li class="nav-item">--%>
<%--                                <a class="page-scroll" href="#contact">Contact</a>--%>
<%--                            </li>--%>
                        </ul>
<%--                        <div class="header-btn">--%>
<%--                            <a href="javascript:void(0)" class="theme-btn">Get Started</a>--%>
<%--                        </div>--%>
                    </div> <!-- navbar collapse -->
                </nav> <!-- navbar -->
            </div>
        </div> <!-- row -->
    </div> <!-- container -->
</header>
</body>
</html>
