<%-- 
    Document   : Definition_En
    Created on : Dec 8, 2022, 10:56:07 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Results</title>
    </head>
    <body>
        <c:forEach items="${list}" var="item">
            <h1>${item.getWord()}</h1>
            <h3>${item.getPartOfSpeech()}</h3>
            <h4>${item.getDefinition()}</h4>
            <h4>${item.getExample()}</h4>
        </c:forEach>        
    </body>
</html>
