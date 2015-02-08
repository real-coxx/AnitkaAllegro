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

  <div id="szablony">
    <label ></label>

    <div id="POPUP_wybierzSzablon">

    </div>

  </div>

  <form class="form-horizontal" action="${pageContext.request.contextPath}/checSprzedazy" role="form" method="POST">







    <fieldset id="sekcjaPrzedmiotu">
      <legend>dane przedmiotu </legend>
      <div id="danePrzedmiotu">

        <div id="podsekcja_tytulAukcji">
          <div>
            <label>
              nazwa przedmiotu
            </label>
          </div>
          <div>
            <input class="form-control" id="name" name="name" maxlength="50" value="" type="text"/>
            <div class="validation-message"><div>Wpisz nazwę przedmiotu</div></div>
            <div class="help-block pull-right">Pozostało znaków: <span id="charCounter">7</span></div>
          </div>
          <div>
            <p style="" class="parent">
              kod EAN / ISBN przedmiotu:
              <span class="manualTrigger" id="eanBtn" role="button">Dodaj</span>
            </p>
          </div>
        </div>

        <div id="podsekcja_wyborKategorii">
          <label>
            kategoria
          </label>
          <div id="selektorKategorii">
            <%
              //select z kategoriami głównymi
            %>
              <%-- Ta formatka będzie generowana przez JS na podstawie dostępnych kategorii --%>
          </div>
          <label class="validation"></label>
        </div>


        <div id="podsekcja_parametryPrzedmiotuZKategorii">
            <%-- Ta formatka będzie generowana przez JS na podstawie parametrów szczegółowych dla wybranej kategorii --%>
        </div>

        <div id="podsekcja_zdjecia">
          <label>
            zdjęcia
          </label>
          <input id="zdjecie1" style="display: none;"/>
          <input id="zdjecie2" style="display: none;"/>
          <input id="zdjecie3" style="display: none;"/>
          <input id="zdjecie4" style="display: none;"/>
          <input id="zdjecie5" style="display: none;"/>
          <input id="zdjecie6" style="display: none;"/>
          <input id="zdjecie7" style="display: none;"/>
          <input id="zdjecie8" style="display: none;"/>
        </div>


        <%--      DIALOGS        --%>

        <div id="POPUP_kodEANISBN">
          <label>
            kod EAN / ISBN przedmiotu:
          </label>
          <input id="numerISBNEAN" />
            <span id="numerISBNEAN_OKButton">
              <a href="#">dodaj</a>
            </span>
        </div>
        <%--      /DIALOGS        --%>

      </div>
    </fieldset>








      <fieldset id="sekcjaOferty">
        <legend>szczegóły oferty </legend>
          <div id="szczegolyOferty">

            <div id="podsekcja_rodzajAukcji">
              <input type="radio" name="rodzajAukcjiRadioSection" value="licytacja"/>licytacja
              <input type="radio" name="rodzajAukcjiRadioSection" value="kupTeraz"/>Tylko Kup Teraz
              <label class="validation"></label>
            </div>

            <div id="podsekcja_cenyPrzedmiotu">
              <div>
                <label>liczba</label>
                <input type="text" />
                <select>
                  <%
                    //kod wymieniający jednostki przedmiotu (niezależne od kontekstu)
                  %>
                </select>
                <label class="validation">pole wymagane</label>
              </div>
              <div>
                <label>cena minimalna</label>
                <input type="text" />
                <label class="validation"></label>
              </div>
              <div>
                <label>cena wywoławcza</label>
                <input type="text" />
                <label class="validation">pole wymagane</label>
              </div>
              <div>
                <label>cena kup teraz</label>
                <input type="text" />
                <label class="validation">pole wymagane</label>
              </div>
              <div>
                <label>czas trwania</label>
                <select>
                  <%
                    //kod wymieniający czasy trwania (niezależne od kontekstu)
                  %>
                </select>
                <label class="validation">pole wymagane</label>
              </div>
            </div>

            <div id="podsekcja_opcjeAutoWznowienia">

            </div>

            <div id="podsekcja_opcjePromowania">
                <%-- Ta formatka będzie generowana przez JS na podstawie zdefiniowanych opcji promowania dla kategorii --%>
            </div>

            <div id="POPUP_dataRozpoczecia">

            </div>

          </div>
      </fieldset>









    <fieldset id="sekcjaPrzesyłki">
      <legend>
        płatność i dostawa </legend>
    <div id="platnoscIDostawa">


      <div id="POPUP_dodatkoweInfoOdostawieIPlatnosci">

      </div>

      <div id="POPUP_lokalizacja">
          <%-- input - miejscowosc --%>
          <%-- input - kod poczt --%>
          <%-- select - wojewodztwa --%>
          <%-- select - kraje --%>
          <%-- button - zatwierdz --%>
      </div>

      <div id="POPUP_wysylkaWCiagu">
          <%-- select - czasy wysylki --%>
          <%-- button - zatwierdz --%>
      </div>

      <div id="POPUP_cennikDostawy">
        <%-- select - nazy cennikow --%>
        <%-- button - zatwierdz --%>
      </div>

    </div>
</fieldset>





    <fieldset id="sekcjaOpisu">
      <legend>
        szczegóły oferty </legend>
    <div id="dodatkoweInfo">
      <%-- textarea - opis przedniotu --%>
    </div>
</fieldset>



  </form>
</t:layout>

