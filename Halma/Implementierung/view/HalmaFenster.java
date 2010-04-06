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
		// Listener hinzuf�gen
		this.buttonNeuesSpiel.addActionListener(new NeuesSpielButtonListener());
		this.buttonEinstellungen.addActionListener(new EinstellungenButtonListener());
		this.buttonSpielBeenden.addActionListener(new SpielBeendenButtonListener());
		Iterator<JMenuItem> i = this.menuItemList.iterator();
		while(i.hasNext()){
			i.next().addActionListener(new MenuListener());
		}	
		// Fenstergr��e anpassen und zeigen
		this.frame.setSize(1000,625);
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
		//und schliesslich die Liste der menuItems f�llen
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
