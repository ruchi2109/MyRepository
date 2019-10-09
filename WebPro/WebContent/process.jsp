<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Process Page</title>
</head>
<body>

<!-- using action commands -->
<jsp:useBean id="pers" class="com.cg.bean.Person" scope="session"/>

<jsp:setProperty property="*" name="pers"/>
<%--<jsp:setProperty property="name" name="pers"/>
<jsp:setProperty property="age" name="pers"/>
<jsp:setProperty property="city" name="pers" param="city"/> --%>
<!-- no need to write param if the field names in bean is same as
attributes in class -->

<% response.sendRedirect("output.jsp"); %> 
<%-- <jsp:forward page="output.jsp"/> --%>
</body>
</html>