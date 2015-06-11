import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;


public class Excursion_GUI extends JFrame{
	private static final long serialVersionUID = 1L;

	public Excursion_GUI()
	{
		/*Set Layout Here*/
		setTitle("Booking System:Excursion");
		this.setLayout(new BorderLayout());
		
		/*Objects Here*/
		//North
		JLabel User_Detail = new JLabel("Place_Holder");
		ImageIcon Logo_Icon = createImageIcon("images/Police Front 2.bmp","PlaceHolder");
		JLabel Logo = new JLabel("Logo Here",Logo_Icon,JLabel.RIGHT); 
		JButton Excursion_Button = new JButton("Excursion");
		JButton Passenger_GUI = new JButton("Passenger");
		JButton Other_Button_2 = new JButton("Place_Holder");
		JButton Other_Button_3 = new JButton("Place_Holder");
		//Center
		JButton Add_Excursion = new JButton("Add Excursion");
		JButton Search_Excursion = new JButton("Search Excursion");
		
		/*Format GUI Here*/
		//North
		JPanel North_Panel = new JPanel();
		JPanel North_Button_Panel = new JPanel();
		JPanel North_Top_Panel = new JPanel();
		North_Panel.setLayout(new BorderLayout());
		North_Button_Panel.setLayout(new GridLayout(1,4));
		North_Top_Panel.setLayout(new BorderLayout());
		North_Panel.add(North_Top_Panel,"North");
		North_Panel.add(North_Button_Panel,"South");
		this.add(North_Panel,"North");
		//Center
		JPanel Center_Panel = new JPanel();
		Center_Panel.setLayout(new GridLayout(3,1));
		Center_Panel.add(Add_Excursion);
		Center_Panel.add(Search_Excursion);
		this.add(Center_Panel,"Center");
		
		/*Add JLabels Here*/
		North_Top_Panel.add(Logo,"West");
		North_Top_Panel.add(User_Detail,"East");
		
		/*Add Buttons Here*/
		North_Button_Panel.add(Excursion_Button);
		North_Button_Panel.add(Passenger_GUI);
		North_Button_Panel.add(Other_Button_2);
		North_Button_Panel.add(Other_Button_3);
		
		/*Listeners*/
		//North
		Add_Excursion_Button_Listener Add_Excursion_Listen = new Add_Excursion_Button_Listener();
		Add_Excursion.addActionListener(Add_Excursion_Listen);
		Search_Excursion_Button_Listener Search_Excursion_Listen = new Search_Excursion_Button_Listener();
		Search_Excursion.addActionListener(Search_Excursion_Listen);
	}
	
	/*Listener Classes Here*/
	
	
	public class Add_Excursion_Button_Listener implements ActionListener
	{
		Add_Excursion_GUI Add_Excursion_Window = new Add_Excursion_GUI();
		public void actionPerformed(ActionEvent ev)
		{
			Add_Excursion_Window.pack();
			Add_Excursion_Window.setLocationRelativeTo(null);
			Add_Excursion_Window.setVisible(true);
		}
	}
	
	public class Search_Excursion_Button_Listener implements ActionListener
	{
		Search_Excursion_GUI Search_Excursion_Window = new Search_Excursion_GUI();
		public void actionPerformed(ActionEvent ev)
		{
			Search_Excursion_Window.pack();
			Search_Excursion_Window.setLocationRelativeTo(null);
			Search_Excursion_Window.setVisible(true);
		}
	}
	

	/*Functions*/
	protected ImageIcon createImageIcon(String path, String description) 
	{
		java.net.URL imgURL = getClass().getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL, description);
		} 
		else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}
}