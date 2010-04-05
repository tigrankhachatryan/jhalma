package controller;

import view.*;
import java.awt.event.*;

public class NeuesSpielButtonListener implements ActionListener{

	public NeuesSpielButtonListener(){
	
	}
	
	public void actionPerformed(ActionEvent e){
		
		new NeuesSpielFenster();
	}
}