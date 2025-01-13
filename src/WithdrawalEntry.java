import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WithdrawalEntry extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WithdrawalEntry frame = new WithdrawalEntry();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	BankAccount service = new BankAccount();
	
	public WithdrawalEntry() {
		setTitle("Deposit Window");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Withdrawal amount:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(68, 25, 300, 44);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setBounds(139, 97, 158, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit\r\n");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double entry = Double.parseDouble(textField.getText());
				if(BankAccount.getBalance() > entry) {
					service.withDrawalOp(entry);
					JOptionPane.showMessageDialog(btnNewButton, "Operation Successfull !");
					if(service.myHistory().size()==5) {
						service.myHistory().remove(0);
					}
					service.myHistory().add("Withdraw: "+entry);
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "Withdrawal amount is greater than currunt balance !");
				}
				
			}
		});
		btnNewButton.setBounds(146, 164, 143, 44);
		contentPane.add(btnNewButton);
	}
}