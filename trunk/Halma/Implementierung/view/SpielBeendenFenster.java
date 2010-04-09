package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Locale;
 
public class SpielBeendenFenster{

	/*
	 * Custom-Konstruktor.
	 */
	public SpielBeendenFenster(JFrame owner){
		
		Object[] options = {"Ja", "Nein"};
		int n = JOptionPane.showOptionDialog(owner,"Willst du das Spiel wirklich beenden ?", "Spiel Beenden",
										JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
		if(n==0)
			System.exit(0);		
	}
}