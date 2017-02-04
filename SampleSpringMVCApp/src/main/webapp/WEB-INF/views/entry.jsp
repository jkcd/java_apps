<!doctype html>
<%@page import="java.util.Date"%>
<html>
 <title>
    JSP Title
 </title>
 <body>
  <p> This is request param value: ${myarg} </p>
  <% 
  // scriplets are not good
  // java/business logic inside a view is not good
  // avoid writing scriplets
  Date now = new Date();
  %>
  <p> Now: <%=now %></p>
  
  <form action="/login.do" method="post">
   Enter User Id: <input type="text" name="username" value="userid"><br>
   Enter password: <input type="password" name="passwd"><br>
   <input type="submit" name="login">
  
  </form>
  
  
  
 </body>
</html>