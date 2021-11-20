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
    <link rel="shortcut icon" href="<c:url value='/resources/custom/img/ico/ddangilyFavCon.jpg'/>" type="image/x-icon">
    <title>땡일리 강아지유치원</title>
    <jsp:include page="include/head.jsp"/>
    <style type="text/css">
        /*.eventSwiper {*/
        /*    height: 500px;*/
        /*}*/

    </style>
</head>
<body>
    <div class="container">
        <jsp:include page="include/header.jsp"/>
        <div class="row">

        </div>
    </div> <%-- container --%>

    <jsp:include page="/WEB-INF/views/include/javascript.jsp"/>
    <script type="text/javascript">
        /* El */
        <%--var getPostsUrlRest = '<c:url value="/rest/v1/posts"/>';--%>

        $(document).ready(function () {

            // getContentOfSwiper();
            // getPosts();
        });



    </script>
</body>
</html>
