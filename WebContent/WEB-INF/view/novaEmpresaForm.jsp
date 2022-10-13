<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="linkEntradaNovaEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro</title>
</head>
<body>
	<form action="${linkEntradaNovaEmpresa}" method="post">
		Nome: <input type="text" name="nome"/>
		Data Abertura: <input type="text" name="data"/>
		
		<input type="submit" value="Incluir" />
		<input type="hidden" name="acao" value="NovaEmpresa" />
	</form>
</body>
</html>