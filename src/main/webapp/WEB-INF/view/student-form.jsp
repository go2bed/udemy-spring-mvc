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
        <form:option value="${student.countryOptions.get('BR')}" label="Brazil"/>
        <form:option value="${student.countryOptions.get('FR')}" label="France"/>
        <form:option value="${student.countryOptions.get('DE')}" label="Germany"/>
        <form:option value="${student.countryOptions.get('IN')}" label="India"/>
    </form:select>

    <br><br>

    <input type="submit" value="Submit"/>

</form:form>

</body>
</html>
