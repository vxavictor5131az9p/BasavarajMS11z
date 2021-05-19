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
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


class Passenger {
	String pasId;
	String pasName;
	int pasAge;
	String pasType;
	EntranceMode eMode; // Passenger owns Entrance Mode

	Passenger() {
		pasId="";
		pasName = "";
		pasAge = 0;
		pasType = "";
		eMode=null;

	}

	Passenger(String pid,String pn, int pa, String pt, EntranceMode em) {
		this.pasId=pid;
		this.pasName = pn;
		this.pasAge = pa;
		this.pasType = pt;
		this.eMode = em;
	}

	void displayPassenger() {
		System.out.println("\nDisplay Passenger......");
		System.out.println("Passenger Name:" + pasName + "\tPassenger Age:" + pasAge + "\tPassenger Type:" + pasType);
		eMode.displayMode();
	}
	String displayToString() {
		String s="Passenger Id:" + pasId + " Passenger Name:" + pasName + " Passenger Age:" + pasAge + " Passenger Type:" + pasType;
		return s+'\n';
	}
}

public class passengerj extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					passengerj frame = new passengerj();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 * @param sc 
	 * @param stationList 
	 */
	public passengerj(ArrayList<StationC> stationList, String sc) {
		
		
		setTitle("Passenger");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setPreferredSize(new Dimension(600,600));
		//pack();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		
		Ticket t1=new Ticket("Ticket","Dharwad New Bus Stop","Dharwad BRTS Terminal",1.0,001,"10-01-2020","10:10:03","StudentPass",1.00,"A23B");		
		Ticket t2=new Ticket("Ticket","Dharwad BRTS Terminal","JSS",4.2,010,"12-12-2019","12:50:30","StudentPass",1.00,"M25B");
		Ticket t3=new Ticket("Ticket","Jubilee Circle","BVB",13.2,006,"02-04-2019","12:50:30","StudentPass",1.00,"C25G");
		Ticket t4=new Ticket("Ticket","Court circle","KIMS",13.8,007,"21-02-2019","12:50:30","Passenger",20.00,"V25L");
		Ticket t5=new Ticket("Ticket","NTTF","JSS",1.8,003,"27-01-2019","12:50:30","MonthlyPass",2.00,"K48K");
		Ticket t6=new Ticket("Ticket","Hosa Yellapur Cross","BVB",11.4,015,"12-02-2019","12:50:30","StudentPass",1.00,"H55D");
		Ticket t7=new Ticket("Ticket","Toll Naka","Jubilee Circle",2.4,026,"12-03-2019","12:10:30","StudentPass",1.00,"V24E");
		Ticket t8=new Ticket("Ticket","JSS","Jubilee Circle",3,045,"18-04-2019","10:10","Passenger",15.00,"E26R");
		Ticket t9=new Ticket("Ticket","Vidyagiri","JSS",0.6,041,"12-06-2019","11:40:26","StudentPass",1.00,"W35R");
		Ticket t10=new Ticket("Ticket","Gandhi Nagar","Toll Naka",1.8,063,"12-12-2019","12:50:30","MonthlyPass",2.00,"J55E");
		Ticket t11=new Ticket("Ticket","Lakamanahalli","JSS",1.8,045,"13-10-2019","12:50:30","StudentPass",1.00,"V36V");
		Ticket t12=new Ticket("Ticket","Sattur","SDM",0.6,101,"12-05-2019","12:50:30","Passenger",8.00,"W65F");
		Ticket t13=new Ticket("Ticket","SDM","Sattur",0.6,221,"12-09-2019","12:00:23","StudentPass",1.00,"2ERG");
		Ticket t14=new Ticket("Ticket","Navalur Station","OCBS",9.6,201,"12-08-2019","10:10:10","StudentPass",1.00,"AV09");
		Ticket t15=new Ticket("Ticket","Rayapur","BVB",6.0,301,"12-10-2019","10:10","MonthlyPass",2.00,"K6YV");
		Ticket t16=new Ticket("Ticket","Iskcon","Vidya Nagar",6.0,401,"12-10-2019","10:10","Passenger",16.00,"8YHN");
		Ticket t17=new Ticket("Ticket","RTO","Navanagar",0.6,321,"10-12-2019","10:10","StudentPass",1.00,"KJ93");
		Ticket t18=new Ticket("Ticket","Navanagar","Toll Naka",7,361,"09-12-2019","10:10","StudentPass",1.00,"NK8M");
		Ticket t19=new Ticket("Ticket","APMC","JSS",7,001,"23-02-2019","10:10","StudentPass",1.00,"MN98");
		Ticket t20=new Ticket("Ticket","Shantiniketan","Hosur Cross",8,065,"18-11-2019","10:10","MonthlyPass",2.00,"JH98");
		Ticket t21=new Ticket("Ticket","Bhairidevarkoppa","KIMS",4,045,"13-12-2019","12:50:30","StudentPass",1.00,"KJN9");
		Ticket t22=new Ticket("Ticket","Unkal Lake","Navanagar",3,011,"16-02-2020","20:20:30","StudentPass",1.00,"JN89");
		Ticket t23=new Ticket("Ticket","Unkal Village","BVB",1.2,041,"12-10-2019","06:40:30","StudentPass",1.00,"LKJ0");
		Ticket t24=new Ticket("Ticket","Unkal Cross","Vidyagiri",1.2,241,"19-01-2019","12:50:30","Passenger",10.00,"KJY9");
		Ticket t25=new Ticket("Ticket","BVB","KIMS",1.2,751,"12-11-2019","12:50:30","MonthlyPass",2.00,"KJH8");
		Ticket t26=new Ticket("Ticket","Vidya Nagar","Unkal Lake",1.8,301,"14-04-2019","12:50:30","StudentPass",1.00,"7Y8Y");
		Ticket t27=new Ticket("Ticket","KIMS","OCBS",4.0,245,"02-08-2019","14:50:30","StudentPass",1.00,"IUY8");
		Ticket t28=new Ticket("Ticket","Hosur Cross","OCBS",0.6,125,"17-07-2019","12:50:20","Passenger",10.00,"KJH9");
		Ticket t29=new Ticket("Ticket","Dr.B.R.Ambedkar Circle","BVB",15,489,"02-05-2019","18:00:30","StudentPass",1.00,"987H");
		Ticket t30=new Ticket("Ticket","Hubli CBT","Jubilee Circle",17,155,"26-12-2019","09:10:20","MonthlyPass",2.00,"98HN");
		Ticket t31=new Ticket("Ticket","OCBS","BVB",4.6,136,"27-02-2020","16:50:10","StudentPass",1.00,"987H");
		Ticket t32=new Ticket("Ticket","Railway Station-Hubli","OCBS",4.2,851,"11-05-2019","12:50:38","Passenger",10.00,"YH9B");
		
		SmartCard sc1=new SmartCard("SmartCard","Dharwad New Bus Stop","OCBS",18.0,"Concessional","Abhay","Valid",230);
		SmartCard sc2=new SmartCard("SmartCard","Dharwad BRTS Terminal","JSS",4.2,"Student","Vinay","Valid",412);
		SmartCard sc3=new SmartCard("SmartCard","Jubilee Circle","BVB",13.2,"Concessional","Kumar","Valid",654);
		SmartCard sc4=new SmartCard("SmartCard","Court circle","KIMS",13.8,"Student","Vijay","Valid",256);
        SmartCard sc5=new SmartCard("SmartCard","NTTF","JSS",1.8,"Student","Sidram","Valid",659);
        SmartCard sc6=new SmartCard("SmartCard","Hosa Yellapur Cross","BVB",11.4,"Student","Amrita","Valid",264);
        SmartCard sc7=new SmartCard("SmartCard","Toll Naka","Jubilee Circle",2.4,"Concessional","Keshav","Valid",326);
        SmartCard sc8=new SmartCard("SmartCard","JSS","Jubilee Circle",3,"Student","Karthik","Valid",256);
        SmartCard sc9=new SmartCard("SmartCard","Vidyagiri","JSS",0.6,"Student","Sunil","Valid",500);
        SmartCard sc10=new SmartCard("SmartCard","Gandhi Nagar","Toll Naka",1.8,"Concessional","Praveen","Valid",366);
        SmartCard sc11=new SmartCard("SmartCard","Lakamanahalli","JSS",1.8,"Student","Chinmay","Valid",2369);
        SmartCard sc12=new SmartCard("SmartCard","Sattur","SDM",0.6,"Student","Kirti","Valid",369);
        SmartCard sc13=new SmartCard("SmartCard","SDM","Sattur",0.6,"Student","Karun","Valid",985);
        SmartCard sc14=new SmartCard("SmartCard","Navalur Station","OCBS",9.6,"Concessional","Sonal","Valid",369);
        SmartCard sc15=new SmartCard("SmartCard","Rayapur","BVB",6.0,"Student","Chirag","Valid",856);
        SmartCard sc16=new SmartCard("SmartCard","Iskcon","Vidya Nagar",6.0,"Student","Vilas","Valid",321);
        SmartCard sc17=new SmartCard("SmartCard","RTO","Navanagar",0.6,"Student","Jagadeesh","Valid",695);
        SmartCard sc18=new SmartCard("SmartCard","Navanagar","Toll Naka",7,"Concessional","Pradeep","Valid",963);
        SmartCard sc19=new SmartCard("SmartCard","APMC","JSS",7,"Student","Sukanya","Valid",964);
        SmartCard sc20=new SmartCard("SmartCard","Shantiniketan","Hosur Cross",8,"Student","Sadhvi","Valid",258);
        SmartCard sc21=new SmartCard("SmartCard","Bhairidevarkoppa","KIMS",4,"Concessional","Mohan","Valid",685);
        SmartCard sc22=new SmartCard("SmartCard","Unkal Lake","Navanagar",3,"Student","Milan","Valid",326);
        SmartCard sc23=new SmartCard("SmartCard","Unkal Village","BVB",1.2,"Student","Aravind","Valid",687);
        SmartCard sc24=new SmartCard("SmartCard","Unkal Cross","Vidyagiri",1.2,"Student","Rajini","Valid",326);
        SmartCard sc25=new SmartCard("SmartCard","BVB","KIMS",1.2,"Student","Kalmesh","Valid",248);
        SmartCard sc26=new SmartCard("SmartCard","Vidya Nagar","Unkal Lake",1.8,"Concessional","Samarth","Valid",264);
        SmartCard sc27=new SmartCard("SmartCard","KIMS","OCBS",4.0,"Student","Shanmukh","Valid",265);
        SmartCard sc28=new SmartCard("SmartCard","Hosur Cross","OCBS",0.6,"Student","Vishnu","Valid",326);
        SmartCard sc29=new SmartCard("SmartCard","Dr.B.R.Ambedkar Circle","BVB",15,"E-Purse","Madan","Valid",8527);
        SmartCard sc30=new SmartCard("SmartCard","Hubli CBT","Jubilee Circle",17,"E-Purse","Roshan","Valid",2598);
        SmartCard sc31=new SmartCard("SmartCard","OCBS","BVB",4.6,"E-Purse","Manish","Valid",5000);
        SmartCard sc32=new SmartCard("SmartCard","Railway Station-Hubli","3.4",4.2,"E-Purse","Manohar","Valid",6254);
		
		EntranceMode em1=t1,em2=t2,em3=t3,em4=t4,em5=t5,em6=t6,em7=t7,em8=t8,em9=t9,em10=t10,em11=t11,em12=t12,em13=t13,em14=t14,em15=t15,em16=t16,
				em17=t17,em18=t18,em19=t19,em20=t20,em21=t21,em22=t22,em23=t23,em24=t24,em25=t25,em26=t26,em27=t27,em28=t28,em29=t29,em30=t30,em31=t31,em32=t32;
		
		EntranceMode ems1=sc1,ems2=sc2,ems3=sc3,ems4=sc4,ems5=sc5,ems6=sc6,ems7=sc7,ems8=sc8,ems9=sc9,ems10=sc10,ems11=sc11,ems12=sc12,ems13=sc13,ems14=sc14,ems15=sc15,ems16=sc16,
				ems17=sc17,ems18=sc18,ems19=sc19,ems20=sc20,ems21=sc21,ems22=sc22,ems23=sc23,ems24=sc24,ems25=sc25,ems26=sc26,ems27=sc27,ems28=sc28,ems29=sc29,ems30=sc30,ems31=sc31,ems32=sc32;
		
		ArrayList<Passenger> p1=new ArrayList<Passenger>();
		p1.add(new Passenger("S1P01","Abhilash",18,"Student",em1));
		p1.add(new Passenger("S1P02","Abhay",26,"Passenger Smart Card",ems1));
		
		stationList.get(0).passengers=p1;
		
		ArrayList<Passenger> p2=new ArrayList<Passenger>();
		p2.add(new Passenger("S2P01","Suhas",20,"Student",em2));
		p2.add(new Passenger("S2P02","Vinay",26,"Student Smart Card",ems2));
		
		stationList.get(1).passengers=p2;
		
		ArrayList<Passenger> p3=new ArrayList<Passenger>();
		p3.add(new Passenger("S3P01","Vineeth",18,"Student",em3));
		p3.add(new Passenger("S3P02","Kumar",26,"Concessional Smart Card",ems3));
		
		stationList.get(2).passengers=p3;
		
		ArrayList<Passenger> p4=new ArrayList<Passenger>();
		p4.add(new Passenger("S4P01","Abhilash",18,"Student",em1));
		p4.add(new Passenger("S4P02","Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p5=new ArrayList<Passenger>();
		p5.add(new Passenger("S4P02","Abhilash",18,"Student",em1));
		p5.add(new Passenger("S4P02","Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p6=new ArrayList<Passenger>();
		p6.add(new Passenger("S4P02","Abhilash",18,"Student",em1));
		p6.add(new Passenger("S4P02","Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p7=new ArrayList<Passenger>();
		p7.add(new Passenger("S4P02","Abhilash",18,"Student",em1));
		p7.add(new Passenger("S4P02","Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p8=new ArrayList<Passenger>();
		p8.add(new Passenger("S4P02","Abhilash",18,"Student",em1));
		p8.add(new Passenger("S4P02","Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p9=new ArrayList<Passenger>();
		p9.add(new Passenger("S4P02","Abhilash",18,"Student",em1));
		p9.add(new Passenger("S4P02","Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p10=new ArrayList<Passenger>();
		p10.add(new Passenger("S4P02","Abhilash",18,"Student",em1));
		p10.add(new Passenger("S4P02","Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p11=new ArrayList<Passenger>();
		p11.add(new Passenger("S4P02","Abhilash",18,"Student",em1));
		p11.add(new Passenger("S4P02","Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p12=new ArrayList<Passenger>();
		p12.add(new Passenger("S4P02","Abhilash",18,"Student",em1));
		p12.add(new Passenger("S4P02","Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p13=new ArrayList<Passenger>();
		p13.add(new Passenger("S4P02","Abhilash",18,"Student",em1));
		p13.add(new Passenger("S4P02","Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p14=new ArrayList<Passenger>();
		p14.add(new Passenger("S4P02","Abhilash",18,"Student",em1));
		p14.add(new Passenger("S4P02","Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p15=new ArrayList<Passenger>();
		p15.add(new Passenger("S4P02","Abhilash",18,"Student",em1));
		p15.add(new Passenger("S4P02","Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p16=new ArrayList<Passenger>();
		p16.add(new Passenger("S4P02","Abhilash",18,"Student",em1));
		p16.add(new Passenger("S4P02","Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p17=new ArrayList<Passenger>();
		p17.add(new Passenger("S4P02","Abhilash",18,"Student",em1));
		p17.add(new Passenger("S4P02","Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p18=new ArrayList<Passenger>();
		p18.add(new Passenger("S4P02","Abhilash",18,"Student",em1));
		p18.add(new Passenger("S4P02","Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p19=new ArrayList<Passenger>();
		p19.add(new Passenger("S4P02","Abhilash",18,"Student",em1));
		p19.add(new Passenger("S4P02","Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p20=new ArrayList<Passenger>();
		p20.add(new Passenger("S4P02","Abhilash",18,"Student",em1));
		p20.add(new Passenger("S4P02","Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p21=new ArrayList<Passenger>();
		p21.add(new Passenger("S4P02","Abhilash",18,"Student",em1));
		p21.add(new Passenger("S4P02","Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p22=new ArrayList<Passenger>();
		p22.add(new Passenger("S4P02","Abhilash",18,"Student",em1));
		p22.add(new Passenger("S4P02","Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p23=new ArrayList<Passenger>();
		p23.add(new Passenger("S4P02","Abhilash",18,"Student",em1));
		p23.add(new Passenger("S4P02","Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p24=new ArrayList<Passenger>();
		p24.add(new Passenger("S4P02","Abhilash",18,"Student",em1));
		p24.add(new Passenger("S4P02","Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p25=new ArrayList<Passenger>();
		p25.add(new Passenger("S4P02","Abhilash",18,"Student",em1));
		p25.add(new Passenger("S4P02","Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p26=new ArrayList<Passenger>();
		p26.add(new Passenger("S4P02","Abhilash",18,"Student",em1));
		p26.add(new Passenger("S4P02","Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p27=new ArrayList<Passenger>();
		p27.add(new Passenger("S4P02","Abhilash",18,"Student",em1));
		p27.add(new Passenger("S4P02","Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p28=new ArrayList<Passenger>();
		p28.add(new Passenger("S4P02","Abhilash",18,"Student",em1));
		p28.add(new Passenger("S4P02","Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p29=new ArrayList<Passenger>();
		p29.add(new Passenger("S4P02","Abhilash",18,"Student",em1));
		p29.add(new Passenger("S4P02","Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p30=new ArrayList<Passenger>();
		p30.add(new Passenger("S4P02","Abhilash",18,"Student",em1));
		p30.add(new Passenger("S4P02","Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p31=new ArrayList<Passenger>();
		p31.add(new Passenger("S4P02","Abhilash",18,"Student",em1));
		p31.add(new Passenger("S4P02","Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p32=new ArrayList<Passenger>();
		p32.add(new Passenger("S4P02","Abhilash",18,"Student",em1));
		p32.add(new Passenger("S4P02","Abhay",26,"Passenger Smart Card",ems1));
		
		stationList.get(0).passengers=p1;
		stationList.get(1).passengers=p2;
		stationList.get(2).passengers=p3;
		stationList.get(3).passengers=p4;
		stationList.get(4).passengers=p5;
		stationList.get(5).passengers=p6;
		stationList.get(6).passengers=p3;
		stationList.get(7).passengers=p3;
		stationList.get(8).passengers=p3;
		stationList.get(9).passengers=p3;
		stationList.get(10).passengers=p3;
		stationList.get(11).passengers=p3;
		stationList.get(12).passengers=p3;
		stationList.get(13).passengers=p3;
		stationList.get(14).passengers=p3;
		stationList.get(15).passengers=p3;
		stationList.get(16).passengers=p3;
		stationList.get(17).passengers=p3;
		stationList.get(18).passengers=p3;
		stationList.get(19).passengers=p3;
		stationList.get(20).passengers=p3;
		stationList.get(21).passengers=p3;
		stationList.get(22).passengers=p3;
		stationList.get(23).passengers=p3;
		stationList.get(24).passengers=p3;
		stationList.get(25).passengers=p3;
		stationList.get(26).passengers=p3;
		stationList.get(27).passengers=p3;
		stationList.get(28).passengers=p3;
		stationList.get(29).passengers=p3;
		stationList.get(30).passengers=p3;
		stationList.get(31).passengers=p3;
		
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setEditable(true);
		comboBox_5.setBounds(314, 62, 116, 23);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setEditable(true);
		comboBox_3.setBounds(321, 43, 116, 23);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEditable(true);
		comboBox_1.setBounds(316, 84, 81, 22);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setEditable(true);
		comboBox_2.setBounds(299, 75, 91, 21);
		
		System.out.println(sc);
		for(StationC itr:stationList)
		{
			System.out.println(itr.stationCode);
			if(sc.equals(itr.stationCode))
			{
				for(Passenger pitr:itr.passengers)
				{
					System.out.println(pitr.pasId);
					comboBox_1.addItem(pitr.pasId);
					comboBox_2.addItem(pitr.pasId);
					comboBox_3.addItem(pitr.pasId);
					comboBox_5.addItem(pitr.pasId);
				}
				
			}
		}
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 28, 608, 696);
		tabbedPane.setBackground(new Color(0, 204, 153));
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 102));
		tabbedPane.addTab("Add Passenger", null, panel, null);
		panel.setLayout(null);
		
		JLabel label = new JLabel("PasAge");
		label.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label.setBounds(153, 129, 75, 25);
		panel.add(label);
		
		JLabel label_1 = new JLabel("PasName");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_1.setBounds(153, 89, 75, 25);
		panel.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(321, 43, 116, 22);
		panel.add(textField);
		
		JLabel lblPasid = new JLabel("PasId");
		lblPasid.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPasid.setBounds(153, 42, 75, 22);
		panel.add(lblPasid);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(321, 91, 116, 22);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(321, 131, 116, 22);
		panel.add(textField_2);
		
		JLabel label_4 = new JLabel("PasType");
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_4.setBounds(153, 175, 75, 25);
		panel.add(label_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Student(T)", "Passenger(T)", "MonthlyPass(T)", "Student Smart Card(SC)", "Concessional Smart Card(SC)", "Passenger Smart Card(SC)"}));
		comboBox.setBounds(321, 177, 116, 23);
		panel.add(comboBox);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(116, 314, 373, 210);
		textArea.setLineWrap(true);
		
		JButton button = new JButton("Add");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String s1=textField.getText();
				String s2=textField_1.getText();
				String s3=textField_2.getText();
				int age=Integer.parseInt(s3);
				String ptype=comboBox.getSelectedItem().toString();
				
				
				try {
					int flag=0;
					for(StationC itr:stationList) {
						if(sc.equals(itr.stationCode))
						{
							for(Passenger pitr:itr.passengers)
							{
								if(s1.equals(pitr.pasId)) 
								{
									
									flag=1;
								}
							
							}
						}
						
					}
					if(flag==1) {
						throw new DuplicateItemException(1234,"Passenger Id already exists!");
					}
					else {
						for(StationC itr:stationList) {
							if(sc.equals(itr.stationCode))
							{
								itr.passengers.add(new Passenger(s1,s2,age,ptype,null));
							
							}
						}
						
						comboBox_1.addItem(s1);
						comboBox_2.addItem(s1);
						comboBox_3.addItem(s1);
						comboBox_5.addItem(s1);
					
						JOptionPane.showMessageDialog(null, "Passenger Added!");
						textArea.append(s1+" Passenger added!\n");
					}
				}
				catch(DuplicateItemException die){
					JOptionPane.showMessageDialog(null, "Duplicate Passenger Id!");
					die.showError();
					textArea.setLineWrap(true);
					
					textArea.append("Duplicate Element!\n");
				}
			}
		});
		button.setBounds(237, 224, 97, 25);
		panel.add(button);
		
		JButton button_1 = new JButton("Back");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				station s=new station(stationList,sc);
				s.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		button_1.setBounds(249, 591, 97, 25);
		panel.add(button_1);
		
		JLabel label_2 = new JLabel("Display");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_2.setBounds(266, 280, 80, 18);
		panel.add(label_2);
		
		
		panel.add(textArea);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 255, 153));
		tabbedPane.addTab("Remove Passenger", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblPasid_1 = new JLabel("PasId");
		lblPasid_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPasid_1.setBounds(211, 82, 64, 24);
		panel_1.add(lblPasid_1);
		
		
		panel_1.add(comboBox_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(86, 253, 443, 228);
		panel_1.add(textArea_1);
		
		JLabel label_5 = new JLabel("Display");
		label_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_5.setBounds(259, 219, 91, 21);
		panel_1.add(label_5);
		
		JButton button_2 = new JButton("Remove");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String pid=comboBox_1.getSelectedItem().toString();
				int pos=0;
				for(StationC itr:stationList) {
					if(sc.equals(itr.stationCode))
					{
						for(Passenger pitr:itr.passengers)
						{
							if(pid.equals(pitr.pasId)) 
							{
								itr.passengers.remove(pos);
								//stationList.remove(comboBox_17);
								textArea_1.setLineWrap(true);
								textArea_1.append(pid+" !Removed Passenger!\n");
								JOptionPane.showMessageDialog(null, pid+"!Removed Passenger!! From Station"+sc);
								
								comboBox_1.removeItem(pid);
								comboBox_2.removeItem(pid);
								comboBox_3.removeItem(pid);
								comboBox_5.removeItem(pid);
							}
							pos+=1;
						
						}
					}
			}
			}
		});
		button_2.setBounds(253, 134, 97, 25);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("Back");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				station s=new station(stationList);
				s.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		button_3.setBounds(259, 517, 97, 25);
		panel_1.add(button_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 204, 153));
		tabbedPane.addTab("Display Passenger", null, panel_2, null);
		panel_2.setLayout(null);
		
		
		panel_2.add(comboBox_2);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(39, 299, 509, 284);
		panel_2.add(textArea_2);
		
		JLabel lblPasid_2 = new JLabel("PasId");
		lblPasid_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPasid_2.setBounds(185, 74, 72, 21);
		panel_2.add(lblPasid_2);
		
		JButton button_4 = new JButton("Display");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String pid=comboBox_1.getSelectedItem().toString();
				
				for(StationC itr:stationList) {
					if(sc.equals(itr.stationCode))
					{
						for(Passenger pitr:itr.passengers)
						{
							if(pid.equals(pitr.pasId)) 
							{
								
								//stationList.remove(comboBox_17);
								String data=pitr.displayToString();
								textArea_2.setLineWrap(true);
								textArea_2.append(data);
								JOptionPane.showMessageDialog(null, pid+"!Display Passenger!!");
								
	
							}
						
						
						}
					}
			}
			}
		});
		button_4.setBounds(215, 135, 97, 25);
		panel_2.add(button_4);
		
		JLabel label_6 = new JLabel("Display");
		label_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_6.setBounds(251, 268, 80, 18);
		panel_2.add(label_6);
		
		JButton button_5 = new JButton("Display All");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String pid=comboBox_1.getSelectedItem().toString();
				
				for(StationC itr:stationList) {
					if(sc.equals(itr.stationCode))
					{
						for(Passenger pitr:itr.passengers)
						{
								//stationList.remove(comboBox_17);
								String data=pitr.displayToString();
								textArea_2.setLineWrap(true);
								textArea_2.append(data);
			
						}
						JOptionPane.showMessageDialog(null, pid+"!Display All Passengers in Station!!"+sc);
					}
			}

			}
		});
		button_5.setBounds(191, 173, 150, 33);
		panel_2.add(button_5);
		
		JButton button_6 = new JButton("Back");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				station s=new station(stationList);
				s.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		button_6.setBounds(234, 596, 97, 25);
		panel_2.add(button_6);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(204, 255, 102));
		tabbedPane.addTab("Update Passenger", null, panel_3, null);
		panel_3.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(new Color(255, 204, 255));
		panel_5.setBounds(0, 0, 603, 666);
		panel_3.add(panel_5);
		
		JLabel label_3 = new JLabel("PasAge");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_3.setBounds(153, 129, 75, 25);
		panel_5.add(label_3);
		
		JLabel label_7 = new JLabel("PasName");
		label_7.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_7.setBounds(153, 89, 75, 25);
		panel_5.add(label_7);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(321, 91, 116, 22);
		panel_5.add(textField_3);
		
		JLabel label_8 = new JLabel("PasId");
		label_8.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_8.setBounds(153, 42, 75, 22);
		panel_5.add(label_8);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(321, 131, 116, 22);
		panel_5.add(textField_5);
		
		JLabel label_9 = new JLabel("PasType");
		label_9.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_9.setBounds(153, 175, 75, 25);
		panel_5.add(label_9);
		
		
		panel_5.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Student(T)", "Passenger(T)", "MonthlyPass(T)", "Student Smart Card(SC)", "Concessional Smart Card(SC)", "Passenger Smart Card(SC)"}));
		comboBox_4.setBounds(321, 177, 116, 23);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(116, 314, 373, 210);
		
		JButton button_7 = new JButton("Update");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String pid=comboBox_3.getSelectedItem().toString();
				String s2=textField_3.getText();
				String s3=textField_5.getText();
				int age=Integer.parseInt(textField_5.getText());
				String ptype=comboBox_4.getSelectedItem().toString();
				
				
				for(StationC itr:stationList) {
					if(sc.equals(itr.stationCode))
					{
						for(Passenger pitr:itr.passengers)
						{
							if(pid.equals(pitr.pasId)) 
							{
								pitr.pasName=s2;
								pitr.pasAge=age;
								pitr.pasType=ptype;
								
								textArea_3.setLineWrap(true);
								textArea_3.append(pid+" !Updated Passenger!\n");
								JOptionPane.showMessageDialog(null, pid+"!Updated Passenger!! From Station"+sc);
								
								
							}
							
						
						}
					}
			}
				
			}
		});
		button_7.setBounds(237, 224, 97, 25);
		panel_5.add(button_7);
		
		JButton button_8 = new JButton("Back");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				station s=new station(stationList);
				s.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		button_8.setBounds(249, 591, 97, 25);
		panel_5.add(button_8);
		
		JLabel label_10 = new JLabel("Display");
		label_10.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_10.setBounds(266, 280, 80, 18);
		panel_5.add(label_10);
		
		
		panel_5.add(textArea_3);
		
		
		panel_5.add(comboBox_4);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 204, 102));
		tabbedPane.addTab("Entrance Mode", null, panel_4, null);
		panel_4.setLayout(null);
		
		JButton btnNewButton = new JButton("Entrance Mode");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pid=comboBox_5.getSelectedItem().toString();
				for(StationC itr:stationList) {
					if(sc.equals(itr.stationCode))
					{
						for(Passenger pitr:itr.passengers)
						{
							if(pid.equals(pitr.pasId)) 
							{
								
								entrancemodej pas=new entrancemodej(itr.passengers,pid,stationList,sc);
								pas.setVisible(true);
								setVisible(false);
								dispose();
								
								
							}
							
						
						}
					}
				}
				
				
			}
		});
		btnNewButton.setBounds(232, 151, 155, 25);
		panel_4.add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				station s=new station(stationList);
				s.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnBack.setBounds(244, 234, 125, 25);
		panel_4.add(btnBack);
		
		
		panel_4.add(comboBox_5);
		
		JLabel label_11 = new JLabel("PasId");
		label_11.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_11.setBounds(190, 65, 75, 22);
		panel_4.add(label_11);
	}
}
