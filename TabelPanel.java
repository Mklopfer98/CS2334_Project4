package GUI;

import java.awt.*;
import javax.swing.*;

public class TabelPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	/** JTable to hold the values the user wishes to display **/
	private JTable table = new JTable(100, 6);
	
	/** Create the table column values **/
	private String[] columNames = {"Station", "Parameter", "Statistics", "Value", "Reporting Stations", "Data"};
	
	/** Create scroll pane **/
	private JScrollPane scroll = new JScrollPane(table);

	public TabelPanel() {
		
		// Set the headers of the table
		for (int i = 0; i < columNames.length; ++i) {
			table.getColumnModel().getColumn(i).setHeaderValue(columNames[i]);
		}
		
		setLayout(new BorderLayout());
		table.setFont(MesonetFrame.timesRoman);
		table.setBackground(Color.WHITE);
		
		
		add(scroll);
		
	}
}
