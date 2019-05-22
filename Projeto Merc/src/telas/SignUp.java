package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textAge;
	private JLabel lblCpf;
	private JTextField textCPF;
	private JLabel lblEmail;
	private JTextField textEmail;
	private JLabel lblUsurio;
	private JTextField textUsuario;
	private JLabel lblSenha;
	private JTextField textSenha;
	private JLabel lblPagamento;

	//Adicionando as informações na tela
	
	public SignUp() {
		
		//Ícone
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Luan Christian Cunha\\Pictures\\Icones\\Redes sociais\\Brilliance Resume Update - OfficeWorld\\Social Icon\\Transparent\\19 - profile t.png"));
		
		//Tela
		setTitle("Sign Up");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 326);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(45, 187, 249));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 12));
		lblName.setBounds(10, 11, 48, 14);
		contentPane.add(lblName);
		
		textName = new JTextField();
		textName.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 12));
		textName.setBounds(68, 9, 356, 20);
		contentPane.add(textName);
		textName.setColumns(10);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 12));
		lblAge.setBounds(10, 51, 48, 20);
		contentPane.add(lblAge);
		
		textAge = new JTextField();
		textAge.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 12));
		textAge.setColumns(10);
		textAge.setBounds(68, 52, 34, 20);
		contentPane.add(textAge);
		
		lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 12));
		lblCpf.setBounds(165, 51, 48, 20);
		contentPane.add(lblCpf);
		
		textCPF = new JTextField();
		textCPF.setHorizontalAlignment(SwingConstants.LEFT);
		textCPF.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 12));
		textCPF.setColumns(10);
		textCPF.setBounds(201, 52, 223, 20);
		contentPane.add(textCPF);
		
		lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 12));
		lblEmail.setBounds(10, 98, 48, 14);
		contentPane.add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 12));
		textEmail.setColumns(10);
		textEmail.setBounds(68, 96, 356, 20);
		contentPane.add(textEmail);
		
		lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 12));
		lblUsurio.setBounds(10, 141, 48, 14);
		contentPane.add(lblUsurio);
		
		textUsuario = new JTextField();
		textUsuario.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 12));
		textUsuario.setColumns(10);
		textUsuario.setBounds(68, 139, 356, 20);
		contentPane.add(textUsuario);
		
		lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 12));
		lblSenha.setBounds(10, 184, 48, 14);
		contentPane.add(lblSenha);
		
		textSenha = new JTextField();
		textSenha.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 12));
		textSenha.setColumns(10);
		textSenha.setBounds(68, 182, 356, 20);
		contentPane.add(textSenha);
		
		lblPagamento = new JLabel("Pagamento");
		lblPagamento.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 12));
		lblPagamento.setBounds(9, 220, 92, 26);
		contentPane.add(lblPagamento);
		
		JCheckBox boxCartoDeCredito = new JCheckBox("Cart\u00E3o de cr\u00E9dito");
		boxCartoDeCredito.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 12));
		boxCartoDeCredito.setOpaque(isActive());
		boxCartoDeCredito.setBounds(91, 222, 134, 23);
		contentPane.add(boxCartoDeCredito);
		
		JCheckBox boxDinheiro = new JCheckBox("Dinheiro");
		boxDinheiro.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 12));
		boxDinheiro.setOpaque(isActive());
		boxDinheiro.setBounds(249, 222, 76, 23);
		contentPane.add(boxDinheiro);
		
		JCheckBox boxDebito = new JCheckBox("D\u00E9bito");
		boxDebito.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 12));
		boxDebito.setOpaque(isActive());
		boxDebito.setBounds(348, 222, 76, 23);
		contentPane.add(boxDebito);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 12));
		btnCadastrar.setBounds(310, 252, 114, 23);
		contentPane.add(btnCadastrar);
	}
}
