package acao;

import java.util.ArrayList;

import beans.Usuario;
import dados.Dados;

public class Acao {
	public void cadastrarUsuario(Usuario usuario) {
		Dados.ListaUsuario.add(usuario);

	}
	public boolean Autenticar(ArrayList<Usuario> listaUsuario,String user,String Password) {
		boolean verificar =false;
		for(int i =0;i<Dados.ListaUsuario.size();i++) {
			if(Dados.ListaUsuario.get(i).getuser().equals(user)&&Dados.ListaUsuario.get(i).getPassword().equals(Password)) {
				verificar =true;
				break;
			}
		}
		
		return verificar;
		
	}
}
