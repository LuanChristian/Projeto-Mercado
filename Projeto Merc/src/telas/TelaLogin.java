package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import beans.Usuario;
import dados.Dados;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Color;

public class TelaLogin {

	private JFrame frame;
	private JTextField textUsername;
	private JTextField textPassword;
	private final JLabel label = new JLabel("New label");

	 // Iniciando a tela

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
					window.frame.setVisible(true);
					
					Usuario master = new Usuario();
					master.setPassword("12345");
					master.setuser("Master");
					Dados.ListaUsuario.add(master);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// criando a tela
	
	public TelaLogin() {
		initialize();
	}

	// Adicionando as informa��es na tela

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(45, 187, 249));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JButton btnSignIn = new JButton("Sign in");
		btnSignIn.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 11));
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean verificar=false;
				
			
				for(int i=0; i<Dados.ListaUsuario.size(); i++) {
					if(textUsername.getText().equals(Dados.ListaUsuario.get(i).getuser()) && textPassword.getText().equals(Dados.ListaUsuario.get(i).getPassword()));

					
					//Adicionando tela 2 no bot�o
					frame.dispose();
					SignIn si = new SignIn();
					si.setVisible(true);
					verificar = true;
					System.out.println(verificar);
					break;
				}
				
				if (verificar = false)
					JOptionPane.showMessageDialog(null, "Usu�io ou senha incorretos");
				
				
			
			}
		});
		btnSignIn.setBounds(163, 187, 75, 20);
		frame.getContentPane().add(btnSignIn);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setHorizontalAlignment(SwingConstants.LEFT);
		lblLogin.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 12));
		lblLogin.setBounds(85, 85, 46, 23);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblUser = new JLabel("User CPF");
		lblUser.setHorizontalAlignment(SwingConstants.LEFT);
		lblUser.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 12));
		lblUser.setBounds(85, 116, 68, 23);
		frame.getContentPane().add(lblUser);
		
		textUsername = new JTextField();
		textUsername.setBounds(163, 119, 161, 20);
		frame.getContentPane().add(textUsername);
		textUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassword.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 12));
		lblPassword.setBounds(85, 150, 68, 23);
		frame.getContentPane().add(lblPassword);
		
		textPassword = new JTextField();
		textPassword.setColumns(10);
		textPassword.setBounds(163, 153, 161, 20);
		frame.getContentPane().add(textPassword);
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Adicionando tela 2 no bot�o
				frame.dispose();
				SignUp su = new SignUp();
				su.setVisible(true);
				
			}
		});
		btnSignUp.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 11));
		btnSignUp.setBounds(249, 186, 75, 20);
		frame.getContentPane().add(btnSignUp);
		label.setBounds(121, -6, 213, 129);
		frame.getContentPane().add(label);
		label.setIcon(new ImageIcon("C:\\Users\\Luan Christian Cunha\\Desktop\\Java\\Projeto mercado\\Logotipo do mercado\\Super Online Market 50-01.png"));
	}
}
