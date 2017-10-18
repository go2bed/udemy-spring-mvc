<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student registration form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">

    First name: <form:input path="firstName"/>

    <br><br>

    Last name: <form:input path="lastName"/>

    <br><br>

    <form:select path="country">
        <form:options items="${theCountryOptions}"/>
    </form:select>

    <br><br>
    Favorite Language:

    <form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"  />

    <br><br>

    <input type="submit" value="Submit"/>

</form:form>

</body>
</html>
