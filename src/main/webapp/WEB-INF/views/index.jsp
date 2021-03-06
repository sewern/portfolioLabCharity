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
    <%@include file="fragments/header.jspf"%>

    <%@include file="fragments/stats.jspf"%>

    <%@include file="fragments/steps.jspf"%>

    <%@include file="fragments/about.jspf"%>

    <%@include file="fragments/help.jspf"%>

    <%@include file="fragments/footer.jspf"%>

    <script src="<c:url value="/resources/js/app.js"/>"></script>
  </body>
</html>
