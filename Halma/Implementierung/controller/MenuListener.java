package controller;

import view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class MenuListener implements ActionListener{

	private JFrame mainFrame;
	
	public MenuListener(JFrame mainFrame) {
			this.mainFrame = mainFrame;
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("AC_NEUES_SPIEL"))
			new NeuesSpielFenster(this.mainFrame);
		else if(e.getActionCommand().equals("AC_EINSTELLUNGEN"))
			new EinstellungenFenster(this.mainFrame);
		else if(e.getActionCommand().equals("AC_BEENDEN"))
			new SpielBeendenFenster(this.mainFrame);
		else {}
	}

}