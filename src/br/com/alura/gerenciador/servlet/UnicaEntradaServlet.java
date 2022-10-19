package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.acao.Acao;

//@WebServlet("/entrada") esse servlet foi substituido pelo ControladorFilter
public class UnicaEntradaServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		String paramAcao = request.getParameter("acao");
//		
////		HttpSession sessao = request.getSession();
////		boolean usuarioNaoEhLogado = (sessao.getAttribute("usuarioLogado") == null); 
////		boolean acaoEhControlada = !(paramAcao.equals("Login") || paramAcao.equals("LoginUsuarioForm"));
////				
////		if(usuarioNaoEhLogado && acaoEhControlada){
////			response.sendRedirect("entrada?acao=LoginUsuarioForm");
////			return;
////		}
//		
//		String urlRedirecionamento = null;
//		String nomeDaClasse = "br.com.alura.gerenciador.acao." + paramAcao;
//		
//		try {
//						
//			Class classe = Class.forName(nomeDaClasse);
//			Acao acao = (Acao) classe.newInstance();
//			urlRedirecionamento = acao.executa(request, response);
//		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			throw new ServletException(e);
//		}
//				
//		String[] tipoEEndereco = urlRedirecionamento.split(":");
//		if(tipoEEndereco[0].equals("forward")){		
//			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipoEEndereco[1]);
//			rd.forward(request, response);
//		}else response.sendRedirect("entrada?acao="+tipoEEndereco[1]);
//	}

}
