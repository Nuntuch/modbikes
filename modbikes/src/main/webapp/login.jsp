<%-- 
    Document   : login
    Created on : Apr 13, 2021, 5:24:44 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="LoginServlet" method="post">
            ID : <input type="number" name="id" required/> <br>
            PIN : <input type="number" name="pin" required/> <br>
            <input type="submit"/><br>
            
        </form>        
        ${status}
        
    </body>
</html>
