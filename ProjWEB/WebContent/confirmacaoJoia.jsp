<%@page import="modelo.dominio.Joia"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String preco = request.getParameter("preco");
	String tipo = request.getParameter("tipo");
	String genero = request.getParameter("genero");
	String quantidade = request.getParameter("quantidade");
%>

<jsp:useBean id="joia" class="modelo.dominio.Joia" scope="request"></jsp:useBean>

<a href="ExibirJoias">Exibir Joias</a>

<table>
	<tr>
		<td>Codigo de identificação:</td>
		<td><%=joia.getId() %></td>
	</tr>
	<tr>
		<td>Preço:</td>
		<td><%=joia.getPreco() %></td>
	</tr>
	<tr>
		<td>Tipo:</td>
		<td><%=joia.getTipo() %></td>
	</tr>
	<tr>
		<td>Genero:</td>
		<td><%=joia.getGenero() %></td>
	</tr>
	<tr>
		<td>Quantidade:</td>
		<td><%= joia.getQuantidade() %></td>
	</tr>




</table>



</body>
</html>