<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Trần Đăng Đình
  Date: 31/12/2021
  Time: 6:33 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
<%
    Map<String ,String >dic =new HashMap<>();
%>
  <%
      dic.put("hello","Xin chào");
      dic.put("how","Thế nào");
      dic.put("book","Quyển vở");
      dic.put("computer","Máy tính");

      String search = request.getParameter("search");

      String result = dic.get(search);
      if (result != null){
          System.out.println("World: "+search);
          System.out.println("Result: "+result);
      }else {
          System.out.println("Not found");
      }

  %>
</body>
</html>
