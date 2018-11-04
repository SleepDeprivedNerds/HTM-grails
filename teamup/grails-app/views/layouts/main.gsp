
<!DOCTYPE html>
<html>
<head>

	<title>Tea'mup</title>
	<meta http-equiv="content-type" content="text/html; charset=utf-8" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<!--[if lte IE 8]><script src="css/ie/html5shiv.js"></script><![endif]-->

	<!--
    Todo: setup refrences
    !-->
	<g:javascript src="jquery.min.js"/>
	<g:javascript src="jquery.dropotron.min.js"/>
	<g:javascript src="skel.min.js"/>
	<g:javascript src="skel-layers.min.js"/>
	<g:javascript src="init.js"/>

	<noscript>

		<link rel="stylesheet" href="${resource(dir: 'css', file: 'skel.css')}" />
		<link rel="stylesheet" href="${resource(dir: 'css', file: 'style.css')}" />
	</noscript>
	<g:layoutHead/>



	<!--
TODO: Put all the CSS and Javascript up here

-->

</head>


<body>


<!--
TODO: Put logo, nav bar here. Need to do a check here to see if person is logged in. Logo needs to return to main page!
-->

<!-- Logo -->
<h1><g:link action="index" controller="home" id="logo"> Tea'mup</g:link></h1>






<div class="container">
	<g:layoutBody/>
</div>




</body>
</html>
