<%@tag description="Layout strony" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@attribute name="headerResources" fragment="true" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="<c:url value='/resources/css/bootstrap.css' />" rel="stylesheet">
    <div class="jumbotron text-left clearfix" style="background-color: #f5f5f5; background-size: 100%;">
        <div class="container">
            <h1 style="color: #737373; float: left">eSothebys</h1>
        </div>
    </div>
</head>
<body>

<jsp:doBody/>
</body>
</html>