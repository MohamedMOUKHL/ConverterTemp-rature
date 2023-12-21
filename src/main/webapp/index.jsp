<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Temperature Converter</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style.css">
</head>
<body>
<div class="container">
    <form action="${pageContext.request.contextPath}/convert" method="post">
        Enter temperature in Celsius: <input type="number" name="celsius" required>
        <input type="submit" value="Convert">
    </form>
</div>
</body>
</html>
