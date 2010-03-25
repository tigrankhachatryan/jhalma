package view;
import model.*;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JMenu;

public class HalmaFenster extends JFrame{

	private JButton buttonSpielBeenden, buttonNeuesSpiel, buttonEinstellungen;
	private JLabel labelReihe, labelAnzahlZuege, labelSpieler, labelZuege;
	private JMenu menuHorizontal;
	private JPanel panelLeer;
	private GridBagConstraints cBSpielBeenden, cBNeuesSpiel, cBEinstellungen, cLReihe, cLAnzahlZuege, cLSpieler, cLZuege, cMHorizontal, cPLeer;
	
	public HalmaFenster{
		
		super("Halma");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		this.getContentPane().setLayout(new GridBagLayout());
		
		this.buttonSpielBeenden = new JButton("Spiel beenden");
		this.cBSpielBeenden = new GridBagConstraints();
		this.cBSpielBeenden.gridx = 2;
		this.cBSpielBeenden.gridy = 2;
		this.cBSpielBeenden.weightx = 0.5;
		this.cBSpielBeenden.weighty = 1.0;
		this.cBSpielBeenden.gridheight = 2;
		this.cBSpielBeenden.anchor = GridBagConstraints.PAGE_END;
		this.cBSpielBeenden.fill = GridBagConstraints.HORIZONTAL;
		this.cBSpielBeenden.insets = new Insets(2,2,2,2);
		this.getContentPane().add(buttonSpielBeenden, cBSpielBeenden);
		
		this.buttonNeuesSpiel = new JButton("Neues Spiel");
		this.cBNeuesSpiel = new GridBagConstraints();
		this.cBNeuesSpiel.gridx = 3;
		this.cBNeuesSpiel.gridy = 2;
		this.cBNeuesSpiel.weightx = 0.5;
		this.cBNeuesSpiel.weighty = 1.0;
		this.cBNeuesSpiel.gridheight = 2;
		this.cBNeuesSpiel.anchor = GridBagConstraints.PAGE_END;
		this.cBNeuesSpiel.fill = GridBagConstraints.HORIZONTAL;
		this.cBNeuesSpiel.insets = new Insets(2,2,2,2);
		this.getContentPane().add(buttonNeuesSpiel, cBNeuesSpiel);
		
		this.buttonEinstellungen = new JButton("Einstellungen");
		this.cBEinstellungen = new GridBagConstraints();
		this.cBEinstellungen.gridx = 4;
		this.cBEinstellungen.gridy = 2;
		this.cBEinstellungen.weightx = 0.5;
		this.cBEinstellungen.weighty = 1.0;
		this.cBEinstellungen.gridheight = 2;
		this.cBEinstellungen.anchor = GridBagConstraints.PAGE_END;
		this.cBEinstellungen.fill = GridBagConstraints.HORIZONTAL;
		this.cBEinstellungen.insets = new Insets(2,2,2,2);
		this.getContentPane().add(buttonEinstellungen, cBEinstellungen);
		
		this.labelReihe = new JLabel("Wer ist an der Reihe?");
		this.cLReihe = new GridBagConstraints();
		this.cLReihe.gridx = 0;
		this.cLReihe.gridy = 2;
		this.cLReihe.weightx = 0.5;
		this.cLReihe.fill = GridBagConstraints.HORIZONTAL;
		this.cLReihe.insets = new Insets(2,2,2,2);
		this.getContentPane().add(labelReihe, cLReihe);
		
		this.labelAnzahlZuege = new JLabel("Anzahl der Züge");
		this.cLAnzahlZuege = new GridBagConstraints();
		this.cLAnzahlZuege.gridx = 1;
		this.cLAnzahlZuege.gridy = 2;
		this.cLAnzahlZuege.weightx = 0.5;
		this.cLAnzahlZuege.fill = GridBagConstraints.HORIZONTAL;
		this.cLAnzahlZuege.insets = new Insets(2,2,2,2);
		this.getContentPane().add(labelAnzahlZuege, cLAnzahlZuege);
		
		this.labelSpieler = new JLabel("");
		this.cLSpieler = new GridBagConstraints();
		this.cLSpieler.gridx = 0;
		this.cLSpieler.gridy = 3;
		this.cLSpieler.weightx = 0.5;
		this.cLSpieler.fill = GridBagConstraints.HORIZONTAL;
		this.cLSpieler.insets = new Insets(2,2,2,2);
		this.getContentPane().add(labelSpieler, cLSpieler);
		
		this.labelZuege = new JLabel("");
		this.cLZuege = new GridBagConstraints();
		this.cLZuege.gridx = 1;
		this.cLZuege.gridy = 3;
		this.cLZuege.weightx = 0.5;
		this.cLZuege.fill = GridBagConstraints.HORIZONTAL;
		this.cLZuege.insets = new Insets(2,2,2,2);
		this.getContentPane().add(labelZuege, cLZuege);
		
		this.menuHorizontal = new JMenu();
		this.cMHorizontal = new GridBagConstraints();
		this.cMHorizontal.gridx = 0;
		this.cMHorizontal.gridy = 0;
		this.cMHorizontal.gridwidth = 5;
		this.cMHorizontal.weightx = 0.5;
		this.cMHorizontal.fill = GridBagConstraints.HORIZONTAL;
		this.cMHorizontal.insets = new Insets(2,2,2,2);
		
		this.panelLeer = new JPanel();
		this.cPLeer = new GridBagConstraints();
		this.cPLeer.gridx = 0;
		this.cPLeer.gridy = 1;
		this.cPLeer.gridwidth = 5;
		this.cPLeer.gridheight = 4;
		this.cPLeer.weightx = 0.5;
		this.cPLeer.fill = GridBagConstraints.HORIZONTAL;
		this.cPLeer.insets = new Insets(0,0,0,0);
		this.getContentPane().add(panelLeer, cPLeer);
		
		this.pack();
		
		this.setVisible(true);
	}

}