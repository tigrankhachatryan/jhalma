package controller;

import view.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class EinstellungenButtonListener implements ActionListener{
	
	private JFrame mainframe;
	
	public EinstellungenButtonListener(JFrame mainframe){
		this.mainframe = mainframe;
	}
	
	public void actionPerformed(ActionEvent e){
		
		new EinstellungenFenster(this.mainframe);
	}
}