package view;
import model.*;
import controller.*;
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
		// GUI erzeugen
		this.createGUI();
		// Listener hinzufügen
		this.buttonOK.addActionListener(new EbuttonOKListener(this.frame, Farbe.valueOf((String)this.comboBoxFarbeSpielbrett.getSelectedItem())));
		this.buttonAbbrechen.addActionListener(new ButtonAbbrechenListener(this.frame));
		// Fenstergrösse anpasen und zeigen
		this.frame.pack();	
		this.frame.setVisible(true);
	}

	/*
	 * Hilfsmethode
	 */
	private void createGUI(){
		
		this.c = new GridBagConstraints();
		// buttonAbbrechen
		this.buttonAbbrechen = new JButton("Abbrechen");
		this.setConstraints(new Integer(2), new Integer(3), new Double(0.5), new Double(1.0), new Integer(1), new Integer(1), new Integer(GridBagConstraints.PAGE_END),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(50), new Integer(2), new Integer(2));
		this.frame.getContentPane().add(buttonAbbrechen, c);
		// buttonOK	
		this.buttonOK = new JButton("        OK        "); // Die Leerzeichen sollen die size des Buttons anpassen.
		this.setConstraints(new Integer(3), new Integer(3), new Double(0.5), new Double(1.0), new Integer(1), new Integer(1), new Integer(GridBagConstraints.PAGE_END),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(2), new Integer(2), new Integer(2));
		this.frame.getContentPane().add(buttonOK, c);
		// labelFarbeSpielbrett
		this.labelFarbeSpielbrett = new JLabel("Farbe des Spielbretts");
		this.setConstraints(new Integer(0), new Integer(0), new Double(0.5), new Double(0.0), new Integer(1), new Integer(1), new Integer(GridBagConstraints.CENTER),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(2), new Integer(2), new Integer(2));
		this.frame.getContentPane().add(labelFarbeSpielbrett, c);
		// comboBoxFarbeSpielbrett
		this.comboBoxFarbeSpielbrett = new JComboBox();
		this.setConstraints(new Integer(0), new Integer(1), new Double(0.5), new Double(0.0), new Integer(1), new Integer(1), new Integer(GridBagConstraints.CENTER),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(2), new Integer(2), new Integer(2));
		this.füllen(comboBoxFarbeSpielbrett);
		this.frame.getContentPane().add(comboBoxFarbeSpielbrett, c);
		// panelLeer
		this.panelLeer = new JPanel();
		this.setConstraints(new Integer(0), new Integer(2), new Double(0.5), new Double(0.0), new Integer(1), new Integer(3), new Integer(GridBagConstraints.CENTER),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(0), new Integer(0), new Integer(100), new Integer(100));
		this.frame.getContentPane().add(panelLeer, c);	
	}
	
	/*
	 * Hilfsmethode
	 */
	private void füllen(JComboBox comboBox){
	
		Farbe[] arrayFarben = Farbe.values();
		
		for(Farbe f : arrayFarben){
			if(f != Farbe.KF && f != Farbe.Frei)
				comboBox.addItem(f);
		}				
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