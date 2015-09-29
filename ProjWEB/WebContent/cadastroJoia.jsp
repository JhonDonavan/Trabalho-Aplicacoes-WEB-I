<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Joias</title>



<jsp:useBean id="joia" class="modelo.dominio.Joia" scope="request"></jsp:useBean>
</head>
<body>

<%
	String mensagem = (String)request.getAttribute("mensagem");
	if(mensagem != null)
	out.println("<h3>"+ mensagem +"<h3>");
%>

<form action="SalvarCadastroJoia" method="post" onsubmit="return validar()">
		<table>
			<tr>
				<td class="campo">Codigo identificador:</td>
				<td><input type="text" name="id" id="id" value="" size="30" maxlength="80"></td>
			</tr>
			<tr>
				<td class="campo">Preço:</td>
				<td><input type="text" name="preco" value="" size="11" maxlength="11"></td>
			</tr>	
			<tr>
				<td class="campo">Tipo:</td>
				<td><input type="text" name="tipo" value="" size="30" maxlength="80"></td>
			</tr>	
			<tr>
				<td class="campo">Genero:</td>
				<td><input type="text" name="genero" value="" size="30" maxlength="80"></td>
			</tr>
			<tr>
				<td class="campo">Quantidade:</td>
				<td><input type="text" name="quantidade" value="" size="30" maxlength="80"></td>
			</tr>		
			<tr>
				<td></td>
				<td><input type="submit" value="Enviar">&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="Limpar"  onClick="limpa()"/></td>
			</tr>			
		
		
		
		
		
		</table>
	</form>

</body>
</html>