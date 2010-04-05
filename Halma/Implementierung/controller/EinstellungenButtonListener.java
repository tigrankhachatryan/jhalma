package implementierung.controller;

import view.*;
import java.awt.event.*;

public class EinstellungenButtonListener implements ActionListener{

	public EinstellungenButtonListener(){
	
	}
	
	public void actionPerformed(ActionEvent e){
		
		new EinstellungenFenster();
	}
}