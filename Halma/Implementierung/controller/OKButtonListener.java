package implementierung.controller;

import view.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class OKButtonListener implements ActionListener{
	
	private JFrame frame;
	
	public OKButtonListener(JFrame frame){
		
		this.frame = frame;
	}
	
	public void actionPerformed(ActionEvent e){
	
		this.frame.dispose();
	}
}