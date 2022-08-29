<%-- 
    Document   : fileUploadView
    Created on : Aug 29, 2022, 9:34:27 PM
    Author     : XV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Spring MVC File Upload</title>
    </head>
    <body>
        <h2>Submitted Files</h2>
    <tr>
        <td>OriginalFileName:</td>
        <td>${file.originalFilename}</td>
    </tr>
    <tr>
        <td>Type:</td>
        <td>${file.contentType}</td>
    </tr>
    <tr>
        <td>Display</td>
        <img src="upload/enjoy.png" alt="image" width="500" height="600">
    </tr>
</body>
</html>
