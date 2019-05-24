package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;

public class SignIn extends JFrame {

	private JPanel contentPane;

// Adicionando as informa��es na tela

	public SignIn() {

//�cone
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\Luan Christian Cunha\\Pictures\\Icones\\Redes sociais\\Brilliance Resume Update - OfficeWorld\\Social Icon\\Transparent\\17 - computer t.png"));

//Tela
		setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 12));
		setTitle("Sign In");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu eletro = new JMenu("Eletrodom�stico");
		menuBar.add(eletro);
		JMenuItem fogao = new JMenuItem("Fog�o");
		eletro.add(fogao);

		JMenu celular = new JMenu("Celulares");
		menuBar.add(celular);

		JMenu ar = new JMenu("Ar e ventila��o");
		menuBar.add(ar);

		JMenu ti = new JMenu("TV e inform�tica");
		menuBar.add(ti);

		JMenu exit = new JMenu("exit");
		menuBar.add(exit);
		JMenuItem sair =new JMenuItem("Log out");
		exit.add(sair);
		sair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				TelaLogin t = new TelaLogin();
				
				dispose();
				
				
				
			
			}
		});

		contentPane = new JPanel();
		contentPane.setBackground(new Color(45, 187, 249));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		contentPane.setVisible(true);

	}
}
