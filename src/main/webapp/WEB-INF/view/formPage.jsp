<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>

    <body >
        <form action="processForm" method="post">
            <input type="text" placeholder="enter first name" name="firstName"> <br><br>
            <input type="text" placeholder="enter last name" name="lastName"> <br><br>
            <input type="email" placeholder="enter e-mail address" name="email"> <br><br>
            <input type="date" placeholder="enter date of birth" name="birthDay"> <br><br>
            <input type="submit">
        </form>
    </body>
</html>

