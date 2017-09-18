<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="/WEB-INF/tagLib/usertag.tld" prefix="user" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello user!</title>
</head>
<body>

<fmt:setLocale value="${sessionScope.locale}"/>
<fmt:setBundle basename="configmsg.message" var="msg"/>

<fmt:message bundle="${msg}" key="page.user.message.greeting" var="greeting"/>

<c:out value="${greeting}"></c:out>

<c:forEach items="${numbersU}" var="numU">
	<c:out value="${numU}"/>
</c:forEach>

<user:iterate-user users="${userSetParam}"/>



</body>
</html>