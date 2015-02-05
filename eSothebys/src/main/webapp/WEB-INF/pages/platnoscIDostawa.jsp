<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<t:layout>

    <script>
        $(document).ready(function () {
            $('#przesylkaMenu').on('change', function () {
                var przesylkaMenuKwota = parseInt($(this).val());
                $('#razem').text(przesylkaMenuKwota + parseInt($('#cenaZaSztuki').text()));
            });
        });

    </script>

    <div class="page-header">
        <h1 style="color: #f5f5f5">Płatność i dostawa</h1>
    </div>

    <form class="form-horizontal" action="${pageContext.request.contextPath}/resultatKupna" role="form" method="POST">
        <div style="width: 80%; margin-left: 10%; margin-right: 10%">
            <h2>1. Sposób dostawy</h2>

            <br>
            <br>

            <div style="margin-left: 4%">
                <h4 style="display: inline">${aukcja.tytul}</h4>
                <h6 style="display: inline; margin-left: 20px">${liczbaSztuk}</h6>
                <h4 class="pull-right" style="display: inline; margin-right: 20px"> zł</h4>
                <h4 id="cenaZaSztuki" class="pull-right" style="display: inline">${cenaZaSztuki}</h4>
            </div>

            <br>
            <br>

            <div style="margin-left: 4%">
                <h4 style="display: inline">Sposób dostawy:</h4>

                <div class="dropdown" style="display: inline; margin-left: 110px">
                    <select id="przesylkaMenu" name="menu">
                        <option value="" disabled="disabled" selected="selected"></option>
                        <c:forEach items="${menuSposobuDostawy}" var="entry">
                            <tr>
                                <option value=${entry.value}>${entry.key}</option>
                            </tr>
                        </c:forEach>
                    </select>
                </div>
            </div>

            <br>
            <br>

            <div style="margin-left: 4%">
                <h4>Wiadomość dla sprzedającego:</h4>
                <textarea class="form-control" rows="4" style="resize: none; width: 50%; margin-left: 250px"></textarea>
            </div>
        </div>

        <br>
        <br>
        <br>
        <br>

        <div style="width: 80%; margin-left: 10%; margin-right: 10%">
            <h2>2. Metoda płatności</h2>

            <div class="dropdown" style="margin-left: 295px">
                <select>
                    <option value="" disabled="disabled" selected="selected"></option>
                    <option value="1">Przelew</option>
                    <option value="2">Karta płatnicza</option>
                    <option value="3">Konto PayU</option>
                </select>
            </div>
        </div>

        <br>
        <br>
        <br>
        <br>

        <div style="width: 80%; margin-left: 10%; margin-right: 10%">
            <h2>3. Dane do wysyłki</h2>

            <br>
            <br>

            <div style="margin-left: 4%">
                <h4>${uzytkownik.imie} ${uzytkownik.nazwisko}</h4>
                <h4>${adres.ulicaZNumerem}</h4>
                <h4>${adres.kodPocztow} ${adres.miejscowosc}</h4>
                <h4>${adres.krajEntity.nazwa}</h4>
            </div>

            <br>

            <a href="podsatwić okienko" style="margin-left: 4%">inny adres</a>

            <br>
            <br>

            <h4 style="margin-left: 4%">${uzytkownik.email}</h4>

            <br>

            <div style="margin-left: 4%">
                <div class="input-group">
                    <span class="input-group-addon" id="basic-addon1">Telefon</span>
                    <input type="tel" class="form-control" placeholder="numer telefonu" aria-describedby="basic-addon1"
                           style="width: 200px; height: 30px">
                </div>
            </div>

        </div>

        <div style="margin-right: 20%">
            <h4 class="pull-right" style="display: inline; margin-left: 10px">zł</h4>
            <h4 id="razem" class="pull-right" style="display: inline">${cenaZaSztuki}</h4>
            <h4 class="pull-right" style="display: inline; margin-right: 10px">razem: </h4>
        </div>

        <br>
        <br>
        <br>

        <div style="margin-right: 20%">
            <button style="width: 115px" type="submit" class="btn btn-default btn-lg pull-right">Zapłać</button>
        </div>
    </form>

</t:layout>
