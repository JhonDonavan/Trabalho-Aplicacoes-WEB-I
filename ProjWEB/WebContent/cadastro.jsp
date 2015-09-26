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

<script type="text/javascript">
function validar()
{
	var f = document.forms[0];
	if (f.nome.value == '')
	{
		alert('O campo NOME não foi preenchido.');
		f.nome.focus();
		//f.nome.setbackground(Color.RED);
		//<campo>.setForeground(Color.RED); 
		return false;
	}
	else if(f.sobrenome.value == '')
		{
		alert('O campo sobre nome não foi preenchido');
		f.sobrenome.focus();
		return false;
		}
	else if (f.cpf.value == '')
	{
		alert('O campo CPF não foi preenchido.');
		f.cpf.focus();
		return false;
	}
	return true;
}

function limpa()
{
	var f = document.forms[0];
	
	if(((f.nome.value && f.cpf.value && f.end.value && f.tel.value && f.email.value) != ' '))
	{
		f.nome.value = '';
		//f.sobrenome.value = '';
		f.cpf.value = '';
		//f.data_nasc.value = '';
		f.end.value = '';
		f.tel.value = '';
		f.email.value= '';
		f.nome.focus();
	}
	
}
</script>

<jsp:useBean id="cliente" class="modelo.dominio.Cliente" scope="request"></jsp:useBean>

</head>
<%
	String mensagem = (String) request.getAttribute("mensagem");
	if (mensagem != null)
		out.println("<h3>" + mensagem + "</h3>");
%>
<body>
	<form action="SalvarCadastro" method="post" onsubmit="return validar()">
		<table>
			<tr>
				<td class="campo">Nome:</td>
				<td><input type="text" name="nome" value="" size="30" maxlength="80"></td>
			</tr>
			<tr>
				<td class="campo">CPF:</td>
				<td><input type="text" name="cpf" value="" size="11" maxlength="11"></td>
			</tr>	
			<tr>
				<td class="campo">E-MAIL:</td>
				<td><input type="text" name="email" value="" size="30" maxlength="80"></td>
			</tr>	
			<tr>
				<td class="campo">Endereço:</td>
				<td><input type="text" name="end" value="" size="30" maxlength="80"></td>
			</tr>	
			<tr>
				<td class="campo">Telefone:</td>
				<td><input type="text" name="tel" value="" size="12" maxlength="12"></td>
			</tr>	
			<tr>
				<td></td>
				<td><input type="submit" value="Enviar">&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="Limpar"  onClick="limpa()"/></td>
			</tr>			
		
		
		
		
		
		</table>
	</form>

</body>
</html>