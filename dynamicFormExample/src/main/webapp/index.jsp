<%@page import="fr.epita.structuredData.services.XmlTemplateService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dynamic Form Example</title>
</head>
<body>

<div id="messageContent"></div>

<%= new XmlTemplateService().convertXmlTemplateToHtmlString() %>


<script>
/*TODO ajax submission for the form*/



</script>

</body>
</html>