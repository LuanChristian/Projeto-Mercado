package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

public class SignIn extends JFrame {

	private JPanel contentPane;

	// Adicionando as informações na tela
	
	public SignIn() {
		
		//Ícone
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Luan Christian Cunha\\Pictures\\Icones\\Redes sociais\\Brilliance Resume Update - OfficeWorld\\Social Icon\\Transparent\\17 - computer t.png"));
		
		//Tela
		setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 12));
		setTitle("Sign In");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(45, 187, 249));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	
		contentPane.setVisible(true);
	
	}
	
}
