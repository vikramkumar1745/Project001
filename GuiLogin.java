package com.finalbuilt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiLogin {

	private JFrame frame;
	private final JPanel panel = new JPanel();
	private JTextField username;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String [] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiLogin window = new GuiLogin();
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
	public GuiLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 866, 494);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Team3");
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 848, 66);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		ImageIcon icon = new ImageIcon("‪D:\\File\\Images\\Team3.jpg");
		frame.setIconImage(icon.getImage());
		
		JLabel lblDetectionAndPrevention = new JLabel("Detection and Prevention of Phishing mail using Supervised Machine Learning");
		lblDetectionAndPrevention.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDetectionAndPrevention.setBounds(29, 0, 819, 66);
		panel.add(lblDetectionAndPrevention);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(0, 0, 428, 10);
		panel.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.RED);
		panel_4.setBounds(425, 0, 423, 10);
		panel.add(panel_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(0, 64, 425, 383);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblReprsentedByTeam = new JLabel("Reprsented By Team3");
		lblReprsentedByTeam.setForeground(Color.WHITE);
		lblReprsentedByTeam.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblReprsentedByTeam.setBounds(32, 28, 310, 47);
		panel_1.add(lblReprsentedByTeam);
		
		JLabel member1 = new JLabel("Vikram Kumar   1DS14CS124");
		member1.setForeground(Color.WHITE);
		member1.setFont(new Font("Tahoma", Font.BOLD, 16));
		member1.setBounds(130, 88, 271, 34);
		panel_1.add(member1);
		
		JLabel member2 = new JLabel("Vikash Kumar    1DS14CS123");
		member2.setForeground(Color.WHITE);
		member2.setFont(new Font("Tahoma", Font.BOLD, 16));
		member2.setBounds(130, 120, 271, 40);
		panel_1.add(member2);
		
		JLabel lblArpanNepaldscs = new JLabel("Arpan Nepal       1DS14CS015");
		lblArpanNepaldscs.setForeground(Color.WHITE);
		lblArpanNepaldscs.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblArpanNepaldscs.setBounds(130, 156, 271, 40);
		panel_1.add(lblArpanNepaldscs);
		
		JLabel lblVatsalSekhardscs = new JLabel("Vatsala Sekhar  1DS14CS121");
		lblVatsalSekhardscs.setForeground(Color.WHITE);
		lblVatsalSekhardscs.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVatsalSekhardscs.setBounds(130, 194, 260, 34);
		panel_1.add(lblVatsalSekhardscs);
		
		JLabel lblUnderTheGui = new JLabel("Under the guidance of");
		lblUnderTheGui.setForeground(Color.WHITE);
		lblUnderTheGui.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUnderTheGui.setBounds(32, 271, 271, 34);
		panel_1.add(lblUnderTheGui);
		
		JLabel lblAsstProfPrasad = new JLabel("Asst. Prof Prasad A M");
		lblAsstProfPrasad.setForeground(Color.WHITE);
		lblAsstProfPrasad.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAsstProfPrasad.setBounds(130, 308, 260, 34);
		panel_1.add(lblAsstProfPrasad);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.RED);
		panel_2.setBounds(423, 64, 425, 383);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblLoginHereTo = new JLabel("Login Here to get Started");
		lblLoginHereTo.setForeground(Color.WHITE);
		lblLoginHereTo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblLoginHereTo.setBackground(Color.BLACK);
		lblLoginHereTo.setBounds(12, 24, 315, 44);
		panel_2.add(lblLoginHereTo);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUsername.setBounds(12, 80, 108, 37);
		panel_2.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPassword.setBounds(12, 119, 119, 44);
		panel_2.add(lblPassword);
		
		JLabel errmsg = new JLabel("");
		errmsg.setBounds(12, 221, 246, 30);
		panel_2.add(errmsg);
		
		username = new JTextField();
		username.setText("project2018dsi@gmail.com");
		username.setBounds(134, 85, 226, 30);
		panel_2.add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setText("project201");
		password.setBounds(134, 124, 226, 30);
		panel_2.add(password);
		
		JButton btnSignIn = new JButton("Sign in");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String user = username.getText();
				@SuppressWarnings("deprecation")
				String pass = password.getText();
				EmailAccessUsingImap.call(user, pass);
				if(EmailAccessUsingImap.status==null) {
					ExecutionClass.startExecution(user, pass);
					frame.dispose();
					GuiSignOut.call();
					errmsg.setText("");
				}else {
					errmsg.setText((String)EmailAccessUsingImap.status);
				}
			}
		});
		btnSignIn.setBounds(134, 183, 97, 25);
		panel_2.add(btnSignIn);
		
		
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}


