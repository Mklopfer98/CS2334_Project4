package GUI;

import java.awt.*;
import javax.swing.*;

public class TabelPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	/** Panel to hold the table **/
	JPanel contain = new JPanel();
	
	/** JTable to hold the values the user wishes to display **/
	JTable table = new JTable();
	

	public TabelPanel() {
		setLayout(new BorderLayout());
		table.setFont(MesonetFrame.timesRoman);
		contain.setBackground(Color.WHITE);
		
		contain.add(table);
		add(contain);
		
	}
}
