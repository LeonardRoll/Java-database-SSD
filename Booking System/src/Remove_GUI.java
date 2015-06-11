import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Remove_GUI extends JFrame{
	Object designated = null;
	ListManager Manage = Main_GUI.Manage;
	JFrame dow=null;
	public Remove_GUI(Object target) {
		dow = this;
		designated = target;
		this.setLayout(new BorderLayout());
		
		JLabel Sure_Label = new JLabel("This will PERMANENTLY Remove this from the database, ARE YOU SURE?");
		
		JPanel Center_Panel= new JPanel();
		Center_Panel.add(Sure_Label);
		this.add(Center_Panel,"Center");
		
		JPanel Bottom_Panel = new JPanel();
		JButton Confirm = new JButton("Yes");
		JButton Cancel = new JButton("No");
		
		Confirm_Button_Listener Confirm_Listen = new Confirm_Button_Listener();
		Confirm.addActionListener(Confirm_Listen);
		Cancel_Button_Listener Cancel_Listen = new Cancel_Button_Listener();
		Cancel.addActionListener(Cancel_Listen);
		Bottom_Panel.add(Confirm);
		Bottom_Panel.add(Cancel);
		this.add(Bottom_Panel,"South");
	}
	public class Confirm_Button_Listener implements ActionListener
	{
		
		public void actionPerformed(ActionEvent ev)
		{
				if(designated instanceof Excursion)
				{
					Manage.RemoveObject(Manage.get_Booking_at_ID(((Excursion) designated).getE_ID()));
				}
				Manage.RemoveObject(designated);
				dow.dispose();
			
		}
	}
	public class Cancel_Button_Listener implements ActionListener
	{
		
		public void actionPerformed(ActionEvent ev)
		{
			
				dow.dispose();
			
		}
	}

}
