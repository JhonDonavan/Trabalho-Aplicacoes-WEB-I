<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
.campo {
	text-align: right;
	color: blue;
}
</style>

</head>
<body>
<%
	String nome = request.getParameter("nome");
	String cpf = request.getParameter("cpf");
	String email = request.getParameter("email");
	String end = request.getParameter("end");
	String tel = request.getParameter("tel");
%>
<a href="ExibirClientes">voltar para Lista de Cliente</a>
<jsp:useBean id="cliente" class="modelo.dominio.Cliente" scope="request"></jsp:useBean>
	<table>
		<tr>
			<td class="campo">Nome:</td>
			<td><%=cliente.getNome() %></td>
		</tr>
		<tr>
			<td class="campo">CPF:</td>
			<td><%=cliente.getCpf() %></td>
		</tr>
		<tr>
			<td class="campo">E-MAIL:</td>
			<td><%=cliente.getEmail() %></td>
		</tr>
		<tr>
			<td class="campo">Endereço:</td>
			<td><%=cliente.getEnd() %></td>
		</tr>
		<tr>
			<td class="campo">Telefone:</td>
			<td><%=cliente.getTel() %></td>
		</tr>
	
	
	
	</table>

</body>
</html>