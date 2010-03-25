package view;
import model.*;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;

public class EinstellungenFenster{
	
	private JFrame frame;
	private JButton buttonAbbrechen, buttonOK;
	private JLabel labelFarbeSpielbrett;
	private JComboBox comboBoxFarbeSpielbrett;
	private JPanel panelLeer;
	private GridBagConstraints c;
	
	/*
	 * Standard-Konstruktor.
	 */
	public EinstellungenFenster(){
		// Basiseinstellungen
		this.frame = new JFrame("Einstellungen");
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.getContentPane().setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		this.frame.getContentPane().setLayout(new GridBagLayout());
		// Komponenten hinzufügen
		this.initializeSwingElements();
		this.setAllocations();
		// Fenstergrösse anpasen und zeigen
		this.frame.pack();	
		this.frame.setVisible(true);
	}
	
	/*
	 * Hilfsmethode
	 */
	private void initializeSwingElements(){
		
		this.buttonAbbrechen = new JButton("Abbrechen");
		
		this.buttonOK = new JButton("        OK        "); // Die Leerzeichen sollen die size des Buttons anpassen.
		
		this.labelFarbeSpielbrett = new JLabel("Farbe des Spielbretts");
		
		this.comboBoxFarbeSpielbrett = new JComboBox();
		//-------------------------------------------------------
		Farbe[] arrayFarben = Farbe.values();
		for(Farbe f : arrayFarben){
			if(f != Farbe.KF && f != Farbe.Frei)
				this.comboBoxFarbeSpielbrett.addItem(f);
		}		
		//-------------------------------------------------------
		
		this.panelLeer = new JPanel();
	}
	
	/*
	 * Hilfsmethode
	 */
	private void setAllocations(){
		
		this.c = new GridBagConstraints();
		// buttonAbbrechen
		this.c.gridx = 2;
		this.c.gridy = 3;
		this.c.weightx = 0.5;
		this.c.weighty = 1.0;
		this.c.anchor = GridBagConstraints.PAGE_END;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,50,2,2);
		this.frame.getContentPane().add(buttonAbbrechen, c);
		// buttonOK	
		this.c.gridx = 3;
		this.c.gridy = 3;
		this.c.weightx = 0.5;
		this.c.weighty = 1.0;
		this.c.anchor = GridBagConstraints.PAGE_END;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,2,2,2);
		this.frame.getContentPane().add(buttonOK, c);
		// labelFarbeSpielbrett
		this.c.gridx = 0;
		this.c.gridy = 0;
		this.c.weightx = 0.5;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,2,2,2);
		this.frame.getContentPane().add(labelFarbeSpielbrett, c);
		// comboBoxFarbeSpielbrett
		this.c.gridx = 0;
		this.c.gridy = 1;
		this.c.weightx = 0.5;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,2,2,2);
		this.frame.getContentPane().add(comboBoxFarbeSpielbrett, c);
		// panelLeer
		this.c.gridx = 0;
		this.c.gridy = 2;
		this.c.gridwidth = 3;
		this.c.weightx = 0.5;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(0,0,100,100);
		this.frame.getContentPane().add(panelLeer, c);	
	}
}