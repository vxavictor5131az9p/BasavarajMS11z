package cppackage;

import java.awt.BorderLayout;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;

class Branch
{
    String branchId;
    String branchName;
    String branchLocation;
    String branchState;
    String branchOpYear;
  
    ArrayList<GreenBRTSC> eventList=new ArrayList<GreenBRTSC>();      //Branch has event GreenBRTS
    ArrayList<CompanyEmployee> employeeList= new ArrayList<CompanyEmployee>();//Branch has company employees
    ArrayList<StationC> stationList=new ArrayList<StationC>();              //Branch own stations                    
    ArrayList<Bus100> bus100List=new ArrayList<Bus100>();
    ArrayList<Bus200> bus200List=new ArrayList<Bus200>();
    ArrayList<Bus201> bus201List=new ArrayList<Bus201>();

    Branch()
    {
        branchId="";
        branchName="";
        branchLocation="";
        branchState="";
        branchOpYear="";


    }
    Branch(String bid,String bname,String bloc,String bs,String boy)
    {
        branchId=bid;
        branchName=bname;
        branchLocation=bloc;
        branchState=bs;
        branchOpYear=boy;
       
    }
   
    void displayBranch(int a,int b,int c,int d,int e,int f)
    {
        //cout<<"\nDisplay Branch..........."<<endl;
        //cout<<"Branch ID:"<<branchId<<"\tBranch Name:"<<branchName<<"\tBranch Location:"<<branchLocation<<"\tBranch State:"<<branchState<<"\tOpening year:"<<branchOpYear<<endl;
        //showGreenBRTS(a);
        //showCompEmp(b);
        //showStation(c);
        //showBus(d,e,f);
    }
    
    String displayBranch() {
    	return " Branch ID:"+branchId+" Branch Name:"+branchName+" Branch Location:"+branchLocation+" Branch State:"+branchState+" Opening year:"+branchOpYear;
    }
	public void add(GreenBRTSC greenBRTSC) {
		// TODO Auto-generated method stub
		
	}
}


public class secondpage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					secondpage frame = new secondpage();
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
	public secondpage(String user) {
		
		Branch hdbrts=new Branch("BRTS014","CHIGARI","Hubli-Dharwad","Karnataka","2018");
		
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setPreferredSize(new Dimension(600,600));
		//pack();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("     Menu");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblNewLabel.setBounds(219, 13, 147, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(153, 72, 92, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Display");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBounds(288, 621, 90, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Station");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3.setBounds(153, 140, 56, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Bus");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_4.setBounds(153, 191, 92, 22);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("GreenBRTS");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_5.setBounds(153, 239, 92, 22);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Employee");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				employee e=new employee(hdbrts.employeeList,user);
				e.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		btnNewButton.setBounds(330, 72, 120, 28);
		contentPane.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(56, 650, 529, 77);
		textArea.setLineWrap(true);
		JButton btnNewButton_1 = new JButton("Display Branch");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String data=hdbrts.displayBranch();
				JOptionPane.showMessageDialog(null, "Display Branch!");
				textArea.append(data);
				
			}
		});
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		btnNewButton_1.setBounds(248, 564, 147, 39);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Station");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				station s=new station(hdbrts.stationList,user);
				s.setVisible(true);
				setVisible(false);
				dispose();
			}
			
		});
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		btnNewButton_2.setBounds(330, 132, 120, 32);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Bus");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bus b=new bus(hdbrts.bus100List,hdbrts.bus200List,hdbrts.bus201List,user);
				b.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_3.setBackground(Color.ORANGE);
		btnNewButton_3.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		btnNewButton_3.setBounds(330, 191, 120, 22);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("GreenBRTS");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				greenBRTS g=new greenBRTS(hdbrts.eventList,user);
				g.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_4.setBackground(Color.ORANGE);
		btnNewButton_4.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		btnNewButton_4.setBounds(330, 239, 120, 22);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Back");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstpage fp=new firstpage();
				fp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_5.setBackground(Color.ORANGE);
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_5.setBounds(248, 289, 97, 25);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		ImageIcon img= new ImageIcon(this.getClass().getResource("/bus4.jpg"));
		lblNewLabel_6.setIcon(img);
		lblNewLabel_6.setBounds(12, 347, 608, 204);
		contentPane.add(lblNewLabel_6);
		
		
		contentPane.add(textArea);
	}
}
