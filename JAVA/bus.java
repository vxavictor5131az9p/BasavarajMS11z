package cppackage;	
import java.awt.BorderLayout;

import java.awt.*;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTabbedPane;

//import java.awt.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import javax.swing.DefaultComboBoxModel;

abstract class BusC
{
    int busNo;
    String busType;
    int noOfSeats;
    int busCapacity;
    int busLength;
    String fromStation;
    String toStation;
   

    BusC()
    {
        busNo=0;
        busType="";
        noOfSeats=0;
        busCapacity=0;
        busLength=0;
        fromStation="";
        toStation="";

    }
    BusC(int bn,String bt,int ns,int bc,int bl,String fs,String ts)
    {
        this.busNo=bn;
        this.busType=bt;
        this.noOfSeats=ns;
        this.busCapacity=bc;
        this.busLength=bl;
        this.fromStation=fs;
        this.toStation=ts;
    }
    void displayBus()
    {
    	System.out.println("\nDisplay Bus...................");
    	System.out.println("Bus No:"+busNo+"\tBus Type:"+busType+"\tNumber Of Seats:"+noOfSeats+"\tBus Capacity:"+busCapacity+"\tBus Length:"+busLength+"\tFrom Station:"+fromStation+"\tTo Station:"+toStation);

    }
    
    public String templateDisplay() {
    	return displayBusStringWithStops();
    }
    
    
    String displayBusString() {
    	return " Bus No:"+busNo+" Bus Type:"+busType+" Number Of Seats:"+noOfSeats+" Bus Capacity:"+busCapacity+" Bus Length:"+busLength+" From Station:"+fromStation+" To Station:"+toStation;
    }
}

class Bus201 extends BusC
{
    
    ArrayList<String> availableStops1=new ArrayList<String>();
    String bus201Type;

    Bus201()
    {
       // availableStops;
    	super();
        bus201Type="";
    }
    Bus201(int bn,String bt,int ns,int bc,int bl,String fs,String ts,String btype)
    {
    	super(bn,bt,ns,bc,bl,fs,ts);
    	this.bus201Type=btype;

        availableStops1.add("Dharwad-New-Bus-Stop");
        availableStops1.add("Dharwad-Terminal");
        availableStops1.add("Jubili circle");
        availableStops1.add("Court-Circle");
        availableStops1.add("NTTF");
        availableStops1.add("TollNaka");
        availableStops1.add("JSS");
        availableStops1.add("Vidyagiri");
        availableStops1.add("Gandhinagar");
        availableStops1.add("Lakamanahalli");
        availableStops1.add("Sattur");
        availableStops1.add("SDM");
        availableStops1.add("Navalur Station");
        availableStops1.add("Rayapur");
        availableStops1.add("Iskcon");
        availableStops1.add("RTO");
        availableStops1.add("NavaNagar");
        availableStops1.add("APMC");
        availableStops1.add("Shantiniketan");
        availableStops1.add("Bhairidevarakoppa");
        availableStops1.add("Unkal Lake");
        availableStops1.add("Unkal Village");
        availableStops1.add("Unkal Cross");
        availableStops1.add("BVB");
        availableStops1.add("Vidya Nagar");
        availableStops1.add("KIMS");
        availableStops1.add("Hosur Cross");
        availableStops1.add("OCBC");
        if(btype=="B-D"||btype=="B-U")
        {
          availableStops1.add("Railway Station");
        }

    }

    void displayBus()
    {
    	System.out.println("\nDisplay 201 Bus................");
    	System.out.println("Available Stops:");
    	
		for(String data:availableStops1) {
			System.out.println(data);
		}

        System.out.println("\nBus 201 Type:"+bus201Type);
        super.displayBus();
    }
    String availableStops() {
    	String s="Available Stops in 201:\n";
    	for(String data:availableStops1) {
			s=s+data+" : ";
		}
    	return s+"\n";
    }
    
    String displayBusString() {
    	return "Bus No:"+busNo+" Bus Type:"+busType+" Number Of Seats:"+noOfSeats+" Bus Capacity:"+busCapacity+" Bus Length:"+busLength+" From Station:"+fromStation+" To Station:"+toStation+"Bus 201 Type:"+bus201Type+"\n";
    }
    String displayBusStringWithStops() {
    	String s= displayBusString();
    	s=s+"Available Stops:\n";
    	for(String data:availableStops1) {
			s=s+data+" : ";
		}
    	return s+"\n";
    }
    


}


class Bus200 extends BusC
{
	ArrayList<String> availableStops=new ArrayList<String>();
    String bus200Type;

    Bus200()
    {
        super();
        this.bus200Type="";
    }
    Bus200(int bn,String bt,int ns,int bc,int bl,String fs,String ts,String btype)
    {
    	super(bn,bt,ns,bc,bl,fs,ts);
    	this.bus200Type=btype;

        availableStops.add("Dharwad-Terminal");
        availableStops.add("Jubili circle");
        availableStops.add("Court-Circle");
        availableStops.add("NTTF");
        availableStops.add("TollNaka");
        availableStops.add("JSS");
        availableStops.add("Vidyagiri");
        availableStops.add("Gandhinagar");
        availableStops.add("Lakamanahalli");
        availableStops.add("Sattur");
        availableStops.add("SDM");
        availableStops.add("Navalur Station");
        availableStops.add("Rayapur");
        availableStops.add("Iskcon");
        availableStops.add("RTO");
        availableStops.add("NavaNagar");
        availableStops.add("APMC");
        availableStops.add("Shantiniketan");
        availableStops.add("Bhairidevarakoppa");
        availableStops.add("Unkal Lake");
        availableStops.add("Unkal Village");
        availableStops.add("Unkal Cross");
        availableStops.add("BVB");
        availableStops.add("Vidya Nagar");
        availableStops.add("KIMS");
        availableStops.add("Hosur Cross");
        availableStops.add("Dr.B.R.Ambedkar Circle");

        if(btype=="A-D"||btype=="A-U")
        {
            availableStops.add("OCBC");
            availableStops.add("Hubli CBT");
            availableStops.add("Railway Station");
        }
        
        

    }

    void displayBus()
    {
    	System.out.println("\nDisplay 200 Bus................");
    	System.out.println("Available Stops:");
    	
    	for(String data:availableStops) {
			System.out.println(data);
		}
    	System.out.println("\nBus 200 Type:"+bus200Type);
        super.displayBus();
    }
    String availableStops() {
    	String s="Available Stops in 200:\n";
    	for(String data:availableStops) {
			s=s+data+" : ";
		}
    	return s+"\n";
    }
    
    String displayBusString() {
    	return "Bus No:"+busNo+" Bus Type:"+busType+" Number Of Seats:"+noOfSeats+" Bus Capacity:"+busCapacity+" Bus Length:"+busLength+" From Station:"+fromStation+" To Station:"+toStation+"Bus 200 Type:"+bus200Type+"\n";
    }
    String displayBusStringWithStops() {
    	String s= displayBusString();
    	s=s+"Available Stops:\n";
    	for(String data:availableStops) {
			s=s+data+" : ";
		}
    	return s+"\n";
    }


}

class Bus100 extends BusC
{
	ArrayList<String> availableStops=new ArrayList<String>();
    String bus100Type;

    Bus100()
    {
       // availableStops={};
    	super();
    	this.bus100Type="";
    }
    Bus100(int bn,String bt,int ns,int bc,int bl,String fs,String ts,String btype)
    {
    	super(bn,bt,ns,bc,bl,fs,ts);
        availableStops.add("Dharwad-Terminal");
        availableStops.add("Jubilee Circle");
        availableStops.add("Court Circle");
        availableStops.add("NTTF");
        availableStops.add("TollNaka");
        availableStops.add("SDM");
        availableStops.add("KIMS");
        availableStops.add("Hosur Cross");
        availableStops.add("OCBS");

        this.bus100Type=btype;
    }

    void displayBus()
    {
    	System.out.println("\nDisplay 100 Bus................");
    	System.out.println("Available Stops:");
    	for(String data:availableStops) {
			System.out.println(data);
		}
        System.out.println("\nBus 100 Type:"+bus100Type);
        super.displayBus();
    }
    
    String availableStops() {
    	String s="Available Stops in 100:\n";
    	for(String data:availableStops) {
			s=s+data+" : ";
		}
    	return s+"\n";
    }
    
