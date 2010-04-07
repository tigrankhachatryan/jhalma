package controller;

import view.*;
import java.awt.event.*;
import javax.swing.JDialog;

public class AbbrechenButtonListener implements ActionListener{
	
	private JDialog dialog;
	
	public AbbrechenButtonListener(JDialog dialog){
		
		this.dialog = dialog;
	}
	
	public void actionPerformed(ActionEvent e){
	
		this.dialog.dispose();
	}
}