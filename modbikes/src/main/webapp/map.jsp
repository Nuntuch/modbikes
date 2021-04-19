<%-- 
    Document   : map
    Created on : Apr 19, 2021, 3:30:15 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>-->


<!DOCTYPE HTML>
<html>
  <head>
        <meta charset="UTF-8">
        <title>Create Map Sample | Longdo Map</title>
        <style type="text/css">
html {
  height: 100%;
}
body {
  margin: 0px;
  height: 100%;
}
#map {
  height: 100%;
}
</style>
        <script type="text/javascript" src="https://api.longdo.com/map/?key=[YOUR-KEY-API]"></script>
        <script>
          function init() {
            var map = new longdo.Map({
              placeholder: document.getElementById('map')
            });
          }
        </script>
  </head>
  <body onload="init();">
      <div id="map"></div>
  </body>
</html>