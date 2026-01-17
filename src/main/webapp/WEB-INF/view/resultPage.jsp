<html>
<head>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body >
        <h1>User Form</h1>
        <h3>UserName Is : ${userModel.username}</h3>
        <h3>UserPassword Is : ${userModel.password}</h3>
        <h3>UserCountry Is : ${userModel.country}</h3>
        <h3>UserLanguage Is : ${userModel.programmingLanguage}</h3>
        <h3>UserPreferredOperationSystems Is : ${userModel.preferredOperationSystems}</h3>

</body>
</html>


