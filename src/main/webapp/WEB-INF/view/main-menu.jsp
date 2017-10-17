<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Spring MVC Demo - Home page</h2>

${message}
<hr>
<br>
<img src="${pageContext.request.contextPath}/resources/images/cat.jpeg"  height="200">
<br>
<a href="hello/showForm">Hello World form</a>

<a href="student/showForm">Student form</a>
</body>
</html>
