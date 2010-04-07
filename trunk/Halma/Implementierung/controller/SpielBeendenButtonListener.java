package controller;

import view.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class SpielBeendenButtonListener implements ActionListener{

	private JFrame mainFrame;
	
	public SpielBeendenButtonListener(JFrame mainFrame){
		this.mainFrame = mainFrame;
	}
	
	public void actionPerformed(ActionEvent e){
		
		new SpielBeendenFenster(this.mainFrame);
	}
}