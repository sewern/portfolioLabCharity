<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="pl">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Document</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"/>
  </head>

  <body>
    <header class="header--form-page">
      <%@include file="fragments/nav-form.jspf"%>

      <div class="slogan container container--90">
        <div class="slogan--item">
          <h1>
            Oddaj rzeczy, których już nie chcesz<br />
            <span class="uppercase">potrzebującym</span>
          </h1>

          <%@include file="fragments/steps-form.jspf"%>
        </div>
      </div>
    </header>

    <section class="form--steps">
      <div class="form--steps-instructions">
        <div class="form--steps-container">
          <h3>Ważne!</h3>
          <p data-step="1" class="active">
            Uzupełnij szczegóły dotyczące Twoich rzeczy. Dzięki temu będziemy
            wiedzieć komu najlepiej je przekazać.
          </p>
          <p data-step="2">
            Uzupełnij szczegóły dotyczące Twoich rzeczy. Dzięki temu będziemy
            wiedzieć komu najlepiej je przekazać.
          </p>
          <p data-step="3">
           Wybierz jedną, do
            której trafi Twoja przesyłka.
          </p>
          <p data-step="4">Podaj adres oraz termin odbioru rzeczy.</p>
        </div>
      </div>

      <div class="form--steps-container">
        <div class="form--steps-counter">Krok <span>1</span>/4</div>

        <form id="donation" method="post">
          <!-- STEP 1: class .active is switching steps -->
          <div data-step="1" class="active">
            <h3>Zaznacz co chcesz oddać:</h3>

            <c:forEach items="${categories}" var="category" varStatus="categoryStatus">
              <div class="form-group form-group--checkbox">
                <label>
                  <input id="categories${categoryStatus.count}" type="checkbox" name="categories" value="${category.id}"/>
                  <span class="checkbox"></span>
                  <span class="description"><c:out value="${category.name}"/></span>
                </label>
              </div>
            </c:forEach>

            <input type="hidden" name="_categories" value="on">
            <div class="form-group form-group--buttons">
              <button type="button" class="btn next-step">Dalej</button>
            </div>
          </div>

          <!-- STEP 2 -->
          <div data-step="2">
            <h3>Podaj liczbę 60l worków, w które spakowałeś/aś rzeczy:</h3>

            <div class="form-group form-group--inline">
              <label>
                Liczba 60l worków:
                <input id="quantity" type="number" name="quantity" step="1" min="1" />
              </label>
            </div>

            <div class="form-group form-group--buttons">
              <button type="button" class="btn prev-step">Wstecz</button>
              <button type="button" class="btn next-step">Dalej</button>
            </div>
          </div>

          <!-- STEP 3 -->
          <div data-step="3">
            <h3>Wybierz organizacje, której chcesz pomóc:</h3>

            <c:forEach items="${institutions}" var="institution" varStatus="institutionStatus">
              <div class="form-group form-group--checkbox">
                <label>
                  <input id="institution.id${institutionStatus.count}" type="radio" name="institution.id" value="${institution.id}" />
                  <span class="checkbox radio"></span>
                  <span class="description">
                    <div class="title"><c:out value="${institution.name}"/></div>
                    <div class="subtitle"><c:out value="${institution.description}"/></div>
                  </span>
                </label>
              </div>
            </c:forEach>

            <div class="form-group form-group--buttons">
              <button type="button" class="btn prev-step">Wstecz</button>
              <button type="button" class="btn next-step">Dalej</button>
            </div>
          </div>

          <!-- STEP 4 -->
          <div data-step="4">
            <h3>Podaj adres oraz termin odbioru rzecz przez kuriera:</h3>

            <div class="form-section form-section--columns">
              <div class="form-section--column">
                <h4>Adres odbioru</h4>
                <div class="form-group form-group--inline">
                  <label> Ulica <input id="street" type="text" name="street" /> </label>
                </div>

                <div class="form-group form-group--inline">
                  <label> Miasto <input id="city" type="text" name="city" /> </label>
                </div>

                <div class="form-group form-group--inline">
                  <label>
                    Kod pocztowy <input id="zipCode" type="text" name="zipCode" />
                  </label>
                </div>

                <div class="form-group form-group--inline">
                  <label>
                    Numer telefonu <input id="phone" type="phone" name="phone" />
                  </label>
                </div>
              </div>

              <div class="form-section--column">
                <h4>Termin odbioru</h4>
                <div class="form-group form-group--inline">
                  <label> Data <input id="pickUpDate" type="date" name="pickUpDate" /> </label>
                </div>

                <div class="form-group form-group--inline">
                  <label> Godzina <input id="pickUpTime" type="time" name="pickUpTime" /> </label>
                </div>

                <div class="form-group form-group--inline">
                  <label>
                    Uwagi dla kuriera
                    <textarea id="pickUpComment" name="pickUpComment" rows="5"></textarea>
                  </label>
                </div>
              </div>
            </div>
            <div class="form-group form-group--buttons">
              <button type="button" class="btn prev-step">Wstecz</button>
              <button type="button" class="btn next-step">Dalej</button>
            </div>
          </div>

          <!-- STEP 6 -->
          <div data-step="5">
            <h3>Podsumowanie Twojej darowizny</h3>

            <div class="summary">
              <div class="form-section">
                <h4>Oddajesz:</h4>
                <ul>
                  <li>
                    <span class="icon icon-bag"></span>
                    <span class="summary--text"
                      >4 worki ubrań w dobrym stanie dla dzieci</span
                    >
                  </li>

                  <li>
                    <span class="icon icon-hand"></span>
                    <span class="summary--text"
                      >Dla fundacji "Mam marzenie" w Warszawie</span
                    >
                  </li>
                </ul>
              </div>

              <div class="form-section form-section--columns">
                <div class="form-section--column">
                  <h4>Adres odbioru:</h4>
                  <ul>
                    <li>Prosta 51</li>
                    <li>Warszawa</li>
                    <li>99-098</li>
                    <li>123 456 789</li>
                  </ul>
                </div>

                <div class="form-section--column">
                  <h4>Termin odbioru:</h4>
                  <ul>
                    <li>13/12/2018</li>
                    <li>15:40</li>
                    <li>Brak uwag</li>
                  </ul>
                </div>
              </div>
            </div>

            <div class="form-group form-group--buttons">
              <button type="button" class="btn prev-step">Wstecz</button>
              <button type="submit" class="btn">Potwierdzam</button>
            </div>
          </div>
        </form>
      </div>
    </section>

    <%@include file="fragments/footer.jspf"%>

    <script src="<c:url value="/resources/js/app.js"/>"></script>
  </body>
</html>
