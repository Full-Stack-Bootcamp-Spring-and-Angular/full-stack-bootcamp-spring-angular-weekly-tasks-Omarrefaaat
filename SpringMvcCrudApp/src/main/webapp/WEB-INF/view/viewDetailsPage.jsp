<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/bootstrap.min.css' />">
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/style.css' />">
</head>
<body>

<div class="container mt-5">
    <h1>Product Details</h1>

    <div class="card mt-4">
        <div class="card-body">
            <p><b>ID:</b> ${productModel.id}</p>
            <p><b>Name:</b> ${productModel.name}</p>
            <p><b>Price:</b> ${productModel.price}</p>
            <p><b>Available:</b>
                <c:choose>
                    <c:when test="${productModel.productAvailable}">Yes</c:when>
                    <c:otherwise>No</c:otherwise>
                </c:choose>
            </p>
        </div>
    </div>

    <a class="btn btn-secondary mt-3" href="${pageContext.request.contextPath}/products">Back</a>
</div>

</body>
</html>