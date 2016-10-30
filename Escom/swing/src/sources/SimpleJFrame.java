package sources;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;

public class SimpleJFrame{
	private static void createAndShowGUI(){
		//Create and set up the window
		JFrame jframe = new JFrame();
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Create JMenuBar which is out of the content pane
		JMenuBar menu = new JMenuBar();		
		menu.setOpaque(true);
		menu.setBackground(new Color(154, 165, 127));
	    menu.setPreferredSize(new Dimension(200, 20));
	    
	    //Create a yellow label to put in the content pane.
        JLabel yellowLabel = new JLabel();
        yellowLabel.setText("Hello Swing pro");
        yellowLabel.setOpaque(true);
        yellowLabel.setBackground(new Color(248, 213, 131));
        yellowLabel.setPreferredSize(new Dimension(200, 180));
 
        //Set the menu bar and add the label to the content pane.
        jframe.setJMenuBar(menu);
        jframe.getContentPane().add(yellowLabel, BorderLayout.CENTER);
        
		//Display the window
		jframe.pack();
		jframe.setVisible(true);
	}
	public static void main(String args[]){
		//equivalent for java.awt.EventQueue.invokeLater{...}
		javax.swing.SwingUtilities.invokeLater(new Runnable() {//Using an anonymus class implementing Runnable
			@Override
			public void run() {
				//implementing code block for run() method from Runnable interface
				createAndShowGUI();
			}
		});
	}
}
//https://docs.oracle.com/javase/8/javafx/interoperability-tutorial/swing-fx-interoperability.htm