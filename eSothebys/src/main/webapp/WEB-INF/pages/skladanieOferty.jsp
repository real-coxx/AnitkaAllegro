<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<t:layout>
    <script>
        $('#myTab a').click(function (e) {
            e.preventDefault()
            $(this).tab('show')
        })
    </script>
    <form class="form-horizontal" action="${pageContext.request.contextPath}/checKupna" role="form" method="POST">
        <div class="page-header">
            <h1 style="color: #f5f5f5">${aukcjaTO.tytul}
                <small style="color: #f5f5f5">(${aukcjaTO.numer})</small>
                <button style="width: 190px" type="button" class="btn btn-default btn-sm pull-right">Obserwuj</button>
            </h1>

            <h3 style="display: inline; color: darkred">Kategoria: </h3>

            <c:forEach var="i" begin="0" end="${nadkategorie.size()-1}">
                <h3 style="display: inline; color: darkred">${nadkategorie.get(nadkategorie.size()-1-i)}</h3>
                <h3 style="display: inline; color: darkred"> - </h3>
            </c:forEach>

            <h3 style="display: inline; color: darkred">${aukcjaTO.kategoria.nazwa}</h3>

            <h3 style="display: inline">
                <button style="width: 190px" type="button" class="btn btn-default btn-sm pull-right">
                    Dodaj kategorię do ulubionych
                </button>
            </h3>
        </div>


        <div>
            <div class="col-lg-6">
                <div>
                    <img src="${aukcjaTO.miniatura.attribute}" width="568">
                </div>
            </div>
            <div class="col-lg-6">
                <c:choose>
                    <c:when test="${aukcjaTO.stan.equals('Aktywna')}">
                    <h5 class="pull-right" style="margin-right: 20px">Zakończenie aukcji: ${aukcjaTO.terminZakonczeniaTekst}</h5>
                    </c:when>
                    <c:otherwise>
                        <h5 class="pull-right" style="margin-right: 20px">Aukcja zakończona</h5>
                    </c:otherwise>
                </c:choose>

                <br>
                <br>

                <h6 style="display: inline">${kupTeraz.iloscOsob}</h6>
                <h6 style="display: inline">${kupTeraz.odmianaOsoby}</h6>
                <h6 style="display: inline">${kupTeraz.iloscSztuk}</h6>
                <h6 style="display: inline; margin-right: 20px">${kupTeraz.odmianaSztuk}</h6>
                <h6 style="display: inline">${licytacja.iloscOsob}</h6>
                <h6 style="display: inline">${licytacja.odmianaOsoby}</h6>

                <br>
                <br>
                <br>

                <div>
                    <table>
                        <tr>
                            <th style="width: 23%">Aktualna cena</th>
                            <th style="width: 18%">Twoja oferta</th>
                            <th style="width: 5%"></th>
                            <th style="width: 18%">Liczba sztuk</th>
                            <th style="width: 18%"></th>
                            <th style="width: 18%"></th>
                        </tr>
                        <tr>
                            <td style="width: 23%">${aukcjaTO.aktualnaCena}</td>
                            <td style="width: 18%">
                                <input type="text" class="form-control" id="twojaOferta">
                            </td>
                            <td style="width: 5%">zł</td>
                            <td style="width: 18%">
                                <input type="text" class="form-control" id="liczbaSztukLicytacji">
                            </td>
                            <td style="width: 18%">z ${aukcjaTO.liczbaDostepnychPrzedmiotow} sztuk</td>
                            <td style="width: 18%">
                                <button style="width: 80px" type="submit" name="licytuj" value="Licytuj" class="btn btn-default btn-sm pull-right">
                                    Licytuj
                                </button>
                            </td>
                        </tr>
                    </table>
                    <br>
                    <br>
                    <table>
                        <tr>
                            <th style="width: 23%">Cena Kup Teraz</th>
                            <th style="width: 18%"></th>
                            <th style="width: 5%"></th>
                            <th style="width: 18%">Liczba sztuk</th>
                            <th style="width: 18%"></th>
                            <th style="width: 18%"></th>
                        </tr>
                        <tr>
                            <td style="width: 23%">${aukcjaTO.cenaKupTeraz}</td>
                            <td style="width: 18%"></td>
                            <td style="width: 5%"></td>
                            <td style="width: 18%">
                                <input type="text" name="liczbaSztuk" class="form-control" id="liczbaSztukKupTeraz" path="liczbaSztuk">
                            </td>
                            <td style="width: 18%">z ${aukcjaTO.liczbaDostepnychPrzedmiotow} sztuk</td>
                            <td style="width: 18%">
                                <button style="width: 80px" type="submit" name="kupTeraz" value="KupTeraz" class="btn btn-default btn-sm pull-right">Kup
                                    Teraz
                                </button>
                            </td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>

        <div class="container col-lg-12" style="margin-top: 50px; margin-bottom: 200px">
            <ul class="nav nav-tabs" role="tablist" id="myTab">
                <li role="presentation" class="active"><a href="#opis" aria-controls="opis" role="tab"
                                                          data-toggle="tab">Opis</a>
                </li>
                <li role="presentation"><a href="#dostawaiplatnosc" aria-controls="dostawaiplatnosc" role="tab"
                                           data-toggle="tab">Dostawa i płatność</a></li>
                <li role="presentation"><a href="#ofertykupna" aria-controls="ofertykupna" role="tab" data-toggle="tab">Oferty
                    kupna</a></li>
            </ul>

            <div class="tab-content">
                <div role="tabpanel" class="tab-pane active" id="opis">
                    <h4>Opis aukcji:</h4>
                    <textarea disabled class="form-control" rows="10"
                              style="width: 70%; margin-left: 15%; resize: none">${aukcjaTO.opisPrzedmiotu}</textarea>
                </div>
                <div role="tabpanel" class="tab-pane" id="dostawaiplatnosc">
                    <h4>${aukcjaTO.dodatkoweInformacjeODostawieIPlatnosci}</h4>
                    <br>
                    <h4>Wysyłka za granicę: ${aukcjaTO.wysylkaZaGranice ? "Tak" : "Nie"}</h4>
                    <br>
                    <br>
                    <h4>Koszty przesyłki:</h4>
                    <div class="panel panel-default" style="width: 80%; margin-left: 10%; margin-top: 10px">
                        <table class="table">
                            <tr>
                                <th></th>
                                <th>Sposób dostawy</th>
                                <th>Liczba sztuk w paczce</th>
                                <th>Cena pierwszej sztuki</th>
                                <th>Cena za kolejną sztukę</th>
                            </tr>
                            <c:forEach var="i" begin="0" end="${szczegolydostawyTOs.size()-1}">
                                <tr>
                                    <th>#</th>
                                    <th>${szczegolydostawyTOs.get(i).sposobDostawy.nazwa}</th>
                                    <th>${szczegolydostawyTOs.get(i).liczbaWPaczce}</th>
                                    <th>${szczegolydostawyTOs.get(i).kosztPierwszejSztuki} zł</th>
                                    <th>${szczegolydostawyTOs.get(i).kosztKolejnejSztuki} zł</th>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                </div>
                <div role="tabpanel" class="tab-pane" id="ofertykupna">
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
                        <c:forEach var="i" begin="0" end="${oferty.size()-1}">
                            <tr>
                                <th>${oferty.get(i).kupujacy.login}</th>
                                <th>${oferty.get(i).aukcja.cenaKupTeraz} zł</th>
                                <th>${oferty.get(i).liczbaSztuk}</th>
                                <th>${oferty.get(i).terminZlozenia}</th>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

        <div>
            <h5 class="pull-left" style="display: inline; margin-left: 20px">Liczba odwiedzin:</h5>
            <h5 class="pull-left" style="display: inline; margin-left: 10px">${aukcjaTO.liczbaOdwiedzin}</h5>
        </div>
        <div>
            <h5 class="pull-right" style="display: inline; margin-right: 20px">${aukcjaTO.terminRozpoczeciaTekst}</h5>
            <h5 class="pull-right" style="display: inline; margin-right: 10px">Rozpoczęcie aukcji:</h5>
        </div>


    </form>
</t:layout>
