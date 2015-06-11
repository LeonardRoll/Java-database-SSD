import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.util.Random;
public class Edit_Passenger_GUI extends JFrame {
	
		private static final long serialVersionUID = 1L;
		
		//Global Attributes
		ListManager Manage = Main_GUI.Manage;
		Passenger Editee = null;
		
		/*ComboBoxes*/
		JComboBox<String> Passenger_Titles = new JComboBox<String>();
		JComboBox<String> Leader_Titles = new JComboBox<String>();
		
		
		/*CheckBox*/
		JCheckBox Leader_CheckBox = new JCheckBox("Leader");
		
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
		JLabel Leader_Check_Box_Label = new JLabel("Leader?");
		
		/*Text Fields*/
		JTextField Passenger_First_Name_TextField =  new JTextField(20);
		JTextField Passenger_Last_Name_TextField = new JTextField(20);
		JTextField Leader_First_Name_TextField =  new JTextField(20);
		JTextField Leader_Last_Name_TextField = new JTextField(20);
		JTextField Address_Line_1_TextField = new JTextField(20);
		JTextField Address_Line_2_TextField = new JTextField(20);
		JTextField Address_City_TextField = new JTextField(20);
		JTextField Address_Post_Code_TextField = new JTextField(20);
		JTextField Insurance_Number_TextField = new JTextField(20);
		JTextField Insurance_Company_TextField = new JTextField(20);
		JTextField Verification_TextField = new JTextField(20);
		JTextField Passenger_Home_Phone_TextField = new JTextField(20);
		JTextField Passenger_Mobile_Phone_TextField = new JTextField(20);
		JTextField Passenger_Email_TextField = new JTextField(20);
		JTextField Leader_Home_Phone_TextField = new JTextField(20);
		JTextField Leader_Mobile_Phone_TextField = new JTextField(20);
		JTextField Leader_Email_TextField = new JTextField(20);
		JTextField Policy_Number_TextField = new JTextField(20);
		JTextField P_Detail_Card_Number_TextField = new JTextField(20);
		JTextField P_Detail_Security_Code_TextField = new JTextField(20);
		JTextField P_Detail_Verification_TextField = new JTextField(20);
		
