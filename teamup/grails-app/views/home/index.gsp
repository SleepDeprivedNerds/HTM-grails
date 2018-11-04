<%--
  Created by IntelliJ IDEA.
  User: asim
  Date: 11/3/18
  Time: 11:58 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Home Page</title>
</head>

<body>
<p>
    A website to join and host local tea meetings. The map shows the location of meetings. Click on start a tea’mup to create a new meet up at your location or find a tea’mup to join an existing meet up.
</p>
<div id="googleMap" style="width:100%;height:400px;"></div>

<script>



    function myMap() {
        var mapProp= {
            center:new google.maps.LatLng(51.508742,-0.120850),
            zoom:5,
        };

        var map=new google.maps.Map(document.getElementById("googleMap"),mapProp);

         <%
             for (event in events){
             //def event= events[0]
         %>

        var marker=new google.maps.Marker({

            map:map,

            position:new google.maps.LatLng(<%print(event?.lat)%>.000000,<%print(event?.lng)%>.000000),
            animation:google.maps.Animation.DROP

        });



        <%
            }
        %>

    }



</script>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAaPxXChkUkKJ_VlY66oS2EDwB7aAyv02g&callback=myMap"
        async defer></script><br/>
<div align="center">
<g:link controller="event" action="create"><button  class="button alt">Create an event</button></g:link>
<g:link controller="event" action="index"><button  class="button alt">Select an event</button></g:link></div>
</body>
</html>