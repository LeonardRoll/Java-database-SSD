import javax.swing.*;


import java.awt.*;
import java.awt.event.*;

public class Search_Result_Excursion extends JFrame{
	//Global Attributes
	Excursion Resultee=null;
	
	public Search_Result_Excursion(Excursion Search_Result_Excursion)
	{
		Resultee = Search_Result_Excursion;
		/*JLabels*/
		JLabel Excursion_Price_Label = new JLabel("Excursion Price:");
		JLabel Excursion_Location_Name_Label =  new JLabel("Excursion Location_Name:");
		JLabel Excursion_Location_Description_Label =  new JLabel("Excursion Location_Description:");
		JLabel Excursion_Information_Label = new JLabel("Excursion Information:");
		JLabel Excursion_Transport_Type_Label = new JLabel("Excursion Transport_Type:");
		JLabel Excursion_Transport_Capacity_Label = new JLabel("Excursion Transport_Capacity:");
		JLabel Excursion_Year_Label =  new JLabel("Excursion Year:");
		JLabel Excursion_Month_Label =  new JLabel("Excursion Month:");
		JLabel Excursion_Day_Label =  new JLabel("Excursion Day:");
		JLabel Excursion_Time_Hour_Label = new JLabel("Excursion Time Hour:");
		JLabel Excursion_Time_Minute_Label = new JLabel("Excursion Time Minute:");
		JLabel Excursion_Duration_Label = new JLabel("Excursion Duration:");
		
		JLabel Excursion_Price_Label_Result = new JLabel(Double.toString(Search_Result_Excursion.getPrice()));
		JLabel Excursion_Location_Name_Label_Result =  new JLabel(Search_Result_Excursion.getLocation().getName());
		JLabel Excursion_Location_Description_Label_Result =  new JLabel(Search_Result_Excursion.getLocation().getText_Description());
		JLabel Excursion_Information_Label_Result = new JLabel(Search_Result_Excursion.getInformation());
		JLabel Excursion_Transport_Type_Label_Result =  new JLabel(Search_Result_Excursion.getTransport().getType());
		JLabel Excursion_Transport_Capacity_Label_Result =  new JLabel(Integer.toString(Search_Result_Excursion.getTransport().getCapacity()));
		JLabel Excursion_Year_Label_Result = new JLabel(Integer.toString(Search_Result_Excursion.getDate().get_Year()));
		JLabel Excursion_Month_Label_Result = new JLabel(Search_Result_Excursion.getDate().get_Month());
		JLabel Excursion_Day_Label_Result = new JLabel(Integer.toString(Search_Result_Excursion.getDate().get_Day()));
		JLabel Excursion_Time_Hour_Label_Result = new JLabel(Integer.toString(Search_Result_Excursion.getTimes().getHour()));
		JLabel Excursion_Time_Minute_Label_Result = new JLabel(Integer.toString(Search_Result_Excursion.getTimes().getMinute()));
		JLabel Excursion_Duration_Label_Result = new JLabel(Search_Result_Excursion.getDuration());

		/*Format Here*/
		//Center
		JPanel Center_Panel = new JPanel();
		Center_Panel.setLayout(new GridLayout(24,2));
		Center_Panel.add(Excursion_Price_Label);
		Center_Panel.add(Excursion_Price_Label_Result);
		Center_Panel.add(Excursion_Location_Name_Label);
		Center_Panel.add(Excursion_Location_Name_Label_Result);
		Center_Panel.add(Excursion_Location_Description_Label);
		Center_Panel.add(Excursion_Location_Description_Label_Result);
		Center_Panel.add(Excursion_Information_Label);
		Center_Panel.add(Excursion_Information_Label_Result);
		Center_Panel.add(Excursion_Transport_Type_Label);
		Center_Panel.add(Excursion_Transport_Type_Label_Result);
		Center_Panel.add(Excursion_Transport_Capacity_Label);
		Center_Panel.add(Excursion_Transport_Capacity_Label_Result);
		Center_Panel.add(Excursion_Year_Label);
		Center_Panel.add(Excursion_Year_Label_Result);
		Center_Panel.add(Excursion_Month_Label);
		Center_Panel.add(Excursion_Month_Label_Result);
		Center_Panel.add(Excursion_Day_Label);
		Center_Panel.add(Excursion_Day_Label_Result);
		Center_Panel.add(Excursion_Time_Hour_Label);
		Center_Panel.add(Excursion_Time_Hour_Label_Result);
		Center_Panel.add(Excursion_Time_Minute_Label);
		Center_Panel.add(Excursion_Time_Minute_Label_Result);
		Center_Panel.add(Excursion_Duration_Label);
		Center_Panel.add(Excursion_Duration_Label_Result);
		this.add(Center_Panel,"Center");
		
		JPanel Bottom_Panel = new JPanel();
		JButton Edit = new JButton("Edit");
		JButton Remove = new JButton("Remove");
		
		Edit_Button_Listener Edit_Listen = new Edit_Button_Listener();
		Edit.addActionListener(Edit_Listen);
		Remove_Button_Listener Remove_Listen = new Remove_Button_Listener();
		Remove.addActionListener(Remove_Listen);
		Bottom_Panel.add(Edit);
		Bottom_Panel.add(Remove);
		this.add(Bottom_Panel,"South");
	}
	public class Edit_Button_Listener implements ActionListener
	{
		Edit_Excursion_GUI Edit_Excursion_Window = new Edit_Excursion_GUI(Resultee);
		public void actionPerformed(ActionEvent ev)
		{
			Edit_Excursion_Window.pack();
			Edit_Excursion_Window.setLocationRelativeTo(null);
			Edit_Excursion_Window.setVisible(true);
		}
	}
	public class Remove_Button_Listener implements ActionListener
	{
		Remove_GUI Remove_Window = new Remove_GUI(Resultee);
		
		public void actionPerformed(ActionEvent ev)
		{
			Remove_Window.pack();
			Remove_Window.setLocationRelativeTo(null);
			Remove_Window.setVisible(true);
			
		}
	}
}