		public Edit_Passenger_GUI(Passenger edited)
		{
			Editee = edited;
			Passenger_First_Name_TextField.setText(Editee.getPassenger_Name().getFirst_Name());
			Passenger_Last_Name_TextField.setText(Editee.getPassenger_Name().getLast_Name());
			Leader_First_Name_TextField.setText(Editee.getLeader_Name().getFirst_Name());
			Leader_Last_Name_TextField.setText(Editee.getLeader_Name().getLast_Name());
			Address_Line_1_TextField.setText(Editee.getNaddress().getAddress_Line_1());
			Address_Line_2_TextField.setText(Editee.getNaddress().getAddress_Line_2());
			Address_City_TextField.setText(Editee.getNaddress().getCity());
			Address_Post_Code_TextField.setText(Editee.getNaddress().getPost_Code());
			Insurance_Number_TextField.setText(Editee.getInsurance_Number());
			Insurance_Company_TextField.setText(Editee.getInsurance_Company());
			Verification_TextField.setText(Editee.getVerification());
			Passenger_Home_Phone_TextField.setText(Editee.getPassenger_Contact_Detail().getHome_Phone());
			Passenger_Mobile_Phone_TextField.setText(Editee.getPassenger_Contact_Detail().getMobile_Phone());
			Passenger_Email_TextField.setText(Editee.getPassenger_Contact_Detail().getEmail());
			Leader_Home_Phone_TextField.setText(Editee.getLeader_Contact_Detail().getHome_Phone());
			Leader_Mobile_Phone_TextField.setText(Editee.getLeader_Contact_Detail().getMobile_Phone());
			Leader_Email_TextField.setText(Editee.getLeader_Contact_Detail().getEmail());
			P_Detail_Card_Number_TextField.setText(Editee.getPayment_Details().getCard_Number());
			P_Detail_Security_Code_TextField.setText(Editee.getPayment_Details().getSecurity_Code());
			P_Detail_Verification_TextField.setText(Editee.getPayment_Details().getVerification());
			/*Set Layout Here*/
			setTitle("Edit Passenger No.: " + Editee.getP_ID());
			this.setLayout(new BorderLayout());

			/*Center*/
			/*Objects Here*/
			Passenger_Titles.addItem("Mr.");
			Passenger_Titles.addItem("Mrs.");
			Passenger_Titles.addItem("Miss.");
			Passenger_Titles.addItem("Dr.");
			Leader_Titles.addItem("Mr.");
			Leader_Titles.addItem("Mrs.");
			Leader_Titles.addItem("Miss.");
			Leader_Titles.addItem("Dr.");
			
			/*Button*/
			JButton Add_Passenger = new JButton("Add");
			
			/*Format Here*/
			//Center
			JPanel Center_Panel = new JPanel();
			Center_Panel.setLayout(new GridLayout(24,2));
			Center_Panel.add(Passenger_Title_Label);
			Center_Panel.add(Passenger_Titles);
			Center_Panel.add(Passenger_First_Name_Label);
			Center_Panel.add(Passenger_First_Name_TextField);
			Center_Panel.add(Passenger_Last_Name_Label);
			Center_Panel.add(Passenger_Last_Name_TextField);
			Center_Panel.add(Leader_Check_Box_Label);
			Center_Panel.add(Leader_CheckBox);
			Center_Panel.add(Leader_Title_Label);
			Center_Panel.add(Leader_Titles);
			Center_Panel.add(Leader_First_Name_Label);
			Center_Panel.add(Leader_First_Name_TextField);
			Center_Panel.add(Leader_Last_Name_Label);
			Center_Panel.add(Leader_Last_Name_TextField);
			Center_Panel.add(Address_Line_1_Label);
			Center_Panel.add(Address_Line_1_TextField);
			Center_Panel.add(Address_Line_2_Label);
			Center_Panel.add(Address_Line_2_TextField);
			Center_Panel.add(Address_City_Label);
			Center_Panel.add(Address_City_TextField);
			Center_Panel.add(Address_Post_Code_Label);
			Center_Panel.add(Address_Post_Code_TextField);
			Center_Panel.add(Insurance_Number_Label);
			Center_Panel.add(Insurance_Number_TextField);
			Center_Panel.add(Insurance_Company_Label);
			Center_Panel.add(Insurance_Company_TextField);
			Center_Panel.add(Verification_Label);
			Center_Panel.add(Verification_TextField);
			Center_Panel.add(Passenger_Home_Phone_Label);
			Center_Panel.add(Passenger_Home_Phone_TextField);
			Center_Panel.add(Passenger_Mobile_Phone_Label);
			Center_Panel.add(Passenger_Mobile_Phone_TextField);
			Center_Panel.add(Passenger_Email_Label);
			Center_Panel.add(Passenger_Email_TextField);
			Center_Panel.add(Leader_Home_Phone_Label);
			Center_Panel.add(Leader_Home_Phone_TextField);
			Center_Panel.add(Leader_Mobile_Phone_Label);
			Center_Panel.add(Leader_Mobile_Phone_TextField);
			Center_Panel.add(Leader_Email_Label);
			Center_Panel.add(Leader_Email_TextField);
			Center_Panel.add(Policy_Number_Label);
			Center_Panel.add(Policy_Number_TextField);
			Center_Panel.add(P_Detail_Card_Number_Label);
			Center_Panel.add(P_Detail_Card_Number_TextField);
			Center_Panel.add(P_Detail_Security_Code_Label);
			Center_Panel.add(P_Detail_Security_Code_TextField);
			Center_Panel.add(P_Detail_Verification_Label);
			Center_Panel.add(P_Detail_Verification_TextField);
			this.add(Center_Panel,"Center");
			//South
			JPanel South_Panel = new JPanel();
			South_Panel.setLayout(new FlowLayout(FlowLayout.CENTER));
			South_Panel.add(Add_Passenger);
			this.add(South_Panel,"South");
			
			/*Listeners*/
			//South
			Add_Passenger_Button_Listener Add_Button_Listen = new Add_Passenger_Button_Listener();
			Add_Passenger.addActionListener(Add_Button_Listen);
		}
		
		
		/*Listener Classes Here*/
		public class Add_Passenger_Button_Listener implements ActionListener
		{
			public void actionPerformed(ActionEvent ev)
			{
				Name Passenger_Name = new Name((String)Passenger_Titles.getSelectedItem(),
						Passenger_First_Name_TextField.getText(),
						Passenger_Last_Name_TextField.getText());
				Contact Passenger_Contact_Details = new Contact(Passenger_Home_Phone_TextField.getText(),
						Passenger_Mobile_Phone_TextField.getText(),
						Passenger_Email_TextField.getText());
				//To be set
				Name Leader_Name;
				Contact Leader_Contact_Details;
				
				if(Leader_CheckBox.isSelected())
				{
					Name leader_Name = new Name((String)Passenger_Titles.getSelectedItem(),
							Passenger_First_Name_TextField.getText(),
							Passenger_Last_Name_TextField.getText());
					Contact leader_Contact_Details = new Contact(Passenger_Home_Phone_TextField.getText(),
							Passenger_Mobile_Phone_TextField.getText(),
							Passenger_Email_TextField.getText());
					//Set Now
					Leader_Name = leader_Name;
					Leader_Contact_Details = leader_Contact_Details;
				}
				else
				{
					Name leader_Name = new Name((String)Leader_Titles.getSelectedItem(),
							Leader_First_Name_TextField.getText(),
							Leader_Last_Name_TextField.getText());
					Contact leader_Contact_Details = new Contact(Leader_Home_Phone_TextField.getText(),
							Leader_Mobile_Phone_TextField.getText(),
							Leader_Email_TextField.getText());
					//Set Now
					Leader_Name = leader_Name;
					Leader_Contact_Details = leader_Contact_Details;
				}
				Address New_Address = new Address(Address_Line_1_TextField.getText(),
						Address_Line_2_TextField.getText(),
						Address_City_TextField.getText(),
						Address_Post_Code_TextField.getText());
				P_Detail Payment_Info = new P_Detail(P_Detail_Card_Number_TextField.getText(),
						P_Detail_Security_Code_TextField.getText(),
						P_Detail_Verification_TextField.getText());
				Integer OldID=Editee.getP_ID();
				Manage.RemoveObject(Editee);
				
				Manage.Add_Passenger_To_List(new Passenger(OldID,Passenger_Name,Leader_Name,
						New_Address,20131121,Insurance_Number_TextField.getText(),
						Insurance_Company_TextField.getText(),Verification_TextField.getText(),
						Passenger_Contact_Details,Leader_Contact_Details,
						Policy_Number_TextField.getText(),Payment_Info));
			}
		}
	}


