package cppackage;

import java.awt.BorderLayout;

import java.awt.*;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

class DuplicateItemException extends Exception{
	
	private static final long serialVersionUID = 1L;
	int errNo;
	String errorMessage;
	
	DuplicateItemException(){
		
	}
	DuplicateItemException(int errNo,String errorMessage){
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
/*
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
		System.out.println("\nTicket Entrance Mode............");
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
		System.out.println("\nSmart Card Entrance Mode........");
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

class Passenger {
	String pasName;
	int pasAge;
	String pasType;
	EntranceMode eMode; // Passenger owns Entrance Mode

	Passenger() {
		pasName = "";
		pasAge = 0;
		pasType = "";
		eMode=null;

	}

	Passenger(String pn, int pa, String pt, EntranceMode em) {
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
		String s="Passenger Name:" + pasName + " Passenger Age:" + pasAge + " Passenger Type:" + pasType;
		return s+'\n';
	}
}
*/
class PasInfSys {
	String infoId;
	String arrivalFrom;
	String destinationTo;
	int arrivingIn;
	String busName;

	PasInfSys() {
		infoId="";
		arrivalFrom = "";
		destinationTo = "";
		arrivingIn = 0;
		busName = "";
	}

	PasInfSys(String iid,String af, String dt, int ain, String bn) {
		
		infoId=iid;
		arrivalFrom = af;
		destinationTo = dt;
		arrivingIn = ain;
		busName = bn;
	}

	void displayPasInfSys() {
		System.out.println("\nDisplay Passenger Information System..........");
		System.out.println(" InfoId:"+infoId+" Arriving From:" + arrivalFrom + " Destination To:" + destinationTo + " Arriving In:"
				+ arrivingIn + " min" + " Bus Name:" + busName);
	}
	
	String displayPasString() {
		return " InfoId:"+infoId+" Arriving From:" + arrivalFrom + " Destination To:" + destinationTo + " Arriving In:"
				+ arrivingIn + " min" + " Bus Name:" + busName+"\n";
	}
}

class StationC {
	String stationCode;
	String stationName;
	HashSet<String> counterOperators;
	ArrayList<Passenger> passengers=new ArrayList<Passenger>(); // Station has passengers
	ArrayList<PasInfSys> pasInfSys; // Station has passenger information system

	StationC() {
		stationCode = "";
		stationName = "";

	}

	StationC(String sc, String sn,HashSet<String> co,ArrayList<PasInfSys> pis) {
		this.stationCode = sc;
		this.stationName = sn;
	    this.counterOperators=co;
	    this.pasInfSys=pis;

	}
	
	String displayStation() {
		String s="Station Code:" + stationCode + " Station Name:" + stationName;
		for (String itr : counterOperators) {
			//System.out.println("Counter Operator:" + itr);
			s=s.concat(" Counter Operator: "+itr);
		}
		return s+'\n';
	}
	
	String displayStationWithPas() {
		String s=displayStation();
		/*
		s=s.concat(" Passengers in Station :\n");
		for (Passenger itr : passengers) {
			//System.out.println("Counter Operator:" + itr);
			s=s.concat(itr.displayToString());
		}*/
		
		return s+'\n';
	}
	
	String displayStationWithPasInfSys() {
		String s=displayStation();
		s=s.concat(" PassengerInfSystem in Station :\n");
		for (PasInfSys itr : pasInfSys) {
			//System.out.println("Counter Operator:" + itr);
			s=s.concat(itr.displayPasString());
		}
		
		return s+'\n';
	}
	
	String displayStationAll() {
		String s=displayStation();
		s=s.concat(" Passengers in Station :\n");
		/*
		for (Passenger itr : passengers) {
			//System.out.println("Counter Operator:" + itr);
			s=s.concat(itr.displayToString());
		}*/
		s=s.concat(" PassengerInfSystem in Station :\n");
		for (PasInfSys itr : pasInfSys) {
			//System.out.println("Counter Operator:" + itr);
			s=s.concat(itr.displayPasString());
		}
		
		return s+'\n';
	}

	void display() {
		System.out.println("\nDisplay Station..............");
		System.out.println("Station Code:" + stationCode + "\tStation Name:" + stationName);
		for (String itr : counterOperators) {
			System.out.println("Counter Operator:" + itr);
		}
		// passengers.displayPassenger();
		/*
		for (Passenger itr2 : passengers) {
			//System.out.println("Counter Operator:" + itr);
			//s=s.concat(itr.displayToString());
			itr2.displayPassenger();
		}*/
		for (PasInfSys itr : pasInfSys) {
			//System.out.println("Counter Operator:" + itr);
			itr.displayPasInfSys();
		}

	}

	void displaySt() {
		System.out.println("\nDisplay Station..............");
		System.out.println("Station Code:" + stationCode + "\tStation Name:" + stationName);
		for (String itr : counterOperators) {
			System.out.println("Counter Operator:" + itr);
		}
		/*
		for (Passenger pasTemp : passengers) {
			// System.out.println(pasTemp);
			pasTemp.displayPassenger();
		}*/
		for (PasInfSys pasInfTemp : pasInfSys) {
			// System.out.println(pasTemp);
			pasInfTemp.displayPasInfSys();
		}

	}
	
	public String toString() {
		return displayStation();
	}
}

public class station extends JFrame {

	private JPanel contentPane;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;

	/**
	 * Launch the application.
	 */
	
	/*
	public static void main(String[] args) throws DuplicateItemException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					station frame = new station();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 * @param user 
	 */
	public station(ArrayList<StationC> stationList, String user) {

		//ArrayList<StationC> stationList = new ArrayList<>();
		// int s=32;
		
		
		String sc=new String();

		

		HashSet<String> co1 = new HashSet<>();
		co1.add("Anil");
		co1.add("Naveen");
		
		HashSet<String> co2=new HashSet<String>(); 
		co2.add("Vikas");
		co2.add("Anita");
		
		HashSet<String> co3=new HashSet<String>(); 
		co3.add("Sukanya");
		co3.add("Shriram");
		
		HashSet<String> co4=new HashSet<String>(); 
		co4.add("Sudha");
		co4.add("Spoorthi");
		 
		HashSet<String> co5=new HashSet<String>(); 
		co5.add("Anil");
		co5.add("Naveen");
		 
		HashSet<String> co6=new HashSet<String>(); 
		co6.add("Vikas");
		co6.add("Anita");
		 
		HashSet<String> co7=new HashSet<String>(); 
		co7.add("Anil");
		co7.add("Naveen");
		 
		HashSet<String> co8=new HashSet<String>(); 
		co8.add("Vikas");
		co8.add("Anita");
		
		HashSet<String> co9=new HashSet<String>(); 
		co9.add("Anil");
		co9.add("Naveen");
		
		HashSet<String> co10=new HashSet<String>(); 
		co10.add("Vikas");
		co10.add("Anita");
		
		HashSet<String> co11=new HashSet<String>(); 
		co11.add("Anil");
		co11.add("Naveen");
		
		HashSet<String> co12=new HashSet<String>(); 
		co12.add("Vikas");
		co12.add("Anita");
		 
		HashSet<String> co13=new HashSet<String>(); 
		co13.add("Anil");
		co13.add("Naveen");
		
		HashSet<String> co14=new HashSet<String>(); 
		co14.add("Vikas");
		co14.add("Anita");
		 
		HashSet<String> co15=new HashSet<String>(); 
		co15.add("Anil");
		co15.add("Naveen");
		 
		HashSet<String> co16=new HashSet<String>(); co16.add("Vikas");
		co16.add("Anita");
		
		HashSet<String> co17=new HashSet<String>(); co17.add("Anil");
		co17.add("Naveen");
		 
		HashSet<String> co18=new HashSet<String>(); co18.add("Vikas");
		co18.add("Anita");
		 
		HashSet<String> co19=new HashSet<String>(); co19.add("Anil");
		co19.add("Naveen");
		
		HashSet<String> co20=new HashSet<String>(); co20.add("Vikas");
		co20.add("Anita");
		
		HashSet<String> co21=new HashSet<String>(); co21.add("Anil");
		co21.add("Naveen");
		
		HashSet<String> co22=new HashSet<String>(); co22.add("Vikas");
		co22.add("Anita");
		
		HashSet<String> co23=new HashSet<String>(); co23.add("Anil");
		co23.add("Naveen");
		
		HashSet<String> co24=new HashSet<String>(); co24.add("Vikas");
		co24.add("Anita");
		
		HashSet<String> co25=new HashSet<String>(); co25.add("Anil");
		co25.add("Naveen");
		
		HashSet<String> co26=new HashSet<String>(); co26.add("Vikas");
		co26.add("Anita");
		 
		HashSet<String> co27=new HashSet<String>(); co27.add("Anil");
		co27.add("Naveen");
		
		HashSet<String> co28=new HashSet<String>(); co28.add("Vikas");
		co28.add("Anita");
		
		HashSet<String> co29=new HashSet<String>(); co29.add("Anil");
		co29.add("Naveen");
		
		HashSet<String> co30=new HashSet<String>(); co30.add("Vikas");
		co30.add("Anita");
		
		HashSet<String> co31=new HashSet<String>(); co31.add("Anil");
		co31.add("Naveen");
		
		HashSet<String> co32=new HashSet<String>(); co32.add("Vikas");
		co32.add("Anita");
		 
		
		
/*
		
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
		p1.add(new Passenger("Abhilash",18,"Student",em1));
		p1.add(new Passenger("Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p2=new ArrayList<Passenger>();
		p2.add(new Passenger("Suhas",20,"Student",em2));
		p2.add(new Passenger("Vinay",26,"Student Smart Card",ems2));
		
		ArrayList<Passenger> p3=new ArrayList<Passenger>();
		p3.add(new Passenger("Vineeth",18,"Student",em3));
		p3.add(new Passenger("Kumar",26,"Concessional Smart Card",ems3));
		
		ArrayList<Passenger> p4=new ArrayList<Passenger>();
		p4.add(new Passenger("Abhilash",18,"Student",em1));
		p4.add(new Passenger("Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p5=new ArrayList<Passenger>();
		p5.add(new Passenger("Abhilash",18,"Student",em1));
		p5.add(new Passenger("Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p6=new ArrayList<Passenger>();
		p6.add(new Passenger("Abhilash",18,"Student",em1));
		p6.add(new Passenger("Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p7=new ArrayList<Passenger>();
		p7.add(new Passenger("Abhilash",18,"Student",em1));
		p7.add(new Passenger("Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p8=new ArrayList<Passenger>();
		p8.add(new Passenger("Abhilash",18,"Student",em1));
		p8.add(new Passenger("Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p9=new ArrayList<Passenger>();
		p9.add(new Passenger("Abhilash",18,"Student",em1));
		p9.add(new Passenger("Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p10=new ArrayList<Passenger>();
		p10.add(new Passenger("Abhilash",18,"Student",em1));
		p10.add(new Passenger("Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p11=new ArrayList<Passenger>();
		p11.add(new Passenger("Abhilash",18,"Student",em1));
		p11.add(new Passenger("Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p12=new ArrayList<Passenger>();
		p12.add(new Passenger("Abhilash",18,"Student",em1));
		p12.add(new Passenger("Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p13=new ArrayList<Passenger>();
		p13.add(new Passenger("Abhilash",18,"Student",em1));
		p13.add(new Passenger("Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p14=new ArrayList<Passenger>();
		p14.add(new Passenger("Abhilash",18,"Student",em1));
		p14.add(new Passenger("Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p15=new ArrayList<Passenger>();
		p15.add(new Passenger("Abhilash",18,"Student",em1));
		p15.add(new Passenger("Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p16=new ArrayList<Passenger>();
		p16.add(new Passenger("Abhilash",18,"Student",em1));
		p16.add(new Passenger("Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p17=new ArrayList<Passenger>();
		p17.add(new Passenger("Abhilash",18,"Student",em1));
		p17.add(new Passenger("Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p18=new ArrayList<Passenger>();
		p18.add(new Passenger("Abhilash",18,"Student",em1));
		p18.add(new Passenger("Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p19=new ArrayList<Passenger>();
		p19.add(new Passenger("Abhilash",18,"Student",em1));
		p19.add(new Passenger("Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p20=new ArrayList<Passenger>();
		p20.add(new Passenger("Abhilash",18,"Student",em1));
		p20.add(new Passenger("Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p21=new ArrayList<Passenger>();
		p21.add(new Passenger("Abhilash",18,"Student",em1));
		p21.add(new Passenger("Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p22=new ArrayList<Passenger>();
		p22.add(new Passenger("Abhilash",18,"Student",em1));
		p22.add(new Passenger("Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p23=new ArrayList<Passenger>();
		p23.add(new Passenger("Abhilash",18,"Student",em1));
		p23.add(new Passenger("Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p24=new ArrayList<Passenger>();
		p24.add(new Passenger("Abhilash",18,"Student",em1));
		p24.add(new Passenger("Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p25=new ArrayList<Passenger>();
		p25.add(new Passenger("Abhilash",18,"Student",em1));
		p25.add(new Passenger("Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p26=new ArrayList<Passenger>();
		p26.add(new Passenger("Abhilash",18,"Student",em1));
		p26.add(new Passenger("Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p27=new ArrayList<Passenger>();
		p27.add(new Passenger("Abhilash",18,"Student",em1));
		p27.add(new Passenger("Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p28=new ArrayList<Passenger>();
		p28.add(new Passenger("Abhilash",18,"Student",em1));
		p28.add(new Passenger("Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p29=new ArrayList<Passenger>();
		p29.add(new Passenger("Abhilash",18,"Student",em1));
		p29.add(new Passenger("Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p30=new ArrayList<Passenger>();
		p30.add(new Passenger("Abhilash",18,"Student",em1));
		p30.add(new Passenger("Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p31=new ArrayList<Passenger>();
		p31.add(new Passenger("Abhilash",18,"Student",em1));
		p31.add(new Passenger("Abhay",26,"Passenger Smart Card",ems1));
		
		ArrayList<Passenger> p32=new ArrayList<Passenger>();
		p32.add(new Passenger("Abhilash",18,"Student",em1));
		p32.add(new Passenger("Abhay",26,"Passenger Smart Card",ems1));
		
	*/	
		
		//Passenger Info System
		ArrayList<PasInfSys> pis1=new ArrayList<PasInfSys>();
		pis1.add(new PasInfSys("PIS1","Depot","OSBC",10,"201D"));
		pis1.add(new PasInfSys("PIS2","jubilee-circle","Railway station-hubli",20,"201B"));
		
		ArrayList<PasInfSys> pis2=new ArrayList<PasInfSys>();
		pis2.add(new PasInfSys("PIS1","Depot","CBT-HUBLI",8,"200A"));
		pis2.add(new PasInfSys("PIS2","Depot","Dr.B.R Ambedkar circle",12,"200C"));
		
		stationList.add(new StationC("ST01","Dharwad New Bus Stop",co1,pis1));
		stationList.add(new StationC("ST02","Dharwad BRTS bus Terminal",co2,pis1));
		stationList.add(new StationC("ST03","Jubilee Circle",co3,pis1));
		stationList.add(new StationC("ST04","Court circle",co4,pis1)); 
		stationList.add(new StationC("ST05","NTTF",co5,pis1)); 
		stationList.add(new StationC("ST06","Hosa Yellapur Cross",co6,pis1)); 
		stationList.add(new StationC("ST07","Toll Naka",co7,pis1)); 
		stationList.add(new StationC("ST08","JSS",co8,pis1)); 
		stationList.add(new StationC("ST09","Vidyagiri",co9,pis1)); 
		stationList.add(new StationC("ST10","Gandhi Nagar",co10,pis1)); 
		stationList.add(new StationC("ST11","Lakamanahalli",co11,pis1)); 
		stationList.add(new StationC("ST12","Sattur",co12,pis1)); 
		stationList.add(new StationC("ST13","SDM",co13,pis1)); 
		stationList.add(new StationC("ST14","Navalur Station",co14,pis1)); 
		stationList.add(new StationC("ST15","Rayapur",co15,pis1)); 
		stationList.add(new StationC("ST16","Iskcon",co16,pis1)); 
		stationList.add(new StationC("ST17","RTO",co17,pis1)); 
		stationList.add(new StationC("ST18","Navanagar",co18,pis1)); 
		stationList.add(new StationC("ST19","APMC",co19,pis1)); 
		stationList.add(new StationC("ST20","Shantiniketan",co20,pis1)); 
		stationList.add(new StationC("ST21","Bhairidevarkoppa",co21,pis1)); 
		stationList.add(new StationC("ST22","Unkal Lake",co22,pis1)); 
		stationList.add(new StationC("ST23","Unkal village",co23,pis1)); 
		stationList.add(new StationC("ST24","Unkal cross",co24,pis1)); 
		stationList.add(new StationC("ST25","BVB",co25,pis1)); 
		stationList.add(new StationC("ST26","Vidya Nagar",co26,pis1)); 
		stationList.add(new StationC("ST27","KIMS",co27,pis1)); 
		stationList.add(new StationC("ST28","Hosur Cross",co28,pis1)); 
		stationList.add(new StationC("ST29","Dr.B.R.Ambedkar Circle",co29,pis1)); 
		stationList.add(new StationC("ST30","OCBS",co30,pis1)); 
		stationList.add(new StationC("ST31","Hubli CBT",co31,pis1)); 
		stationList.add(new StationC("ST32","Railway Station-Hubli",co32,pis1));
		
		JComboBox comboBox_17 = new JComboBox();
		comboBox_17.setEditable(true);
		comboBox_17.setBounds(304, 66, 85, 22);
		
		JComboBox comboBox_18 = new JComboBox();
		comboBox_18.setEditable(true);
		comboBox_18.setBounds(262, 44, 114, 23);
		
		JComboBox comboBox_19 = new JComboBox();
		comboBox_19.setEditable(true);
		comboBox_19.setBounds(308, 14, 100, 25);
		
		JComboBox comboBox_20 = new JComboBox();
		comboBox_20.setEditable(true);
		comboBox_20.setBounds(255, 65, 93, 26);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(280, 80, 106, 24);
		
		for(StationC itr:stationList) {
			//comboBox.addItem(itr.stationCode);
			//comboBox_6.addItem(itr.stationCode);
			//comboBox_8.addItem(itr.stationCode);
			
			comboBox_1.addItem(itr.stationCode);
			comboBox_17.addItem(itr.stationCode);
			comboBox_18.addItem(itr.stationCode);
			comboBox_19.addItem(itr.stationCode);
			comboBox_20.addItem(itr.stationCode);
			
			
		}

		/*
		 * String
		 * co1[]={"Anil","Naveen"},co2[]={"Vikas","Anita"},co3[]={"Sukanya","Shriram"},
		 * co4[]={"Sudha","Spoorthi"},co5[]={"Sunil","Nitesh"},
		 * co6[]={"Aditya","Bharat"},co7[]={"Keertan","Shashi"},co8[]={"Sumant",
		 * "Siddesh"},co9[]={"Swati","Shrinivas"},co10[]={"Shankar","Rajesh"},
		 * co11[]={"Param","Rohan"},co12[]={"Ninad","Sanjay"},co13[]={"Sunil","Chandan"}
		 * ,co14[]={"Raj","Jaya"},co15[]={"Preetam","Vipul"},
		 * co16[]={"Suraksha","Vidya"},co17[]={"Sandesh","Abhi"},co18[]={"Ananya","Amit"
		 * },co19[]={"Naveen","Abhishek"},co20[]={"Sukumar","Nitya"},
		 * co21[]={"Keerti","Vinay"},co22[]={"Suhas","Nagaraj"},co23[]={"Savita",
		 * "Mahesh"},co24[]={"Jaya","Krishna"},co25[]={"Praveen","Kiran"},
		 * co26[]={"Hitesh","Vandana"},co27[]={"Prakalp","Pooja"},co28[]={"Raksha",
		 * "Raju"},co29[]={"Bhuvan","Harish"},co30[]={"Pavan","Sumant"},
		 * co31[]={"Pradeep","Kushal"},co32[]={"Ramesh","Siresh"};
		 */
		setTitle("Station");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setPreferredSize(new Dimension(600, 600));
		// pack();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(25, 13, 550, 558);
		contentPane.add(tabbedPane);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(173, 255, 47));
		tabbedPane.addTab("Passenger", null, panel, null);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Station");
		label.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label.setBounds(123, 58, 75, 23);
		panel.add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ST01", "ST02", "ST03", "ST04", "ST05", "ST06", "ST07", "ST08", "ST09", "ST10", "ST11", "ST12", "ST13", "ST14", "ST15", "ST16", "ST17", "ST18", "ST19", "ST20", "ST21", "ST22", "ST23", "ST24", "ST25", "ST26", "ST27", "ST28", "ST29", "ST30", "ST31", "ST32"}));
		comboBox.setBounds(268, 58, 106, 24);
		panel.add(comboBox);
		
		JButton button = new JButton("Passenger");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(user=="Admin")
				{
					JOptionPane.showMessageDialog(null, "You are an authorized user!");
					String scode=comboBox.getSelectedItem().toString();
					passengerj pas=new passengerj(stationList,scode);
					pas.setVisible(true);
					setVisible(false);
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "You are not authorized!");
				}
				
			}
		});
		button.setBounds(199, 126, 97, 25);
		panel.add(button);
		
		JButton button_1 = new JButton("Back");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				secondpage sp = new secondpage(user);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		button_1.setBounds(199, 232, 97, 25);
		panel.add(button_1);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(46, 139, 87));
		tabbedPane.addTab("PasInfSys", null, panel_1, null);
		panel_1.setLayout(null);
		
		
		
		JButton btnNewButton = new JButton("Pas Inf Sys");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(user=="Admin")
				{
					JOptionPane.showMessageDialog(null, "You are an authorized user!");
					String scode=comboBox_1.getSelectedItem().toString();
					pasinfosysj pas=new pasinfosysj(stationList,scode);
					pas.setVisible(true);
					setVisible(false);
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "You are not authorized!");
				}
			}
		});
		btnNewButton.setBounds(164, 155, 179, 60);
		panel_1.add(btnNewButton);
		
		JLabel label_1 = new JLabel("Station");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_1.setBounds(135, 80, 75, 23);
		panel_1.add(label_1);
		
		
		panel_1.add(comboBox_1);
		
		JButton button_2 = new JButton("Back");
		button_2.setBounds(211, 254, 97, 25);
		panel_1.add(button_2);

		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 165, 0));
		tabbedPane.addTab("Add Station", null, panel_8, null);
		panel_8.setLayout(null);

		JLabel lblNewLabel_37 = new JLabel("StationCode");
		lblNewLabel_37.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_37.setBounds(93, 46, 93, 26);
		panel_8.add(lblNewLabel_37);

		textField_17 = new JTextField();
		textField_17.setBounds(216, 49, 116, 22);
		panel_8.add(textField_17);
		textField_17.setColumns(10);

		JLabel lblNewLabel_38 = new JLabel("StationName");
		lblNewLabel_38.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_38.setBounds(93, 108, 93, 22);
		panel_8.add(lblNewLabel_38);

		textField_18 = new JTextField();
		textField_18.setBounds(216, 109, 116, 22);
		panel_8.add(textField_18);
		textField_18.setColumns(10);

		JLabel lblNewLabel_39 = new JLabel("Counter Operator 1");
		lblNewLabel_39.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_39.setBounds(25, 161, 161, 26);
		panel_8.add(lblNewLabel_39);

		JLabel lblNewLabel_40 = new JLabel("Counter Operator 2");
		lblNewLabel_40.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_40.setBounds(25, 218, 132, 26);
		panel_8.add(lblNewLabel_40);

		textField_19 = new JTextField();
		textField_19.setBounds(216, 164, 116, 22);
		panel_8.add(textField_19);
		textField_19.setColumns(10);

		textField_20 = new JTextField();
		textField_20.setBounds(216, 221, 116, 22);
		panel_8.add(textField_20);
		textField_20.setColumns(10);

		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(218, 292, 271, 60);
		
		JButton btnNewButton_17 = new JButton("Add Station");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1=textField_17.getText();
				String s2=textField_18.getText();
				String s3=textField_19.getText();
				String s4=textField_20.getText();
				
				ArrayList<String> cop=new ArrayList<>();
				
				cop.add(s3);
				cop.add(s4);
				
				if(user=="Admin")
				{
					JOptionPane.showMessageDialog(null, "You are an authorized user!");
				
				try {
					int flag=0;
					for(StationC itr:stationList) {
						if(s1.equals(itr.stationCode) || s2.equals(itr.stationName)) {
							flag=1;
						}
					}
					if(flag==1) {
						throw new DuplicateItemException(1234,"Station code / Name already exists!");
					}
					else {
						stationList.add(new StationC(s1,s2,cop,null));
						comboBox.addItem(s1);
						//comboBox_6.addItem(s1);
						//comboBox_8.addItem(s1);
						comboBox_1.addItem(s1);
						comboBox_17.addItem(s1);
						comboBox_18.addItem(s1);
						comboBox_19.addItem(s1);
						comboBox_20.addItem(s1);
						/*
						for(PasInfSys pisitr:itr.pasInfSys) {
							comboBox_15.addItem(pisitr.infoId);
							comboBox_22.addItem(pisitr.infoId);
						}*/
						JOptionPane.showMessageDialog(null, "Station Added!");
						textArea_2.append(s1+" Station added!\n");
					}
				}
				catch(DuplicateItemException die){
					JOptionPane.showMessageDialog(null, "Duplicate Station Code/Name!");
					die.showError();
					textArea_2.setLineWrap(true);
					
					textArea_2.append("Duplicate Element!\n");
				}
				
			}
			else {
				JOptionPane.showMessageDialog(null, "You are not authorized!");
			}
				
				
				
			}
		});
		btnNewButton_17.setBounds(126, 373, 161, 26);
		panel_8.add(btnNewButton_17);


		panel_8.add(textArea_2);

		JLabel lblNewLabel_41 = new JLabel("      Display");
		lblNewLabel_41.setBounds(216, 272, 106, 17);
		panel_8.add(lblNewLabel_41);

		JButton btnNewButton_18 = new JButton("Back");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				secondpage sp = new secondpage(user);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_18.setBounds(162, 426, 97, 25);
		panel_8.add(btnNewButton_18);

		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 255, 0));
		tabbedPane.addTab("Remove Station", null, panel_9, null);
		panel_9.setLayout(null);

		JLabel lblNewLabel_42 = new JLabel("StationCode");
		lblNewLabel_42.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_42.setBounds(146, 65, 85, 22);
		panel_9.add(lblNewLabel_42);

		
		panel_9.add(comboBox_17);

		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBounds(146, 306, 255, 68);
		textArea_4.setLineWrap(true);
		
		JButton btnNewButton_19 = new JButton("Remove");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String scode=comboBox_17.getSelectedItem().toString();
				
				if(user=="Admin")
				{
					JOptionPane.showMessageDialog(null, "You are an authorized user!");
					for(StationC itr:stationList) {
					if(scode.equals(itr.stationCode))
					{
						stationList.remove(comboBox_17);
						textArea_4.append(scode+" !Removed Station!\n");
						JOptionPane.showMessageDialog(null, scode+"!Removed Station!!");
						comboBox.removeItem(scode);
						//comboBox_6.removeItem(scode);
						//comboBox_8.removeItem(scode);
						comboBox_1.removeItem(scode);
						comboBox_17.removeItem(scode);
						comboBox_18.removeItem(scode);
						comboBox_19.removeItem(scode);
						comboBox_20.removeItem(scode);
					}
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "You are not authorized!");
			}
				
			}
		});
		btnNewButton_19.setBounds(216, 131, 97, 25);
		panel_9.add(btnNewButton_19);

		JButton btnNewButton_20 = new JButton("Back");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				secondpage sp = new secondpage(user);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_20.setBounds(216, 196, 97, 25);
		panel_9.add(btnNewButton_20);
		
		JLabel lblNewLabel_50 = new JLabel("    Display");
		lblNewLabel_50.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_50.setBounds(228, 259, 85, 22);
		panel_9.add(lblNewLabel_50);
		
		
		panel_9.add(textArea_4);

		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(60, 179, 113));
		tabbedPane.addTab("Update Station", null, panel_10, null);
		panel_10.setLayout(null);

		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.setBounds(12, 13, 521, 502);
		panel_10.add(tabbedPane_3);

		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(204, 255, 51));
		tabbedPane_3.addTab("Change Counter Operator", null, panel_13, null);
		panel_13.setLayout(null);

		JLabel lblNewLabel_43 = new JLabel("StationCode");
		lblNewLabel_43.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_43.setBounds(113, 43, 85, 23);
		panel_13.add(lblNewLabel_43);

		
		panel_13.add(comboBox_18);

		JLabel lblNewLabel_44 = new JLabel("Counter Operator 1");
		lblNewLabel_44.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_44.setBounds(76, 113, 145, 23);
		panel_13.add(lblNewLabel_44);

		JLabel lblNewLabel_45 = new JLabel("Counter Operator 2");
		lblNewLabel_45.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_45.setBounds(76, 167, 145, 23);
		panel_13.add(lblNewLabel_45);

		textField_21 = new JTextField();
		textField_21.setBounds(260, 114, 116, 22);
		panel_13.add(textField_21);
		textField_21.setColumns(10);

		textField_22 = new JTextField();
		textField_22.setBounds(262, 168, 116, 22);
		panel_13.add(textField_22);
		textField_22.setColumns(10);

		JTextArea textArea_5 = new JTextArea();
		textArea_5.setBounds(167, 339, 276, 106);
		textArea_5.setLineWrap(true);
		
		JButton btnNewButton_15 = new JButton("Change Update");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String scode=comboBox_18.getSelectedItem().toString();
				
				String s22=textField_21.getText();
				String s23=textField_22.getText();
				
				if(user=="Admin")
				{
					JOptionPane.showMessageDialog(null, "You are an authorized user!");
					for(StationC itr:stationList) {
					if(scode.equals(itr.stationCode))
					{
						if(s22.equals(s23)) {
							JOptionPane.showMessageDialog(null, "!Can't add Counter Operators in Station as name are same!!");
						}
						else {
							itr.counterOperators.add(s22);
							itr.counterOperators.add(s23);
							textArea_5.append(scode+" !Changed Counter Operator in Station!\n");
							JOptionPane.showMessageDialog(null, scode+"!Changed Counter Operator in Station!!");
						}
						
						
					}
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "You are not authorized!");
			}
				
				
			}
		});
		btnNewButton_15.setBounds(178, 216, 145, 25);
		panel_13.add(btnNewButton_15);

		JButton btnNewButton_16 = new JButton("Back");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				secondpage sc = new secondpage(user);
				sc.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_16.setBounds(203, 276, 97, 25);
		panel_13.add(btnNewButton_16);
		
		JLabel lblNewLabel_51 = new JLabel("Display");
		lblNewLabel_51.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_51.setBounds(99, 338, 79, 23);
		panel_13.add(lblNewLabel_51);
		
		
		panel_13.add(textArea_5);

		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(204, 153, 204));
		tabbedPane_3.addTab("Add Operator", null, panel_14, null);
		panel_14.setLayout(null);

		JLabel lblNewLabel_46 = new JLabel("StationCode");
		lblNewLabel_46.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_46.setBounds(112, 60, 110, 31);
		panel_14.add(lblNewLabel_46);

		
		panel_14.add(comboBox_20);

		JLabel lblNewLabel_49 = new JLabel("New Operator");
		lblNewLabel_49.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_49.setBounds(97, 140, 116, 25);
		panel_14.add(lblNewLabel_49);

		textField_23 = new JTextField();
		textField_23.setBounds(237, 142, 175, 23);
		panel_14.add(textField_23);
		textField_23.setColumns(10);

		JTextArea textArea_6 = new JTextArea();
		textArea_6.setBounds(132, 353, 251, 75);
		textArea_6.setLineWrap(true);
		
		JButton btnNewButton_21 = new JButton("Add Operator");
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String scode=comboBox_20.getSelectedItem().toString();
				
				String s24=textField_23.getText();
				int flag=0;
				
				if(user=="Admin")
				{
					JOptionPane.showMessageDialog(null, "You are an authorized user!");
					for(StationC itr:stationList) {
					if(scode.equals(itr.stationCode))
					{
						for(String citr:itr.counterOperators)
						{
							if(s24.equals(citr))
							{
								JOptionPane.showMessageDialog(null, "!Can't add Counter Operator in Station as name already exists!!");
								flag=1;
							}
						}
						if(flag==0)
						{
							itr.counterOperators.add(s24);
							textArea_6.append(scode+" !Added Counter Operator in Station!\n");
							JOptionPane.showMessageDialog(null, scode+"!Added Counter Operator in Station!!");
						}
						
					}
				}
				
			}
			else {
				JOptionPane.showMessageDialog(null, "You are not authorized!");
			}
			}
		});
		btnNewButton_21.setBounds(177, 209, 125, 26);
		panel_14.add(btnNewButton_21);

		JButton btnNewButton_22 = new JButton("Back");
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				secondpage sc = new secondpage(user);
				sc.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_22.setBounds(190, 270, 97, 25);
		panel_14.add(btnNewButton_22);
		
		JLabel lblNewLabel_52 = new JLabel("  Display");
		lblNewLabel_52.setBounds(211, 324, 65, 16);
		panel_14.add(lblNewLabel_52);
		

		panel_14.add(textArea_6);

		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(147, 112, 219));
		tabbedPane.addTab("Display", null, panel_12, null);
		panel_12.setLayout(null);

		JLabel lblNewLabel_47 = new JLabel("Station Code");
		lblNewLabel_47.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_47.setBounds(120, 13, 100, 25);
		panel_12.add(lblNewLabel_47);

		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(32, 296, 487, 181);
		textArea_3.setLineWrap(true);
		
		JButton btnNewButton_23 = new JButton("Display All");
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//String scode=comboBox_19.getSelectedItem().toString();
				
				for(StationC itr:stationList) {
					
						String data=itr.displayStationAll();
						
						textArea_3.append(data);
						
						
					
				}
				JOptionPane.showMessageDialog(null, "! Display All Station Info!!");
				
				
			}
		});
		btnNewButton_23.setBounds(217, 187, 97, 25);
		panel_12.add(btnNewButton_23);

		
		panel_12.add(comboBox_19);

		
		panel_12.add(textArea_3);

		JLabel lblNewLabel_48 = new JLabel("Display");
		lblNewLabel_48.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_48.setBounds(243, 258, 89, 25);
		panel_12.add(lblNewLabel_48);

		JButton btnNewButton_25 = new JButton("Back");
		btnNewButton_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				secondpage sp = new secondpage(user);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_25.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_25.setBounds(235, 490, 97, 25);
		panel_12.add(btnNewButton_25);
		
		JButton btnNewButton_27 = new JButton("Display with Pas Inf Sys");
		btnNewButton_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String scode=comboBox_19.getSelectedItem().toString();
				
				for(StationC itr:stationList) {
					if(scode.equals(itr.stationCode))
					{
						String data=itr.displayStationWithPasInfSys();
						
						textArea_3.append(data);
						
						JOptionPane.showMessageDialog(null, scode+"!Display Station with Pas Inf Sys!!");
					}
				}
				
			}
		});
		btnNewButton_27.setBounds(165, 123, 194, 25);
		panel_12.add(btnNewButton_27);
		
		JButton btnNewButton_28 = new JButton("Display Station");
		btnNewButton_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String scode=comboBox_19.getSelectedItem().toString();
				
				for(StationC itr:stationList) {
					if(scode.equals(itr.stationCode))
					{
						String data=itr.displayStation();
						
						textArea_3.append(data);
						
						JOptionPane.showMessageDialog(null, scode+"!Display Station!!");
					}
				}
				
			}
		});
		btnNewButton_28.setBounds(205, 68, 127, 25);
		panel_12.add(btnNewButton_28);
		
		JButton btnNewButton_29 = new JButton("Reset");
		btnNewButton_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea_3.setText("");
				JOptionPane.showMessageDialog(null, "!Display Cleared!!");
			}
		});
		btnNewButton_29.setBounds(422, 270, 97, 25);
		panel_12.add(btnNewButton_29);
		
		
	}
}
