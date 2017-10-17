<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World - Inpuy Form</title>
</head>
<body>
<form action="processForm" method="get">
    <input type="text"  title="name" name="name" placeholder="What's your name?"/>
    <input type="submit" value="Submit Query"/>
</form>


<form action="processFormVersionTwo" method="get">
    <input type="text"  title="name" name="studentName" placeholder="What's your name, student?"/>
    <input type="submit" value="Submit Query Version Two"/>
</form>
</body>
</html>
