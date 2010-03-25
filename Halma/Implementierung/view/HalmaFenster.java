package view;
import model.*;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class HalmaFenster{

	private JFrame frame;
	private JButton buttonSpielBeenden, buttonNeuesSpiel, buttonEinstellungen;
	private JLabel labelReihe, labelAnzahlZuege, labelSpieler, labelZuege;
	private JMenu menu1, menu2;
	private JMenuBar menuBar;
	private JMenuItem menuItem1, menuItem2, menuItem3, menuItem4, menuItem5, menuItem6;
	private JPanel panelLeer;
	private GridBagConstraints c;
	
	public HalmaFenster(){
		// Basiseinstellungen
		this.frame = new JFrame("Halma");
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.getContentPane().setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		this.frame.getContentPane().setLayout(new GridBagLayout());
		// Komponenten hinzufügen
		this.initializeSwingElements();
		this.setAllocations();
		// Fenstergröße anpassen und zeigen
		// this.frame.pack(); wird hier nicht benötigt, da wir die Fenstergröße selbst festlegen wollen.
		this.frame.setSize(700,600);
		this.frame.setVisible(true);
	}
	
	/*
	 * Hilfsmethode
	 */
	public void initializeSwingElements(){
	
		this.buttonSpielBeenden = new JButton("Spiel beenden");
		
		this.buttonNeuesSpiel = new JButton("Neues Spiel");
		
		this.buttonEinstellungen = new JButton("Einstellungen");
		
		this.labelReihe = new JLabel("Wer ist an der Reihe?");
		
		this.labelAnzahlZuege = new JLabel("Anzahl der Züge");
		
		this.labelSpieler = new JLabel("Spieler 2");
		
		this.labelZuege = new JLabel("23");
		
		this.panelLeer = new JPanel();
		
		this.menuBar = new JMenuBar();
		
		this.menu1 = new JMenu("Spiel");
		
		this.menu2 = new JMenu("Hilfe");
		
		this.menuItem1 = new JMenuItem("Neues Spiel");
		
		this.menuItem2 = new JMenuItem("Einstellungen");
		
		this.menuItem3 = new JMenuItem("Bestenliste");
		
		this.menuItem4 = new JMenuItem("Spiel beenden");
		
		this.menuItem5 = new JMenuItem("Spielregeln");
		
		this.menuItem6 = new JMenuItem("Info");
	}
		
	/*
	 * Hilfsmethode
	 */
	public void setAllocations(){
	
		this.c = new GridBagConstraints();
		// buttonSpielBeenden
		this.c.gridx = 2;
		this.c.gridy = 2;
		this.c.weightx = 0.5;
		this.c.weighty = 1.0;
		this.c.gridheight = 2;
		this.c.anchor = GridBagConstraints.PAGE_END;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,2,2,2);
		this.frame.getContentPane().add(buttonSpielBeenden, c);
		// buttonNeuesSpiel
		this.c.gridx = 3;
		this.c.gridy = 2;
		this.c.weightx = 0.5;
		this.c.weighty = 1.0;
		this.c.gridheight = 2;
		this.c.anchor = GridBagConstraints.PAGE_END;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,2,2,2);
		this.frame.getContentPane().add(buttonNeuesSpiel, c);
		// buttonEinstellungen
		this.c.gridx = 4;
		this.c.gridy = 2;
		this.c.weightx = 0.5;
		this.c.weighty = 1.0;
		this.c.gridheight = 2;
		this.c.anchor = GridBagConstraints.PAGE_END;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,2,2,2);
		this.frame.getContentPane().add(buttonEinstellungen, c);
		// labelReihe // Müsste eine Zelle weiter oben sein.
		this.c.gridx = 0;
		this.c.gridy = 2;
		this.c.weightx = 0.5;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,2,2,2);
		this.frame.getContentPane().add(labelReihe, c);
		// labelAnzahlZuege // Müsste eine Zelle weiter oben sein.
		this.c.gridx = 1;
		this.c.gridy = 2;
		this.c.weightx = 0.5;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,2,2,2);
		this.frame.getContentPane().add(labelAnzahlZuege, c);
		// labelSpieler
		this.c.gridx = 0;
		this.c.gridy = 3;
		this.c.weightx = 0.5;
		this.c.anchor = GridBagConstraints.PAGE_END;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,2,2,2);
		this.labelSpieler.setOpaque(true);
		this.labelSpieler.setBackground(Color.WHITE);
		this.frame.getContentPane().add(labelSpieler, c);
		// labelZuege
		this.c.gridx = 1;
		this.c.gridy = 3;
		this.c.weightx = 0.5;
		this.c.anchor = GridBagConstraints.PAGE_END;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(2,2,2,2);
		this.labelZuege.setOpaque(true);
		this.labelZuege.setBackground(Color.WHITE);
		this.frame.getContentPane().add(labelZuege, c);
		// menuBar
		this.c.gridx = 0;
		this.c.gridy = 0;
		this.c.gridwidth = 5;
		this.c.weightx = 0.5;
		this.c.anchor = GridBagConstraints.PAGE_START;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(0,0,0,0);
		this.menuBar.add(menu1);
		this.menuBar.add(menu2);
		this.menu1.add(menuItem1);
		this.menu1.add(menuItem2);
		this.menu1.add(menuItem3);
		this.menu1.add(menuItem4);
		this.menu2.add(menuItem5);
		this.menu2.add(menuItem6);
		this.frame.getContentPane().add(menuBar, c);
		// panelLeer
		this.c = new GridBagConstraints();
		this.c.gridx = 0;
		this.c.gridy = 1;
		this.c.gridwidth = 5;
		this.c.gridheight = 4;
		this.c.weightx = 0.5;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.insets = new Insets(0,0,0,0);
		this.frame.getContentPane().add(panelLeer, c);
	}
}
