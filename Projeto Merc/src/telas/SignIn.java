package telas;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JTextArea;
import javax.swing.JSplitPane;

public class SignIn extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtPromoes;
	

	// Adicionando as informações na tela
	
	public SignIn() {
		
		//Ícone
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Luan Christian Cunha\\Pictures\\Icones\\Redes sociais\\Brilliance Resume Update - OfficeWorld\\Social Icon\\Transparent\\17 - computer t.png"));
		
		
		
		//Tela
		setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 12));
		setTitle("Buying");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 518);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(null);
		menuBar.setBackground(new Color(45, 187, 249));
		setJMenuBar(menuBar);
		
		//Adicionando menus
		JMenu eletro = new JMenu("Eletrodoméstico");
		eletro.setBackground(Color.DARK_GRAY);
		menuBar.add(eletro);
		
		JMenu celular = new JMenu("Celulares");
		menuBar.add(celular);
		
		JMenu ar = new JMenu("Ar e ventilação");
		menuBar.add(ar);
		
		JMenu ti = new JMenu("TV e informática");
		menuBar.add(ti);
		
		JMenu exit = new JMenu("Log out");
		menuBar.add(exit);
		
		//Adicionando itens aos menus
		//Eletrodomestico
		JMenuItem fogao = new JMenuItem("Fogão");
		buttonGroup.add(fogao);
		
		eletro.add(fogao);
		
		JMenuItem lavadora = new JMenuItem("Lavadora de roupa");
		eletro.add(lavadora);
		
		JMenuItem refrigerador = new JMenuItem("Refrigerador");
		eletro.add(refrigerador);
		
		JMenuItem centrifuga = new JMenuItem("Centrífuga de roupa");
		eletro.add(centrifuga);
		
		JMenuItem coifa = new JMenuItem("Coifa");
		eletro.add(coifa);
		
		JMenuItem forno = new JMenuItem("Forno");
		eletro.add(forno);
		
		JMenuItem microondas = new JMenuItem("Micro-ondas");
		eletro.add(microondas);
		
		//Celular
		JMenuItem samsumg = new JMenuItem("Samsumg");
		celular.add(samsumg);
		
		JMenuItem motorola = new JMenuItem("Motorola");
		celular.add(motorola);
		
		JMenuItem lg = new JMenuItem("LG");
		celular.add(lg);
		
		JMenuItem multilaser = new JMenuItem("Multilaser");
		celular.add(multilaser);
		
		//Ar
		JMenuItem split = new JMenuItem("Ar condicionado split");
		ar.add(split);
		
		JMenuItem janela = new JMenuItem("Ar condicionado de janela");
		ar.add(janela);
		
		JMenuItem ventilador = new JMenuItem("Ventiladores");
		ar.add(ventilador);
		
		JMenuItem portatil = new JMenuItem("Ar condicionado portátil");
		ar.add(portatil);
		
		JMenuItem aquecedor = new JMenuItem("Aquecedores");
		ar.add(aquecedor);
		
		//TV e Informática
		JMenuItem note = new JMenuItem("Notebooks");
		ti.add(note);
		
		JMenuItem computador = new JMenuItem("Computadores");
		ti.add(computador);
		
		JMenuItem impressora = new JMenuItem("Impressoras multifuncionais");
		ti.add(impressora);
		
		JMenuItem projetores = new JMenuItem("Projetores");
		ti.add(projetores);
		
		JMenuItem perifericos = new JMenuItem("Acessórios periféricos");
		ti.add(perifericos);
		
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setVisible(true);
		contentPane.setLayout(null);
		
		txtPromoes = new JTextField();
		txtPromoes.setForeground(Color.BLACK);
		txtPromoes.setToolTipText("");
		txtPromoes.setBackground(Color.YELLOW);
		txtPromoes.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 15));
		txtPromoes.setText("PROMO\u00C7\u00D5ES");
		txtPromoes.setHorizontalAlignment(SwingConstants.CENTER);
		txtPromoes.setBounds(0, 117, 689, 53);
		contentPane.add(txtPromoes);
		txtPromoes.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\i3i\\Desktop\\Projeto\\Projeto-Mercado\\Projeto Merc\\src\\Imagens\\684567_5053591_20170316113420.jpg"));
		lblNewLabel.setBounds(10, 197, 84, 77);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrFogoPiso = new JTextArea();
		txtrFogoPiso.setEditable(false);
		txtrFogoPiso.setLineWrap(true);
		txtrFogoPiso.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 12));
		txtrFogoPiso.setText("Fog\u00E3o Piso 6 Bocas Consul\r\nAcendimento Autom\u00E1tico Inox Bivolt \r\nDe R$1.489,00 por R$1.300,00\r\nC\u00F3digo do produto: 684567");
		txtrFogoPiso.setBounds(104, 197, 208, 72);
		contentPane.add(txtrFogoPiso);
		
		JButton btnfogaoprmais = new JButton("Adicionar ao carrinho");
		btnfogaoprmais.setHorizontalAlignment(SwingConstants.LEFT);
		btnfogaoprmais.setIcon(new ImageIcon("C:\\Users\\i3i\\Desktop\\Projeto\\Projeto-Mercado\\Projeto Merc\\src\\Imagens\\icone menor.png"));
		btnfogaoprmais.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 10));
		btnfogaoprmais.setBounds(370, 218, 144, 32);
		contentPane.add(btnfogaoprmais);
		
		JButton btnfogaoprmenos = new JButton("Retirar ao carrinho");
		btnfogaoprmenos.setIcon(new ImageIcon("C:\\Users\\i3i\\Desktop\\Projeto\\Projeto-Mercado\\Projeto Merc\\src\\Imagens\\icone menor.png"));
		btnfogaoprmenos.setHorizontalAlignment(SwingConstants.LEFT);
		btnfogaoprmenos.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 10));
		btnfogaoprmenos.setBounds(535, 219, 144, 32);
		contentPane.add(btnfogaoprmenos);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\i3i\\Desktop\\Projeto\\Projeto-Mercado\\Projeto Merc\\src\\Imagens\\Super Online Market 50-01.png"));
		lblNewLabel_1.setBounds(-16, 6, 261, 100);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\Users\\i3i\\Desktop\\Projeto\\Projeto-Mercado\\Projeto Merc\\src\\Imagens\\1206821_12086740_20190212153347.jpg"));
		label.setBounds(10, 285, 84, 77);
		contentPane.add(label);
		
		JTextArea txtrSmartphoneMultilaserMsx = new JTextArea();
		txtrSmartphoneMultilaserMsx.setText("Smartphone Multilaser MS80X 4G\r\nAndroid 8.1 Qualcomm 4GB RAM \r\nDe R$998,58 por R$837,57\r\nC\u00F3digo do produto: 1206821");
		txtrSmartphoneMultilaserMsx.setLineWrap(true);
		txtrSmartphoneMultilaserMsx.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 12));
		txtrSmartphoneMultilaserMsx.setEditable(false);
		txtrSmartphoneMultilaserMsx.setBounds(104, 285, 208, 72);
		contentPane.add(txtrSmartphoneMultilaserMsx);
		
		JButton btncelularprmais = new JButton("Adicionar ao carrinho");
		btncelularprmais.setIcon(new ImageIcon("C:\\Users\\i3i\\Desktop\\Projeto\\Projeto-Mercado\\Projeto Merc\\src\\Imagens\\icone menor.png"));
		btncelularprmais.setHorizontalAlignment(SwingConstants.LEFT);
		btncelularprmais.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 10));
		btncelularprmais.setBounds(370, 306, 144, 32);
		contentPane.add(btncelularprmais);
		
		JButton btncelularprmenos = new JButton("Retirar ao carrinho");
		btncelularprmenos.setIcon(new ImageIcon("C:\\Users\\i3i\\Desktop\\Projeto\\Projeto-Mercado\\Projeto Merc\\src\\Imagens\\icone menor.png"));
		btncelularprmenos.setHorizontalAlignment(SwingConstants.LEFT);
		btncelularprmenos.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 10));
		btncelularprmenos.setBounds(535, 307, 144, 32);
		contentPane.add(btncelularprmenos);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("C:\\Users\\i3i\\Desktop\\Projeto\\Projeto-Mercado\\Projeto Merc\\src\\Imagens\\1213031_12146891_20190319100538.jpg"));
		label_1.setBounds(10, 369, 84, 77);
		contentPane.add(label_1);
		
		JTextArea txtrArCondicionadoSplit = new JTextArea();
		txtrArCondicionadoSplit.setText("Ar Condicionado Split Inverter\r\nSamsung Wind Free 24000 Btus\r\nDe R$4.833,27 por R$4625,55\r\nC\u00F3digo do produto: 1213031");
		txtrArCondicionadoSplit.setLineWrap(true);
		txtrArCondicionadoSplit.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 12));
		txtrArCondicionadoSplit.setEditable(false);
		txtrArCondicionadoSplit.setBounds(104, 369, 208, 72);
		contentPane.add(txtrArCondicionadoSplit);
		
		JButton btnarprmais = new JButton("Adicionar ao carrinho");
		btnarprmais.setIcon(new ImageIcon("C:\\Users\\i3i\\Desktop\\Projeto\\Projeto-Mercado\\Projeto Merc\\src\\Imagens\\icone menor.png"));
		btnarprmais.setHorizontalAlignment(SwingConstants.LEFT);
		btnarprmais.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 10));
		btnarprmais.setBounds(370, 390, 144, 32);
		contentPane.add(btnarprmais);
		
		JButton btnarprmenos = new JButton("Retirar ao carrinho");
		btnarprmenos.setIcon(new ImageIcon("C:\\Users\\i3i\\Desktop\\Projeto\\Projeto-Mercado\\Projeto Merc\\src\\Imagens\\icone menor.png"));
		btnarprmenos.setHorizontalAlignment(SwingConstants.LEFT);
		btnarprmenos.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 10));
		btnarprmenos.setBounds(535, 391, 144, 32);
		contentPane.add(btnarprmenos);
		
		
		
		fogao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.setVisible(false);
			}
		});
		
		
		
	}
}
