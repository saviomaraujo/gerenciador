<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="linkEntradaLoginUsuario"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form action="${linkEntradaLoginUsuario}" method="post">
		Login: <input type="text" name="login"/>
		Senha: <input type="password" name="senha"/>
		
		<input type="submit" value="Login" />
		<input type="hidden" name="acao" value="Login" />
	</form>
</body>
</html>