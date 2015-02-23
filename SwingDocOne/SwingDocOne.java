import javax.swing.*;

public class SwingDocOne
{
	public static void main (String [] args) {

		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				guii();
			}
		});
	}

	public static void guii() {
		
		//Create the window and configure
		JFrame frame = new JFrame("Window Title");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Add the label
		JLabel label = new JLabel("Hullo wold");
		frame.getContentPane().add(label);

		//Display said window
		frame.pack();
		frame.setVisible(true);
	}

}