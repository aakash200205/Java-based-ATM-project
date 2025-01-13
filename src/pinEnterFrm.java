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

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pinEnterFrm extends JFrame {
	
	private JPanel contentPane;
    private JPasswordField passwordField;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pinEnterFrm frame = new pinEnterFrm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	BankAccount balance;
	
	public pinEnterFrm() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMainMenu = new JLabel("ENTER CARD PIN NUMBER");
		lblMainMenu.setForeground(new Color(255, 160, 122));
		lblMainMenu.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblMainMenu.setBounds(187, 147, 412, 61);
		contentPane.add(lblMainMenu);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String psd = passwordField.getText();
                
                if(psd.equals("")){
                    JOptionPane.showMessageDialog(btnSubmit, "Please Enter pin");
                } else {
                    if (psd.equals("5669")) {
					
                        //JOptionPane.showMessageDialog(btnSubmit, "Logged in Successfully!");
                        MainMenu menu2 = new MainMenu();
                        menu2.setVisible(true);
                        
                    }
                    else {
                        JOptionPane.showMessageDialog(btnSubmit, "Invalid Pin Try Again!");
                        passwordField.setText("");
                    }
                }
				
			}
		});
		btnSubmit.setBounds(443, 332, 100, 50);
		contentPane.add(btnSubmit);
        
        JButton btnclear = new JButton("Clear");
        btnclear.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                    passwordField.setText("");
            }	
		});
		btnclear.setBounds(243, 332, 100, 50);
        contentPane.add(btnclear);
        

        passwordField = new JPasswordField();
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		passwordField.setBounds(243, 218, 300, 50);
		contentPane.add(passwordField);
		
		JLabel ba=new JLabel();
		ImageIcon im=new ImageIcon("resources\\grs.jpg");
		ba=new JLabel("",im,JLabel.CENTER);
		ba.setBounds(0,0,800,500);
		contentPane.add(ba);
		
		JLabel WARNING = new JLabel("INDIAN BANK ATM");
		WARNING.setFont(new Font("Times New Roman", Font.BOLD, 40));
		WARNING.setBounds(202, 48, 382, 50);
		contentPane.add(WARNING);

	}
}