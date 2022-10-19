package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class AutorizacaoFilter
 */
//@WebFilter("/entrada") a chamada ficou definida no web.xml, devido a ordem a ser seguida  
public class AutorizacaoFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("AutorizacaoFilter");
		
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		HttpSession sessao = request.getSession();
		String paramAcao = request.getParameter("acao");
		
		boolean usuarioNaoEhLogado = (sessao.getAttribute("usuarioLogado") == null); 
		boolean acaoEhControlada = !(paramAcao.equals("Login") || paramAcao.equals("LoginUsuarioForm"));
		
		if(usuarioNaoEhLogado && acaoEhControlada){
			response.sendRedirect("entrada?acao=LoginUsuarioForm");
			return;
		}
				
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
