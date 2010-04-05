package implementierung.view;

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

public class HalmaFenster{

	private JFrame frame;
	private JButton buttonSpielBeenden, buttonNeuesSpiel, buttonEinstellungen;
	private JLabel labelReihe, labelAnzahlZuege, labelSpieler, labelZuege;
	private JMenu menuSpiel, menuHilfe, menuLaden, menuSpeichern;
	private JMenuBar menuBar;
	private JMenuItem menuItemNeuesSpiel, menuItemEinstellungen, menuItemBestenliste, menuItemSpielBeenden, menuItemSpielregeln, menuItemInfo, menuItemSpeichernSlot1,
					  menuItemSpeichernSlot2, menuItemSpeichernSlot3, menuItemSpeichernSlot4, menuItemSpeichernSlot5, menuItemLadenSlot1, menuItemLadenSlot2, 
					  menuItemLadenSlot3, menuItemLadenSlot4, menuItemLadenSlot5;
	private JPanel panelLeer;
	private GridBagConstraints c;
	
	public HalmaFenster(){
		// Basiseinstellungen
		this.frame = new JFrame("Halma");
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.getContentPane().setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		this.frame.getContentPane().setLayout(new GridBagLayout());
		// GUI erzeugen
		this.createGUI();
		// Listener hinzufügen
		this.buttonNeuesSpiel.addActionListener(new NeuesSpielButtonListener());
		this.buttonEinstellungen.addActionListener(new EinstellungenButtonListener());
		this.buttonSpielBeenden.addActionListener(new SpielBeendenButtonListener());
		// Fenstergröße anpassen und zeigen
		// this.frame.pack(); wird hier nicht benötigt, da wir die Fenstergröße selbst festlegen wollen.
		this.frame.setSize(1100,800);
		this.frame.setVisible(true);
	}

	/*
	 * Hilfsmethode
	 */
	private void createGUI(){
	
		this.c = new GridBagConstraints();
		// buttonSpielBeenden
		this.buttonSpielBeenden = new JButton("Spiel beenden");
		this.setConstraints(new Integer(4), new Integer(2), new Double(0.5), new Double(1.0), new Integer(1), new Integer(1), new Integer(GridBagConstraints.PAGE_END),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(2), new Integer(2), new Integer(2));
		this.frame.getContentPane().add(this.buttonSpielBeenden, this.c);
		// buttonNeuesSpiel
		this.buttonNeuesSpiel = new JButton("Neues Spiel");
		this.setConstraints(new Integer(5), new Integer(2), new Double(0.5), new Double(1.0), new Integer(1), new Integer(1), new Integer(GridBagConstraints.PAGE_END),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(2), new Integer(2), new Integer(2));
		this.frame.getContentPane().add(this.buttonNeuesSpiel, this.c);
		// buttonEinstellungen
		this.buttonEinstellungen = new JButton("Einstellungen");
		this.setConstraints(new Integer(6), new Integer(2), new Double(0.5), new Double(1.0), new Integer(1), new Integer(1), new Integer(GridBagConstraints.PAGE_END),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(2), new Integer(2), new Integer(2));
		this.frame.getContentPane().add(this.buttonEinstellungen, this.c);
		// labelReihe
		this.labelReihe = new JLabel("An der Reihe ist: ");
		this.setLabelProperties(this.labelReihe, new Boolean(false), Color.BLUE);
		this.setConstraints(new Integer(0), new Integer(2), new Double(0.5), new Double(0.0), new Integer(1), new Integer(1), new Integer(GridBagConstraints.PAGE_END),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(2), new Integer(2), new Integer(2));
		this.frame.getContentPane().add(this.labelReihe, this.c);
		// labelAnzahlZuege
		this.labelAnzahlZuege = new JLabel("Anzahl der Zuege: ");
		this.setLabelProperties(this.labelAnzahlZuege, new Boolean(false), Color.BLUE);
		this.setConstraints(new Integer(2), new Integer(2), new Double(0.5), new Double(0.0), new Integer(1), new Integer(1), new Integer(GridBagConstraints.PAGE_END),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(2), new Integer(2), new Integer(2));
		this.frame.getContentPane().add(this.labelAnzahlZuege, this.c);
		// labelSpieler
		this.labelSpieler = new JLabel("Spieler 2");
		this.setLabelProperties(this.labelSpieler, new Boolean(true), Color.WHITE);
		this.setConstraints(new Integer(1), new Integer(2), new Double(0.5), new Double(0.0), new Integer(1), new Integer(1), new Integer(GridBagConstraints.PAGE_END),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(2), new Integer(2), new Integer(2));
		this.frame.getContentPane().add(this.labelSpieler, this.c);
		// labelZuege
		this.labelZuege = new JLabel("23");
		this.setLabelProperties(this.labelZuege, new Boolean(true), Color.WHITE);
		this.setConstraints(new Integer(3), new Integer(2), new Double(0.5), new Double(0.0), new Integer(1), new Integer(1), new Integer(GridBagConstraints.PAGE_END),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(2), new Integer(2), new Integer(2));
		this.frame.getContentPane().add(this.labelZuege, this.c);
		// menuBar
		this.createMenuBar();
		this.frame.setJMenuBar(this.menuBar);
		// panelLeer
		this.panelLeer = new JPanel();
		this.setConstraints(new Integer(0), new Integer(1), new Double(0.5), new Double(0.0), new Integer(4), new Integer(5), new Integer(GridBagConstraints.PAGE_START),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(0), new Integer(0), new Integer(0), new Integer(0));
		this.frame.getContentPane().add(this.panelLeer, this.c);
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
		this.menuItemEinstellungen = new JMenuItem("Einstellungen");
		this.menuItemBestenliste = new JMenuItem("Bestenliste");
		this.menuItemSpielBeenden = new JMenuItem("Spiel beenden");
		this.menuItemSpielregeln = new JMenuItem("Spielregeln");
		this.menuItemInfo = new JMenuItem("Info");
		this.menuItemSpeichernSlot1 = new JMenuItem("< Slot 1 >");
		this.menuItemSpeichernSlot2 = new JMenuItem("< Slot 2 >");
		this.menuItemSpeichernSlot3 = new JMenuItem("< Slot 3 >");
		this.menuItemSpeichernSlot4 = new JMenuItem("< Slot 4 >");
		this.menuItemSpeichernSlot5 = new JMenuItem("< Slot 5 >");
		this.menuItemLadenSlot1 = new JMenuItem("< Slot 1 >");
		this.menuItemLadenSlot2 = new JMenuItem("< Slot 2 >");
		this.menuItemLadenSlot3 = new JMenuItem("< Slot 3 >");
		this.menuItemLadenSlot4 = new JMenuItem("< Slot 4 >");
		this.menuItemLadenSlot5 = new JMenuItem("< Slot 5 >");
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
	}
	
	/*
	 * Hilfsmethode
	 */
	private void setConstraints(Integer gx, Integer gy, Double wx, Double wy, Integer gheight, Integer gwidth, Integer anker, Integer fuellen, Integer a, Integer b, Integer c, Integer d){
		
		this.c.gridx = gx.intValue();
		this.c.gridy = gy.intValue();
		this.c.weightx = wx.doubleValue();
		this.c.weighty = wy.doubleValue();
		this.c.gridheight = gheight.intValue();
		this.c.gridwidth = gwidth.intValue();
		this.c.anchor = anker.intValue();
		this.c.fill = fuellen.intValue();
		this.c.insets = new Insets(a.intValue(),b.intValue(),c.intValue(),d.intValue());
	}
}
