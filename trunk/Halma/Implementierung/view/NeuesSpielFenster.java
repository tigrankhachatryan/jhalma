package view;
import model.*;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;

public class NeuesSpielFenster{

	private JFrame frame;
	private JButton buttonOK, buttonAbbrechen;
	private JLabel labelAnzahlSpieler, labelFarbeSpieler, labelSpieler1, labelSpieler2, labelSpieler3, labelSpieler4, labelSpieler5, labelSpieler6;
	private JComboBox comboBoxAnzahlSpieler, comboBoxFarbeSpieler1, comboBoxFarbeSpieler2, comboBoxFarbeSpieler3, comboBoxFarbeSpieler4, comboBoxFarbeSpieler5, comboBoxFarbeSpieler6;
	private JPanel panelLeer;
	private GridBagConstraints c;
	
	/*
	 * Standard-Konstruktor.
	 */
	public NeuesSpielFenster(){
		// Basiseinstellungen	
		this.frame = new JFrame("Neues Spiel");
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
	public void setAllocations(){
	
		this.c = new GridBagConstraints();
		// buttonOK
		this.c.gridx = 3;
		this.c.gridy = 9;
		this.c.weightx = 0.5;
		this.c.weighty = 1.0;
		this.c.anchor = GridBagConstraints.PAGE_END;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,2,2,2);
		this.frame.getContentPane().add(buttonOK, c);
		// buttonAbbrechen
		this.c.gridx = 2;
		this.c.gridy = 9;
		this.c.weightx = 0.5;
		this.c.weighty = 1.0;
		this.c.anchor = GridBagConstraints.PAGE_END;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,2,2,2);
		this.frame.getContentPane().add(buttonAbbrechen, c);
		// labelAnzahlSpieler
		this.c.gridx = 1;
		this.c.gridy = 0;
		this.c.gridwidth = 2;
		this.c.weightx = 0.5;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,2,2,2);
		this.frame.getContentPane().add(labelAnzahlSpieler, c);
		// comboBoxAnzahlSpieler
		this.c.gridx = 1;
		this.c.gridy = 1;
		this.c.gridwidth = 2;
		this.c.weightx = 0.5;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,2,20,2);
		this.comboBoxAnzahlSpieler.addItem(new String("2 Spieler"));
		this.comboBoxAnzahlSpieler.addItem(new String("3 Spieler"));
		this.comboBoxAnzahlSpieler.addItem(new String("4 Spieler"));
		this.comboBoxAnzahlSpieler.addItem(new String("6 Spieler"));
		this.frame.getContentPane().add(comboBoxAnzahlSpieler, c);	
		// labelFarbeSpieler
		this.c.gridx = 1;
		this.c.gridy = 2;
		this.c.gridwidth = 2;
		this.c.weightx = 0.5;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,2,2,2);
		this.frame.getContentPane().add(labelFarbeSpieler, c);
		// labelSpieler1
		this.c.gridx = 1;
		this.c.gridy = 3;
		this.c.weightx = 0.5;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,2,2,2);
		this.frame.getContentPane().add(labelSpieler1, c);
		// labelSpieler 2
		this.c.gridx = 1;
		this.c.gridy = 4;
		this.c.weightx = 0.5;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,2,2,2);
		this.frame.getContentPane().add(labelSpieler2, c);
		// labelSpieler 3
		this.c.gridx = 1;
		this.c.gridy = 5;
		this.c.weightx = 0.5;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,2,2,2);
		this.frame.getContentPane().add(labelSpieler3, c);
		// labelSpieler 4
		this.c.gridx = 1;
		this.c.gridy = 6;
		this.c.weightx = 0.5;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,2,2,2);
		this.frame.getContentPane().add(labelSpieler4, c);
		// labelSpieler 5
		this.c.gridx = 1;
		this.c.gridy = 7;
		this.c.weightx = 0.5;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,2,2,2);
		this.frame.getContentPane().add(labelSpieler5, c);
		// labelSpieler 6
		this.c.gridx = 1;
		this.c.gridy = 8;
		this.c.weightx = 0.5;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,2,20,2);
		this.frame.getContentPane().add(labelSpieler6, c);
		// comboBoxSpieler 1
		this.c.gridx = 2;
		this.c.gridy = 3;
		this.c.weightx = 0.5;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,2,2,2);
		this.füllen(this.comboBoxFarbeSpieler1);
		this.frame.getContentPane().add(comboBoxFarbeSpieler1, c);
		// comboBoxSpieler 2
		this.c.gridx = 2;
		this.c.gridy = 4;
		this.c.weightx = 0.5;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,2,2,2);
		this.füllen(this.comboBoxFarbeSpieler2);
		this.frame.getContentPane().add(comboBoxFarbeSpieler2, c);
		// comboBoxSpieler 3
		this.c.gridx = 2;
		this.c.gridy = 5;
		this.c.weightx = 0.5;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,2,2,2);
		this.füllen(this.comboBoxFarbeSpieler3);
		this.frame.getContentPane().add(comboBoxFarbeSpieler3, c);
		// comboBoxSpieler 4
		this.c.gridx = 2;
		this.c.gridy = 6;
		this.c.weightx = 0.5;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,2,2,2);
		this.füllen(this.comboBoxFarbeSpieler4);
		this.frame.getContentPane().add(comboBoxFarbeSpieler4, c);
		// comboBoxSpieler 5
		this.c.gridx = 2;
		this.c.gridy = 7;
		this.c.weightx = 0.5;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,2,2,2);
		this.füllen(this.comboBoxFarbeSpieler5);
		this.frame.getContentPane().add(comboBoxFarbeSpieler5, c);
		// comboBoxSpieler 6
		this.c.gridx = 2;
		this.c.gridy = 8;
		this.c.weightx = 0.5;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,2,20,2);
		this.füllen(this.comboBoxFarbeSpieler6);
		this.frame.getContentPane().add(comboBoxFarbeSpieler6, c);
		// panelLeer
		this.c.gridx = 0;
		this.c.gridy = 0;
		this.c.gridheight = 10;
		this.c.weightx = 0.5;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,2,2,80);
		this.frame.getContentPane().add(panelLeer, c);
	}
	
	/*
	 * Hilfsmethode
	 */
	public void initializeSwingElements(){
	
		this.buttonOK = new JButton("        OK        "); // Die Leerzeichen sollen die size des Buttons anpassen.
		
		this.buttonAbbrechen = new JButton("Abbrechen");
		
		this.labelAnzahlSpieler = new JLabel("Wählen Sie die Anzahl der Spieler aus.");
		
		this.comboBoxAnzahlSpieler = new JComboBox();	
		
		this.labelFarbeSpieler = new JLabel("Wählen Sie die Farbe der Spieler aus.");
		
		this.labelSpieler1 = new JLabel("Spieler 1");
		
		this.labelSpieler2 = new JLabel("Spieler 2");
		
		this.labelSpieler3 = new JLabel("Spieler 3");
		
		this.labelSpieler4 = new JLabel("Spieler 4");

		this.labelSpieler5 = new JLabel("Spieler 5");
		
		this.labelSpieler6 = new JLabel("Spieler 6");
		
		this.comboBoxFarbeSpieler1 = new JComboBox();
		
		this.comboBoxFarbeSpieler2 = new JComboBox();
		
		this.comboBoxFarbeSpieler3 = new JComboBox();
		
		this.comboBoxFarbeSpieler4 = new JComboBox();
		
		this.comboBoxFarbeSpieler5 = new JComboBox();
		
		this.comboBoxFarbeSpieler6 = new JComboBox();
		
		this.panelLeer = new JPanel();
	}
	
	/*
	 * Hilfsmethode
	 */
	public void füllen(JComboBox comboBox){
	
		Farbe[] arrayFarben = Farbe.values();
		
		for(Farbe f : arrayFarben){
			if(f != Farbe.KF && f != Farbe.Frei)
				comboBox.addItem(f);
		}		
	}
}