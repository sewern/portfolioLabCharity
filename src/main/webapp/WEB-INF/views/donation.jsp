<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %><html>

<head>
  <title>Darowizna</title>
</head>
<body>
  <form:form method="post" modelAttribute="donation">
    <form:label path="categories">Kategorie:</form:label>
    <form:checkboxes path="categories" items="${categories}"/><br>
    <form:errors path="categories" cssClass="error" element="div"/>
    <form:label path="institution">Fundacja:</form:label>
    <form:select path="institution.id" items="${institutions}"/><br>
    <form:errors path="institution" cssClass="error" element="div"/>
    <form:label path="zipCode">Kod poczt.:</form:label>
    <form:input path="zipCode"/><br>
    <form:errors path="zipCode" cssClass="error" element="div"/>
    <form:label path="street">Ulica:</form:label>
    <form:input path="street"/><br>
    <form:errors path="street" cssClass="error" element="div"/>
    <form:label path="city">Miasto:</form:label>
    <form:input path="city"/><br>
    <form:errors path="city" cssClass="error" element="div"/>
    <form:label path="quantity">Ilość worków:</form:label>
    <form:input path="quantity"/><br>
    <form:errors path="quantity" cssClass="error" element="div"/>
    <form:label path="pickUpComment">Komentarz:</form:label>
    <form:textarea path="pickUpComment"/><br>
    <form:errors path="pickUpComment" cssClass="error" element="div"/>
    <form:label path="pickUpDate">Data:</form:label>
    <form:input type="date" path="pickUpDate"/><br>
    <form:errors type="date" path="pickUpDate" cssClass="error" element="div"/>
    <form:label path="pickUpTime">Czas:</form:label>
    <form:input type="time" path="pickUpTime"/><br>
    <form:errors type="time" path="pickUpTime" cssClass="error" element="div"/>
    <input type="submit" value="Zapisz">
  </form:form>
</body>
</html>
