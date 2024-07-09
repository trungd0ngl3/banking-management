package main;

import javax.swing.JFrame;

public class Login extends JFrame {
	public Login() {
		setTitle("Banking management System");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Login();
	}
}
