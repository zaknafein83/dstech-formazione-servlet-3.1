<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Invio mail tramite JSP</title>
</head>
<body>
    <form action="EmailSendingServlet" method="post">
        <table border="0" width="35%" align="center">
            <caption><h2>Invia una mail </h2></caption>
            <tr>
                <td width="50%">Indirizzo</td>
                <td><input type="text" name="indirizzo" size="50"/></td>
            </tr>
            <tr>
                <td>Oggetto mail: </td>
                <td><input type="text" name="soggetto" size="50"/></td>
            </tr>
            <tr>
                <td>Contenuto</td>
                <td><textarea rows="10" cols="39" name="contenuto"></textarea> </td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Invia"/></td>
            </tr>
        </table>
         
    </form>
</body>
</html>