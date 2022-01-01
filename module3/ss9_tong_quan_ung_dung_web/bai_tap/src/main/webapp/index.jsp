<%--
  Created by IntelliJ IDEA.
  User: Trần Đăng Đình
  Date: 29/12/2021
  Time: 6:02 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>

    <style>
      .content{
        border: solid;
        text-align: center;
      }


    </style>
  </head>
  <body>
  <div class="content">
  <h3>Ứng dụng Product Discount Calculator</h3>
    <form method="post" action="/display-discount">
      <label>Product Description:</label>
      <input type="text" name="product_description" placeholder="Enter Product Description" /><br/>
      <label>List Price:</label>
      <input type="text" name="list_price" placeholder="Enter List Price" /><br/>
      <label>Discount Percent: </label>
      <input type="text" name="discount_percent" placeholder="Enter Discount Percen" /><br/>
      <input type = "submit" id = "submit" value = "Calculate Discount"/>
    </form>
</html>
