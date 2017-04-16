<%-- 
    Document   : index
    Created on : Apr 16, 2017, 12:12:29 PM
    Author     : igor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calculadora Web</h1>
        <form method = "POST" action = "ServletOperaciones"> 
        x: <input type = "text" name = "textNum1" id = "idNum1" style = "font-size:20px"> <br /> <br />
        y: <input type = "text" name = "textNum2" id = "idNum2" style = "font-size:20px"> <br /> <br />
        <input type = "submit" name = "btnSumar" value="Sumar(x + y)" style = "font-size:20px"/> <br /> <br />
        <input type = "submit" name = "btnRestar" value="Restar(x - y)" style="font-size:20px"/>  <br /> <br />
        <input type = "submit" name = "btnMultiplicar" value="Multiplicar(x * y)" style="font-size:20px"/>  <br /> <br />
        <input type = "submit" name = "btnDividir" value="Dividir(x / y)" style="font-size:20px"/>  <br /> <br />
        <input type = "submit" name = "btnPower" value="Power(x ^ y)" style="font-size:20px"/>         
        </form>             
    </body>
</html>
