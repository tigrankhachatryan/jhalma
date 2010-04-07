package controller;

import view.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class NeuesSpielButtonListener implements ActionListener{

	private JFrame mainFrame;
	
	public NeuesSpielButtonListener(JFrame mainFrame){
		this.mainFrame = mainFrame;
	}
	
	public void actionPerformed(ActionEvent e){
		
		new NeuesSpielFenster(this.mainFrame);
	}
}