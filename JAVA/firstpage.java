package cppackage;

import java.awt.BorderLayout;


import java.awt.*;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

class InvalidUserException extends Exception{
	
	private static final long serialVersionUID = 1L;
	int errNo;
	String errorMessage;
	
	InvalidUserException(){
		
	}
	InvalidUserException(int errNo,String errorMessage){
		this.errNo=errNo;
		this.errorMessage=errorMessage;
	}
	
	public String toString() {
		return errNo+":"+errorMessage;
	}
	
	void showError() {
		System.out.println(errNo+":"+errorMessage);
	}
}

class User{
	String userName;
	String password;
	String userType;
	
	User(){
		
	}
	User(String userName,String password, String userType){
		
		this.userName=userName;
		this.password=password;
		this.userType=userType;
	}
}

public class firstpage extends JFrame {

	//User u1=new User("","","")
	//ArrayList<User> userList=new ArrayList<User>();
	//userList.add(new User("Abhi","Abhi@123","Admin");
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)throws InvalidUserException {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					firstpage frame = new firstpage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public firstpage() {
		ArrayList<User> userList=new ArrayList<User>();
		userList.add(new User("Abhi","Abhi@123","Admin"));
		userList.add(new User("111","111","Admin"));
		userList.add(new User("Akash","Akash@123","Admin"));
		userList.add(new User("Shashi","Shashi@123","Passenger"));
		userList.add(new User("Praveen","Praveen@123","Passenger"));
		userList.add(new User("Kumar","Kumar@123","Passenger"));
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(121, 513, 381, 90);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Passenger", "Admin"}));
		comboBox.setBounds(195, 427, 130, 23);
		
		
		setTitle("HDBRTS Login/Register");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 153, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setPreferredSize(new Dimension(600,600));
		//pack();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  HDBRTS Management System");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setForeground(new Color(51, 0, 102));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(105, 13, 439, 97);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New User Register");
		lblNewLabel_1.setBackground(Color.YELLOW);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(215, 236, 152, 41);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(new Color(102, 255, 204));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String s1=textField.getText();
				String s2=textField_1.getText();
				String user=new String();
				
				try {
					int flag=0;
				for(User itr:userList) {
						//System.out.println(acc);
					//System.out.println(itr.password);
					if(s1.equals(itr.userName) && s2.equals(itr.password)) {
						flag=1;
						user=itr.userType;
					}
				}
				if(flag==1) {
					secondpage sp=new secondpage(user);
					sp.setVisible(true);
					setVisible(false);
					dispose();
				}
				else
					throw new InvalidUserException(1234,"Invalid username or password");
				
				}
				catch(InvalidUserException iue) {
					JOptionPane.showMessageDialog(null, "Invalid UserName or Password");
					iue.showError();
					textArea.setLineWrap(true);
					
					textArea.append(s1+" User not Found");
				}
				
			}
		});
		btnNewButton.setBounds(400, 169, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reg");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String s3=textField_2.getText();
				String s4=textField_3.getText();
				String s5=textField_4.getText();
				String s6=comboBox.getSelectedItem().toString();
				
				if(s4.equals(s5)) {
					userList.add(new User(s3,s4,s6));
					JOptionPane.showMessageDialog(null, "User Created! Login to proceed!");
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid UserName or Password");
					textArea.append("Password mismatched");
				}
					
					
				
			}
		});
		btnNewButton_1.setBounds(400, 351, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("User Name:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(89, 136, 110, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password  :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(89, 186, 110, 25);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(195, 134, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setBounds(195, 185, 130, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("User Name:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(89, 293, 86, 20);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Password  :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(89, 338, 86, 25);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Confirm Password:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(40, 381, 135, 33);
		contentPane.add(lblNewLabel_6);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setBounds(195, 290, 135, 25);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setBounds(195, 338, 130, 23);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_4.setBounds(195, 384, 130, 27);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("User Type :");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(89, 427, 86, 23);
		contentPane.add(lblNewLabel_7);
		
		
		contentPane.add(comboBox);
		
		contentPane.add(textArea);
		
		JLabel lblNewLabel_8 = new JLabel("Display ");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_8.setBounds(264, 483, 79, 25);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("");
		ImageIcon img= new ImageIcon(this.getClass().getResource("/logo.jpg"));
		lblNewLabel_9.setIcon(img);
		lblNewLabel_9.setBounds(187, 646, 246, 82);
		contentPane.add(lblNewLabel_9);
	}
}
