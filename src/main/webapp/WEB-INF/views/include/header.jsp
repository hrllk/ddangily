<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--<link rel="shortcut icon" href="<c:url value'/resources/custom/img/ico/ddangilyFavCon.jpg'/>" type="image/x-icon">--%>
<header class="header navbar-area bg-white">
<%--    <div class="container">--%>
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
<%--                    <div class="w-100">--%>
                    <div class="collapse navbar-collapse sub-menu-bar" id="navbarSupportedContent">
                        <ul id="nav" class="navbar-nav ms-auto">
                            <li class="nav-item">
                                <a class="page-scroll active" href="<c:url value="/"/>">Instagram</a>
<%--                                <a class="page-scroll active" href="#portfolio"></a>--%>
                            </li>
                            <li class="nav-item">
                                <a class="page-scroll" href="<c:url value="/about"/>">About</a>
<%--                                <a class="page-scroll" href="about">오시는길</a>--%>
                            </li>
                            <li class="nav-item">
<%--                                <a class="page-scroll" href="#services">Services</a>--%>
                                <a class="page-scroll" href="#<c:url value="/services"/>">Services</a>
                            </li>
                        </ul>
                    </div> <!-- navbar collapse -->
<%--                    </div>--%>
                </nav> <!-- navbar -->
            </div>
        </div> <!-- row -->
<%--    </div> <!-- container -->--%>
</header>