package GUI;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class MesonetFrame extends JFrame {

	public static final long serialVersionUID = 1L;

	/** Create a new Font **/
	protected static Font timesRoman = new Font("TimesRoman", Font.BOLD, 18);

	/** Create the black border **/
	protected static Border blackline = BorderFactory.createLineBorder(Color.BLACK);

	/** Create a color for the back Panels (New custom color) **/
	protected static final Color BACK = new Color(220, 220, 220);

	/** Panel to hold the Parameters and the Statistics choices **/
	JPanel paramStat = new JPanel();

	public MesonetFrame(String title) {
		super(title);

		/**
		 * Add the panel that contains the parameter and statistics options list
		 **/
		paramStat.setLayout(new GridLayout(0, 2));
		paramStat.add(new ParameterPanel());
		paramStat.add(new StatisticsPanel());
		add(paramStat, BorderLayout.WEST);

		/** Add the panels to the frame from the other class **/
		add(new TabelPanel(), BorderLayout.CENTER);
		add(new BottomPanel(), BorderLayout.SOUTH);
		add(new FileMenuBar("File"), BorderLayout.NORTH);

		// Configure the frame

		setSize(900, 700);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	/**
	 * This class is a subset class of the MesonetFrame class that will hold the
	 * components of the file menu bar that will allow the user to choose a file to
	 * calculate statistics on and exit the program. This class will also contain
	 * the slogan for the program that is displayed just under the file menu bar
	 * 
	 * @author Matthew Klopfer
	 *
	 */
	public class FileMenuBar extends JMenuBar {

		private static final long serialVersionUID = 1L;

		/** Create the menu bar **/
		JMenu file = new JMenu("File");
		JMenuItem getFile = new JMenuItem("Open Data File");
		JMenuItem exit = new JMenuItem("Exit");

		/** JPanel to hold the slogan of our program **/
		JPanel slogan = new JPanel();

		/** Slogan of the program **/
		JLabel meso = new JLabel("Mesonet - We don't set records, we report them!");

		public FileMenuBar(String title) {

			setLayout(new GridLayout(2, 0));

			/** Set up the menu **/
			// Change font of all menu components
			getFile.setFont(timesRoman);
			exit.setFont(timesRoman);
			file.setFont(timesRoman);
			meso.setFont(timesRoman);

			// Add the slogan to the JPanel
			slogan.add(meso);
			slogan.setBackground(Color.GRAY); // Set the color of the slogan label

			// Add menu components to the menu bar
			file.add(getFile);
			file.add(exit);

			add(file); // Add the component list to the menu, and the slogan bar
			add(slogan);
		}

	}

	/**
	 * This public method will hold the bottom panel to hold the calculate and the
	 * exit buttons for the user to activate when they please
	 * 
	 * @author Matthew Klopfer
	 *
	 */
	public class BottomPanel extends JPanel {

		private static final long serialVersionUID = 1L;

		/** JButton to hold the calculate script **/
		private JButton calc = new JButton("Calculate");

		/** JButton to hold the exit script **/
		private JButton exit = new JButton("Exit");

		/** Panel to hold the buttons **/
		JPanel buttonPane = new JPanel();

		public BottomPanel() {

			/** Set the layout of the bottom panel **/
			setLayout(new GridLayout(1, 1));

			/** Set the text of the buttons to timesRoman **/
			calc.setFont(timesRoman);
			exit.setFont(timesRoman);

			/** Add the buttons to the bottom panel **/
			buttonPane.add(calc);
			buttonPane.add(exit);
			add(buttonPane);
			pack();
		}
	}

}
