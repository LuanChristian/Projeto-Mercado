package acao;

import java.util.ArrayList;

import javax.swing.JOptionPane;

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
	
	public void SomarConta(Float valor,Usuario user) {
		user.setValorApagar(user.getValorApagar()+valor);
	}
	
	public void Subtrair(Usuario User,Float valor) {
		
		if(User.getValorApagar()>=valor) {
		User.setValorApagar(User.getValorApagar()-valor);
	}}
	
	public void calculoApagar(Float valor,Usuario user) {
		
		if(valor<user.getValorApagar()) {
			JOptionPane.showMessageDialog(null, "valor insulficiente\nO Total da sua compra ficou "+user.getValorApagar());
		}
		
		
	}
	
}
