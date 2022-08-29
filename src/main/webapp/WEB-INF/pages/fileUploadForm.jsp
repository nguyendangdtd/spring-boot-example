<%-- 
    Document   : fileUploadForm
    Created on : Aug 29, 2022, 9:21:34 PM
    Author     : XV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Upload File Form</title>
    </head>
    <body>
        <form method="POST" action="upload" enctype="multipart/form-data">
            <table>
                <tr>
                    <td>Select a file to upload</td>
                    <td><input type="file" name="file" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit" /></td>
                </tr>
            </table>
        </form>
    </body>
</html>
