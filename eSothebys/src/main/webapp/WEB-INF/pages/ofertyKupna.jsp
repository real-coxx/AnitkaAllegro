<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link href="<c:url value='/resources/css/bootstrap.css' />" rel="stylesheet">
</head>
<body>
<table class="table table-bordered" style="width: 80%; margin-left: 10%; margin-top: 10px">
  <thead>
    <tr>
      <th data-field="uzytkownik" style="width: 40%">Użytkownik</th>
      <th data-field="cena" style="width: 20%">Cena</th>
      <th data-field="sztuk" style="width: 20%">Sztuk</th>
      <th data-field="data" style="width: 20%">Data</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>k...a</th>
      <th>980 zł</th>
      <th>1</th>
      <th>07-02-2015 22:01:34</th>
    </tr>
  </tbody>
</table>
</body>
</html>
