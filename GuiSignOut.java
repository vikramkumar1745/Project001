package com.finalbuilt;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuiSignOut {

	JFrame frame;
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void call() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiSignOut window = new GuiSignOut();
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
	public GuiSignOut() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 866, 494);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		panel.setBackground(Color.WHITE);
		frame.setTitle("Team3");
		frame.setResizable(false);
		panel.setBounds(0, 0, 848, 66);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JLabel lblDetectionAndPrevention = new JLabel("Detection and Prevention of Phishing mail using Supervised Machine Learning");
		lblDetectionAndPrevention.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDetectionAndPrevention.setBounds(29, 0, 819, 66);
		panel.add(lblDetectionAndPrevention);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(0, 0, 425, 10);
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
		
		JLabel lblLoginHereTo = new JLabel("Loged In As");
		lblLoginHereTo.setForeground(Color.WHITE);
		lblLoginHereTo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblLoginHereTo.setBackground(Color.BLACK);
		lblLoginHereTo.setBounds(12, 24, 315, 44);
		panel_2.add(lblLoginHereTo);
		
		
		/*Properties prope = PropertiesFile.getUserPass();
		String useremail = prope.getProperty("username");*/
 		JLabel username = new JLabel(EmailAccessUsingImap.user);
		username.setForeground(Color.WHITE);
		username.setFont(new Font("Tahoma", Font.BOLD, 18));
		username.setBounds(12, 80, 332, 44);
		panel_2.add(username);
		
		
		JButton btnSignIn = new JButton("Sign out");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EmailAccessUsingImap.user = null;
				frame.dispose();
				String asd[] = {null,null};
				ExecutionClass.thread1.interrupt();
				GuiLogin.main(asd);
				
				}
		});
		btnSignIn.setBounds(12, 137, 97, 25);
		panel_2.add(btnSignIn);
		
		JLabel lblDetecionAndPrevention = new JLabel("Detecion and Prevention from Phishing main using Supervised Machine Learning");
		lblDetecionAndPrevention.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDetecionAndPrevention.setBounds(12, 0, 836, 67);
		frame.getContentPane().add(lblDetecionAndPrevention);
		
	}

}

