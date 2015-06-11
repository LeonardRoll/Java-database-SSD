import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import java.awt.*;
import java.awt.event.*;

public class Booking_Manager_GUI extends JFrame{
	private static final long serialVersionUID = 1L;
	//Global Attributes
	ListManager Manage;
		
	public Booking_Manager_GUI(){
		/*Set Layout*/
		setTitle("Booking System: Booking");
		this.setLayout(new BorderLayout());
		Manage = Main_GUI.Manage;
		
		/*Objects Here*/
		//North
		JLabel User_Detail = new JLabel("Place_Holder");
		JLabel Logo = new JLabel("Logo Here",JLabel.RIGHT); 
		JButton Excursion_Button = new JButton("Excursion");
		JButton Passenger_Button = new JButton("Passenger");
		JButton Other_Button_2 = new JButton("Book");
		JButton Other_Button_3 = new JButton("Place_Holder");
		
		//Center
		JButton Add_Excursion = new JButton("Add");
		JComboBox<String> Combo_Box_2 = new JComboBox<String>();
		Combo_Box_2.addItem("Place_Holder");
		Combo_Box_2.setSelectedItem("Place_Holder");
		JComboBox<String> Combo_Box_3 = new JComboBox<String>();
		Combo_Box_3.addItem("Place_Holder");
		Combo_Box_3.setSelectedItem("Place_Holder");
		JComboBox<String> Combo_Box_4 = new JComboBox<String>();
		Combo_Box_4.addItem("Place_Holder");
		Combo_Box_4.setSelectedItem("Place_Holder");
		
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
		JPanel Center_Dropbox_Panel = new JPanel();
		JPanel Center_Table_Panel = new JPanel();
		Center_Panel.setLayout(new BorderLayout());
		Center_Dropbox_Panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		Center_Table_Panel.setLayout(new BorderLayout());
		Center_Panel.add(Center_Table_Panel,"Center");
		Center_Panel.add(Center_Dropbox_Panel,"North");
		this.add(Center_Panel,"Center");
		
		/*Add JLabels Here*/
		North_Top_Panel.add(Logo,"West");
		North_Top_Panel.add(User_Detail,"East");
		
		/*Add Buttons Here*/
		North_Button_Panel.add(Excursion_Button);
		North_Button_Panel.add(Passenger_Button);
		North_Button_Panel.add(Other_Button_2);
		North_Button_Panel.add(Other_Button_3);
		
		/*Add Combo  Boxes Here*/
		Center_Dropbox_Panel.add(Add_Excursion);
		Center_Dropbox_Panel.add(Combo_Box_2);
		Center_Dropbox_Panel.add(Combo_Box_3);
		Center_Dropbox_Panel.add(Combo_Box_4);
		
		/*Table Creation*/
		DefaultTableModel Table_Model = new DefaultTableModel();
		
		Object[] col = {"ID","Location","Transport","Price","Date","Book"};
		Object[][] object = new Object[Manage.getExcursionListSize()][col.length];
		
		if(Manage.getExcursionListSize() != 0){
			for(int i = 0 ; i < Manage.getExcursionListSize() ; i++){
				object[i][0] = Manage.get_Trip(i).getE_ID();
				object[i][1] = Manage.get_Trip(i).getLocation().getName();
				object[i][2] = Manage.get_Trip(i).getTransport().getType();
				object[i][3] = Manage.get_Trip(i).getPrice();
				object[i][4] = Manage.get_Trip(i).getDate().toString();
				object[i][5] = "Book";
			}
		}
		
		Table_Model.setDataVector(object,col);
		
		JTable Table = new JTable(Table_Model);
		Table.getColumn("Book").setCellRenderer(new ButtonRenderer());
		Table.getColumn("Book").setCellEditor(new ButtonEditor(new JCheckBox()));
		Table.setPreferredScrollableViewportSize(new Dimension(500,70));
		Table.setFillsViewportHeight(true);
		
		JScrollPane Table_Scroll = new JScrollPane(Table);
		Center_Table_Panel.add(Table_Scroll,"Center");
		}
		/*Listeners*/
		//North
		
		
		//Button Source: http://stackoverflow.com/questions/13833688/adding-jbutton-to-jtable
		//Extra Source: http://www.java2s.com/Code/Java/Swing-Components/ButtonTableExample.htm
		//This is not my code but the use of a code from a tutorial online
		//Leonard Roll
		class ButtonRenderer extends JButton implements TableCellRenderer {

			private static final long serialVersionUID = 1L;

			public ButtonRenderer() {
		        setOpaque(true);
		    }

		    public Component getTableCellRendererComponent(JTable table, Object value,
		            boolean isSelected, boolean hasFocus, int row, int column) {
		        if (isSelected) {
		            setForeground(table.getSelectionForeground());
		            setBackground(table.getSelectionBackground());
		        } else {
		            setForeground(table.getForeground());
		            setBackground(UIManager.getColor("Button.background"));
		        }
		        setText((value == null) ? "" : value.toString());
		        return this;
		    }
		}

		class ButtonEditor extends DefaultCellEditor {

			private static final long serialVersionUID = 1L;
			protected JButton button;
		    private int r;
		    private String label;
		    private boolean isPushed;

		    public ButtonEditor(JCheckBox checkBox) {
		        super(checkBox);
		        button = new JButton();
		        button.setOpaque(true);
		        button.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                fireEditingStopped();
		            }
		        });
		    }

		    @Override
		    public Component getTableCellEditorComponent(JTable table, Object value,
		            boolean isSelected, int row, int column) {
		        if (isSelected) {
		            button.setForeground(table.getSelectionForeground());
		            button.setBackground(table.getSelectionBackground());
		        } else {
		            button.setForeground(table.getForeground());
		            button.setBackground(table.getBackground());
		        }
		        r = row;
		        label = (value == null) ? "" : value.toString();
		        button.setText(label);
		        isPushed = true;
		        return button;
		    }

		    @Override
		    public Object getCellEditorValue() {
		    	if (isPushed) {
		        	int i = 0;
		        	int R = r;
		        			//addPassengertoBooking passengerBooking = new addPassengertoBooking(Manage.get_Trip(R));
		        			//passengerBooking.pack();
		        			//passengerBooking.setLocationRelativeTo(null);
		        			//passengerBooking.setVisible(true);
		        	try{
		        		Booking_Overview_GUI viewBooking = new Booking_Overview_GUI(Manage.get_Booking_at_ID(Manage.get_Trip(R).getE_ID()));
		        		viewBooking.pack();
						viewBooking.setLocationRelativeTo(null);
						viewBooking.setVisible(true);
		        	}
		        	catch(Exception e){
		        	Booking_Overview_GUI viewBooking = new Booking_Overview_GUI(new Booking_Manager(Manage.get_Trip(R)));
					viewBooking.pack();
					viewBooking.setLocationRelativeTo(null);
					viewBooking.setVisible(true);
					}
		    	}
		        isPushed = false;
		        return label;
		    }

		    @Override
		    public boolean stopCellEditing() {
		        isPushed = false;
		        return super.stopCellEditing();
		    }

		    @Override
		    protected void fireEditingStopped() {
		        super.fireEditingStopped();
		   }
	}	
}

