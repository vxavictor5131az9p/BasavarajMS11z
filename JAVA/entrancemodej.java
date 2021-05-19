package cppackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

class EntranceMode {
	String eModeType;
	String source;
	String destination;
	double travelDistance;

	EntranceMode() {
		eModeType = "";
		source = "";
		destination = "";
		travelDistance = 0;

	}

	EntranceMode(String emt, String src, String dst, double td) {
		eModeType = emt;
		source = src;
		destination = dst;
		travelDistance = td;

	}

	void displayMode() {

		System.out.println("\nEntrance Mode................");
		System.out.println("Mode Type:" + eModeType + "\tSource:" + source + "\tDestination:" + destination
				+ "\tTravel Distance:" + travelDistance + " km");

	}

	public String toString() {
		return "Mode Type:" + eModeType + "\tSource:" + source + "\tDestination:" + destination + "\tTravel Distance:"
				+ travelDistance + " km";
	}
}

class Ticket extends EntranceMode {
	int serialNo;
	String date;
	String time;
	String ticketType;
	double ticketPrice;
	String operatorId;

	Ticket() {
		super();
		this.serialNo = 0;
		this.date = "";
		this.time = "";
		this.ticketType = "";
		this.ticketPrice = 0;
		this.operatorId = "";
		
	}

	Ticket(String em, String src, String dst, double td, int sn, String dt, String t, String tt, double tp,
			String oid) {
		super(em, src, dst, td);
		this.serialNo = sn;
		this.date = dt;
		this.time = t;
		this.ticketType = tt;
		this.ticketPrice = tp;
		this.operatorId = oid;
	}

	void displayMode() {
		System.out.println("\nTicket Entrance Mode............");
		super.displayMode();
		System.out.println("Serial Number:" + serialNo + "\tDate:" + date + "\nTime:" + time + "\tTicket Type:"
				+ ticketType + "\tTicket Price:" + ticketPrice + "\tOperator ID:" + operatorId);

	}

	public String toString() {
		//System.out.println("\nTicket Entrance Mode............");
		return super.toString() + "Serial Number:" + serialNo + "\tDate:" + date + "\nTime:" + time + "\tTicket Type:"
				+ ticketType + "\tTicket Price:" + ticketPrice + "\tOperator ID:" + operatorId;

	}
}

class SmartCard extends EntranceMode {
	String smartCardType;
	String holderName;
	String validity;
	double balance;

	SmartCard() {
		super();
		smartCardType = "";
		holderName = "";
		validity = "";
		balance = 0;
	}

	SmartCard(String em, String src, String dst, double td, String sct, String hn, String val, double bal) {
		super(em, src, dst, td);
		this.smartCardType = sct;
		this.holderName = hn;
		this.validity = val;
		this.balance = bal;
	}

	void displayMode() {
		System.out.println("\nSmart Card Entrance Mode........");
		super.displayMode();
		System.out.println("Smart Card Type:" + smartCardType + "\tHolder Name:" + holderName + "\tValidity:" + validity
				+ "\tBalance:" + balance);
	}

	public String toString() {
		//System.out.println("\nSmart Card Entrance Mode........");
		return super.toString() + "Smart Card Type:" + smartCardType + "\tHolder Name:" + holderName + "\tValidity:"
				+ validity + "\tBalance:" + balance;

	}

	void rechargeSmartCard(double x) {
		System.out.println("\n\nBefore Recharge");
		displayMode();
		balance += x;
		System.out.println("\nRecharged");
		displayMode();
	}
}


