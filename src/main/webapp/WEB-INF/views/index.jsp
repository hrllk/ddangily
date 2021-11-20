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
        .eventSwiper {
            height: 500px;
        }

    </style>
</head>
<body>
    <div class="container">
        <jsp:include page="include/header.jsp"/>
        <div class="row">
            <%--            <div class="col-12">--%>
            <div class="swiper-container">
                <div class="swiper eventSwiper">
                    <div class="swiper-wrapper">
                        <div class="swiper-slide">
                            <a href="#">
                                <%--                                    <img src="<c:url value="/resources/custom/img/carousel/carousel1.jpeg"/> " alt=""/>--%>
                                <%--                                    <img src="<c:url value="/resources/custom/img/carousel/carousel1 (1).jpeg"/> " alt=""/>--%>
                                <%--                                    <svg --%>
                            </a>
                        </div>
                        <div class="swiper-slide">Slide 2</div>
                        <div class="swiper-slide">Slide 3</div>
                        <div class="swiper-slide">Slide 4</div>
                        <div class="swiper-slide">Slide 5</div>
                        <div class="swiper-slide">Slide 6</div>
                        <div class="swiper-slide">Slide 7</div>
                        <div class="swiper-slide">Slide 8</div>
                            <div class="swiper-slide">Slide 9</div>
                        </div>
                        <div class="swiper-pagination"></div>
                    </div>
                </div>

<%--            </div>--%>
        </div><!-- Swiper -->
        <div class="row d-posts-frame" id="postsFrame" >

        </div>
    </div> <%-- container --%>

    <jsp:include page="/WEB-INF/views/include/javascript.jsp"/>
    <script type="text/javascript">
        /* El */
        var getPostsUrlRest = '<c:url value="/rest/v1/posts"/>';

        $(document).ready(function () {

            getContentOfSwiper();
            getPosts();
        });



        function getContentOfSwiper(){
            var swiper = new Swiper(".eventSwiper", {
                direction: "vertical",
                slidesPerView: 1,
                spaceBetween: 30,
                mousewheel: true,
                pagination: {
                    el: ".swiper-pagination",
                    clickable: true,
                },
            });
        }

        function getPosts(){
            $.ajax({
                url: getPostsUrlRest,
                method: 'GET'
            }).done(function (res){

                res.forEach(function (element){



                    if (element.mediaType === 'VIDEO') {

                        // $("#postsFrame").append(
                        //     '<div class="col-lg-4 col-md-6 col-sm-12 d-posts" >' +
                        //         '<video src="' + element.mediaUrl + '">' +
                        //     '</div>'
                        // )
                    } else {
                        $(".d-posts-frame").append(
                            '<div class="col-lg-4 col-md-6 col-sm-12 d-div-posts">' +
                                '<img class="d-img-posts" src="' + element.mediaUrl + '">' +
                            '</div>'
                        )
                    }
                    // console.log("element:",element);

                });
            });
        }

    </script>
</body>
</html>
