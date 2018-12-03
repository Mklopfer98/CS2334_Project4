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
	
	/** Panel to hold the Parameters and the Statistics choices **/
	JPanel paramStat = new JPanel();

	public MesonetFrame(String title) {
		super(title);
		
		/** Add the panel that contains the parameter and statistics options list **/
		paramStat.setLayout(new GridLayout(0, 2));
		paramStat.add(new ParameterPanel());
		paramStat.add(new StatisticsPanel());
		add(paramStat, BorderLayout.WEST);
		
		add(new FileMenuBar("File"), BorderLayout.NORTH);
		add(new BottomPanel(), BorderLayout.SOUTH);

		// Configure the frame
		setSize(900, 600);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	/** This class is a subset class of the MesonetFrame class that will hold the compnets of the file
	 *  menu bar that will allow the user to choose a file to calculate statistics on and exit the program
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
		
		public FileMenuBar(String title) {
			
			
			/** Set up the menu **/
			// Change font of all menu components
			getFile.setFont(timesRoman);
			exit.setFont(timesRoman);
			file.setFont(timesRoman);
			
			// Add menu components to the menu bar
			file.add(getFile);
			file.add(exit);
			
			add(file); // Add the component list to the menu
		}

	}
	
	/** This public method will hold the bottom panel to hold the calculate and the exit buttons
	 *  for the user to activate when they please
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
