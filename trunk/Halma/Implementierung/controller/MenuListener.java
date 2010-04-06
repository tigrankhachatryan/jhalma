package controller;

import view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MenuListener implements ActionListener{

	public MenuListener() {
		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("AC_NEUES_SPIEL"))
			new NeuesSpielFenster();
		else if(e.getActionCommand().equals("AC_EINSTELLUNGEN"))
			new EinstellungenFenster();
		else if(e.getActionCommand().equals("AC_BEENDEN"))
			new SpielBeendenFenster();
		else {}
	}

}