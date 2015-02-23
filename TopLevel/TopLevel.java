//Following this guide here
//http://docs.oracle.com/javase/tutorial/uiswing/components/toplevel.html

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TopLevel
{
  public static void showGui() {
    //Create and set up the window
    JFrame frame = new JFrame("Window Title");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //Now create the menu bar
    JMenuBar myMenu = new JMenuBar();
    myMenu.setOpaque(true);
    myMenu.setBackground(new Color(200, 200, 200));
    myMenu.setPreferredSize(new Dimension(200, 20));

    //Add a label
    JLabel myLabel = new JLabel("this Label");
    myLabel.setOpaque(true);
    myLabel.setBackground(new Color(255, 255, 255));
    myLabel.setPreferredSize(new Dimension(200, 180));

    //Combine the label and menu with the frame
    frame.setJMenuBar(myMenu);
    frame.getContentPane().add(myLabel, BorderLayout.CENTER);

    //Now send to the display
    frame.pack();
    frame.setVisible(true);
  }

  public static void main (String [] args) {
    //This is an event queue
    javax.swing.SwingUtilities.invokeLater(new Runnable () {
      public void run () {
        showGui ();
      }
    });
    System.out.println("Window Dispatched");
  }
}
