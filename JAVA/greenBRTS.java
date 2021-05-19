package cppackage;

import java.awt.BorderLayout;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import java.awt.*;
import javax.swing.DefaultComboBoxModel;

import java.util.Collections;

class GreenBRTSC
{
    String plantnPhase;
    String year;
    int noOfPlants;
    String plantedPlace;

    GreenBRTSC()
    {
        plantnPhase="";
        year="";
        noOfPlants=0;
        plantedPlace="";

    }

    GreenBRTSC(String pp,String y,int n,String p)
    {
        this.plantnPhase=pp;
        this.year=y;
        this.noOfPlants=n;
        this.plantedPlace=p;
       // countevent+=1;

    }

    void displayGreenBRTS()
    {
    	System.out.println("\nGreen BRTS.....................");
    	System.out.println("Plantation Phase:"+plantnPhase+"\tYear:"+year+"\tNumber of Plants:"+noOfPlants+"\tPlanted Location:"+plantedPlace);
    }
    
	public String toString() {
		return " Plantation Phase:"+plantnPhase+" Year:"+year+" Number of Plants:"+noOfPlants+" Planted Location:"+plantedPlace+"\n";
	}

}

public class greenBRTS extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 * @param user 
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					greenBRTS frame = new greenBRTS();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 * @param eventList2 
	 */
	public greenBRTS(ArrayList<GreenBRTSC> eventList2, String user) {
		
		
		//ArrayList<GreenBRTSC> eventList = new ArrayList<>();
		eventList2.add(new GreenBRTSC("Phase1","2013-14",8000,"58 DifferentSchools/Institutions"));
		eventList2.add(new GreenBRTSC("Phase2","2014-15",4000,"Tapovana"));
		eventList2.add(new GreenBRTSC("Phase3","2015-16",4000,"STP,Nrupatunga Betta"));
		eventList2.add(new GreenBRTSC("Phase4","2016-17",2000,"Navalur Betta"));
		eventList2.add(new GreenBRTSC("Phase5","2018-19",9510,"Sanjivini Park, BRTScorridor's and other workspaces"));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEditable(true);
		comboBox_1.setBounds(331, 53, 107, 22);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setEditable(true);
		comboBox_2.setBounds(331, 64, 116, 25);
		
		
		for(GreenBRTSC itr:eventList2) {
			comboBox_1.addItem(itr.plantnPhase);
			comboBox_2.addItem(itr.plantnPhase);
		}
		
		setTitle("GreenBRTS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 51));
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
		tabbedPane.addTab("Add Event", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Plantation Phase");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(103, 49, 124, 19);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(299, 48, 116, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Year");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(103, 98, 89, 19);
		panel.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"2013-14", "2014-15", "2015-16", "2016-17", "2017-18", "2018-19", "2019-20", "2020-21"}));
		comboBox.setBounds(299, 98, 116, 20);
		panel.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("No Of Plants");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setBounds(103, 145, 94, 19);
		panel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(299, 144, 116, 22);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Planted Place");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3.setBounds(111, 191, 116, 22);
		panel.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(299, 192, 116, 22);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(89, 336, 416, 122);
		textArea_1.setLineWrap(true);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(user=="Admin")
				{
					JOptionPane.showMessageDialog(null, "You are an authorized user!");
				String year=comboBox.getSelectedItem().toString();
				String s1=textField.getText();
				String s2=textField_1.getText();
				String s3=textField_2.getText();
				int plants=Integer.parseInt(textField_1.getText());
				
				eventList2.add(new GreenBRTSC(s1,year,plants,s3));
				JOptionPane.showMessageDialog(null, "!Event Added !!");
				textArea_1.append("!Event Added........ !!\n");
				
				comboBox_1.addItem(s1);
				comboBox_2.addItem(s1);
				}
				else {
					JOptionPane.showMessageDialog(null, "You are not authorized!");
				}
			}
		});
		btnNewButton.setBounds(238, 244, 97, 25);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				secondpage sp=new secondpage(user);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_1.setBounds(238, 494, 97, 25);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_8 = new JLabel("    Display");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_8.setBounds(238, 301, 89, 19);
		panel.add(lblNewLabel_8);
		
		
		panel.add(textArea_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(144, 238, 144));
		tabbedPane.addTab("Display", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Plantation Phase");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_6.setBounds(105, 49, 124, 29);
		panel_2.add(lblNewLabel_6);
		
		
		panel_2.add(comboBox_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(36, 280, 509, 181);
		textArea.setLineWrap(true);
		
		JButton btnNewButton_2 = new JButton("Display");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String phase=comboBox_1.getSelectedItem().toString();
				
				ArrayList<String> phasename=new ArrayList<String>();
				//int pos=Collections.binarySearch(eventLis, arg1)
				for(GreenBRTSC itr:eventList2) {
					if(phase.equals(itr.plantnPhase))
					{
						String data=itr.toString();
						textArea.append(data);
						
					}
				}
			}
		});
		btnNewButton_2.setBounds(230, 114, 97, 25);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Display All");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				for(GreenBRTSC itr:eventList2) {
	
						String data=itr.toString();
						textArea.append(data);
						
					
				}
			}
		});
		btnNewButton_3.setBounds(218, 182, 124, 29);
		panel_2.add(btnNewButton_3);
		
		
		panel_2.add(textArea);
		
		JLabel lblNewLabel_7 = new JLabel("Display");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_7.setBounds(36, 245, 84, 22);
		panel_2.add(lblNewLabel_7);
		
		JButton btnNewButton_4 = new JButton("Back");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				secondpage sp=new secondpage(user);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_4.setBounds(252, 485, 97, 25);
		panel_2.add(btnNewButton_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(154, 205, 50));
		tabbedPane.addTab("Update Event", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Plantation Phase");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_4.setBounds(102, 60, 129, 30);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New Number of Plants");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_5.setBounds(58, 117, 173, 30);
		panel_1.add(lblNewLabel_5);
		
		
		panel_1.add(comboBox_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(331, 122, 116, 22);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("Update");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String phase=comboBox_2.getSelectedItem().toString();
				String s2=textField_3.getText();
				int plants=Integer.parseInt(textField_3.getText());
				
				if(user=="Admin")
				{
					JOptionPane.showMessageDialog(null, "You are an authorized user!");
				
				for(GreenBRTSC itr:eventList2) {
					if(phase.equals(itr.plantnPhase))
					{
						//String data=itr.toString();
						//textArea.append(data);
						itr.noOfPlants=plants;
						JOptionPane.showMessageDialog(null, "!Event Updated by number of plants!!!");
						
					}
				}
				}
				else {
					JOptionPane.showMessageDialog(null, "You are not authorized!");
				}
				
			}
		});
		btnNewButton_5.setBounds(227, 188, 97, 25);
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Back");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				secondpage sp=new secondpage(user);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_6.setBounds(227, 265, 97, 25);
		panel_1.add(btnNewButton_6);
	}
}
