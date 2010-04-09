import java.awt.Frame;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Locale;
 
public class SpielBeendenFenster{

	private final JOptionPane optionPane;
	private final JDialog dialog;
	
	/*
	 * Custom-Konstruktor.
	 */
	public SpielBeendenFenster(JFrame owner){
		// Initialisierungen
		dialog = new JDialog(owner,"Spiel beenden",true);
		optionPane = new JOptionPane("Möchten Sie das Spiel wirklich beenden?", JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION);
		// optionPane-Einstellungen
		JOptionPane.setDefaultLocale(Locale.GERMAN);
		// optionPane zum dialog hinzufügen
		dialog.setContentPane(optionPane);
		// dialog-Einstellungen
		dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		dialog.setResizable(false);
		// dialog packen und anzeigen
		dialog.pack();
		dialog.setVisible(true);
	}
}