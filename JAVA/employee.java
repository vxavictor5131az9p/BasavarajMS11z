package cppackage;

import java.awt.BorderLayout;

import java.awt.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;


class CompanyEmployee{
    String empId;
    String empName;
    double  salary;
    int empAge;
    String empType;
    String empAddress;
    //int countEmp=0;

    CompanyEmployee()
    {
     
    }
    CompanyEmployee(String eid,String ename,double s,int a,String et,String ea)
    {
        this.empId=eid;
        this.empName=ename;
        this.salary=s;
        this.empAge=a;
        this.empType=et;
        this.empAddress=ea;
       // countEmp+=1;

    }
    void displayCompEmp()
    {
     
        System.out.println("\nCompany Employee................");
        System.out.println("Employee ID:"+this.empId+"Employee Name:"+this.empName+"Salary:"+this.salary+"Age:"+this.empAge+"Employee Type:"+this.empType+"Address:"+this.empAddress);

    }
    public String toString() {
    	return "Employee ID:"+this.empId+" Employee Name:"+this.empName+" Salary:"+this.salary+" Age:"+this.empAge+" Employee Type:"+this.empType+" Address:"+this.empAddress+"\n";
    }
}

public class employee extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) throws DuplicateItemException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					employee frame = new employee();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
     */
	/**
	 * Create the frame.
	 * @param employeeList2 
	 * @param user 
	 */
	public employee(ArrayList<CompanyEmployee> employeeList2, String user) {
		
		
		//ArrayList<CompanyEmployee> employeeList = new ArrayList<>();
		
		employeeList2.add(new CompanyEmployee("HD001","Bhuvan",12000,39,"Counterer","Hubli"));
		employeeList2.add(new CompanyEmployee("HD002","Ajit",18000,42,"Driver","Navalur"));
		employeeList2.add(new CompanyEmployee("HD003","Nikhil",20000,44,"Controller","Hubli"));
		employeeList2.add(new CompanyEmployee("HD004","Ashwath",12000,28,"Counterer","Dharwad"));
		employeeList2.add(new CompanyEmployee("HD005","Suresh",10000,27,"Driver","Garag"));
		employeeList2.add(new CompanyEmployee("HD006","Kiran",19000,33,"Driver","NavaNagar"));
		employeeList2.add(new CompanyEmployee("HD007","Girish",25000,54,"Counterer","Vijaypur"));
		employeeList2.add(new CompanyEmployee("HD008","Jagadeesh",22000,38,"Driver","Dharwad"));
		employeeList2.add(new CompanyEmployee("HD009","Praveen",12500,29,"Driver","Hubli"));
		employeeList2.add(new CompanyEmployee("HD010","Prakash",23000,38,"Driver","Hubli"));
		employeeList2.add(new CompanyEmployee("HD011","Kumar",24000,39,"Driver","Dharwad"));
		employeeList2.add(new CompanyEmployee("HD012","Sachin",14000,29,"Driver","Hubli"));
		employeeList2.add(new CompanyEmployee("HD013","Umesh",19000,39,"Driver","Hubli"));
		employeeList2.add(new CompanyEmployee("HD014","Sagar",21000,49,"Driver","Dharwad"));
		employeeList2.add(new CompanyEmployee("HD015","Suhas",20000,42,"Counterer","Hubli"));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEditable(true);
		comboBox_1.setBounds(314, 74, 108, 25);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setEditable(true);
		comboBox_2.setBounds(182, 62, 115, 19);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setEditable(true);
		comboBox_4.setBounds(311, 34, 92, 24);
		
		for(CompanyEmployee itr:employeeList2) {
			
			comboBox_1.addItem(itr.empId);
			comboBox_2.addItem(itr.empId);
			comboBox_4.addItem(itr.empId);
		}
		
		
		setTitle("Employee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(218, 165, 32));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setPreferredSize(new Dimension(600,600));
		//pack();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 13, 576, 574);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 222, 179));
		tabbedPane.addTab("Add Employee", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EmpId");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(54, 91, 67, 19);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("EmpName");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(54, 140, 82, 19);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("EmpSalary");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setBounds(54, 188, 73, 27);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("EmpAge");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3.setBounds(54, 238, 67, 27);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("EmpType");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_4.setBounds(54, 290, 67, 19);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("EmpAddress");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_5.setBounds(54, 336, 95, 19);
		panel.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(151, 90, 116, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(151, 139, 116, 22);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(151, 191, 116, 22);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(151, 241, 116, 22);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Driver", "Controller", "Conter Operator", "Cleaner", "Security Gaurd"}));
		comboBox.setEditable(true);
		comboBox.setBounds(151, 289, 116, 20);
		panel.add(comboBox);
		
		textField_4 = new JTextField();
		textField_4.setBounds(151, 335, 116, 22);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(279, 124, 260, 264);
		textArea.setLineWrap(true);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String s1=textField.getText();
				String s2=textField_1.getText();
				String s3=textField_2.getText();
				String s4=textField_3.getText();
				String emptype=comboBox.getSelectedItem().toString();
				double salary=Integer.parseInt(textField_2.getText());
				int age=Integer.parseInt(textField_3.getText());
				String s5=textField_4.getText();
				
				if(user=="Admin")
				{
					JOptionPane.showMessageDialog(null, "You are an authorized user!");
				try {
					int flag=0;
					for(CompanyEmployee itr:employeeList2) {
						if(s1.equals(itr.empId) ) {
							flag=1;
						}
					}
					if(flag==1) {
						throw new DuplicateItemException(1234,"This Employee ID already exists!");
					}
					else {
						employeeList2.add(new CompanyEmployee(s1,s2,salary,age,emptype,s5));
						comboBox_1.addItem(s1);
						comboBox_2.addItem(s1);
						comboBox_4.addItem(s1);

						JOptionPane.showMessageDialog(null, "Company Employee Added!");
						textArea.append(s1+" Company Employee added!\n");
					}
				}
				catch(DuplicateItemException die){
					JOptionPane.showMessageDialog(null, "Duplicate Employee ID!");
					die.showError();
					textArea.setLineWrap(true);
					
					textArea.append("Duplicate Element!\n");
				}
				}
				else {
					JOptionPane.showMessageDialog(null, "You are not authorized!");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		btnNewButton.setBounds(107, 400, 106, 27);
		panel.add(btnNewButton);
		
		
		panel.add(textArea);
		
		JLabel lblNewLabel_6 = new JLabel("Display");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_6.setBounds(370, 92, 82, 17);
		panel.add(lblNewLabel_6);
		
		JButton btnNewButton_5 = new JButton("Back");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				secondpage sp=new secondpage(user);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_5.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		btnNewButton_5.setBounds(107, 475, 116, 32);
		panel.add(btnNewButton_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(210, 105, 30));
		tabbedPane.addTab("Remove Employee", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("EmpId");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_7.setBounds(181, 76, 85, 19);
		panel_1.add(lblNewLabel_7);
		
		
		panel_1.add(comboBox_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(133, 230, 319, 147);
		textArea_1.setLineWrap(true);
		textArea_1.setLineWrap(true);
		
		JButton btnNewButton_1 = new JButton("Remove");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String eid=comboBox_1.getSelectedItem().toString();
				if(user=="Admin")
				{
					JOptionPane.showMessageDialog(null, "You are an authorized user!");
				
				for(CompanyEmployee itr:employeeList2) {
					if(eid.equals(itr.empId))
					{
						employeeList2.remove(eid);
						textArea_1.append(eid+" !Removed Company Employee!\n");
						JOptionPane.showMessageDialog(null, eid+"!Removed Compony Employee!!");
						comboBox.removeItem(eid);
						comboBox_1.removeItem(eid);
						comboBox_2.removeItem(eid);
						comboBox_4.removeItem(eid);
						
					}
				}
				}
				else {
					JOptionPane.showMessageDialog(null, "You are not authorized!");
				}
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.setBounds(234, 132, 97, 25);
		panel_1.add(btnNewButton_1);
		
		
		panel_1.add(textArea_1);
		
		JLabel lblNewLabel_8 = new JLabel("Display");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_8.setBounds(258, 198, 85, 25);
		panel_1.add(lblNewLabel_8);
		
		JButton btnNewButton_6 = new JButton("Back");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				secondpage sp=new secondpage(user);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_6.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		btnNewButton_6.setBounds(246, 395, 97, 25);
		panel_1.add(btnNewButton_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(32, 178, 170));
		tabbedPane.addTab("Update Employee", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("EmpId");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_9.setBounds(71, 62, 78, 19);
		panel_2.add(lblNewLabel_9);
		
		
		panel_2.add(comboBox_2);
		
		JLabel lblNewLabel_10 = new JLabel("EmpSalary");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_10.setBounds(71, 108, 78, 19);
		panel_2.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("EmpAge");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_11.setBounds(71, 155, 78, 25);
		panel_2.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("EmpType");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_12.setBounds(70, 206, 79, 19);
		panel_2.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("EmpAddress");
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_13.setBounds(70, 253, 93, 19);
		panel_2.add(lblNewLabel_13);
		
		textField_5 = new JTextField();
		textField_5.setBounds(181, 107, 116, 22);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(182, 157, 116, 22);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(182, 252, 116, 22);
		panel_2.add(textField_7);
		textField_7.setColumns(10);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Driver", "Controller", "Conter Operator", "Cleaner", "Security Gaurd"}));
		comboBox_3.setBounds(182, 205, 115, 25);
		panel_2.add(comboBox_3);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(327, 78, 232, 303);
		textArea_2.setLineWrap(true);
		
		
		JButton btnNewButton_2 = new JButton("Update");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String eid=comboBox_2.getSelectedItem().toString();
				
				String s6=textField_5.getText();
				String s7=textField_6.getText();
				double salary=Integer.parseInt(textField_5.getText());
				int age=Integer.parseInt(textField_6.getText());
				
				String etype=comboBox_3.getSelectedItem().toString();
				
				String s8=textField_7.getText();
				
				if(user=="Admin")
				{
					JOptionPane.showMessageDialog(null, "You are an authorized user!");
				
				
				for(CompanyEmployee itr:employeeList2) {
					if(eid.equals(itr.empId))
					{
						itr.salary=salary;
						itr.empAge=age;
						itr.empType=etype;
						itr.empAddress=s8;
						textArea_2.append(eid+" !Changed Counter Operator in Station!\n");
						JOptionPane.showMessageDialog(null, eid+"!Changed Counter Operator in Station!!");
					}
				}
				}
				else {
					JOptionPane.showMessageDialog(null, "You are not authorized!");
				}
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_2.setBounds(124, 340, 97, 25);
		panel_2.add(btnNewButton_2);
		
		
		panel_2.add(textArea_2);
		
		JLabel lblNewLabel_14 = new JLabel("Display");
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_14.setBounds(410, 46, 84, 19);
		panel_2.add(lblNewLabel_14);
		
		JButton btnNewButton_7 = new JButton("Back");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				secondpage sp=new secondpage(user);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_7.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		btnNewButton_7.setBounds(223, 471, 97, 25);
		panel_2.add(btnNewButton_7);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 228, 196));
		tabbedPane.addTab("Display Employee", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_15 = new JLabel("EmpId");
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_15.setBounds(145, 33, 79, 25);
		panel_3.add(lblNewLabel_15);
		
		
		panel_3.add(comboBox_4);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(12, 220, 547, 249);
		textArea_3.setLineWrap(true);
		
		JButton btnNewButton_3 = new JButton("Display");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String eid=comboBox_4.getSelectedItem().toString();
				
				if(user=="Admin")
				{
					JOptionPane.showMessageDialog(null, "You are an authorized user!");
				
				for(CompanyEmployee itr:employeeList2) {
					if(eid.equals(itr.empId))
					{
						String data=itr.toString();
						
						textArea_3.append(data);
						
						JOptionPane.showMessageDialog(null, eid+"!Company Employee!!");
					}
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "You are not authorized!");
			}
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_3.setBounds(210, 79, 97, 25);
		panel_3.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("DisplayAll");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(CompanyEmployee itr:employeeList2) {
					String data=itr.toString();
					
					textArea_3.append(data);		
			}
			JOptionPane.showMessageDialog(null, "!Display All Company Employee!!");
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_4.setBounds(196, 136, 126, 33);
		panel_3.add(btnNewButton_4);
		
		
		panel_3.add(textArea_3);
		
		JLabel lblNewLabel_16 = new JLabel("Display");
		lblNewLabel_16.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_16.setBounds(227, 182, 92, 25);
		panel_3.add(lblNewLabel_16);
		
		JButton btnNewButton_8 = new JButton("Back");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				secondpage sp=new secondpage(user);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_8.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		btnNewButton_8.setBounds(239, 506, 97, 25);
		panel_3.add(btnNewButton_8);
	}

}
