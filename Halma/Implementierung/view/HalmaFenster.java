package view;

import model.*;
import controller.*;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.util.ArrayList;
import java.util.Iterator;

public class HalmaFenster{

	private JFrame frame;
	private JButton buttonSpielBeenden, buttonNeuesSpiel, buttonEinstellungen;
	private JLabel labelReihe, labelAnzahlZuege, labelSpieler, labelZuege;
	private JMenu menuSpiel, menuHilfe, menuLaden, menuSpeichern;
	private JMenuBar menuBar;
	private JMenuItem menuItemNeuesSpiel, menuItemEinstellungen, menuItemBestenliste, menuItemSpielBeenden, menuItemSpielregeln, menuItemInfo, menuItemSpeichernSlot1,
					  menuItemSpeichernSlot2, menuItemSpeichernSlot3, menuItemSpeichernSlot4, menuItemSpeichernSlot5, menuItemLadenSlot1, menuItemLadenSlot2, 
					  menuItemLadenSlot3, menuItemLadenSlot4, menuItemLadenSlot5;
	private ArrayList<JMenuItem> menuItemList;
	private JPanel spielbrettPanel, buttonPanel;
	private GridBagConstraints c;
	
	public HalmaFenster(){
		this.menuItemList = new ArrayList<JMenuItem>();
		// Basiseinstellungen
		this.frame = new JFrame("Halma");
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.getContentPane().setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		this.frame.getContentPane().setLayout(new BorderLayout());
		// GUI erzeugen
		this.createGUI();
		// Listener hinzufügen
		this.buttonNeuesSpiel.addActionListener(new NeuesSpielButtonListener(this.frame));
		this.buttonEinstellungen.addActionListener(new EinstellungenButtonListener(this.frame));
		this.buttonSpielBeenden.addActionListener(new SpielBeendenButtonListener(this.frame));
		Iterator<JMenuItem> i = this.menuItemList.iterator();
		while(i.hasNext()){
			i.next().addActionListener(new MenuListener(this.frame));
		}	
		// Fenstergröße anpassen und zeigen
		this.frame.setSize(1000,700);
		this.frame.setVisible(true);
	}

	/*
	 * Hilfsmethode
	 */
	private void createGUI(){		
		this.buttonPanel = new JPanel(new FlowLayout());
		this.frame.getContentPane().add(this.buttonPanel, BorderLayout.SOUTH);
		
		this.labelReihe = new JLabel("An der Reihe ist: ");
		this.setLabelProperties(this.labelReihe, new Boolean(false), Color.BLUE);
		this.buttonPanel.add(this.labelReihe);
		
		this.labelSpieler = new JLabel("Spieler n");
		this.setLabelProperties(this.labelSpieler, new Boolean(true), Color.WHITE);
		this.buttonPanel.add(this.labelSpieler);
		
		this.labelAnzahlZuege = new JLabel("Anzahl der Zuege: ");
		this.setLabelProperties(this.labelAnzahlZuege, new Boolean(false), Color.BLUE);
		this.buttonPanel.add(this.labelAnzahlZuege);
		
		this.labelZuege = new JLabel("m");
		this.setLabelProperties(this.labelZuege, new Boolean(true), Color.WHITE);
		this.buttonPanel.add(this.labelZuege);
		
		this.buttonSpielBeenden = new JButton("Spiel beenden");
		this.buttonPanel.add(this.buttonSpielBeenden);
		
		this.buttonNeuesSpiel = new JButton("Neues Spiel");
		this.buttonPanel.add(this.buttonNeuesSpiel);
		
		this.buttonEinstellungen = new JButton("Einstellungen");
		this.buttonPanel.add(this.buttonEinstellungen);
		
		this.createMenuBar();
		this.frame.setJMenuBar(this.menuBar);
		
		this.spielbrettPanel = new JPanel(new GridLayout(17, 25));
		this.panelFuellen();
		this.frame.getContentPane().add(this.spielbrettPanel, BorderLayout.CENTER);
	}
	
	/*
	 *	Hilfsmethode
	 */
	private void setLabelProperties(JLabel label, Boolean opaque, Color color){
	
		label.setOpaque(opaque.booleanValue());
		label.setBackground(color);
	}
	
