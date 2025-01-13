import java.awt.EventQueue;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainMenu extends JFrame {
	
	private JPanel contentPane;

	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	BankAccount balance;
	private JLabel ba_1;
	
	public MainMenu() {
		setForeground(new Color(135, 206, 235));
		setBackground(new Color(192, 192, 192));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMainMenu = new JLabel("MAIN MENU");
		lblMainMenu.setBackground(new Color(255, 255, 255));
		lblMainMenu.setFont(new Font("Arial", Font.BOLD, 32));
		lblMainMenu.setForeground(new Color(0, 0, 0));
		lblMainMenu.setBounds(299, 10, 188, 67);
		contentPane.add(lblMainMenu);
		
		JLabel lblChooseAnOperation = new JLabel("Choose Any Option");
		lblChooseAnOperation.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblChooseAnOperation.setForeground(new Color(0, 0, 0));
		lblChooseAnOperation.setBounds(287, 87, 212, 40);
		contentPane.add(lblChooseAnOperation);
		
		JButton btnShowHistory = new JButton("Show History");
		btnShowHistory.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnShowHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MyHistory menu6 = new MyHistory();
				menu6.setVisible(true);
				
			}
		});
		btnShowHistory.setBounds(500, 255, 173, 75);
		contentPane.add(btnShowHistory);
		
		JButton btnNewButton = new JButton("Withdraw");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WithdrawalEntry menu3 = new WithdrawalEntry();
				menu3.setVisible(true);
			}
		});
		btnNewButton.setBounds(100, 255, 173, 75);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Deposit");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DepositEntry menu4 = new DepositEntry();
				menu4.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(100, 149, 173, 75);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Check Balance\r\n");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Your Currunt Blanace is "+BankAccount.getBalance());
			}
		});
		btnNewButton_2.setBounds(500, 149, 173, 75);
		contentPane.add(btnNewButton_2);
		
		JButton btnLogout = new JButton("Exit");
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnLogout.setBounds(306, 353,173, 75);
		contentPane.add(btnLogout);


		JLabel ba=new JLabel();
		ImageIcon im=new ImageIcon("resources\\grs.jpg");
		ba_1=new JLabel("",im,JLabel.CENTER);
		ba_1.setBackground(new Color(135, 206, 235));
		ba_1.setForeground(new Color(0, 0, 0));
		ba_1.setBounds(-14,10,800,500);
		contentPane.add(ba_1);
	}
}