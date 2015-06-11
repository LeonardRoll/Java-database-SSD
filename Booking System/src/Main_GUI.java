import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class Main_GUI extends JFrame{
	private static final long serialVersionUID = 1L;
	static ListManager Manage = new ListManager();
	static Excursion_GUI Excursion_Window = new Excursion_GUI();
	static Passenger_GUI Passenger_Window = new Passenger_GUI();
	static Booking_Manager_GUI Book_Window = new Booking_Manager_GUI();
	
	public Main_GUI()
	{
		/*Set Layout Here*/
		setTitle("Booking System");
		this.setLayout(new BorderLayout());
		
		/*Objects Here*/
		//North
		JLabel User_Detail = new JLabel("Place_Holder");
		ImageIcon Logo_Icon = createImageIcon("images/Police Front 2.bmp","PlaceHolder");
		JLabel Logo = new JLabel("Logo Here",Logo_Icon,JLabel.RIGHT); 
		JButton Excursion_Button = new JButton("Excursion");
		JButton Passenger_Button = new JButton("Passenger");
		JButton Book_Button = new JButton("Book");
		JButton Other_Button_3 = new JButton("Place_Holder");
		
		//Center
		JLabel First_Name = new JLabel("First Name:");
		JLabel Surname = new JLabel("Surname: ");
		JButton Reload_Button = new JButton("Reload");
		JTextField First_Name_TextField = new JTextField(20);
		JTextField Surname_TextField = new JTextField(20);
		
		//South
		
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
		
		/*Add JLabels Here*/
		North_Top_Panel.add(Logo,"West");
		North_Top_Panel.add(User_Detail,"East");
		
		/*Add Buttons Here*/
		North_Button_Panel.add(Excursion_Button);
		North_Button_Panel.add(Passenger_Button);
		North_Button_Panel.add(Book_Button);
		North_Button_Panel.add(Other_Button_3);
		
		//Center
		JPanel Center_Panel = new JPanel();
		Center_Panel.setLayout(new GridLayout(3,2));
		Center_Panel.add(First_Name);
		Center_Panel.add(First_Name_TextField);
		Center_Panel.add(Surname);
		Center_Panel.add(Surname_TextField);
		Center_Panel.add(Reload_Button);
		this.add(Center_Panel,"Center");
		
		/*Listeners*/
		//North
		Excursion_Button_Listener Excursion_Listen = new Excursion_Button_Listener();
		Excursion_Button.addActionListener(Excursion_Listen);
		Passenger_Button_Listener Passenger_Listen = new Passenger_Button_Listener();
		Passenger_Button.addActionListener(Passenger_Listen);
		Book_Button_Listener Book_Listen = new Book_Button_Listener();
		Book_Button.addActionListener(Book_Listen);
		Reload_Button_Listener Reload_Listen = new Reload_Button_Listener();
		Reload_Button.addActionListener(Reload_Listen);
	}; 
	
	/*Listener Classes Here*/
	public class Excursion_Button_Listener implements ActionListener
	{
		
		public void actionPerformed(ActionEvent ev)
		{
			Excursion_Window.pack();
			Excursion_Window.setLocationRelativeTo(null);
			Excursion_Window.setVisible(true);
		}
	}
	
	public class Passenger_Button_Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent ev)
		{
			Passenger_Window.pack();
			Passenger_Window.setLocationRelativeTo(null);
			Passenger_Window.setVisible(true);
		}
	}
	
	public class Book_Button_Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent ev)
		{
			Book_Window.pack();
			Book_Window.setLocationRelativeTo(null);
			Book_Window.setVisible(true);
		}
	}
	
	public class Reload_Button_Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent ev)
		{
			ListManager Reload = new ListManager();
			
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