    String displayBusString() {
    	return "Bus No:"+busNo+" Bus Type:"+busType+" Number Of Seats:"+noOfSeats+" Bus Capacity:"+busCapacity+" Bus Length:"+busLength+" From Station:"+fromStation+" To Station:"+toStation+"Bus 100 Type:"+bus100Type+"\n";
    }
    String displayBusStringWithStops() {
    	String s= displayBusString();
    	s=s+"Available Stops:\n";
    	for(String data:availableStops) {
			s=s+data+" : ";
		}
    	return s+"\n";
    }


}

class BusFactory {
    public BusC createBus(String channel)
    {
        if (channel == null || channel.isEmpty())
            return null;
        if ("Bus100".equals(channel)) {
            return new Bus100(1000,"100",35,65,14,"Dharwad BRTS Terminal","OCBS","D-D");
        }
        else if ("Bus200".equals(channel)) {
            return new Bus200(2000,"200",35,65,14,"Dharwad BRTS Terminal","Dr.B.R.Ambedkar Circle","C-D");
        }
        else if ("Bus201".equals(channel)) {
            return new Bus201(2001,"201",35,65,14,"Dharwad New Bus Stop","Railway Station","B-D");
        }
        return null;
    }
}

/*
class FactoryService {
	
	FactoryService(){
		
	}
    public static void main(String[] args)
    {
        BusFactory busFactory = new BusFactory();
        BusC bus = busFactory.createBus("Bus100");
        String s=bus.displayBusString();
    }
}
*/

