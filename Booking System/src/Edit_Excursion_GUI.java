import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.util.Random;
public class Edit_Excursion_GUI extends JFrame {
       
 
       
                private static final long serialVersionUID = 1L;
               
                //Global Attributes
                ListManager Manage = Main_GUI.Manage;
                Random rand = new Random();
                private String[] TransportList = {"Bus","Boat","Plane","Car"};
                private String[] Months = {"January","February","March","April","May","June","July"
                                ,"August","September","October","November","December"};
                Excursion Editee=null;
               
                //JLabels
                JLabel Excursion_Location = new JLabel("Location: ");
                JLabel Excursion_Price = new JLabel("Price: ");
                JLabel Excursion_Date_Day = new JLabel("Day: ");
                JLabel Excursion_Date_Month = new JLabel("Month: ");
                JLabel Excursion_Date_Year = new JLabel("Year: ");
                JLabel Excursion_Time_Hour = new JLabel("Time(Hour): ");
                JLabel Excursion_Time_Minute = new JLabel("Time(Minute): ");
                JLabel Excursion_Duration = new JLabel("Duration: ");
                JLabel Excursion_Transport = new JLabel("Transport: ");
                JLabel Excursion_Transport_Capacity = new JLabel("Capacity");
                JLabel Excursion_Information = new JLabel("Information: ");
               
                //ComboBoxes
                JComboBox Transports = new JComboBox(TransportList);
                JComboBox Month = new JComboBox(Months);
               
                //TextFields
                JTextField Excursion_Location_TextField = new JTextField(20);
                JTextField Excursion_Price_TextField = new JTextField(20);
                JTextField Excursion_Date_Day_TextField = new JTextField(20);
                JTextField Excursion_Date_Year_TextField = new JTextField(20);
                JTextField Excursion_Time_Hour_TextField = new JTextField(20);
                JTextField Excursion_Time_Minute_TextField = new JTextField(20);
                JTextField Excursion_Duration_TextField = new JTextField(20);
                JTextField Excursion_Transport_Capacity_TextField = new JTextField(20);
                JTextField Excursion_Information_TextField = new JTextField(20);
               
                //JButtons
                JButton Add_Excursion = new JButton("Add");
               
                public Edit_Excursion_GUI(Excursion edited)
                {
                        Editee = edited;
                   
                    Excursion_Price_TextField.setText(Double.toString(Editee.getPrice()));
                    Excursion_Location_TextField.setText(Editee.getLocation().getName());
                    Excursion_Information_TextField.setText(Editee.getInformation());
                    Transports.setSelectedItem(Editee.getTransport().getType());
                    Excursion_Transport_Capacity_TextField.setText(Integer.toString(Editee.getTransport().getCapacity()));
                    Excursion_Date_Year_TextField.setText(Integer.toString(Editee.getDate().get_Year()));
                    Month.setSelectedItem(Editee.getDate().get_Month());
                    Excursion_Date_Day_TextField.setText(Integer.toString(Editee.getDate().get_Day()));
                    Excursion_Time_Hour_TextField.setText(Integer.toString(Editee.getTimes().getHour()));
                    Excursion_Time_Minute_TextField.setText(Integer.toString(Editee.getTimes().getMinute()));
                    Excursion_Duration_TextField.setText(Editee.getDuration());
               
                        /*Set Layout Here*/
                        setTitle("Edit Excursion");
                        this.setLayout(new BorderLayout());
                       
                        /*Formatting*/
                        //Center
                        JPanel Center_Panel = new JPanel();
                        Center_Panel.setLayout(new GridLayout(11,2));
                        Center_Panel.add(Excursion_Location);
                        Center_Panel.add(Excursion_Location_TextField);
                        Center_Panel.add(Excursion_Price);
                        Center_Panel.add(Excursion_Price_TextField);
                        Center_Panel.add(Excursion_Date_Day);
                        Center_Panel.add(Excursion_Date_Day_TextField);
                        Center_Panel.add(Excursion_Date_Month);
                        Center_Panel.add(Month);
                        Center_Panel.add(Excursion_Date_Year);
                        Center_Panel.add(Excursion_Date_Year_TextField);
                        Center_Panel.add(Excursion_Time_Hour);
                        Center_Panel.add(Excursion_Time_Hour_TextField);
                        Center_Panel.add(Excursion_Time_Minute);
                        Center_Panel.add(Excursion_Time_Minute_TextField);
                        Center_Panel.add(Excursion_Duration);
                        Center_Panel.add(Excursion_Duration_TextField);
                        Center_Panel.add(Excursion_Transport);
                        Center_Panel.add(Transports);
                        Center_Panel.add(Excursion_Transport_Capacity);
                        Center_Panel.add(Excursion_Transport_Capacity_TextField);
                        Center_Panel.add(Excursion_Information);
                        Center_Panel.add(Excursion_Information_TextField);
                        this.add(Center_Panel,"Center");
                       
                        //South
                        JPanel South_Panel = new JPanel();
                        South_Panel.setLayout(new FlowLayout(FlowLayout.CENTER));
                        South_Panel.add(Add_Excursion);
                        this.add(South_Panel,"South");
                       
                        /*Listener*/
                        //South
                        Add_Excursion_Button_Listener Add_Button_Listen = new Add_Excursion_Button_Listener();
                        Add_Excursion.addActionListener(Add_Button_Listen);
                }
               
                /*Listener Classes*/
                public class Add_Excursion_Button_Listener implements ActionListener
                {
                        public void actionPerformed(ActionEvent ev)
                        {
                                Date Excursion_Date_Input = new Date(Integer.parseInt(
                                                Excursion_Date_Day_TextField.getText()),(String)Month.getSelectedItem(),
                                                Integer.parseInt(Excursion_Date_Year_TextField.getText()));
                               
                                Time Excursion_Time_Input = new Time(Integer.parseInt(Excursion_Time_Hour_TextField.getText()),
                                                Integer.parseInt(Excursion_Time_Minute_TextField.getText()));
                               
                                Transportation Excursion_Transport_Input = new Transportation(
                                                (String)Transports.getSelectedItem(),Integer.parseInt(
                                                                Excursion_Transport_Capacity_TextField.getText()));
                               
                                Location Location_Input = new Location(Excursion_Location_TextField.getText());
                               
                                int i = Manage.getExcursionListSize() + 1;
                                Integer OldID=Editee.getE_ID();
                                Manage.RemoveObject(Editee);
                               
                                Manage.Add_Excursion_To_List(new Excursion(OldID,Double.parseDouble(
                                                Excursion_Price_TextField.getText()),Location_Input,
                                                Excursion_Information_TextField.getText(),
                                                Excursion_Transport_Input,Excursion_Date_Input,Excursion_Time_Input,
                                                Excursion_Duration_TextField.getText()));
                        }
                }
       
       
}
