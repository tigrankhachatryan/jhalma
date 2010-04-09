package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Locale;
 
public class SpielBeendenFenster{

	/*
	 * Custom-Konstruktor.
	 */
	public SpielBeendenFenster(JFrame owner){
		
		JOptionPane.setDefaultLocale(Locale.GERMAN);
		
		int n = JOptionPane.showOptionDialog(owner,"Willst du das Spiel wirklich beenden ?", "Spiel Beenden", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
		
		if(n == JOptionPane.YES_OPTION){
			// User hat Ja geklickt
			System.exit(0);	
		}
		// Wenn der User Nein anklickt schlieﬂt sich das Fenster per Default.
	}
}