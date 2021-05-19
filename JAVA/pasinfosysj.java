package cppackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

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
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class pasinfosysj extends JFrame {

	private JPanel contentPane;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pasinfosysj frame = new pasinfosysj();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 * @param scode 
	 * @param stationList 
	 */
	public pasinfosysj(ArrayList<StationC> stationList, String scode) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(221, 160, 221));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setPreferredSize(new Dimension(600,600));
		//pack();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setEditable(true);
		comboBox_4.setBounds(295, 116, 82, 25);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setEditable(true);
		comboBox_6.setBounds(296, 92, 101, 21);
		
		for(StationC itr:stationList) {
			if(scode.equals(itr.stationCode))
			{
				for(PasInfSys pitr:itr.pasInfSys)
				{
					comboBox_4.addItem(pitr.infoId);
					comboBox_6.addItem(pitr.infoId);
				}
				/*
				itr.pasInfSys.add(new PasInfSys(s17,s15,s16,arrin,busname));
				JOptionPane.showMessageDialog(null, "!Passenger Info System Added to "+scode +"Station!!");
				textArea.append("!Passenger Info System Added to "+scode +"Station!!\n");*/
			}
		}
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 13, 608, 557);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(219, 112, 147));
		tabbedPane.addTab("Add Info", null, panel, null);
		
		JLabel label = new JLabel("ArrivalFrom");
		label.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label.setBounds(67, 108, 104, 25);
		panel.add(label);
		
		JLabel label_1 = new JLabel("DestinationTo");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_1.setBounds(67, 146, 104, 25);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("ArrivingIn");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_2.setBounds(67, 194, 104, 16);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("BusName");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_3.setBounds(67, 234, 104, 25);
		panel.add(label_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"5", "10", "15", "20", "25", "30"}));
		comboBox.setBounds(183, 187, 116, 25);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"200A", "200C", "201B", "201D", "100D"}));
		comboBox_1.setBounds(183, 235, 116, 25);
		panel.add(comboBox_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setBounds(321, 72, 183, 240);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"Dharwad-New-Bus-Stop ", "Dharwad-Terminal ", "OCBC ", "Railway Station "}));
		comboBox_7.setBounds(183, 147, 116, 25);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Dharwad-New-Bus-Stop ", "Dharwad-Terminal ", "OCBC ", "Railway Station "}));
		comboBox_2.setBounds(183, 109, 116, 25);
		
		JButton button = new JButton("Add");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//String scode=comboBox_13.getSelectedItem().toString();
				String s17=textField_2.getText();
				String s15=comboBox_2.getSelectedItem().toString();
				String s16=comboBox_7.getSelectedItem().toString();
				String arrinstring=comboBox.getSelectedItem().toString();
				int arrin=Integer.parseInt(arrinstring);
				String busname=comboBox_1.getSelectedItem().toString();
				
				for(StationC itr:stationList) {
					if(scode.equals(itr.stationCode))
					{
						
						itr.pasInfSys.add(new PasInfSys(s17,s15,s16,arrin,busname));
						JOptionPane.showMessageDialog(null,s17+ "!Passenger Info System Added to "+scode +"Station!!");
						textArea.append(s17+"!Passenger Info System Added to "+scode +"Station!!\n");
						comboBox_4.addItem(s17);
						comboBox_6.addItem(s17);
					}
				}
			}
		});
		button.setBounds(118, 287, 97, 25);
		panel.add(button);
		
		JButton button_1 = new JButton("Back");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				passengerj sp=new passengerj(stationList,scode);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		button_1.setBounds(118, 338, 97, 25);
		panel.add(button_1);
		
		JLabel label_4 = new JLabel("InfoId");
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_4.setBounds(67, 70, 91, 25);
		panel.add(label_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(183, 72, 116, 22);
		panel.add(textField_2);
		
		JLabel label_6 = new JLabel("Display");
		label_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_6.setBounds(382, 27, 66, 24);
		panel.add(label_6);
		
		
		panel.add(textArea);
		
		
		panel.add(comboBox_2);
		
		
		panel.add(comboBox_7);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(245, 222, 179));
		tabbedPane.addTab("Remove Info", null, panel_1, null);
		
		JLabel label_8 = new JLabel("InfoId");
		label_8.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_8.setBounds(109, 113, 77, 29);
		panel_1.add(label_8);
		
		
		panel_1.add(comboBox_4);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setLineWrap(true);
		textArea_1.setBounds(41, 264, 421, 93);
		
		JButton button_2 = new JButton("Remove");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String infoid=comboBox_4.getSelectedItem().toString();
				
				for(StationC itr:stationList) {
					if(scode.equals(itr.stationCode))
					{
						for(PasInfSys pisitr:itr.pasInfSys)
						{
							if(infoid.equals(pisitr.infoId))
							{
								itr.pasInfSys.remove(infoid);
								textArea_1.append(" !Removed PasInfSys"+infoid+ "in Station!\n"+scode);
								JOptionPane.showMessageDialog(null, " !Removed PasInfSys"+infoid+ "in Station!"+scode);
								comboBox.removeItem(scode);
								comboBox_4.removeItem(infoid);
								comboBox_6.removeItem(infoid);
							}
							
						}
					}
				}
			}
		});
		button_2.setBounds(186, 180, 111, 29);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("Back");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				passengerj sp=new passengerj(stationList,scode);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		button_3.setBounds(200, 389, 97, 25);
		panel_1.add(button_3);
		
		JLabel label_9 = new JLabel("Display");
		label_9.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_9.setBounds(211, 223, 66, 25);
		panel_1.add(label_9);
		
		
		panel_1.add(textArea_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(175, 238, 238));
		tabbedPane.addTab("Display Info", null, panel_2, null);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setLineWrap(true);
		textArea_2.setBounds(50, 250, 415, 110);
		
		JButton button_4 = new JButton("Display");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String infoid=comboBox_6.getSelectedItem().toString();
				
				for(StationC itr:stationList) {
					if(scode.equals(itr.stationCode))
					{
						for(PasInfSys pisitr:itr.pasInfSys)
						{
							if(infoid.equals(pisitr.infoId))
							{
								String data=pisitr.displayPasString();
								textArea_2.append(data);
							}
							
						}
					}
				}
				
			}
		});
		button_4.setBounds(204, 152, 97, 25);
		panel_2.add(button_4);
		
		JButton button_5 = new JButton("Back");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				passengerj sp=new passengerj(stationList,scode);
				sp.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		button_5.setBounds(204, 405, 97, 25);
		panel_2.add(button_5);
		
		JLabel label_11 = new JLabel("InfoId");
		label_11.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_11.setBounds(117, 91, 97, 22);
		panel_2.add(label_11);
		
		
		panel_2.add(comboBox_6);
		
		JLabel label_12 = new JLabel("Display");
		label_12.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_12.setBounds(225, 225, 72, 22);
		panel_2.add(label_12);
		
		
		panel_2.add(textArea_2);
	}

}
