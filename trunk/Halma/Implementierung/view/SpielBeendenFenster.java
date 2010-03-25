package view;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SpielBeendenFenster{
	
	private JFrame frame;
	private JButton buttonJa, buttonNein;
	private JLabel labelSpielBeenden;
	private GridBagConstraints c;
	
	/*
	 * Standard-Konstruktor.
	 */
	public SpielBeendenFenster(){
		// Basiseinstellungen
		this.frame = new JFrame("Spiel beenden");
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.getContentPane().setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		this.frame.getContentPane().setLayout(new GridBagLayout());
		// Komponenten hinzufügen
		this.initializeSwingElements();
		this.setAllocations();
		// Fenstergröße anpassen und zeigen
		this.frame.pack();	
		this.frame.setVisible(true);
	}
	
	/*
	 * Hilfsmethode
	 */
	 public void initializeSwingElements(){
		
		this.buttonJa = new JButton("Ja");
		
		this.buttonNein = new JButton("         Nein         "); // Die Leerzeichen sollen die size des Buttons anpassen.
		
		this.labelSpielBeenden = new JLabel("Möchten Sie das Spiel wirklich beenden?");
	 }
	 
	/*
	 * Hilfsmethode
	 */
	public void setAllocations(){
		
		this.c = new GridBagConstraints();
		// buttonJa
		this.c.gridx = 2;
		this.c.gridy = 1;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,2,2,2);
		this.frame.getContentPane().add(buttonJa, c);
		// buttonNein
		this.c.gridx = 1;
		this.c.gridy = 1;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,2,2,2);
		this.frame.getContentPane().add(buttonNein, c);
		// labelSpielBeenden
		this.c.gridx = 1;
		this.c.gridy = 0;
		this.c.gridwidth = 2;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,2,2,2);
		this.frame.getContentPane().add(labelSpielBeenden, c);
	}
}