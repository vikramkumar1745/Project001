package com.finalbuilt;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javafx.concurrent.Task;

public class GuiPhishingMail {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void call() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiPhishingMail window = new GuiPhishingMail();
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
	public GuiPhishingMail() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.RED);
		frame.setBackground(new Color(255, 0, 0));
		frame.setBounds(1056, 630, 492, 197);
		frame.getContentPane().setLayout(null);
		String user = " ";
		String str[] = EmailAccessUsingImap.from.split(" ");
		for(int i = 0; i < str.length - 1; i++) {
		user = user + str[i];
		}
		String emailrec = EmailAccessUsingImap.domainOfSender;
		
		JLabel lblEmailFrom = new JLabel("Email From :");
		lblEmailFrom.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEmailFrom.setForeground(new Color(255, 255, 255));
		lblEmailFrom.setBounds(79, 62, 131, 28);
		frame.getContentPane().add(lblEmailFrom);
		
		JLabel username = new JLabel("New label");
		username.setFont(new Font("Tahoma", Font.PLAIN, 18));
		username.setForeground(new Color(255, 255, 255));
		username.setBounds(238, 64, 201, 24);
		username.setText(user);
		frame.getContentPane().add(username);
		
		JLabel lblYouveReceivedPhishing = new JLabel("You've Received Phishing Mail ");
		lblYouveReceivedPhishing.setForeground(new Color(255, 255, 255));
		lblYouveReceivedPhishing.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblYouveReceivedPhishing.setBounds(12, 13, 303, 49);
		frame.getContentPane().add(lblYouveReceivedPhishing);
		
		JLabel email = new JLabel("New label");
		email.setFont(new Font("Tahoma", Font.BOLD, 18));
		email.setForeground(new Color(255, 255, 255));
		email.setBounds(79, 103, 360, 28);
		email.setText(emailrec);
		frame.getContentPane().add(email);
	}
}
