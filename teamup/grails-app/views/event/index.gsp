<head>
    <meta name="layout" content="main"/>
    <title> Pick Event</title>
</head>

<g:form action="view">
<g:select name="event" from="${events}" />
    <g:submitButton name="Lookup" class="button"/>
</g:form>