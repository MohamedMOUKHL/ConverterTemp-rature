<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Temperature Converter Result</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style.css">
</head>
<body>
<div class="container">
    <h2>Result:</h2>
    <p>${fahrenheit} Fahrenheit</p>
    <a href="${pageContext.request.contextPath}/index.jsp">Go back</a>
</div>
</body>
</html>
