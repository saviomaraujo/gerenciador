package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javafx.animation.Interpolator;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	private static List<Usuario> listaUsuario = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static{
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("Alura");
		
		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("Caelum");
		
		Banco.lista.add(empresa);
		Banco.lista.add(empresa2);
		
		Usuario u1 = new Usuario();
		u1.setLogin("savio");
		u1.setSenha("12345");
		
		Usuario u2 = new Usuario();
		u2.setLogin("arthur");
		u2.setSenha("12345");
		
		Banco.listaUsuario.add(u1);
		Banco.listaUsuario.add(u2);

	}
	
	public void adiciona(Empresa empresa){
		empresa.setId(Banco.chaveSequencial++);
		Banco.lista.add(empresa);
	}

	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

	public void removeEmpresa(Integer idEmpresa) {
		
		Iterator<Empresa> it = lista.iterator();
		
		while(it.hasNext()){
			Empresa emp = it.next();
			if(emp.getId()== idEmpresa) it.remove();
		}
	}

	public Empresa buscaEmpresaPorId(Integer idEmpresa) {
		for (Empresa empresa : lista) {
			if(empresa.getId() == idEmpresa)
				return empresa;
		}
		return null;
	}

	public Usuario existeUsuario(String login, String senha) {
		for (Usuario usuario : listaUsuario){
			if(usuario.ehIgual(login, senha))
				return usuario;
		}
		return null;
	}

}
