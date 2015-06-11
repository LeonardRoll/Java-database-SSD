import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Search_Excursion_GUI extends JFrame{
	//Global Attributes
	ListManager Manage = Main_GUI.Manage;
	
	/*JLabels*/
	JLabel E_Location_Label = new JLabel("Location: ");
	
	/*Text Fields*/
	JTextField E_Location_TextField = new JTextField(20);
	
	public Search_Excursion_GUI()
	{
		/*Set Layout Here*/
		setTitle("Searh Excursion");
		this.setLayout(new BorderLayout());
		
		/*Objects Here*/
		 
		/*Button*/
		JButton Search_Button = new JButton("Search");
		
		/*Format Here*/
		JPanel North_Panel = new JPanel();
		JPanel South_Panel = new JPanel();
		
		/*North*/
		North_Panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		North_Panel.add(E_Location_Label);
		North_Panel.add(E_Location_TextField);
		this.add(North_Panel,"North");
		
		/*South*/
		South_Panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		South_Panel.add(Search_Button);
		this.add(South_Panel,"South");
		
		/*Listeners*/
		Search_Excursion_Button_Listener Search_Excursion_Listen = new Search_Excursion_Button_Listener();
		Search_Button.addActionListener(Search_Excursion_Listen);
	}
	
	public class Search_Excursion_Button_Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent ev) //P_ID_TextField.getText()
		{
			ArrayList<Integer> Results =Manage.search_Excursion(E_Location_TextField.getText());
			
				Search_Excursion_List Search_List_Window = new Search_Excursion_List(Results);
				Search_List_Window.pack();
				Search_List_Window.setLocationRelativeTo(null);
				Search_List_Window.setVisible(true);
			
		}
	}
}

