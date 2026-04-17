<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <!-- Bootstrap + Custom CSS -->
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/bootstrap.min.css' />">
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/style.css' />">
</head>

<body>
<h1>Products Data</h1>

<div class="tbl-div">
    <table class="table">
        <thead class="thead-dark">
        <tr>
            <th scope="col">#</th>
            <th scope="col">Name</th>
            <th scope="col">Show Details</th>
            <th scope="col">Add/Update</th>
            <th scope="col">Delete</th>
        </tr>
        </thead>

        <tbody>

        <c:forEach items="${productLists}" var="item">
            <tr>
                <td>${item.id}</td>
                <td>${item.name}</td>

                <td>
                    <a class="btn btn-primary"
                       href="${pageContext.request.contextPath}/viewDetailsPage?id=${item.id}">
                        View Details
                    </a>
                </td>

                <td>
                    <form:form action="${pageContext.request.contextPath}/updateDetailsForm" method="get">
                        <input type="hidden" name="id" value="${item.id}"/>
                        <input type="submit" class="btn btn-warning" value="Add/Update Details"/>
                    </form:form>
                </td>

                <td>
                    <form:form action="${pageContext.request.contextPath}/deleteProduct" method="post">
                        <input type="hidden" name="id" value="${item.id}"/>
                        <input type="submit" class="btn btn-danger" value="Delete"/>
                    </form:form>
                </td>
            </tr>
        </c:forEach>
        </tbody>

    </table>

    <form:form action="${pageContext.request.contextPath}/addProduct" method="get">
        <input type="submit" class="btn btn-success" value="Add new Product"/>
    </form:form>
</div>

</body>
</html>