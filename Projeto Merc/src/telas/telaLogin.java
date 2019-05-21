package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class telaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public telaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 829, 577);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 816, 540);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(373, 159, 89, 23);
		panel.add(lblNewLabel_1);
		
		JLabel lblName = new JLabel("User ");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setBounds(269, 205, 48, 14);
		panel.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(316, 204, 177, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPasswor = new JLabel("Password");
		lblPasswor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPasswor.setBounds(235, 247, 71, 14);
		panel.add(lblPasswor);
		
		textField_1 = new JTextField();
		textField_1.setBounds(316, 246, 177, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Sign in");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 12));
		btnNewButton.setBounds(316, 298, 80, 23);
		panel.add(btnNewButton);
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 12));
		btnSignUp.setBounds(406, 298, 87, 23);
		panel.add(btnSignUp);
	}
}
