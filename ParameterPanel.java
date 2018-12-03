package GUI;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class ParameterPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/** Button that can be pressed if TAIR is chosen **/
	private JCheckBox TAIR = new JCheckBox("TAIR");

	/** Button that can be pressed if TA9M is chosen **/
	private JCheckBox TA9M = new JCheckBox("TA9M");

	/** Button that can be pressed if TAIR is chosen **/
	private JCheckBox SRAD = new JCheckBox("SRAD");

	/** Button that can be pressed if TA9M is chosen **/
	private JCheckBox WSPD = new JCheckBox("WSPD");

	/** Button that can be pressed if TAIR is chosen **/
	private JCheckBox PRES = new JCheckBox("PRES");

	/** New border for the parameter choices **/
	private TitledBorder parameter = new TitledBorder(MesonetFrame.blackline, "Parameter");

	/**
	 * Constructor for the parameter panel that will hold the parameters the user
	 * may chose to get statistics from.
	 * 
	 */
	public ParameterPanel() {

		/** Set the layout, font and the border of the JPanel **/
		parameter.setTitleFont(MesonetFrame.timesRoman);
		setLayout(new GridLayout(5, 0));
		setBorder(parameter);
		
		/** Add all of the components of the JPanel **/
		add(TAIR).setFont(MesonetFrame.timesRoman);
		add(TA9M).setFont(MesonetFrame.timesRoman);
		add(SRAD).setFont(MesonetFrame.timesRoman);
		add(WSPD).setFont(MesonetFrame.timesRoman);
		add(PRES).setFont(MesonetFrame.timesRoman);

	}
}
