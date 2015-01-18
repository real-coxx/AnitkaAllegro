<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<t:layout>
  <div class="page-header">
    <h1 style="color: #f5f5f5">Sprawdź i potwierdź swoją ofertę</h1>
  </div>

  <div>
    <style type="text/css">
      .tg {
        border-collapse: collapse;
        border-spacing: 0;
      }

      .tg td {
        font-family: Arial, sans-serif;
        font-size: 14px;
        padding: 10px 5px;
        border-style: solid;
        border-width: 1px;
        overflow: hidden;
        word-break: normal;
      }

      .tg th {
        font-family: Arial, sans-serif;
        font-size: 14px;
        font-weight: normal;
        padding: 10px 5px;
        border-style: solid;
        border-width: 1px;
        overflow: hidden;
        word-break: normal;
      }
    </style>
    <table class="tg" style="width: 60%; margin-left: 20%; margin-right: 20%; margin-bottom: 40px; margin-top: 20px">
      <tr>
        <td class="tg-031e" style="width: 25%">Aukcja:</td>
        <td class="tg-031e" style="width: 75%">ROWER CROSS MEDIA CROSSWAY 100-V SHIMANO 52cm (numer aukcji: 123456)</td>
      </tr>
      <tr>
        <th class="tg-031e">Minimalna możliwa oferta:</th>
        <th class="tg-031e">539,00 zł</th>
      </tr>
      <tr>
        <th class="tg-031e">Twoja maksymalna oferta:</th>
        <th class="tg-031e">539,00 zł</th>
      </tr>
      <tr>
        <td class="tg-031e">Liczba sztuk, które licytujesz:</td>
        <td class="tg-031e">1</td>
      </tr>
    </table>
  </div>

  <div>
    <button style="width: 100px; margin-left: 20%" type="button" class="btn btn-default pull-left">Wróć</button>
    <button style="width: 100px; margin-right: 20%" type="button" class="btn btn-default pull-right">Licytuj</button>
  </div>
</t:layout>
