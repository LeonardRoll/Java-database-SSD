import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;


public class Passenger_GUI extends JFrame{
	private static final long serialVersionUID = 1L;

	public Passenger_GUI()
	{
		/*Set Layout Here*/
		setTitle("Booking System:Passenger");
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
		JButton Add_Passenger = new JButton("Add Passenger");
		JButton Search_Passenger = new JButton("Search Passenger");
		
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
		Center_Panel.add(Add_Passenger);
		Center_Panel.add(Search_Passenger);
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
		Excursion_Button_Listener Excursion_Listen = new Excursion_Button_Listener();
		Excursion_Button.addActionListener(Excursion_Listen);
		Add_Passenger_Button_Listener Add_Passenger_Listen = new Add_Passenger_Button_Listener();
		Add_Passenger.addActionListener(Add_Passenger_Listen);
		Search_Passenger_Button_Listener Search_Passenger_Listen = new Search_Passenger_Button_Listener();
		Search_Passenger.addActionListener(Search_Passenger_Listen);
	}
	
	/*Listener Classes Here*/
	public class Excursion_Button_Listener implements ActionListener
	{
		Excursion_GUI Excursion_Window = new Excursion_GUI();
		public void actionPerformed(ActionEvent ev)
		{
			Excursion_Window.pack();
			Excursion_Window.setLocationRelativeTo(null);
			Excursion_Window.setVisible(true);
		}
	}
	
	public class Add_Passenger_Button_Listener implements ActionListener
	{
		Add_Passenger_GUI Add_Passenger_Window = new Add_Passenger_GUI();
		public void actionPerformed(ActionEvent ev)
		{
			Add_Passenger_Window.pack();
			Add_Passenger_Window.setLocationRelativeTo(null);
			Add_Passenger_Window.setVisible(true);
		}
	}
	
	public class Search_Passenger_Button_Listener implements ActionListener
	{
		Search_Passenger_GUI Search_Passenger_Window = new Search_Passenger_GUI();
		public void actionPerformed(ActionEvent ev)
		{
			Search_Passenger_Window.pack();
			Search_Passenger_Window.setLocationRelativeTo(null);
			Search_Passenger_Window.setVisible(true);
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
