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
class welcomeFrm{

    private JFrame frmWelcome;
    private JLabel ba2_1;
    
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					welcomeFrm window = new welcomeFrm();
					window.frmWelcome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }

    

    public welcomeFrm(){
        frmWelcome = new JFrame();
		frmWelcome.setTitle("Welcome");
		frmWelcome.setBounds(100, 100, 800, 500);
		frmWelcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmWelcome.getContentPane().setLayout(null);

        JLabel lblwelcomenote = new JLabel("Welcome to INDIAN BANK ATM");
		lblwelcomenote.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblwelcomenote.setForeground(new Color(0, 0, 0));
		lblwelcomenote.setBounds(99, 38, 587, 52);
        frmWelcome.getContentPane().add(lblwelcomenote);
        
		JLabel lblcardin = new JLabel("Please Insert Your ATM card");
		lblcardin.setForeground(new Color(244, 164, 96));
		lblcardin.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblcardin.setBounds(194, 100, 398, 25);
        frmWelcome.getContentPane().add(lblcardin);


		
        JButton btnNewButton = new JButton("Submit\r\n");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(btnNewButton, "Hello");
				pinEnterFrm nwfr = new pinEnterFrm();
				nwfr.setVisible(true);
            }

         });
		btnNewButton.setBounds(650, 350, 150, 50);
		btnNewButton.setBackground(new Color(250, 250, 210));
		btnNewButton.setOpaque(true);
        frmWelcome.getContentPane().add(btnNewButton);
        
        JButton btnNewButton2 = new JButton("Exit\r\n");
        btnNewButton2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton2, "Thank You Come Again ! Remove Debit Card");}
				
         });
		btnNewButton2.setBounds(0, 350, 150, 50);
		btnNewButton2.setBackground(new Color(250, 250, 210));
		btnNewButton2.setOpaque(true);
        frmWelcome.getContentPane().add(btnNewButton2);



		JLabel ba2=new JLabel();
		ImageIcon im2=new ImageIcon("resources\\giphy.gif");
		ba2_1=new JLabel("",im2,JLabel.CENTER);
		ba2_1.setForeground(new Color(240, 248, 255));
		ba2_1.setBounds(0,0,800,500);
		frmWelcome.getContentPane().add(ba2_1);


		JLabel ba=new JLabel();
		ImageIcon im=new ImageIcon("resources\\grs.jpg");
		ba=new JLabel("",im,JLabel.CENTER);
		ba.setBounds(0,0,800,500);
		frmWelcome.getContentPane().add(ba);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\atm-card-slot-icon-flat-vector-10360968 (1).jpg"));
		lblNewLabel.setBounds(243, 166, 300, 265);
		frmWelcome.getContentPane().add(lblNewLabel);
 


        /*JLabel ba=new JLabel();
		ImageIcon im=new ImageIcon("giphy.gif");
		ba=new JLabel("",im,JLabel.CENTER);
		ba.setBounds(0,0,800,500);
		frmWelcome.getContentPane().add(ba);
		*/
    }
}