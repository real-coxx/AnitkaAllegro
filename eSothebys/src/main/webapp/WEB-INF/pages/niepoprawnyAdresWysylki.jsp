<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<t:layout>
  <div class="page-header">
    <h1 style="color: #f5f5f5">Niepowodzenie</h1>
  </div>

  <div>
    <div class="alert alert-danger" role="alert" style="width: 50%; margin-left: 25%; margin-right: 25%; margin-top: 50px">${informacja}</div>
  </div>
  <div>
    <form class="form-horizontal" action="/platnosc" role="form" method="POST">
      <button style="width: 100px; margin-left: 25%" type="submit" class="btn btn-default pull-left">Wróć</button>
    </form>
  </div>
</t:layout>
