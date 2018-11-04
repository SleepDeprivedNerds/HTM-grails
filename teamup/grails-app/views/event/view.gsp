<head>
    <meta name="layout" content="main"/>
    <title> View Event</title>
</head>
<body>
<h1>
${event?.name}
</h1>
<p>
    ${event?.description}
</p>
${event?.user?.username}
<div id="googleMap" style="width:100%;height:400px;"></div>


<script>
    function myMap() {
        var mapProp= {
            center:new google.maps.LatLng(${event?.lat},${event?.lng}),
            zoom:14,
        };

        var map=new google.maps.Map(document.getElementById("googleMap"),mapProp);


        <g:each in="${events}" >

        new google.maps.Marker({
            icon:"images/favicon.png",
            map:map,
            url: ${createLink(controller: 'event', action: 'view', params: [id:it?.id])},
            position:new google.maps.LatLng(${it?.lat},${it?.lng}),
            animation:google.maps.Animation.DROP
        });
        </g:each>

    }
    <g:form action="goto">
    <g:hiddenField value="${event.id}" name="id"/>
    <g:submitButton name="Have some tea"/>
    </g:form>



</script>


</body>