	/*
	 * Hilfsmethode
     */
	private void createMenuBar(){
		// initialize menubar
		this.menuBar = new JMenuBar();
		// initialize menus with mnemonics
		this.menuSpiel = new JMenu("Spiel");
		this.menuSpiel.setMnemonic('S');
		this.menuHilfe = new JMenu("Hilfe");
		this.menuHilfe.setMnemonic('H');
		this.menuSpeichern = new JMenu("Speichern");
		this.menuLaden = new JMenu("Laden");
		// add menus to menubar
		this.menuBar.add(this.menuSpiel);
		this.menuBar.add(this.menuHilfe);
		// initialize menuitems with mnemonics
		this.menuItemNeuesSpiel = new JMenuItem("Neues Spiel");
		this.menuItemNeuesSpiel.setMnemonic('N');
		this.menuItemNeuesSpiel.setActionCommand("AC_NEUES_SPIEL");
		this.menuItemEinstellungen = new JMenuItem("Einstellungen");
		this.menuItemEinstellungen.setActionCommand("AC_EINSTELLUNGEN");
		this.menuItemBestenliste = new JMenuItem("Bestenliste");
		this.menuItemBestenliste.setActionCommand("AC_BESTENLISTE");
		this.menuItemSpielBeenden = new JMenuItem("Spiel beenden");
		this.menuItemSpielBeenden.setActionCommand("AC_BEENDEN");
		this.menuItemSpielregeln = new JMenuItem("Spielregeln");
		this.menuItemSpielregeln.setActionCommand("AC_SPIELREGELN");
		this.menuItemInfo = new JMenuItem("Info");
		this.menuItemSpeichernSlot1 = new JMenuItem("< Slot 1 >");
		this.menuItemSpeichernSlot1.setActionCommand("AC_SS1");
		this.menuItemSpeichernSlot2 = new JMenuItem("< Slot 2 >");
		this.menuItemSpeichernSlot2.setActionCommand("AC_SS2");
		this.menuItemSpeichernSlot3 = new JMenuItem("< Slot 3 >");
		this.menuItemSpeichernSlot3.setActionCommand("AC_SS3");
		this.menuItemSpeichernSlot4 = new JMenuItem("< Slot 4 >");
		this.menuItemSpeichernSlot4.setActionCommand("AC_SS4");
		this.menuItemSpeichernSlot5 = new JMenuItem("< Slot 5 >");
		this.menuItemSpeichernSlot5.setActionCommand("AC_SS5");
		this.menuItemLadenSlot1 = new JMenuItem("< Slot 1 >");
		this.menuItemLadenSlot1.setActionCommand("AC_LS1");
		this.menuItemLadenSlot2 = new JMenuItem("< Slot 2 >");
		this.menuItemLadenSlot2.setActionCommand("AC_LS2");
		this.menuItemLadenSlot3 = new JMenuItem("< Slot 3 >");
		this.menuItemLadenSlot3.setActionCommand("AC_LS3");
		this.menuItemLadenSlot4 = new JMenuItem("< Slot 4 >");
		this.menuItemLadenSlot4.setActionCommand("AC_LS4");
		this.menuItemLadenSlot5 = new JMenuItem("< Slot 5 >");
		this.menuItemLadenSlot5.setActionCommand("AC_LS5");
		// add menuitems to menus with separators
		this.menuSpiel.add(this.menuItemNeuesSpiel);
		this.menuSpiel.addSeparator();
		this.menuSpeichern.add(this.menuItemSpeichernSlot1);
		this.menuSpeichern.add(this.menuItemSpeichernSlot2);
		this.menuSpeichern.add(this.menuItemSpeichernSlot3);
		this.menuSpeichern.add(this.menuItemSpeichernSlot4);
		this.menuSpeichern.add(this.menuItemSpeichernSlot5);
		this.menuLaden.add(this.menuItemLadenSlot1);
		this.menuLaden.add(this.menuItemLadenSlot2);
		this.menuLaden.add(this.menuItemLadenSlot3);
		this.menuLaden.add(this.menuItemLadenSlot4);
		this.menuLaden.add(this.menuItemLadenSlot5);
		this.menuSpiel.add(this.menuSpeichern);
		this.menuSpiel.add(this.menuLaden);
		this.menuSpiel.add(this.menuItemEinstellungen);
		this.menuSpiel.add(this.menuItemBestenliste);
		this.menuSpiel.addSeparator();
		this.menuSpiel.add(this.menuItemSpielBeenden);
		this.menuHilfe.add(this.menuItemSpielregeln);
		this.menuHilfe.addSeparator();
		this.menuHilfe.add(this.menuItemInfo);
		//und schliesslich die Liste der menuItems füllen
		this.menuItemList.add(this.menuItemNeuesSpiel);
		this.menuItemList.add(this.menuItemEinstellungen);
		this.menuItemList.add(this.menuItemBestenliste);
		this.menuItemList.add(this.menuItemSpielBeenden);
		this.menuItemList.add(this.menuItemSpielregeln);
		this.menuItemList.add(this.menuItemInfo);
		this.menuItemList.add(this.menuItemSpeichernSlot1);
		this.menuItemList.add(this.menuItemSpeichernSlot2);
		this.menuItemList.add(this.menuItemSpeichernSlot3);
		this.menuItemList.add(this.menuItemSpeichernSlot4);
		this.menuItemList.add(this.menuItemSpeichernSlot5);
		this.menuItemList.add(this.menuItemLadenSlot1);
		this.menuItemList.add(this.menuItemLadenSlot2);
		this.menuItemList.add(this.menuItemLadenSlot3);
		this.menuItemList.add(this.menuItemLadenSlot4);
		this.menuItemList.add(this.menuItemLadenSlot5);
	}
	
	/*
	 * Hilfsmethode
	 */
	private void panelFuellen(){
		for(int i = 0; i < 425; ++i)
			this.spielbrettPanel.add(new JHalmaFeld(Farbe.Blau, new Position((int)i/25,i%25)));
			//spielbrettPanel.add(new JButton());
	}
}
