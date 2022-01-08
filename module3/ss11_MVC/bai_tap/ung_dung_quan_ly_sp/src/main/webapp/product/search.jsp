<%--
  Created by IntelliJ IDEA.
  User: Trần Đăng Đình
  Date: 06/01/2022
  Time: 11:09 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Search Product</title>
</head>
<body>
<h1>Search product</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<table border="1">
    <tr>
        <th>Name</th>
        <th>Product Name</th>
        <th>Price</th>
    </tr>
    <c:forEach items='${products}' var="product">
        <tr>
            <td>${product.getName()}</td>
            <td>${product.getProductName()}</td>
            <td>${product.getPrice()}</td>
            <td>${product.getProducer()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
