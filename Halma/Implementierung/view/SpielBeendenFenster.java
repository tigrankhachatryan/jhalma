package view;
import controller.*;
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
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.getContentPane().setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		this.frame.getContentPane().setLayout(new GridBagLayout());
		// GUI erzeugen
		this.createGUI();
		// Listener hinzufügen
		this.buttonNein.addActionListener(new AbbrechenButtonListener(this.frame));
		// Fenstergröße anpassen und zeigen
		this.frame.pack();	
		this.frame.setVisible(true);
	}
	 
	/*
	 * Hilfsmethode
	 */
	private void createGUI(){
		
		this.c = new GridBagConstraints();
		// buttonJa
		this.buttonJa = new JButton("Ja");
		this.setConstraints(new Integer(2), new Integer(1), new Double(0.0), new Double(0.0), new Integer(1), new Integer(1), new Integer(GridBagConstraints.CENTER),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(2), new Integer(2), new Integer(2));
		this.frame.getContentPane().add(this.buttonJa, this.c);
		// buttonNein
		this.buttonNein = new JButton("         Nein         "); // Die Leerzeichen sollen die size des Buttons anpassen.
		this.setConstraints(new Integer(1), new Integer(1), new Double(0.0), new Double(0.0), new Integer(1), new Integer(1), new Integer(GridBagConstraints.CENTER),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(2), new Integer(2), new Integer(2));
		this.frame.getContentPane().add(this.buttonNein, this.c);
		// labelSpielBeenden
		this.labelSpielBeenden = new JLabel("Möchten Sie das Spiel wirklich beenden?");
		this.setConstraints(new Integer(1), new Integer(0), new Double(0.0), new Double(0.0), new Integer(1), new Integer(2), new Integer(GridBagConstraints.CENTER),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(2), new Integer(2), new Integer(2));
		this.frame.getContentPane().add(this.labelSpielBeenden, this.c);
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