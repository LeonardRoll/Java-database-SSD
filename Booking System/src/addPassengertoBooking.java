import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import java.awt.*;
import java.awt.event.*;

public class addPassengertoBooking extends JFrame{
	private static final long serialVersionUID = 1L;
		//Global Attributes
		ListManager Manage = Main_GUI.Manage;
		Booking_Manager TheBooking;
		
		public addPassengertoBooking(Booking_Manager Booking){
			/*Layout*/
			setTitle("Booking System: Passenger Booking");
			this.setLayout(new BorderLayout());
			TheBooking = Booking;
			//North
			JLabel Title = new JLabel("Choose Passenger");
			JPanel North_Panel = new JPanel();
			North_Panel.setLayout(new FlowLayout(FlowLayout.CENTER));
			North_Panel.add(Title);
			this.add(North_Panel,"North");
			
			//Center
			JPanel Center_Table_Panel = new JPanel();
			/*Table Creation*/
			DefaultTableModel Table_Model = new DefaultTableModel();
			
			Object[] col = {"ID","First Name","Last Name","Book"};
			Object[][] object = new Object[Manage.getPassengerListSize()][col.length];
			
			if(Manage.getExcursionListSize() != 0){
				for(int i = 0 ; i < Manage.getPassengerListSize() ; i++){
					object[i][0] = Manage.get_Passenger(i).getP_ID();
					object[i][1] = Manage.get_Passenger(i).getPassenger_Name().getFirst_Name();
					object[i][2] = Manage.get_Passenger(i).getPassenger_Name().getLast_Name();
					object[i][3] = "Book";
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
			this.add(Center_Table_Panel,"Center");
			
			//South
			JPanel South_Panel = new JPanel();
			JButton Overview_Button = new JButton("Overview");
			JButton Save_Button = new JButton("Save");
			South_Panel.setLayout(new FlowLayout(FlowLayout.CENTER));
			South_Panel.add(Overview_Button);
			South_Panel.add(Save_Button);
			this.add(South_Panel,"South");
			
			/*Listener*/
			Save_Button_Listener Save_Button_Listen = new Save_Button_Listener();
			Save_Button.addActionListener(Save_Button_Listen);
			}
		
		/*Listener Classes*/
		public class Save_Button_Listener implements ActionListener{
			public void actionPerformed(ActionEvent ev){
					Manage.RemoveObject(Manage.get_Booking_at_ID(TheBooking.getID()));
					Manage.Add_Booking_To_List(TheBooking);
			}
		}
//Button Source: http://stackoverflow.com/questions/13833688/adding-jbutton-to-jtable
		//Extra Source: http://www.java2s.com/Code/Java/Swing-Components/ButtonTableExample.htm
		//This is not my code but the use of a code from a tutorial online
		//Leonard Roll
		class ButtonRenderer extends JButton implements TableCellRenderer {

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
		        	TheBooking.addPassenger(Manage.get_Passenger(R));
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