public class entrancemodej extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_9;
	private JTextField textField;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_8;
	private JTextField textField_10;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					entrancemodej frame = new entrancemodej();
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
	 * @param pid 
	 * @param passengers 
	 * @param sc 
	 * @param stationList 
	 */
	public entrancemodej(ArrayList<Passenger> passengers, String pid, ArrayList<StationC> stationList, String sc) {
		setTitle("Entrance Mode");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setPreferredSize(new Dimension(600,600));
		//pack();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(255, 255, 153));
		tabbedPane.setBounds(12, 13, 608, 673);
		contentPane.add(tabbedPane);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Dharwad-New-Bus-Stop ", "Dharwad-Terminal ", "Jubili circle ", "Court-Circle ", "NTTF ", "TollNaka ", "JSS ", "Vidyagiri ", "Gandhinagar ", "Lakamanahalli ", "Sattur ", "SDM ", "Navalur Station ", "Rayapur ", "Iskcon ", "RTO ", "NavaNagar ", "APMC ", "Shantiniketan ", "Bhairidevarakoppa ", "Unkal Lake ", "Unkal Village ", "Unkal Cross ", "BVB ", "Vidya Nagar ", "KIMS ", "Hosur Cross ", "OCBC ", "Railway Station "}));
		comboBox_3.setBounds(298, 14, 116, 23);
		
		JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"Dharwad-New-Bus-Stop ", "Dharwad-Terminal ", "Jubili circle ", "Court-Circle ", "NTTF ", "TollNaka ", "JSS ", "Vidyagiri ", "Gandhinagar ", "Lakamanahalli ", "Sattur ", "SDM ", "Navalur Station ", "Rayapur ", "Iskcon ", "RTO ", "NavaNagar ", "APMC ", "Shantiniketan ", "Bhairidevarakoppa ", "Unkal Lake ", "Unkal Village ", "Unkal Cross ", "BVB ", "Vidya Nagar ", "KIMS ", "Hosur Cross ", "OCBC ", "Railway Station "}));
		comboBox_12.setBounds(321, 14, 116, 23);
		
		JComboBox comboBox_13 = new JComboBox();
		comboBox_13.setModel(new DefaultComboBoxModel(new String[] {"Dharwad-New-Bus-Stop ", "Dharwad-Terminal ", "Jubili circle ", "Court-Circle ", "NTTF ", "TollNaka ", "JSS ", "Vidyagiri ", "Gandhinagar ", "Lakamanahalli ", "Sattur ", "SDM ", "Navalur Station ", "Rayapur ", "Iskcon ", "RTO ", "NavaNagar ", "APMC ", "Shantiniketan ", "Bhairidevarakoppa ", "Unkal Lake ", "Unkal Village ", "Unkal Cross ", "BVB ", "Vidya Nagar ", "KIMS ", "Hosur Cross ", "OCBC ", "Railway Station "}));
		comboBox_13.setBounds(321, 50, 116, 23);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(321, 198, 116, 22);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 255, 153));
		tabbedPane.addTab("Smart Card", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(12, 13, 579, 579);
		panel_1.add(tabbedPane_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 204, 102));
		tabbedPane_1.addTab("Create Smart Card", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel label = new JLabel("Source");
		label.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label.setBounds(139, 13, 75, 22);
		panel_4.add(label);
		
		JLabel label_1 = new JLabel("Destination");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_1.setBounds(140, 48, 97, 25);
		panel_4.add(label_1);
		
		
		panel_4.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Dharwad-New-Bus-Stop ", "Dharwad-Terminal ", "Jubili circle ", "Court-Circle ", "NTTF ", "TollNaka ", "JSS ", "Vidyagiri ", "Gandhinagar ", "Lakamanahalli ", "Sattur ", "SDM ", "Navalur Station ", "Rayapur ", "Iskcon ", "RTO ", "NavaNagar ", "APMC ", "Shantiniketan ", "Bhairidevarakoppa ", "Unkal Lake ", "Unkal Village ", "Unkal Cross ", "BVB ", "Vidya Nagar ", "KIMS ", "Hosur Cross ", "OCBC ", "Railway Station "}));
		comboBox_4.setBounds(298, 50, 116, 23);
		panel_4.add(comboBox_4);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(298, 154, 116, 22);
		panel_4.add(textField_1);
		
		JLabel lblHoldername = new JLabel("HolderName");
		lblHoldername.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblHoldername.setBounds(139, 153, 97, 22);
		panel_4.add(lblHoldername);
		
		JLabel lblValidity = new JLabel("Validity");
		lblValidity.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblValidity.setBounds(139, 188, 97, 25);
		panel_4.add(lblValidity);
		
		JLabel lblCardtype = new JLabel("CardType");
		lblCardtype.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblCardtype.setBounds(140, 115, 97, 25);
		panel_4.add(lblCardtype);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Concessional", "Student", "E-Purse"}));
		comboBox_5.setBounds(298, 117, 116, 23);
		panel_4.add(comboBox_5);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(298, 228, 116, 22);
		panel_4.add(textField_9);
		
		JLabel lblBalance = new JLabel("Balance");
		lblBalance.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblBalance.setBounds(139, 226, 97, 25);
		panel_4.add(lblBalance);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(298, 82, 116, 22);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"Valid", "Invalid"}));
		comboBox_9.setBounds(298, 190, 116, 23);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setLineWrap(true);
		textArea_1.setBounds(90, 348, 381, 129);
		
		JButton btnCreateSmartCard = new JButton("Create Smart Card");
		btnCreateSmartCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String source=comboBox_3.getSelectedItem().toString();
				String dest=comboBox_4.getSelectedItem().toString();
				String s1=textField_12.getText();
				double dist=Integer.parseInt(textField_12.getText());
				String s2=textField_1.getText();
				String s3=textField_8.getText();
				String s4=comboBox_9.getSelectedItem().toString();
				double balance=Integer.parseInt(textField_9.getText());
				String cardtype=comboBox_5.getSelectedItem().toString();
				
				try {
					int flag=0;
					for(Passenger itr:passengers) {
						if(pid.equals(itr.pasId))
						{
							if(itr.eMode!=null && itr.eMode.eModeType=="SmartCard")
							{
								flag=1;
							}
								//itr.eMode=new Ticket("SmartCard",source,dest,dist,s2,s3,s4,cardtype);
						}
					}
					if(flag==1) {
						throw new DuplicateItemException(1234,"Smart Car for this Passenger already exists!");
					}
					else {
						for(Passenger itr:passengers) {
							if(pid.equals(itr.pasId))
							{
							
									itr.eMode=new SmartCard("SmartCard",source,dest,dist,cardtype,s2,s3,balance);
							}
						}
					
						JOptionPane.showMessageDialog(null, "Smart Card Created!");
						textArea_1.append(s1+"Smart Card Created!\n");
					}
				}
				
				catch(DuplicateItemException die){
					JOptionPane.showMessageDialog(null, "Duplicate Passenger for Smart Card!");
					die.showError();
					textArea_1.setLineWrap(true);
					
					textArea_1.append("Duplicate Element!\n");
				}	
	
			}
				
		
		});
		btnCreateSmartCard.setBounds(197, 280, 141, 24);
		panel_4.add(btnCreateSmartCard);
		
		JLabel label_8 = new JLabel("Display");
		label_8.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_8.setBounds(243, 317, 80, 18);
		panel_4.add(label_8);
		
		panel_4.add(textArea_1);
		
		JButton button_2 = new JButton("Back");
		button_2.setBounds(226, 591, 97, 25);
		panel_4.add(button_2);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				passengerj sp=new passengerj(stationList,sc);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnBack.setBounds(223, 490, 116, 24);
		panel_4.add(btnBack);
		
		
		panel_4.add(textField_12);
		
		JLabel label_11 = new JLabel("Travel Dist");
		label_11.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_11.setBounds(139, 86, 97, 24);
		panel_4.add(label_11);
		
		
		panel_4.add(comboBox_9);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 250, 205));
		tabbedPane_1.addTab("Update Details", null, panel_2, null);
		panel_2.setLayout(null);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Dharwad-New-Bus-Stop ", "Dharwad-Terminal ", "Jubili circle ", "Court-Circle ", "NTTF ", "TollNaka ", "JSS ", "Vidyagiri ", "Gandhinagar ", "Lakamanahalli ", "Sattur ", "SDM ", "Navalur Station ", "Rayapur ", "Iskcon ", "RTO ", "NavaNagar ", "APMC ", "Shantiniketan ", "Bhairidevarakoppa ", "Unkal Lake ", "Unkal Village ", "Unkal Cross ", "BVB ", "Vidya Nagar ", "KIMS ", "Hosur Cross ", "OCBC ", "Railway Station "}));
		comboBox_6.setBounds(307, 14, 116, 23);
		panel_2.add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"Dharwad-New-Bus-Stop ", "Dharwad-Terminal ", "Jubili circle ", "Court-Circle ", "NTTF ", "TollNaka ", "JSS ", "Vidyagiri ", "Gandhinagar ", "Lakamanahalli ", "Sattur ", "SDM ", "Navalur Station ", "Rayapur ", "Iskcon ", "RTO ", "NavaNagar ", "APMC ", "Shantiniketan ", "Bhairidevarakoppa ", "Unkal Lake ", "Unkal Village ", "Unkal Cross ", "BVB ", "Vidya Nagar ", "KIMS ", "Hosur Cross ", "OCBC ", "Railway Station "}));
		comboBox_7.setBounds(307, 50, 116, 23);
		panel_2.add(comboBox_7);
		
		JLabel label_2 = new JLabel("Destination");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_2.setBounds(149, 48, 97, 25);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("Source");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_3.setBounds(148, 13, 75, 22);
		panel_2.add(label_3);
		
		JLabel label_5 = new JLabel("CardType");
		label_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_5.setBounds(149, 111, 97, 25);
		panel_2.add(label_5);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"Concessional", "Student", "E-Purse"}));
		comboBox_8.setBounds(307, 111, 116, 23);
		panel_2.add(comboBox_8);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(307, 147, 116, 22);
		panel_2.add(textField);
		
		JLabel label_6 = new JLabel("HolderName");
		label_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_6.setBounds(149, 146, 97, 22);
		panel_2.add(label_6);
		
		JLabel label_7 = new JLabel("Validity");
		label_7.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_7.setBounds(149, 182, 97, 25);
		panel_2.add(label_7);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(307, 220, 116, 22);
		panel_2.add(textField_11);
		
		JLabel label_9 = new JLabel("Balance");
		label_9.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_9.setBounds(148, 221, 97, 25);
		panel_2.add(label_9);
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"Valid", "Invalid"}));
		comboBox_10.setBounds(307, 184, 116, 23);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(307, 80, 116, 22);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setLineWrap(true);
		textArea_2.setBounds(99, 348, 381, 129);
		
		JButton btnUpdateSmartCard = new JButton("Update Smart Card");
		btnUpdateSmartCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String source=comboBox_6.getSelectedItem().toString();
				String dest=comboBox_7.getSelectedItem().toString();
				String s1=textField_8.getText();
				double dist=Integer.parseInt(textField_8.getText());
				String cardtype=comboBox_8.getSelectedItem().toString();
				String s2=textField.getText();
				String s3=textField_11.getText();
				String s4=comboBox_10.getSelectedItem().toString();
				double balance=Integer.parseInt(textField_11.getText());

				for(Passenger itr:passengers) {
					if(pid.equals(itr.pasId))
					{
						itr.eMode=new SmartCard("SmartCard",source,dest,dist,cardtype,s2,s3,balance);
					}
				}
					
				JOptionPane.showMessageDialog(null, "Smart Card Updated!");
				textArea_2.append("Smart Card Updated!\n");		
			}
		});
		btnUpdateSmartCard.setBackground(new Color(255, 228, 196));
		btnUpdateSmartCard.setBounds(199, 280, 152, 23);
		panel_2.add(btnUpdateSmartCard);
		
		JLabel label_10 = new JLabel("Display");
		label_10.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_10.setBounds(252, 317, 80, 18);
		panel_2.add(label_10);
		
		
		panel_2.add(textArea_2);
		
		JButton button_3 = new JButton("Back");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				passengerj sp=new passengerj(stationList,sc);
				sp.setVisible(true);
				setVisible(false);
				dispose();
				
			}
		});
		button_3.setBounds(216, 490, 116, 24);
		panel_2.add(button_3);
		
		panel_2.add(comboBox_10);
		
		JLabel label_12 = new JLabel("Travel Dist");
		label_12.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_12.setBounds(149, 78, 97, 24);
		panel_2.add(label_12);
		
		
		panel_2.add(textField_8);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setLineWrap(true);
		textArea_3.setBounds(42, 130, 487, 296);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 228, 225));
		tabbedPane_1.addTab("Display Smart Card", null, panel_3, null);
		panel_3.setLayout(null);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(Passenger itr:passengers) {
					if(pid.equals(itr.pasId))
					{
						if(itr.eMode.eModeType=="SmartCard")
						{
							String data=itr.eMode.toString();
							
							textArea_3.append(pid+"!Passsenger's Smart Card!!....\n"+data);
							
							JOptionPane.showMessageDialog(null, pid+"!Passsenger's Smart Card!!");
						}
						else
						{
							textArea_3.append(pid+"!Passsenger Don't has Smart Card!!....\n");
							
							JOptionPane.showMessageDialog(null, pid+"!Passsenger Don't has Smart Card!!");
						}
						
					}
				}
				
				//String data=
			}
		});
		btnDisplay.setBackground(new Color(255, 228, 196));
		btnDisplay.setBounds(213, 60, 133, 25);
		panel_3.add(btnDisplay);
		
		JLabel label_13 = new JLabel("Display");
		label_13.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_13.setBounds(249, 99, 80, 18);
		panel_3.add(label_13);
		
		
		panel_3.add(textArea_3);
		
		JButton button_4 = new JButton("Back");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passengerj sp=new passengerj(stationList,sc);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		button_4.setBounds(230, 490, 116, 24);
		panel_3.add(button_4);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 222, 173));
		tabbedPane.addTab("Ticket", null, panel_6, null);
		panel_6.setLayout(null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(12, 13, 579, 617);
		panel_6.add(tabbedPane_2);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(173, 255, 47));
		tabbedPane_2.addTab("Create Ticket", null, panel_8, null);
		panel_8.setLayout(null);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBackground(new Color(255, 204, 102));
		panel_9.setBounds(0, 0, 574, 587);
		panel_8.add(panel_9);
		
		JLabel label_14 = new JLabel("Travel Dist");
		label_14.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_14.setBounds(163, 86, 97, 24);
		panel_9.add(label_14);
		
		JLabel label_15 = new JLabel("Destination");
		label_15.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_15.setBounds(163, 48, 97, 25);
		panel_9.add(label_15);
		
		JLabel label_16 = new JLabel("Source");
		label_16.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_16.setBounds(162, 13, 75, 22);
		panel_9.add(label_16);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(321, 88, 116, 22);
		panel_9.add(textField_10);
		
		JLabel label_17 = new JLabel("TicketType");
		label_17.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_17.setBounds(163, 239, 97, 25);
		panel_9.add(label_17);
		
		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"Student Pass", "Monthly Pass", "General Passenger"}));
		comboBox_11.setBounds(321, 241, 116, 23);
		panel_9.add(comboBox_11);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(321, 124, 116, 22);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(321, 317, 116, 22);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(321, 279, 116, 22);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(321, 160, 116, 22);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setLineWrap(true);
		textArea_4.setBounds(102, 409, 381, 129);
		
		JButton button = new JButton("Create Ticket");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String source=comboBox_12.getSelectedItem().toString();
				String dest=comboBox_13.getSelectedItem().toString();
				String s1=textField_10.getText();
				double dist=Integer.parseInt(textField_10.getText());
				String s2=textField_13.getText();
				int slno=Integer.parseInt(textField_13.getText());
				String s3=textField_14.getText();
				String s4=textField_15.getText();
				String tickettype=comboBox_11.getSelectedItem().toString();
				String s5=textField_16.getText();
				double price=Integer.parseInt(textField_6.getText());
				String s6=textField_17.getText();
				
				
				for(Passenger itr:passengers) {
					if(pid.equals(itr.pasId))
					{
							itr.eMode=new Ticket("Ticket",source,dest,dist,slno,s3,s4,tickettype,price,s6);
					}
				}
				//employeeList2.add(new CompanyEmployee(s1,s2,salary,age,emptype,s5));
				//comboBox_1.addItem(s1);
				//comboBox_2.addItem(s1);
				//comboBox_4.addItem(s1);

				JOptionPane.showMessageDialog(null, "Ticket Created!");
				textArea_4.append(pid+" Passenger's Ticket Created !\n");
				
			}
		});
		button.setBounds(230, 352, 116, 24);
		panel_9.add(button);
		
		JButton button_5 = new JButton("Back");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				passengerj sp=new passengerj(stationList,sc);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		button_5.setBounds(232, 556, 97, 25);
		panel_9.add(button_5);
		
		JLabel label_18 = new JLabel("Display");
		label_18.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_18.setBounds(249, 389, 80, 18);
		panel_9.add(label_18);
		
		
		panel_9.add(textArea_4);
		
		JLabel label_19 = new JLabel("Serial No");
		label_19.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_19.setBounds(163, 123, 75, 22);
		panel_9.add(label_19);
		
		
		panel_9.add(textField_13);
		
		JLabel label_20 = new JLabel("Date");
		label_20.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_20.setBounds(163, 158, 97, 25);
		panel_9.add(label_20);
		
		
		panel_9.add(textField_14);
		
		JLabel label_21 = new JLabel("Time");
		label_21.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_21.setBounds(163, 196, 97, 24);
		panel_9.add(label_21);
		
		
		panel_9.add(textField_15);
		
		JLabel label_22 = new JLabel("Price");
		label_22.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_22.setBounds(163, 277, 97, 25);
		panel_9.add(label_22);
		
		
		panel_9.add(textField_16);
		
		JLabel label_23 = new JLabel("OperatorId");
		label_23.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_23.setBounds(163, 315, 97, 24);
		panel_9.add(label_23);
		
		
		panel_9.add(textField_17);
		
		
		panel_9.add(comboBox_12);
		
		
		panel_9.add(comboBox_13);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(189, 183, 107));
		tabbedPane_2.addTab("Display Ticket", null, panel_7, null);
		panel_7.setLayout(null);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setLineWrap(true);
		textArea_5.setBounds(44, 83, 487, 296);
		
		JButton button_6 = new JButton("Display");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(Passenger itr:passengers) {
					if(pid.equals(itr.pasId))
					{
						if(itr.eMode.eModeType=="Ticket")
						{
							String data=itr.eMode.toString();
							
							textArea_5.append(pid+"!Passsenger's Ticket!!....\n"+data);
							
							JOptionPane.showMessageDialog(null, pid+"!Passsenger's Ticket!!");
						}
						else
						{
							textArea_5.append(pid+"!Passsenger Don't has Ticket!!....\n");
							
							JOptionPane.showMessageDialog(null, pid+"!Passsenger Don't has Ticket!!");
						}
						
					}
				}
				
			}
		});
		button_6.setBackground(new Color(255, 228, 196));
		button_6.setBounds(215, 13, 133, 25);
		panel_7.add(button_6);
		
		JLabel label_24 = new JLabel("Display");
		label_24.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_24.setBounds(251, 52, 80, 18);
		panel_7.add(label_24);
		
		
		panel_7.add(textArea_5);
		
		JButton button_7 = new JButton("Back");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				passengerj sp=new passengerj(stationList,sc);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		button_7.setBounds(232, 443, 116, 24);
		panel_7.add(button_7);
	}

}
