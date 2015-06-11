import javax.swing.*;


import java.awt.*;
import java.awt.event.*;

public class Search_Result extends JFrame{
	//Global Attributes
	Passenger Resultee=null;
	
	public Search_Result(Passenger Search_Result)
	{
		Resultee = Search_Result;
		/*JLabels*/
		JLabel Passenger_Title_Label = new JLabel("Passenger Title");
		JLabel Passenger_First_Name_Label =  new JLabel("Passenger First Name:");
		JLabel Passenger_Last_Name_Label = new JLabel("Passenger Last Name:");
		JLabel Leader_Title_Label = new JLabel("Leader Title");
		JLabel Leader_First_Name_Label =  new JLabel("Leader First Name:");
		JLabel Leader_Last_Name_Label = new JLabel("Leader Last Name:");
		JLabel Address_Line_1_Label = new JLabel("Address Line 1:");
		JLabel Address_Line_2_Label = new JLabel("Address Line 2:");
		JLabel Address_City_Label = new JLabel("City:");
		JLabel Address_Post_Code_Label = new JLabel("Post Code:");
		JLabel Insurance_Number_Label = new JLabel("Insurance Number:");
		JLabel Insurance_Company_Label = new JLabel("Insurance Company:");
		JLabel Verification_Label = new JLabel("Verification:");
		JLabel Passenger_Home_Phone_Label = new JLabel("Passenger Home Phone:");
		JLabel Passenger_Mobile_Phone_Label = new JLabel("Passenger Mobile Phone:");
		JLabel Passenger_Email_Label = new JLabel("Passenger Email:");
		JLabel Leader_Home_Phone_Label = new JLabel("Leader Home Phone:");
		JLabel Leader_Mobile_Phone_Label = new JLabel("Leader Mobile Phone:");
		JLabel Leader_Email_Label = new JLabel("Leader Email:");
		JLabel Policy_Number_Label = new JLabel("Policy Number:");
		JLabel P_Detail_Card_Number_Label = new JLabel("Card Number:");
		JLabel P_Detail_Security_Code_Label = new JLabel("Security Code:");
		JLabel P_Detail_Verification_Label = new JLabel("Payment Verification:");
		JLabel Passenger_Title_Label_Result = new JLabel(Search_Result.getPassenger_Name().getTitle());
		JLabel Passenger_First_Name_Label_Result =  new JLabel(Search_Result.getPassenger_Name().getFirst_Name());
		JLabel Passenger_Last_Name_Label_Result = new JLabel(Search_Result.getPassenger_Name().getLast_Name());
		JLabel Leader_Title_Label_Result = new JLabel(Search_Result.getLeader_Name().getTitle());
		JLabel Leader_First_Name_Label_Result =  new JLabel(Search_Result.getLeader_Name().getFirst_Name());
		JLabel Leader_Last_Name_Label_Result = new JLabel(Search_Result.getLeader_Name().getLast_Name());
		JLabel Address_Line_1_Label_Result = new JLabel(Search_Result.getNaddress().getAddress_Line_1());
		JLabel Address_Line_2_Label_Result = new JLabel(Search_Result.getNaddress().getAddress_Line_2());
		JLabel Address_City_Label_Result = new JLabel(Search_Result.getNaddress().getCity());
		JLabel Address_Post_Code_Label_Result = new JLabel(Search_Result.getNaddress().getPost_Code());
		JLabel Insurance_Number_Label_Result = new JLabel(Search_Result.getInsurance_Number());
		JLabel Insurance_Company_Label_Result = new JLabel(Search_Result.getInsurance_Company());
		JLabel Verification_Label_Result = new JLabel(Search_Result.getVerification());
		JLabel Passenger_Home_Phone_Label_Result = new JLabel(Search_Result.getPassenger_Contact_Detail().getHome_Phone());
		JLabel Passenger_Mobile_Phone_Label_Result = new JLabel(Search_Result.getPassenger_Contact_Detail().getMobile_Phone());
		JLabel Passenger_Email_Label_Result = new JLabel(Search_Result.getPassenger_Contact_Detail().getEmail());
		JLabel Leader_Home_Phone_Label_Result = new JLabel(Search_Result.getLeader_Contact_Detail().getHome_Phone());
		JLabel Leader_Mobile_Phone_Label_Result = new JLabel(Search_Result.getLeader_Contact_Detail().getMobile_Phone());
		JLabel Leader_Email_Label_Result = new JLabel(Search_Result.getLeader_Contact_Detail().getEmail());
		JLabel Policy_Number_Label_Result = new JLabel(Search_Result.getPolicy_Number());
		JLabel P_Detail_Card_Number_Label_Result = new JLabel(Search_Result.getPayment_Details().getCard_Number());
		JLabel P_Detail_Security_Code_Label_Result = new JLabel(Search_Result.getPayment_Details().getSecurity_Code());
		JLabel P_Detail_Verification_Label_Result = new JLabel(Search_Result.getPayment_Details().getVerification());

		/*Format Here*/
		//Center
		JPanel Center_Panel = new JPanel();
		Center_Panel.setLayout(new GridLayout(24,2));
		Center_Panel.add(Passenger_Title_Label);
		Center_Panel.add(Passenger_Title_Label_Result);
		Center_Panel.add(Passenger_First_Name_Label);
		Center_Panel.add(Passenger_First_Name_Label_Result);
		Center_Panel.add(Passenger_Last_Name_Label);
		Center_Panel.add(Passenger_Last_Name_Label_Result);
		Center_Panel.add(Leader_Title_Label);
		Center_Panel.add(Leader_Title_Label_Result);
		Center_Panel.add(Leader_First_Name_Label);
		Center_Panel.add(Leader_First_Name_Label_Result);
		Center_Panel.add(Leader_Last_Name_Label);
		Center_Panel.add(Leader_Last_Name_Label_Result);
		Center_Panel.add(Address_Line_1_Label);
		Center_Panel.add(Address_Line_1_Label_Result);
		Center_Panel.add(Address_Line_2_Label);
		Center_Panel.add(Address_Line_2_Label_Result);
		Center_Panel.add(Address_City_Label);
		Center_Panel.add(Address_City_Label_Result);
		Center_Panel.add(Address_Post_Code_Label);
		Center_Panel.add(Address_Post_Code_Label_Result);
		Center_Panel.add(Insurance_Number_Label);
		Center_Panel.add(Insurance_Number_Label_Result);
		Center_Panel.add(Insurance_Company_Label);
		Center_Panel.add(Insurance_Company_Label_Result);
		Center_Panel.add(Verification_Label);
		Center_Panel.add(Verification_Label_Result);
		Center_Panel.add(Passenger_Home_Phone_Label);
		Center_Panel.add(Passenger_Home_Phone_Label_Result);
		Center_Panel.add(Passenger_Mobile_Phone_Label);
		Center_Panel.add(Passenger_Mobile_Phone_Label_Result);
		Center_Panel.add(Passenger_Email_Label);
		Center_Panel.add(Passenger_Email_Label_Result);
		Center_Panel.add(Leader_Home_Phone_Label);
		Center_Panel.add(Leader_Home_Phone_Label_Result);
		Center_Panel.add(Leader_Mobile_Phone_Label);
		Center_Panel.add(Leader_Mobile_Phone_Label_Result);
		Center_Panel.add(Leader_Email_Label);
		Center_Panel.add(Leader_Email_Label_Result);
		Center_Panel.add(Policy_Number_Label);
		Center_Panel.add(Policy_Number_Label_Result);
		Center_Panel.add(P_Detail_Card_Number_Label);
		Center_Panel.add(P_Detail_Card_Number_Label_Result);
		Center_Panel.add(P_Detail_Security_Code_Label);
		Center_Panel.add(P_Detail_Security_Code_Label_Result);
		Center_Panel.add(P_Detail_Verification_Label);
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
		Edit_Passenger_GUI Edit_Passenger_Window = new Edit_Passenger_GUI(Resultee);
		public void actionPerformed(ActionEvent ev)
		{
			Edit_Passenger_Window.pack();
			Edit_Passenger_Window.setLocationRelativeTo(null);
			Edit_Passenger_Window.setVisible(true);
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
