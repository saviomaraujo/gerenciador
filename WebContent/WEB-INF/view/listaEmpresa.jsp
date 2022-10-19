<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.alura.gerenciador.modelo.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<c:url value="/entrada?acao=RemoveEmpresa" var="linkServletRemoveEmpresa"></c:url>
<c:url value="/entrada?acao=MostraEmpresa" var="linkServletMostraEmpresa"></c:url>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listagem das Empresas Cadastradas</title>
</head>
<body>

	<c:import url="logoutForm.jsp" />
	
	Usuário logado: ${usuarioLogado.login}
	
	<br>
	<br>
	  
	<ul>
		<c:if test="${not empty empresa}">
			Empresa ${ empresa } cadastrada com sucesso! <br/> <br/>
		</c:if>
	
		Lista das Empresas Cadastradas: <br/>
		<c:forEach items="${ empresas }" var="empresa">
			<li>
				${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/>
				<a href="${linkServletMostraEmpresa}&id=${empresa.id}">edita</a>
				<a href="${linkServletRemoveEmpresa}&id=${empresa.id}">delete</a> 
			</li>
		</c:forEach>
	</ul>
</body>
</html>