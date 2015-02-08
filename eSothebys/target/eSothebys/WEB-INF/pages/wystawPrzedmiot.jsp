<%--
  Created by IntelliJ IDEA.
  User: Internet
  Date: 2015-01-30
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<t:layout>
  <form class="form-horizontal" action="${pageContext.request.contextPath}/checSprzedazy" role="form" method="POST">

    <div id="szablony">


      <div id="POPUP_wybierzSzablon">

      </div>

    </div>

    <div id="danePrzedmiotu">


      <div id="parametryPrzedmiotu_ZKategorii">
        <%-- Ta formatka będzie generowana przez JS na podstawie parametrów szczegółowych dla wybranej kategorii --%>
      </div>

      <div id="POPUP_kodEANISBN">

      </div>

    </div>

    <div id="szczegolyOferty">

      <div id="opcjePromowania">
          <%-- Ta formatka będzie generowana przez JS na podstawie zdefiniowanych opcji promowania dla kategorii --%>
      </div>

      <div id="POPUP_dataRozpoczecia">

      </div>

    </div>

    <div id="platnoscIDostawa">


      <div id="POPUP_dodatkoweInfoOdostawieIPlatnosci">

      </div>

      <div id="POPUP_lokalizacja">

      </div>

      <div id="POPUP_wysylkaWCiagu">

      </div>

      <div id="POPUP_cennikDostawy">
        <%--  --%>
      </div>

    </div>

    <div id="dodatkoweInfo">
      <%-- edytor wizualny - opis przedniotu --%>
    </div>

  </form>
</t:layout>

