package implementierung.controller;

import view.*;
import java.awt.event.*;

public class SpielBeendenButtonListener implements ActionListener{

	public SpielBeendenButtonListener(){
	
	}
	
	public void actionPerformed(ActionEvent e){
		
		new SpielBeendenFenster();
	}
}