public class bus extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_21;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bus frame = new bus();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 * @param bus201List2 
	 * @param bus200List2 
	 * @param bus100List2 
	 * @param user 
	 */
	public bus(ArrayList<Bus100> bus100List2, ArrayList<Bus200> bus200List2, ArrayList<Bus201> bus201List2, String user) {
		
		//ArrayList<Bus100> bus100List = new ArrayList<>();
		//ArrayList<Bus200> bus200List = new ArrayList<>();
		//ArrayList<Bus201> bus201List = new ArrayList<>();
		
		Bus100 b1001=new Bus100(1,"100",35,65,14,"Dharwad BRTS Terminal","OCBS","D-D");
		Bus100 b1002=new Bus100(2,"100",35,65,14,"OCBS","Dharwad BRTS Terminal","D-U");
		Bus100 b1003=new Bus100(3,"100",35,65,14,"Dharwad BRTS Terminal","OCBS","D-D");
		Bus100 b1004=new Bus100(4,"100",35,65,14,"OCBS","Dharwad BRTS Terminal","D-U");
		Bus100 b1005=new Bus100(5,"100",35,65,14,"Dharwad BRTS Terminal","OCBS","D-D");
		
		Bus200 b2001=new Bus200(1,"200",35,65,14,"Dharwad BRTS Terminal","HUBLI CBT","A-D");
		Bus200 b2002=new Bus200(2,"200",35,65,14,"HUBLI CBT","Dharwad BRTS Terminal","D-U");
		Bus200 b2003=new Bus200(3,"200",35,65,14,"Dharwad BRTS Terminal","HUBLI CBT","A-D");
		Bus200 b2004=new Bus200(4,"200",35,65,14,"HUBLI CBT","Dharwad BRTS Terminal","D-U");
		Bus200 b2005=new Bus200(5,"200",35,65,14,"Dharwad BRTS Terminal","HUBLI CBT","A-D");
		
		Bus201 b2011=new Bus201(1,"201",35,65,14,"Dharwad New Bus Stop","Railway Station","B-D");
		Bus201 b2012=new Bus201(2,"201",35,65,14,"Railway Station","Dharwad New Bus Stop","B-U");
		Bus201 b2013=new Bus201(3,"201",35,65,14,"Dharwad New Bus Stop","Railway Station","B-D");
		Bus201 b2014=new Bus201(4,"201",35,65,14,"Railway Station","Dharwad New Bus Stop","B-U");
		Bus201 b2015=new Bus201(5,"201",35,65,14,"Dharwad New Bus Stop","OCBS","D-D");
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		comboBox_8.setEditable(true);
		comboBox_8.setBounds(293, 35, 90, 23);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setEditable(true);
		comboBox_3.setBounds(144, 28, 103, 22);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setEditable(true);
		comboBox_2.setBounds(303, 56, 106, 24);
		
		bus100List2.add(b1001);
		bus100List2.add(b1002);
		bus100List2.add(b1003);
		bus100List2.add(b1004);
		bus100List2.add(b1005);
		
		for(Bus100 itr:bus100List2) {
			comboBox_2.addItem(itr.busNo);
			comboBox_3.addItem(itr.busNo);
			comboBox_8.addItem(itr.busNo);

		}
		
		JComboBox comboBox_3_1 = new JComboBox();
		comboBox_3_1.setEditable(true);
		comboBox_3_1.setBounds(156, 28, 103, 22);
		
		JComboBox comboBox_15 = new JComboBox();
		comboBox_15.setEditable(true);
		comboBox_15.setBounds(325, 88, 85, 22);
		
		JComboBox comboBox_8_1 = new JComboBox();
		comboBox_8_1.setEditable(true);
		comboBox_8_1.setBounds(322, 13, 90, 23);
		
		bus200List2.add(b2001);
		bus200List2.add(b2002);
		bus200List2.add(b2003);
		bus200List2.add(b2004);
		bus200List2.add(b2005);
		
		for(Bus200 itr:bus200List2) {
			comboBox_15.addItem(itr.busNo);
			comboBox_3_1.addItem(itr.busNo);
			comboBox_8_1.addItem(itr.busNo);

		}
		
		JComboBox comboBox_3_1_1 = new JComboBox();
		comboBox_3_1_1.setEditable(true);
		comboBox_3_1_1.setBounds(156, 28, 103, 22);
		
		JComboBox comboBox_15_1 = new JComboBox();
		comboBox_15_1.setEditable(true);
		comboBox_15_1.setBounds(325, 88, 85, 22);
		
		JComboBox comboBox_8_2 = new JComboBox();
		comboBox_8_2.setEditable(true);
		comboBox_8_2.setBounds(293, 35, 90, 23);
		
		bus201List2.add(b2011);
		bus201List2.add(b2012);
		bus201List2.add(b2013);
		bus201List2.add(b2014);
		bus201List2.add(b2015);
		
		for(Bus201 itr:bus201List2) {
			comboBox_15_1.addItem(itr.busNo);
			comboBox_3_1_1.addItem(itr.busNo);
			comboBox_8_2.addItem(itr.busNo);

		}
		
		
        
		
        
		
		setTitle("Bus");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 140, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setPreferredSize(new Dimension(600,600));
		//pack();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 13, 605, 682);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Bus100", null, panel, null);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(24, 13, 555, 600);
		panel.add(tabbedPane_1);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(new Color(255, 218, 185));
		tabbedPane_1.addTab("Day Running", null, panel_16, null);
		panel_16.setLayout(null);
		
		JTextArea textArea_10 = new JTextArea();
		textArea_10.setBounds(12, 205, 526, 289);
		panel_16.add(textArea_10);
		textArea_10.setLineWrap(true);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"80", "50", "60", "70", "80", "90", "100"}));
		comboBox_4.setBounds(247, 47, 116, 23);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(247, 83, 116, 22);
		
		
		JButton btnNewButton_23 = new JButton("Display");
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s1=comboBox_4.getSelectedItem().toString();
				
				int per=Integer.parseInt(s1);
				String daysstring=textField_21.getText();
				int days=Integer.parseInt(daysstring);
				
				int length=bus100List2.size();
				
				double n=(per*length)/100;
				
				int value=(int)n;
				
				String s=String.valueOf(value);
				//textArea_10.append(s);
				int i,j,k;
				for(i=0;i<days;i++)
				{
					for(j=i;j<=value-1;j++)
					{
						String runbus=bus100List2.get(j).displayBusString();
						textArea_10.append(runbus);
					}
					if(j==length-1)
					{
						for(k=0;k<value-1-days;k++)
						{
							String runbus=bus100List2.get(k).displayBusString();
							textArea_10.append(runbus);
						}
					}
					value++;
				}
				//textArea_3.setText("");
				
				
				
				//System.out.println(length);
				
				
				
			}
		});
		btnNewButton_23.setBounds(207, 136, 97, 25);
		panel_16.add(btnNewButton_23);
		
		JLabel lblNewLabel_12 = new JLabel("Set % of Bus to Run ");
		lblNewLabel_12.setBounds(88, 46, 128, 25);
		panel_16.add(lblNewLabel_12);
		
		
		panel_16.add(comboBox_4);
		
		
		panel_16.add(textField_21);
		
		JLabel lblDays = new JLabel("Days");
		lblDays.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblDays.setBounds(88, 84, 87, 23);
		panel_16.add(lblDays);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textArea_10.setText("");
			}
		});
		btnReset.setBounds(425, 177, 97, 25);
		panel_16.add(btnReset);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(51, 204, 255));
		tabbedPane_1.addTab("Add Bus100", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("BusNo");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(35, 58, 87, 23);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("BusType");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setBounds(33, 94, 91, 23);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NoOfSeats");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3.setBounds(35, 136, 89, 23);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("BusCapacity");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_4.setBounds(35, 176, 89, 23);
		panel_3.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(126, 59, 116, 22);
		panel_3.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(126, 137, 116, 22);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"100"}));
		comboBox.setBounds(126, 95, 116, 23);
		panel_3.add(comboBox);
		
		textField_2 = new JTextField();
		textField_2.setBounds(126, 177, 116, 22);
		panel_3.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("BusLength");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_5.setBounds(273, 62, 91, 19);
		panel_3.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(389, 59, 116, 22);
		panel_3.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("FromStation");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_6.setBounds(273, 107, 91, 20);
		panel_3.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("ToStation");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_7.setBounds(273, 143, 91, 23);
		panel_3.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Bus100Type");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_8.setBounds(35, 258, 89, 23);
		panel_3.add(lblNewLabel_8);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"D-D", "D-U"}));
		comboBox_1.setBounds(136, 259, 106, 23);
		panel_3.add(comboBox_1);
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"Dharwad BRTS Terminal", "OCBS"}));
		comboBox_10.setBounds(389, 107, 116, 23);
		
		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"OCBS", "Dharwad BRTS Terminal"}));
		comboBox_11.setBounds(389, 144, 116, 22);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(78, 315, 384, 112);
		textArea.setLineWrap(true);
		
		JButton btnNewButton = new JButton("CreateBus100");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String s1=textField.getText();
				int busno=Integer.parseInt(textField.getText());
				String btype=comboBox.getSelectedItem().toString();
				String s2=textField_1.getText();
				String s3=textField_2.getText();
				String s4=textField_3.getText();
				int seats=Integer.parseInt(textField_1.getText());
				int capacity=Integer.parseInt(textField_2.getText());
				int length=Integer.parseInt(textField_3.getText());
			
				String from=comboBox_10.getSelectedItem().toString();
				String to=comboBox_11.getSelectedItem().toString();
				String type100=comboBox_1.getSelectedItem().toString();
				
				if(user=="Admin")
				{
					JOptionPane.showMessageDialog(null, "You are an authorized user!");
				
				try {
					int flag=0;
					for(Bus100 itr:bus100List2) {
						if(busno==itr.busNo && btype==itr.busType) {
							flag=1;
						}
					}
					if(flag==1) {
						throw new DuplicateItemException(1234,"Bus100 No already exists!");
					}
					else {
						bus100List2.add(new Bus100(busno,btype,seats,length,capacity,from,to,type100));
						
						comboBox_2.addItem(busno);
						comboBox_3.addItem(busno);
						comboBox_8.addItem(busno);

						
						
						/*
						for(PasInfSys pisitr:itr.pasInfSys) {
							comboBox_15.addItem(pisitr.infoId);
							comboBox_22.addItem(pisitr.infoId);
						}*/
						JOptionPane.showMessageDialog(null, "Bus100 Added!");
						textArea.append(busno+" Bus100 added!\n");
					}
				}
				catch(DuplicateItemException die){
					JOptionPane.showMessageDialog(null, "Duplicate Bus100 No !");
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
		btnNewButton.setBounds(324, 253, 181, 34);
		panel_3.add(btnNewButton);
		
		
		panel_3.add(textArea);
		
		JLabel lblNewLabel_9 = new JLabel("Display");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_9.setBounds(228, 295, 87, 20);
		panel_3.add(lblNewLabel_9);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				secondpage sp=new secondpage(user);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_1.setBounds(214, 439, 97, 25);
		panel_3.add(btnNewButton_1);
		
		
		panel_3.add(comboBox_10);
		
		
		panel_3.add(comboBox_11);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 204, 255));
		tabbedPane_1.addTab("Update Bus100", null, panel_5, null);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("BusNo");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_11.setBounds(42, 27, 99, 23);
		panel_5.add(lblNewLabel_11);
		
		
		panel_5.add(comboBox_3);
		
		JLabel lblNewLabel_13 = new JLabel("No Of Seats");
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_13.setBounds(42, 78, 82, 16);
		panel_5.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("BusCapacity");
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_14.setBounds(42, 125, 98, 24);
		panel_5.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Bus Length");
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_15.setBounds(285, 31, 82, 19);
		panel_5.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("FromStation");
		lblNewLabel_16.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_16.setBounds(285, 74, 82, 24);
		panel_5.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("ToStation");
		lblNewLabel_17.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_17.setBounds(286, 130, 81, 15);
		panel_5.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Bus100Type");
		lblNewLabel_18.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_18.setBounds(42, 193, 99, 23);
		panel_5.add(lblNewLabel_18);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"D-D", "D-U"}));
		comboBox_5.setBounds(144, 194, 116, 22);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Dharwad BRTS Terminal", "OCBS"}));
		comboBox_6.setBounds(379, 76, 116, 22);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"OCBS", "Dharwad BRTS Terminal"}));
		comboBox_7.setBounds(379, 127, 116, 22);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(54, 316, 438, 106);
		textArea_1.setLineWrap(true);
		
		JButton btnNewButton_4 = new JButton("Update Bus100");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String s1=comboBox_3.getSelectedItem().toString();
				int busno=Integer.parseInt(s1);
				String btype=comboBox.getSelectedItem().toString();
				String s2=textField_6.getText();
				String s3=textField_7.getText();
				String s4=textField_8.getText();
				int seats=Integer.parseInt(textField_6.getText());
				int capacity=Integer.parseInt(textField_7.getText());
				int length=Integer.parseInt(textField_8.getText());
			
				String from=comboBox_6.getSelectedItem().toString();
				String to=comboBox_7.getSelectedItem().toString();
				String type100=comboBox_5.getSelectedItem().toString();
				
				if(user=="Admin")
				{
					JOptionPane.showMessageDialog(null, "You are an authorized user!");
					for(Bus100 itr:bus100List2) {
					if(busno==itr.busNo)
					{
						itr.busType=btype;
						itr.busCapacity=capacity;
						itr.busLength=length;
						itr.noOfSeats=seats;
						itr.fromStation=from;
						itr.toStation=to;
						itr.bus100Type=type100;
						textArea_1.append(busno+" !Updated Bus100!\n");
						JOptionPane.showMessageDialog(null, "BusNo: "+busno+" !Updated Bus100!!");
					}
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "You are not authorized!");
			}
				
			}
		});
		btnNewButton_4.setBounds(361, 190, 134, 30);
		panel_5.add(btnNewButton_4);
		
		textField_6 = new JTextField();
		textField_6.setBounds(144, 76, 116, 22);
		panel_5.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(144, 127, 116, 22);
		panel_5.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(379, 28, 116, 22);
		panel_5.add(textField_8);
		textField_8.setColumns(10);
		

		panel_5.add(comboBox_5);
		
		
		panel_5.add(comboBox_6);
		
		
		panel_5.add(comboBox_7);
		
		JLabel lblNewLabel_19 = new JLabel("Display");
		lblNewLabel_19.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_19.setBounds(240, 275, 82, 23);
		panel_5.add(lblNewLabel_19);
		
		
		panel_5.add(textArea_1);
		
		JButton btnNewButton_5 = new JButton("Back");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				secondpage sp=new secondpage(user);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_5.setBounds(230, 450, 97, 25);
		panel_5.add(btnNewButton_5);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(204, 255, 102));
		tabbedPane_1.addTab("Remove Bus100", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("BusNo");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_10.setBounds(156, 54, 86, 27);
		panel_4.add(lblNewLabel_10);
		
		
		panel_4.add(comboBox_2);
		
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(125, 224, 322, 120);
		textArea_3.setLineWrap(true);
		
		JButton btnNewButton_2 = new JButton("Remove Bus");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String s1=comboBox_2.getSelectedItem().toString();
				int busno=Integer.parseInt(s1);
				
				if(user=="Admin")
				{
					JOptionPane.showMessageDialog(null, "You are an authorized user!");
				
				for(Bus100 itr:bus100List2){
					
					if(busno==itr.busNo)
					{
						bus100List2.remove(comboBox_2);
						textArea_3.append("Busno: "+busno+" !of Bus100 Removed!\n");
						JOptionPane.showMessageDialog(null, "Busno: "+busno+"!of Bus100 Removed!!");
						
						comboBox_2.removeItem(busno);
						comboBox_3.removeItem(busno);
						comboBox_8.removeItem(busno);

					}
				}
				}
				else {
					JOptionPane.showMessageDialog(null, "You are not authorized!");
				}
			}
		});
		btnNewButton_2.setBounds(219, 119, 106, 33);
		panel_4.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Back");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				secondpage sp=new secondpage(user);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_3.setBounds(219, 398, 106, 27);
		panel_4.add(btnNewButton_3);
		
		JLabel lblNewLabel_22 = new JLabel("Display");
		lblNewLabel_22.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_22.setBounds(248, 187, 56, 16);
		panel_4.add(lblNewLabel_22);
		
		
		panel_4.add(textArea_3);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(153, 255, 204));
		tabbedPane_1.addTab("Display 100", null, panel_7, null);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_20 = new JLabel("BusNo");
		lblNewLabel_20.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_20.setBounds(151, 33, 99, 24);
		panel_7.add(lblNewLabel_20);
		
		
		panel_7.add(comboBox_8);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(12, 210, 526, 309);
		textArea_2.setLineWrap(true);
		
		JButton btnNewButton_6 = new JButton("Display");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String s1=comboBox_8.getSelectedItem().toString();
				int busno=Integer.parseInt(s1);
				
				for(Bus100 itr:bus100List2){
					
					if(busno==itr.busNo)
					{
			
						
						String data=itr.displayBusString();
						
						textArea_2.append(data);
						
						JOptionPane.showMessageDialog(null, busno+"!Bus100 Display!!");
						

					}
				}
			}
		});
		btnNewButton_6.setBounds(211, 70, 97, 25);
		panel_7.add(btnNewButton_6);
		
		JLabel lblNewLabel_21 = new JLabel("Display");
		lblNewLabel_21.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_21.setBounds(229, 178, 59, 19);
		panel_7.add(lblNewLabel_21);
		
		
		panel_7.add(textArea_2);
		
		JButton btnNewButton_7 = new JButton("Reset");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea_2.setText("");
				JOptionPane.showMessageDialog(null, "!Display Cleared!!");
				
			}
		});
		btnNewButton_7.setBounds(441, 176, 97, 25);
		panel_7.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Display All");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				for(Bus100 itr:bus100List2){
						
						String data=itr.displayBusStringWithStops();
						
						textArea_2.append(data);
					
				}
				JOptionPane.showMessageDialog(null, "!ALL Bus100 Display!!");
			}
		});
		btnNewButton_8.setBounds(211, 140, 97, 25);
		panel_7.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Back");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				secondpage sp=new secondpage(user);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_9.setBounds(229, 532, 97, 25);
		panel_7.add(btnNewButton_9);
		
		JButton btnNewButton_21 = new JButton("Display with Stops");
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String s1=comboBox_8.getSelectedItem().toString();
				int busno=Integer.parseInt(s1);
				
				for(Bus100 itr:bus100List2){
					
					if(busno==itr.busNo)
					{
			
						
						String data=itr.displayBusStringWithStops();
						
						textArea_2.append(data);
						
						JOptionPane.showMessageDialog(null, busno+"!Bus100 Display!!");
						

					}
				}
			}
		});
		btnNewButton_21.setBounds(167, 108, 172, 24);
		panel_7.add(btnNewButton_21);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Bus200", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBackground(new Color(153, 255, 102));
		tabbedPane_2.setBounds(12, 13, 575, 600);
		panel_1.add(tabbedPane_2);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_8.setBackground(new Color(102, 255, 51));
		tabbedPane_2.addTab("Add Bus200", null, panel_8, null);
		panel_8.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BusNo");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(59, 40, 56, 16);
		panel_8.add(lblNewLabel);
		
		JLabel lblNewLabel_23 = new JLabel("BusType");
		lblNewLabel_23.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_23.setBounds(59, 89, 72, 16);
		panel_8.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("NoOfSeats");
		lblNewLabel_24.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_24.setBounds(59, 138, 87, 16);
		panel_8.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("BusCapacity");
		lblNewLabel_25.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_25.setBounds(59, 182, 87, 19);
		panel_8.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("BusLength");
		lblNewLabel_26.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_26.setBounds(316, 40, 81, 16);
		panel_8.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("FromStation");
		lblNewLabel_27.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_27.setBounds(316, 89, 92, 16);
		panel_8.add(lblNewLabel_27);
		
		JLabel lblNewLabel_28 = new JLabel("ToStation");
		lblNewLabel_28.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_28.setBounds(316, 138, 81, 16);
		panel_8.add(lblNewLabel_28);
		
		textField_9 = new JTextField();
		textField_9.setBounds(149, 38, 116, 22);
		panel_8.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(149, 136, 116, 22);
		panel_8.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(149, 181, 116, 22);
		panel_8.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(420, 38, 116, 22);
		panel_8.add(textField_12);
		textField_12.setColumns(10);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"200"}));
		comboBox_9.setBounds(149, 87, 116, 18);
		panel_8.add(comboBox_9);
		
		JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"Dharwad BRTS Terminal", "Hubli CBT"}));
		comboBox_12.setBounds(420, 87, 105, 18);
		panel_8.add(comboBox_12);
		
		JComboBox comboBox_13 = new JComboBox();
		comboBox_13.setModel(new DefaultComboBoxModel(new String[] {"Hubli CBT", "Dharwad BRTS Terminal"}));
		comboBox_13.setBounds(420, 136, 105, 22);
		panel_8.add(comboBox_13);
		
		JLabel lblNewLabel_29 = new JLabel("Bus200Type");
		lblNewLabel_29.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_29.setBounds(59, 248, 92, 22);
		panel_8.add(lblNewLabel_29);
		
		JComboBox comboBox_14 = new JComboBox();
		comboBox_14.setModel(new DefaultComboBoxModel(new String[] {"A-D", "D-U"}));
		comboBox_14.setBounds(163, 249, 105, 21);
		panel_8.add(comboBox_14);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBounds(59, 353, 466, 112);
		textArea_4.setLineWrap(true);
		
		JButton btnNewButton_10 = new JButton("Create Bus200");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String s1=textField_9.getText();
				int busno=Integer.parseInt(textField_9.getText());
				String btype=comboBox.getSelectedItem().toString();
				String s2=textField_10.getText();
				String s3=textField_11.getText();
				String s4=textField_12.getText();
				int seats=Integer.parseInt(textField_10.getText());
				int capacity=Integer.parseInt(textField_11.getText());
				int length=Integer.parseInt(textField_12.getText());
			
				String from=comboBox_12.getSelectedItem().toString();
				String to=comboBox_13.getSelectedItem().toString();
				String type200=comboBox_14.getSelectedItem().toString();
				
				
				if(user=="Admin")
				{
					JOptionPane.showMessageDialog(null, "You are an authorized user!");
				
				try {
					int flag=0;
					for(Bus200 itr:bus200List2) {
						if(busno==itr.busNo && btype==itr.busType) {
							flag=1;
						}
					}
					if(flag==1) {
						throw new DuplicateItemException(1234,"Bus200 No already exists!");
					}
					else {
						bus100List2.add(new Bus100(busno,btype,seats,length,capacity,from,to,type200));
						
						comboBox_15.addItem(busno);
						comboBox_3_1.addItem(busno);
						comboBox_8_1.addItem(busno);

						JOptionPane.showMessageDialog(null, "New Bus200 Added!");
						textArea_4.append(" Bus200 added with BusNo"+busno+"\n");
					}
				}
				catch(DuplicateItemException die){
					JOptionPane.showMessageDialog(null, "Duplicate Bus200 No !");
					die.showError();
					textArea_4.setLineWrap(true);
					
					textArea_4.append("Duplicate Element!\n");
				}
				
			}
			else {
				JOptionPane.showMessageDialog(null, "You are not authorized!");
			}
			}
		});
		btnNewButton_10.setBounds(351, 248, 174, 25);
		panel_8.add(btnNewButton_10);
		
		JLabel lblNewLabel_30 = new JLabel("Display");
		lblNewLabel_30.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_30.setBounds(265, 317, 65, 19);
		panel_8.add(lblNewLabel_30);
		
		panel_8.add(textArea_4);
		
		JButton btnNewButton_11 = new JButton("Back");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				secondpage sp=new secondpage(user);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_11.setBounds(243, 502, 97, 25);
		panel_8.add(btnNewButton_11);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(153, 255, 102));
		tabbedPane_2.addTab("Update Bus200", null, panel_10, null);
		panel_10.setLayout(null);
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setBounds(66, 316, 438, 106);
		panel_10.add(textArea_1_1);
		
		JComboBox comboBox_5_1 = new JComboBox();
		comboBox_5_1.setModel(new DefaultComboBoxModel(new String[] {"A-D", "D-U"}));
		comboBox_5_1.setBounds(156, 194, 116, 22);
		
		JComboBox comboBox_7_1 = new JComboBox();
		comboBox_7_1.setModel(new DefaultComboBoxModel(new String[] {"Hubli CBT", "Dharwad BRTS Terminal"}));
		comboBox_7_1.setBounds(391, 127, 116, 22);
		
		JComboBox comboBox_6_1 = new JComboBox();
		comboBox_6_1.setModel(new DefaultComboBoxModel(new String[] {"Dharwad BRTS Terminal", "Hubli CBT"}));
		comboBox_6_1.setBounds(391, 76, 116, 22);
		
		JButton btnNewButton_4_1 = new JButton("Update Bus200");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s1=comboBox_3_1.getSelectedItem().toString();
				int busno=Integer.parseInt(s1);
				String btype=comboBox.getSelectedItem().toString();
				String s2=textField_4.getText();
				String s3=textField_5.getText();
				String s4=textField_13.getText();
				int seats=Integer.parseInt(textField_4.getText());
				int capacity=Integer.parseInt(textField_5.getText());
				int length=Integer.parseInt(textField_13.getText());
			
				String from=comboBox_6_1.getSelectedItem().toString();
				String to=comboBox_7_1.getSelectedItem().toString();
				String type100=comboBox_5_1.getSelectedItem().toString();
				
				if(user=="Admin")
				{
					JOptionPane.showMessageDialog(null, "You are an authorized user!");
				
				for(Bus100 itr:bus100List2) {
					if(busno==itr.busNo)
					{
						itr.busType=btype;
						itr.busCapacity=capacity;
						itr.busLength=length;
						itr.noOfSeats=seats;
						itr.fromStation=from;
						itr.toStation=to;
						itr.bus100Type=type100;
						textArea_1.append(busno+" !Updated Bus100!\n");
						JOptionPane.showMessageDialog(null, "BusNo: "+busno+" !Updated Bus100!!");
					}
				}
				}
				else {
					JOptionPane.showMessageDialog(null, "You are not authorized!");
				}
				
			}
		});
		btnNewButton_4_1.setBounds(370, 190, 134, 30);
		panel_10.add(btnNewButton_4_1);
		
		
		panel_10.add(comboBox_7_1);
		
		
		panel_10.add(comboBox_6_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(156, 76, 116, 22);
		panel_10.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(156, 127, 116, 22);
		panel_10.add(textField_5);
		
		
		panel_10.add(comboBox_5_1);
		
		JLabel lblNewLabel_18_1 = new JLabel("Bus100Type");
		lblNewLabel_18_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_18_1.setBounds(54, 193, 99, 23);
		panel_10.add(lblNewLabel_18_1);
		
		JLabel lblNewLabel_14_1 = new JLabel("BusCapacity");
		lblNewLabel_14_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_14_1.setBounds(54, 125, 98, 24);
		panel_10.add(lblNewLabel_14_1);
		
		JLabel lblNewLabel_17_1 = new JLabel("ToStation");
		lblNewLabel_17_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_17_1.setBounds(298, 130, 81, 15);
		panel_10.add(lblNewLabel_17_1);
		
		JLabel lblNewLabel_16_1 = new JLabel("FromStation");
		lblNewLabel_16_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_16_1.setBounds(297, 74, 82, 24);
		panel_10.add(lblNewLabel_16_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(391, 28, 116, 22);
		panel_10.add(textField_13);
		
		JLabel lblNewLabel_15_1 = new JLabel("Bus Length");
		lblNewLabel_15_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_15_1.setBounds(297, 31, 82, 19);
		panel_10.add(lblNewLabel_15_1);
		
		
		panel_10.add(comboBox_3_1);
		
		JLabel lblNewLabel_11_1 = new JLabel("BusNo");
		lblNewLabel_11_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_11_1.setBounds(54, 27, 99, 23);
		panel_10.add(lblNewLabel_11_1);
		
		JLabel lblNewLabel_13_1 = new JLabel("No Of Seats");
		lblNewLabel_13_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_13_1.setBounds(54, 78, 82, 16);
		panel_10.add(lblNewLabel_13_1);
		
		JLabel label = new JLabel("Display");
		label.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label.setBounds(245, 274, 59, 29);
		panel_10.add(label);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				secondpage sp=new secondpage(user);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		button.setBounds(225, 488, 97, 25);
		panel_10.add(button);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 153, 255));
		tabbedPane_2.addTab("Remove Bus200", null, panel_9, null);
		panel_9.setLayout(null);
		
		JLabel lblNewLabel_31 = new JLabel("BusNo");
		lblNewLabel_31.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_31.setBounds(164, 83, 85, 30);
		panel_9.add(lblNewLabel_31);
		
		
		panel_9.add(comboBox_15);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setBounds(100, 274, 383, 115);
		textArea_5.setLineWrap(true);
		
		JButton btnNewButton_12 = new JButton("Remove");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String s1=comboBox_15.getSelectedItem().toString();
				int busno=Integer.parseInt(s1);
				
				if(user=="Admin")
				{
					JOptionPane.showMessageDialog(null, "You are an authorized user!");
					for(Bus200 itr:bus200List2){
					
					if(busno==itr.busNo)
					{
						bus200List2.remove(comboBox_2);
						textArea_5.append("Busno: "+busno+" !of Bus200 Removed!\n");
						JOptionPane.showMessageDialog(null, "Busno: "+busno+"!of Bus200 Removed!!");
						
						comboBox_15.removeItem(busno);
						comboBox_3_1.removeItem(busno);
						comboBox_8_1.removeItem(busno);

					}
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "You are not authorized!");
			}
			}
		});
		btnNewButton_12.setBounds(228, 147, 97, 25);
		panel_9.add(btnNewButton_12);
		
		JLabel lblNewLabel_32 = new JLabel("Display");
		lblNewLabel_32.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_32.setBounds(251, 239, 62, 22);
		panel_9.add(lblNewLabel_32);
		
		
		panel_9.add(textArea_5);
		
		JButton btnNewButton_13 = new JButton("Back");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				secondpage sp=new secondpage(user);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_13.setBounds(238, 441, 97, 25);
		panel_9.add(btnNewButton_13);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(255, 255, 153));
		tabbedPane_2.addTab("Display Bus200", null, panel_11, null);
		panel_11.setLayout(null);
		
		JLabel lblNewLabel_20_1 = new JLabel("BusNo");
		lblNewLabel_20_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_20_1.setBounds(157, 11, 99, 24);
		panel_11.add(lblNewLabel_20_1);
		
		
		panel_11.add(comboBox_8_1);
		
		JTextArea textArea_2_1 = new JTextArea();
		textArea_2_1.setBounds(22, 177, 526, 301);
		textArea_2_1.setLineWrap(true);
		
		JButton btnNewButton_6_1 = new JButton("Display");
		btnNewButton_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String s1=comboBox_8_1.getSelectedItem().toString();
				int busno=Integer.parseInt(s1);
				
				for(Bus200 itr:bus200List2){
					
					if(busno==itr.busNo)
					{
			
						
						String data=itr.displayBusString();
						
						textArea_2_1.append(data);
						
						JOptionPane.showMessageDialog(null, busno+"!Bus200 Display!!");
						

					}
				}
			}
		});
		btnNewButton_6_1.setBounds(228, 48, 97, 25);
		panel_11.add(btnNewButton_6_1);
		
		JButton btnNewButton_8_1 = new JButton("Display All");
		btnNewButton_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				for(Bus200 itr:bus200List2){
					
					String data=itr.displayBusStringWithStops();
					
					textArea_2_1.append(data);
				
			}
			JOptionPane.showMessageDialog(null, "!ALL Bus200 Display!!");
				
			}
		});
		btnNewButton_8_1.setBounds(228, 123, 97, 25);
		panel_11.add(btnNewButton_8_1);
		
		JLabel lblNewLabel_21_1 = new JLabel("Display");
		lblNewLabel_21_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_21_1.setBounds(242, 159, 59, 19);
		panel_11.add(lblNewLabel_21_1);
		
		
		textArea_2_1.setLineWrap(true);
		
		JButton btnNewButton_7_1 = new JButton("Reset");
		btnNewButton_7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea_2_1.setText("");
				JOptionPane.showMessageDialog(null, "!Display Cleared!!");
			}
		});
		btnNewButton_7_1.setBounds(447, 143, 97, 25);
		panel_11.add(btnNewButton_7_1);
		
		
		panel_11.add(textArea_2_1);
		
		JButton btnNewButton_9_1 = new JButton("Back");
		btnNewButton_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				secondpage sp=new secondpage(user);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_9_1.setBounds(242, 491, 97, 25);
		panel_11.add(btnNewButton_9_1);
		
		JButton button_1 = new JButton("Display with Stops");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String s1=comboBox_8.getSelectedItem().toString();
				int busno=Integer.parseInt(s1);
				
				for(Bus200 itr:bus200List2){
					
					if(busno==itr.busNo)
					{
			
						
						String data=itr.displayBusStringWithStops();
						
						textArea_2_1.append(data);
						
						JOptionPane.showMessageDialog(null, busno+"!Bus200 Display!!");
						

					}
				}
				
			}
		});
		button_1.setBounds(180, 86, 172, 24);
		panel_11.add(button_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Bus201", null, panel_2, null);
		panel_2.setLayout(null);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.setBounds(10, 10, 575, 600);
		panel_2.add(tabbedPane_3);
		
		JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_4.setBackground(Color.PINK);
		//tabbedPane_3.addTab("Add BUS201", null, tabbedPane_4, null);
		
		JPanel panel_8_1 = new JPanel();
		panel_8_1.setLayout(null);
		panel_8_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_8_1.setBackground(UIManager.getColor("Button.background"));
		//tabbedPane_4.addTab("New tab", null, panel_8_1, null);
		
		JLabel lblNewLabel_33 = new JLabel("BusNo");
		lblNewLabel_33.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_33.setBounds(59, 40, 56, 16);
		panel_8_1.add(lblNewLabel_33);
		
		JLabel lblNewLabel_23_1 = new JLabel("BusType");
		lblNewLabel_23_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_23_1.setBounds(59, 89, 72, 16);
		panel_8_1.add(lblNewLabel_23_1);
		
		JLabel lblNewLabel_24_1 = new JLabel("NoOfSeats");
		lblNewLabel_24_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_24_1.setBounds(59, 138, 87, 16);
		panel_8_1.add(lblNewLabel_24_1);
		
		JLabel lblNewLabel_25_1 = new JLabel("BusCapacity");
		lblNewLabel_25_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_25_1.setBounds(59, 182, 87, 19);
		panel_8_1.add(lblNewLabel_25_1);
		
		JLabel lblNewLabel_26_1 = new JLabel("BusLength");
		lblNewLabel_26_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_26_1.setBounds(316, 40, 81, 16);
		panel_8_1.add(lblNewLabel_26_1);
		
		JLabel lblNewLabel_27_1 = new JLabel("FromStation");
		lblNewLabel_27_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_27_1.setBounds(316, 89, 92, 16);
		panel_8_1.add(lblNewLabel_27_1);
		
		JLabel lblNewLabel_28_1 = new JLabel("ToStation");
		lblNewLabel_28_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_28_1.setBounds(316, 138, 81, 16);
		panel_8_1.add(lblNewLabel_28_1);
		
		textField_17 = new JTextField();
		textField_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_17.setColumns(10);
		textField_17.setBounds(149, 38, 116, 22);
		panel_8_1.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(149, 136, 116, 22);
		panel_8_1.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(149, 181, 116, 22);
		panel_8_1.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(420, 38, 116, 22);
		panel_8_1.add(textField_20);
		
		JComboBox comboBox_9_1 = new JComboBox();
		comboBox_9_1.setBounds(149, 87, 116, 18);
		panel_8_1.add(comboBox_9_1);
		
		JComboBox comboBox_12_1 = new JComboBox();
		comboBox_12_1.setBounds(420, 87, 105, 18);
		panel_8_1.add(comboBox_12_1);
		
		JComboBox comboBox_13_1 = new JComboBox();
		comboBox_13_1.setBounds(420, 136, 105, 22);
		panel_8_1.add(comboBox_13_1);
		
		JLabel lblNewLabel_29_1 = new JLabel("Bus200Type");
		lblNewLabel_29_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_29_1.setBounds(59, 248, 92, 22);
		panel_8_1.add(lblNewLabel_29_1);
		
		JComboBox comboBox_14_1 = new JComboBox();
		comboBox_14_1.setBounds(163, 249, 105, 21);
		panel_8_1.add(comboBox_14_1);
		
		JButton btnNewButton_10_1 = new JButton("Create Bus200");
		btnNewButton_10_1.setBounds(316, 245, 174, 25);
		panel_8_1.add(btnNewButton_10_1);
		
		JLabel lblNewLabel_30_1 = new JLabel("Display");
		lblNewLabel_30_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_30_1.setBounds(265, 317, 65, 19);
		panel_8_1.add(lblNewLabel_30_1);
		
		JTextArea textArea_4_1 = new JTextArea();
		textArea_4_1.setBounds(59, 353, 466, 112);
		panel_8_1.add(textArea_4_1);
		
		JButton btnNewButton_11_1 = new JButton("Back");
		btnNewButton_11_1.setBounds(243, 502, 97, 25);
		panel_8_1.add(btnNewButton_11_1);
		
		JPanel panel_3_1 = new JPanel();
		tabbedPane_3.addTab("Add BUS201", null, panel_3_1, null);
		panel_3_1.setLayout(null);
		panel_3_1.setBackground(new Color(51, 204, 255));
		
		JLabel lblNewLabel_1_1 = new JLabel("BusNo");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(35, 58, 87, 23);
		panel_3_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("BusType");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(33, 94, 91, 23);
		panel_3_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("NoOfSeats");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3_1.setBounds(35, 136, 89, 23);
		panel_3_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("BusCapacity");
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_4_1.setBounds(35, 176, 89, 23);
		panel_3_1.add(lblNewLabel_4_1);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(126, 59, 116, 22);
		panel_3_1.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(126, 137, 116, 22);
		panel_3_1.add(textField_23);
		
		JComboBox comboBox_16 = new JComboBox();
		comboBox_16.setModel(new DefaultComboBoxModel(new String[] {"201"}));
		comboBox_16.setBounds(126, 95, 116, 23);
		panel_3_1.add(comboBox_16);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(126, 177, 116, 22);
		panel_3_1.add(textField_24);
		
		JLabel lblNewLabel_5_1 = new JLabel("BusLength");
		lblNewLabel_5_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_5_1.setBounds(273, 62, 91, 19);
		panel_3_1.add(lblNewLabel_5_1);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(389, 59, 116, 22);
		panel_3_1.add(textField_25);
		
		JLabel lblNewLabel_6_1 = new JLabel("FromStation");
		lblNewLabel_6_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_6_1.setBounds(273, 107, 91, 20);
		panel_3_1.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("ToStation");
		lblNewLabel_7_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_7_1.setBounds(273, 143, 91, 23);
		panel_3_1.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("Bus201Type");
		lblNewLabel_8_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_8_1.setBounds(35, 258, 89, 23);
		panel_3_1.add(lblNewLabel_8_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"B-D", "B-U"}));
		comboBox_1_1.setBounds(136, 259, 106, 23);
		panel_3_1.add(comboBox_1_1);
		
		JComboBox comboBox_10_1 = new JComboBox();
		comboBox_10_1.setModel(new DefaultComboBoxModel(new String[] {"Dharwad New Bus Stop", "Railway Station "}));
		comboBox_10_1.setBounds(389, 107, 116, 23);
		
		JComboBox comboBox_11_1 = new JComboBox();
		comboBox_11_1.setModel(new DefaultComboBoxModel(new String[] {"Railway Station ", "Dharwad New Bus Stop"}));
		comboBox_11_1.setBounds(389, 144, 116, 22);
		
		JTextArea textArea_7 = new JTextArea();
		textArea_7.setBounds(78, 352, 384, 112);
		textArea_7.setLineWrap(true);
		
		JButton btnNewButton_15 = new JButton("CreateBus201");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String s1=textField_22.getText();
				int busno=Integer.parseInt(textField_22.getText());
				String btype=comboBox.getSelectedItem().toString();
				String s2=textField_23.getText();
				String s3=textField_24.getText();
				String s4=textField_25.getText();
				int seats=Integer.parseInt(textField_23.getText());
				int capacity=Integer.parseInt(textField_24.getText());
				int length=Integer.parseInt(textField_25.getText());
			
				String from=comboBox_10_1.getSelectedItem().toString();
				String to=comboBox_11_1.getSelectedItem().toString();
				String type201=comboBox_1_1.getSelectedItem().toString();
				
				if(user=="Admin")
				{
					JOptionPane.showMessageDialog(null, "You are an authorized user!");
				
				try {
					int flag=0;
					for(Bus201 itr:bus201List2) {
						if(busno==itr.busNo && btype==itr.busType) {
							flag=1;
						}
					}
					if(flag==1) {
						throw new DuplicateItemException(1234,"Bus201 No already exists!");
					}
					else {
						bus201List2.add(new Bus201(busno,btype,seats,length,capacity,from,to,type201));
						
						comboBox_15_1.addItem(busno);
						comboBox_3_1_1.addItem(busno);
						comboBox_8_2.addItem(busno);

						JOptionPane.showMessageDialog(null, "New Bus201 Added!");
						textArea_7.append(" Bus201 added with BusNo"+busno+"\n");
					}
				}
				catch(DuplicateItemException die){
					JOptionPane.showMessageDialog(null, "Duplicate Bus201 No !");
					die.showError();
					textArea_7.setLineWrap(true);
					
					textArea_7.append("Duplicate Element!\n");
				}
				
			}
			else {
				JOptionPane.showMessageDialog(null, "You are not authorized!");
			}
			}
		});
		btnNewButton_15.setBounds(324, 253, 181, 34);
		panel_3_1.add(btnNewButton_15);
		
		
		panel_3_1.add(textArea_7);
		
		JLabel lblNewLabel_9_1 = new JLabel("Display");
		lblNewLabel_9_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_9_1.setBounds(240, 319, 87, 20);
		panel_3_1.add(lblNewLabel_9_1);
		
		JButton btnNewButton_1_1 = new JButton("Back");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				secondpage sp=new secondpage(user);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_1_1.setBounds(219, 477, 97, 25);
		panel_3_1.add(btnNewButton_1_1);
		
		
		panel_3_1.add(comboBox_10_1);
		
		
		panel_3_1.add(comboBox_11_1);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(153, 204, 153));
		tabbedPane_3.addTab("Update Bus201", null, panel_14, null);
		panel_14.setLayout(null);
		
		JPanel panel_10_1 = new JPanel();
		panel_10_1.setLayout(null);
		panel_10_1.setBackground(new Color(153, 255, 102));
		panel_10_1.setBounds(0, 0, 570, 573);
		panel_14.add(panel_10_1);
		
		JTextArea textArea_1_1_1 = new JTextArea();
		textArea_1_1_1.setBounds(66, 316, 438, 106);
		panel_10_1.add(textArea_1_1_1);
		
		JComboBox comboBox_5_1_1 = new JComboBox();
		comboBox_5_1_1.setModel(new DefaultComboBoxModel(new String[] {"B-D", "B-U"}));
		comboBox_5_1_1.setBounds(156, 194, 116, 22);
		
		JComboBox comboBox_6_1_1 = new JComboBox();
		comboBox_6_1_1.setModel(new DefaultComboBoxModel(new String[] {"Dharwad New Bus Stop", "Railway Station "}));
		comboBox_6_1_1.setBounds(391, 76, 116, 22);
		
		JComboBox comboBox_7_1_1 = new JComboBox();
		comboBox_7_1_1.setModel(new DefaultComboBoxModel(new String[] {"Railway Station ", "Dharwad New Bus Stop"}));
		comboBox_7_1_1.setBounds(391, 127, 116, 22);
		
		JButton btnNewButton_4_1_1 = new JButton("Update Bus201");
		btnNewButton_4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String s1=comboBox_3_1_1.getSelectedItem().toString();
				int busno=Integer.parseInt(s1);
				String btype=comboBox.getSelectedItem().toString();
				String s2=textField_14.getText();
				String s3=textField_15.getText();
				String s4=textField_16.getText();
				int seats=Integer.parseInt(textField_14.getText());
				int capacity=Integer.parseInt(textField_15.getText());
				int length=Integer.parseInt(textField_16.getText());
			
				String from=comboBox_6_1_1.getSelectedItem().toString();
				String to=comboBox_7_1_1.getSelectedItem().toString();
				String type201=comboBox_5_1_1.getSelectedItem().toString();
				
				if(user=="Admin")
				{
					JOptionPane.showMessageDialog(null, "You are an authorized user!");
				
				for(Bus201 itr:bus201List2) {
					if(busno==itr.busNo)
					{
						itr.busType=btype;
						itr.busCapacity=capacity;
						itr.busLength=length;
						itr.noOfSeats=seats;
						itr.fromStation=from;
						itr.toStation=to;
						itr.bus201Type=type201;
						textArea_1_1_1.append(busno+" !Updated Bus201!\n");
						JOptionPane.showMessageDialog(null, "BusNo: "+busno+" !Updated Bus201!!");
					}
				}
				}
				else {
					JOptionPane.showMessageDialog(null, "You are not authorized!");
				}
				
			}
		});
		btnNewButton_4_1_1.setBounds(337, 190, 134, 30);
		panel_10_1.add(btnNewButton_4_1_1);
		
		
		panel_10_1.add(comboBox_7_1_1);
		
		
		panel_10_1.add(comboBox_6_1_1);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(156, 76, 116, 22);
		panel_10_1.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(156, 127, 116, 22);
		panel_10_1.add(textField_15);
		
		
		panel_10_1.add(comboBox_5_1_1);
		
		JLabel lblNewLabel_18_1_1 = new JLabel("Bus100Type");
		lblNewLabel_18_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_18_1_1.setBounds(54, 193, 99, 23);
		panel_10_1.add(lblNewLabel_18_1_1);
		
		JLabel lblNewLabel_14_1_1 = new JLabel("BusCapacity");
		lblNewLabel_14_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_14_1_1.setBounds(54, 127, 98, 24);
		panel_10_1.add(lblNewLabel_14_1_1);
		
		JLabel lblNewLabel_17_1_1 = new JLabel("ToStation");
		lblNewLabel_17_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_17_1_1.setBounds(298, 130, 81, 15);
		panel_10_1.add(lblNewLabel_17_1_1);
		
		JLabel lblNewLabel_16_1_1 = new JLabel("FromStation");
		lblNewLabel_16_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_16_1_1.setBounds(297, 74, 82, 24);
		panel_10_1.add(lblNewLabel_16_1_1);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(391, 28, 116, 22);
		panel_10_1.add(textField_16);
		
		JLabel lblNewLabel_15_1_1 = new JLabel("Bus Length");
		lblNewLabel_15_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_15_1_1.setBounds(297, 31, 82, 19);
		panel_10_1.add(lblNewLabel_15_1_1);
		
		
		panel_10_1.add(comboBox_3_1_1);
		
		JLabel lblNewLabel_11_1_1 = new JLabel("BusNo");
		lblNewLabel_11_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_11_1_1.setBounds(54, 27, 99, 23);
		panel_10_1.add(lblNewLabel_11_1_1);
		
		JLabel lblNewLabel_13_1_1 = new JLabel("No Of Seats");
		lblNewLabel_13_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_13_1_1.setBounds(54, 78, 82, 16);
		panel_10_1.add(lblNewLabel_13_1_1);
		
		JButton btnNewButton_16 = new JButton("Back");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				secondpage sp=new secondpage(user);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_16.setBounds(235, 479, 97, 25);
		panel_10_1.add(btnNewButton_16);
		
		JLabel lblNewLabel_35 = new JLabel("Display");
		lblNewLabel_35.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_35.setBounds(235, 274, 59, 29);
		panel_10_1.add(lblNewLabel_35);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(204, 51, 255));
		tabbedPane_3.addTab("Remove Bus201", null, panel_13, null);
		panel_13.setLayout(null);
		
		JPanel panel_9_1 = new JPanel();
		panel_9_1.setLayout(null);
		panel_9_1.setBackground(new Color(153, 204, 153));
		panel_9_1.setBounds(0, 0, 570, 573);
		panel_13.add(panel_9_1);
		
		JLabel lblNewLabel_31_1 = new JLabel("BusNo");
		lblNewLabel_31_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_31_1.setBounds(164, 83, 85, 30);
		panel_9_1.add(lblNewLabel_31_1);
		
		
		panel_9_1.add(comboBox_15_1);
		
		JButton btnNewButton_12_1 = new JButton("Remove");
		btnNewButton_12_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String s1=comboBox_15_1.getSelectedItem().toString();
				int busno=Integer.parseInt(s1);
				
				if(user=="Admin")
				{
					JOptionPane.showMessageDialog(null, "You are an authorized user!");
					for(Bus201 itr:bus201List2){
					
					if(busno==itr.busNo)
					{
						bus200List2.remove(comboBox_15_1);
						textArea_5.append("Busno: "+busno+" !of Bus201 Removed!\n");
						JOptionPane.showMessageDialog(null, "Busno: "+busno+"!of Bus201 Removed!!");
						
						comboBox_15_1.removeItem(busno);
						comboBox_3_1_1.removeItem(busno);
						comboBox_8_2.removeItem(busno);

					}
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "You are not authorized!");
			}
				
			}
		});
		btnNewButton_12_1.setBounds(228, 147, 97, 25);
		panel_9_1.add(btnNewButton_12_1);
		
		JLabel lblNewLabel_32_1 = new JLabel("Display");
		lblNewLabel_32_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_32_1.setBounds(251, 239, 62, 22);
		panel_9_1.add(lblNewLabel_32_1);
		
		JTextArea textArea_5_1 = new JTextArea();
		textArea_5_1.setBounds(100, 274, 383, 115);
		panel_9_1.add(textArea_5_1);
		
		JButton btnNewButton_13_1 = new JButton("Back");
		btnNewButton_13_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				secondpage sp=new secondpage(user);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
			
		});
		btnNewButton_13_1.setBounds(238, 441, 97, 25);
		panel_9_1.add(btnNewButton_13_1);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(new Color(204, 255, 51));
		tabbedPane_3.addTab("Display Bus201", null, panel_15, null);
		panel_15.setLayout(null);
		
		JPanel panel_7_1 = new JPanel();
		panel_7_1.setLayout(null);
		panel_7_1.setBackground(new Color(153, 255, 204));
		panel_7_1.setBounds(0, 0, 570, 640);
		panel_15.add(panel_7_1);
		
		JLabel lblNewLabel_20_2 = new JLabel("BusNo");
		lblNewLabel_20_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_20_2.setBounds(151, 33, 99, 24);
		panel_7_1.add(lblNewLabel_20_2);
		
	
		panel_7_1.add(comboBox_8_2);
		
		
		JTextArea textArea_2_2 = new JTextArea();
		textArea_2_2.setBounds(12, 210, 546, 217);
		textArea_2_2.setLineWrap(true);
		
		JButton btnNewButton_6_2 = new JButton("Display");
		btnNewButton_6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String s1=comboBox_8_2.getSelectedItem().toString();
				int busno=Integer.parseInt(s1);
				
				for(Bus201 itr:bus201List2){
					
					if(busno==itr.busNo)
					{
			
						
						String data=itr.displayBusString();
						
						textArea_2_2.append(data);
						
						JOptionPane.showMessageDialog(null, busno+"!Bus201 Display!!");
						

					}
				}
				
				
				
			}
		});
		btnNewButton_6_2.setBounds(211, 70, 97, 25);
		panel_7_1.add(btnNewButton_6_2);
		
		JLabel lblNewLabel_21_2 = new JLabel("Display");
		lblNewLabel_21_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_21_2.setBounds(229, 178, 59, 19);
		panel_7_1.add(lblNewLabel_21_2);
		
		
		panel_7_1.add(textArea_2_2);
		
		JButton btnNewButton_7_2 = new JButton("Reset");
		btnNewButton_7_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textArea_2_2.setText("");
				JOptionPane.showMessageDialog(null, "!Display Cleared!!");
			}
		});
		btnNewButton_7_2.setBounds(449, 176, 97, 25);
		panel_7_1.add(btnNewButton_7_2);
		
		JButton btnNewButton_8_2 = new JButton("Display All");
		btnNewButton_8_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				for(Bus201 itr:bus201List2) {
					
						String data=itr.displayBusString();
						
						textArea_2_2.append(data);
						
							
					
				}
				JOptionPane.showMessageDialog(null, "!Bus201 Display!!");	
				
				
			}
		});
		btnNewButton_8_2.setBounds(211, 145, 97, 25);
		panel_7_1.add(btnNewButton_8_2);
		
		JButton btnNewButton_9_2 = new JButton("Back");
		btnNewButton_9_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				secondpage sp=new secondpage(user);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_9_2.setBounds(229, 440, 97, 25);
		panel_7_1.add(btnNewButton_9_2);
		
		JButton button_2 = new JButton("Display with Stops");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String s1=comboBox_8_2.getSelectedItem().toString();
				int busno=Integer.parseInt(s1);
				
				for(Bus201 itr:bus201List2){
					
					if(busno==itr.busNo)
					{
			
						
						String data=itr.displayBusStringWithStops();
						
						textArea_2_2.append(data);
						
						
						

					}
					
				}	
				JOptionPane.showMessageDialog(null, busno+"!Bus201 Display!!");
						
			}
		});
		button_2.setBounds(178, 108, 172, 24);
		panel_7_1.add(button_2);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(153, 204, 204));
		tabbedPane.addTab("Display All", null, panel_6, null);
		panel_6.setLayout(null);
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setBounds(260, 73, -89, 22);
		panel_6.add(textArea_6);
		
		JTextArea textArea_8 = new JTextArea();
		textArea_8.setBounds(12, 86, 576, 485);
		textArea_8.setLineWrap(true);
		
		JButton btnNewButton_14 = new JButton("DISPLAY ALL");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 Class c=Class.forName(args[0]);  
		         BusC bus=(BusC) c.newInstance();  
		         textArea_8.append(bus.templateDisplay()); 
				
			}
		});
		btnNewButton_14.setBounds(226, 51, 134, 22);
		panel_6.add(btnNewButton_14);
		
		
		panel_6.add(textArea_8);
		
		
		//JScrollPane sp= new JScrollPane(textArea_8, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		//contentPane.add(sp);
		
		JButton btnNewButton_17 = new JButton("Reset");
		btnNewButton_17.setBounds(491, 50, 97, 25);
		panel_6.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("Back");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				secondpage sp=new secondpage(user);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_18.setBounds(263, 599, 97, 25);
		panel_6.add(btnNewButton_18);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(255, 250, 205));
		tabbedPane.addTab("Add Bus", null, panel_12, null);
		panel_12.setLayout(null);
		
		JLabel lblNewLabel_34 = new JLabel("Select Bus To Add");
		lblNewLabel_34.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_34.setBounds(73, 60, 194, 36);
		panel_12.add(lblNewLabel_34);
		
		JComboBox comboBox_17 = new JComboBox();
		comboBox_17.setModel(new DefaultComboBoxModel(new String[] {"Bus100", "Bus200", "Bus201"}));
		comboBox_17.setBounds(309, 67, 159, 27);
		panel_12.add(comboBox_17);
		
		JTextArea textArea_9 = new JTextArea();
		textArea_9.setBounds(73, 229, 475, 293);
		textArea_9.setLineWrap(true);
		
		JButton btnNewButton_19 = new JButton("Add");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String s1=comboBox_17.getSelectedItem().toString();
				
				BusFactory busFactory = new BusFactory();
		        BusC bus = busFactory.createBus(s1);
		        String s=bus.displayBusString();
				
		        JOptionPane.showMessageDialog(null, "New Bus of type "+s1+"Created by Factory!!");
		        textArea_9.append(s);
			}
		});
		btnNewButton_19.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_19.setBounds(221, 126, 119, 36);
		panel_12.add(btnNewButton_19);
		
		JLabel lblNewLabel_36 = new JLabel("  Display");
		lblNewLabel_36.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_36.setBounds(237, 189, 76, 27);
		panel_12.add(lblNewLabel_36);
		
		
		panel_12.add(textArea_9);
		
		JButton btnNewButton_20 = new JButton("Back");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				secondpage sp=new secondpage(user);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_20.setBounds(265, 535, 97, 25);
		panel_12.add(btnNewButton_20);
		
		JButton btnNewButton_22 = new JButton("Reset");
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textArea_9.setText("");
				JOptionPane.showMessageDialog(null, "Display Cleared!!");
			}
		});
		btnNewButton_22.setBounds(451, 191, 97, 25);
		panel_12.add(btnNewButton_22);
	}

}