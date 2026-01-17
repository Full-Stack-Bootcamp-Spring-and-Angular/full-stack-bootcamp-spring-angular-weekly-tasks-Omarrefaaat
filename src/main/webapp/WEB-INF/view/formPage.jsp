<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>

    <body >
        <form:form action="processForm" modelAttribute="userModel">
            <form:input type="text" placeholder="username" path="username"/>
            <form:input type="password" placeholder="enterpassword" path="password"/>
            <form:select path="country">
                <form:option value="Egypt" label="EGY"/>
                <form:option value="saudi Arabia" label="KSA"/>
                <form:option value="Emarties" label="UAE"/>
                <form:option value="Plastien" label="PLS"/>
            </form:select>
            Java <form:radiobutton path="programmingLanguage" value="JAVA"/>
            C# <form:radiobutton path="programmingLanguage" value="C#"/>
            PHP <form:radiobutton path="programmingLanguage" value="PHP"/>
            Python <form:radiobutton path="programmingLanguage" value="Python"/>
            Linux <form:checkbox path="preferredOperationSystems" value="Linux"/>
            MacOS <form:checkbox path="preferredOperationSystems" value="MacOS"/>
            Windows <form:checkbox path="preferredOperationSystems" value="Windows"/>


            <input type="submit" class="btn btn-danger">
        </form:form>
    </body>
</html>

