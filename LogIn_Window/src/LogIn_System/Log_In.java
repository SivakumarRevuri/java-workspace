package LogIn_System;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import calculator.BasicCalc;

import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Log_In {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Log_In window = new Log_In();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Log_In() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("LogIn_System");
		lblNewLabel.setBounds(205, 29, 106, 16);
		frame.getContentPane().add(lblNewLabel);

		JLabel lbIUserName = new JLabel("UserName");
		lbIUserName.setBounds(96, 75, 66, 16);
		frame.getContentPane().add(lbIUserName);

		JLabel IbIPassword = new JLabel("Password");
		IbIPassword.setBounds(96, 130, 65, 16);
		frame.getContentPane().add(IbIPassword);

		textField = new JTextField();
		textField.setBounds(185, 72, 198, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(185, 127, 198, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JButton btnLogin = new JButton("LogIn");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=textField.getText();
				String password=textField_1.getText();

				if (username.contains("shiva")&&password.contains("kumar")) {
					textField.setText(null);
					textField_1.setText(null);
					
					BasicCalc.main(null);
					
				}else{
					JOptionPane.showMessageDialog(null, "invalid, LogIn details");
					textField.setText(null);
					textField_1.setText(null);
				}
			}
		});
		btnLogin.setBounds(214, 190, 97, 25);
		frame.getContentPane().add(btnLogin);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				textField.setText("null");
				textField_1.setText(null);
			}
		});
		btnReset.setBounds(96, 190, 97, 25);
		frame.getContentPane().add(btnReset);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.exit(0);
			}
		});
		btnExit.setBounds(334, 190, 97, 25);
		frame.getContentPane().add(btnExit);

		JSeparator separator = new JSeparator();
		separator.setBounds(30, 173, 440, 18);
		frame.getContentPane().add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(30, 58, 440, 18);
		frame.getContentPane().add(separator_1);
	}
}
