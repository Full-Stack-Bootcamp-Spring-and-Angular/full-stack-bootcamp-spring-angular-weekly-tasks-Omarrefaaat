<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/bootstrap.min.css' />">
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/style.css' />">
</head>

<body>
<h1>Update Product</h1>

<%--@elvariable id="productModel" type="org"--%>
<form:form action="${pageContext.request.contextPath}/processUpdateProductForm"
           method="post" modelAttribute="productModel">

    <!-- مهم جدًا: الـ id يتبعت hidden -->
    <form:hidden path="id"/>

    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">

                <div class="form-group">
                    <h3>Update Product</h3>
                </div>

                <!-- عرض الـ ID فقط (مش قابل للتعديل) -->
                <div class="form-group">
                    <label>ID</label>
                    <input type="text" class="form-control" value="${productModel.id}" readonly/>
                </div>

                <div class="form-group">
                    <label>Product name</label>
                    <form:input cssClass="form-control" path="name" placeholder="Enter product name"/>
                    <form:errors path="name" cssClass="error"/>
                </div>

                <div class="form-group">
                    <label>Price</label>
                    <form:input cssClass="form-control" path="price" placeholder="e.g. 120.50"/>
                    <form:errors path="price" cssClass="error"/>
                </div>

                <div class="form-group">
                    <label>Availability</label>
                    <form:input cssClass="form-control" path="productAvailable" placeholder="0 or 1"/>
                    <form:errors path="productAvailable" cssClass="error"/>
                </div>

                <input type="submit" class="btn btn-primary" value="Save"/>
                <a class="btn btn-secondary" href="${pageContext.request.contextPath}/products">Cancel</a>

            </div>
        </div>
    </div>
</form:form>

</body>
</html>