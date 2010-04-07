package controller;

import view.*;
import java.awt.event.*;
import javax.swing.JDialog;

public class OKButtonListener implements ActionListener{
	
	private JDialog dialog;
	
	public OKButtonListener(JDialog dialog){
		
		this.dialog = dialog;
	}
	
	public void actionPerformed(ActionEvent e){
	
		this.dialog.dispose();
	}
}