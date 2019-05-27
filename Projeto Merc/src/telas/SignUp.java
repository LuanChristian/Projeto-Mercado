package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import beans.Usuario;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
	private JTextField textField;
	private JLabel lblNewLabel;
	private JTextField textField_1;
	private JLabel lblEndereo;
	private JLabel lblCep;
	private JTextField textField_2;
	private JLabel lblN;
	private JTextField textField_3;
	private JLabel lblComplemento;
	private JTextField textField_6;
	private JLabel lblBairro;
	private JTextField textField_5;
	private JLabel lblCidade;
	private JTextField textField_7;

	Acao a = new Acao();
	public static Usuario user = new Usuario();

	TelaLogin tela = new TelaLogin();
	
	//Adicionando as informações na tela
	
	public SignUp() {
		
		
		
		//Ícone
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\i3i\\Desktop\\Projeto\\Projeto-Mercado\\Projeto Merc\\src\\Imagens\\19 - profile t.png"));
		
		//Tela
		setTitle("Sign Up");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 523);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(45, 187, 249));
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
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
		textSenha.setBounds(68, 182, 119, 20);
		contentPane.add(textSenha);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 12));
		btnCadastrar.setBounds(310, 433, 114, 23);
		contentPane.add(btnCadastrar);
		
		textField = new JTextField();
		textField.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 12));
		textField.setColumns(10);
		textField.setBounds(305, 181, 119, 20);
		contentPane.add(textField);

		lblNewLabel = new JLabel("Endere\u00E7o");
		lblNewLabel.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 236, 114, 30);
		contentPane.add(lblNewLabel);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(68, 301, 87, 20);
		contentPane.add(textField_1);

		lblEndereo = new JLabel("CEP");
		lblEndereo.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 12));
		lblEndereo.setBounds(10, 303, 63, 14);
		contentPane.add(lblEndereo);

		lblCep = new JLabel("Endere\u00E7o");
		lblCep.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 12));
		lblCep.setBounds(10, 343, 63, 20);
		contentPane.add(lblCep);


		textField_2 = new JTextField();
		textField_2.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(80, 344, 344, 20);
		contentPane.add(textField_2);

		lblN = new JLabel("N\u00BA");
		lblN.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 12));
		lblN.setBounds(10, 390, 48, 14);
		contentPane.add(lblN);

		textField_3 = new JTextField();
		textField_3.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBounds(40, 387, 48, 20);
		contentPane.add(textField_3);

		lblComplemento = new JLabel("Complemento");
		lblComplemento.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 12));
		lblComplemento.setBounds(165, 303, 94, 14);
		contentPane.add(lblComplemento);

		textField_6 = new JTextField("Ex.: Casa, apartamento, etc.");
		textField_6.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 12));
		textField_6.setColumns(10);
		textField_6.setBounds(257, 301, 167, 20);
		contentPane.add(textField_6);

		lblBairro = new JLabel("Bairro");
		lblBairro.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 12));
		lblBairro.setBounds(104, 389, 48, 14);
		contentPane.add(lblBairro);

		textField_5 = new JTextField();
		textField_5.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 12));
		textField_5.setColumns(10);
		textField_5.setBounds(151, 384, 108, 20);
		contentPane.add(textField_5);

		lblCidade = new JLabel("Cidade");
		lblCidade.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 12));
		lblCidade.setBounds(269, 389, 48, 14);
		contentPane.add(lblCidade);

		textField_7 = new JTextField();
		textField_7.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 12));
		textField_7.setColumns(10);
		textField_7.setBounds(316, 384, 108, 20);
		contentPane.add(textField_7);

		
		
		btnCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				boolean verificar=false;
				
				user.setNome(textName.getText());
				try {
					user.setIdade(Integer.parseInt(textAge.getText()));
					verificar =true;
				} catch (Exception exe) {
					JOptionPane.showMessageDialog(null, "idade só pode receber numeros");
					System.out.println("campo só pode receber numero");
					
				}
				
				user.setCpf(textCPF.getText());
				user.setEmail(textEmail.getText());
				user.setuser(textUsuario.getText());
				user.setPassword(textSenha.getText());
				a.cadastrarUsuario(user);
				
				if(verificar==true) {
					dispose();
					SignIn a = new SignIn();
					a.setVisible(true);
				}
				
				
				
			}
		});
	}
}
