
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.util.ArrayList;

public class Search_List extends JFrame {
	
	ListManager Manage = Main_GUI.Manage;
	ArrayList<Integer> Result;
	public Search_List(ArrayList<Integer> Results)
	{
		setTitle("Please Select From Results Below");
		Result = Results;
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
	/*Table Creation*/
	DefaultTableModel Table_Model = new DefaultTableModel();
	
	Object[] col = {"Passenger","Select"};
	
	Object[][] object = new Object[Results.size()][col.length];
	
	if(Results.size() != 0){
		for(int i = 0 ; i < Results.size() ; i++){
			int R = Results.get(i);
			object[i][0] = Manage.get_Passenger_at_ID(R).getFull_Name();
			object[i][1] = "Select";
		}
	}
	
	Table_Model.setDataVector(object,col);
	
	JTable Table = new JTable(Table_Model);
	Table.getColumn("Select").setCellRenderer(new ButtonRenderer());
	Table.getColumn("Select").setCellEditor(new ButtonEditor(new JCheckBox()));
	Table.setPreferredScrollableViewportSize(new Dimension(500,70));
	Table.setFillsViewportHeight(true);
	
	JScrollPane Table_Scroll = new JScrollPane(Table);
	Center_Table_Panel.add(Table_Scroll,"Center");
	
	}
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

	    protected JButton button;
	    private String label;
	    private int r;
	    private boolean isPushed;

	    public ButtonEditor(JCheckBox checkBox) {
	        super(checkBox);
	        button = new JButton();
	        button.setOpaque(true);
	        button.addActionListener(new ActionListener() {
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
	        r=row;
	        label = (value == null) ? "" : value.toString();
	        button.setText(label);
	        isPushed = true;
	        return button;
	    }

	    @Override
	    public Object getCellEditorValue() {
	        if (isPushed) {
	        	int R = Result.get(r);
				Manage.get_Passenger_at_ID(R).getFull_Name();
	        	Search_Result Search_Result_Window = new Search_Result(Manage.get_Passenger_at_ID(R));
				Search_Result_Window.pack();
				Search_Result_Window.setLocationRelativeTo(null);
				Search_Result_Window.setVisible(true);
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

