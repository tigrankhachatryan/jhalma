package controller;
import view.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class AbbrechenButtonListener implements ActionListener{
	
	private JFrame frame;
	
	public AbbrechenButtonListener(JFrame frame){
		
		this.frame = frame;
	}
	
	public void actionPerformed(ActionEvent e){
		this.frame.dispose();
	}
}