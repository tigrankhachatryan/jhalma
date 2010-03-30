package view;
import model.*;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NeuesSpielFenster implements ActionListener {

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
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.getContentPane().setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		this.frame.getContentPane().setLayout(new GridBagLayout());
		// GUI erzeugen
		this.createGUI();
		// Fenstergröße anpassen und zeigen
		//this.frame.pack();
		this.frame.setSize(450,350);
		this.frame.setVisible(true);
	}
	
	/*
	 * Hilfsmethode
	 */
	private void createGUI(){
	
		this.c = new GridBagConstraints();
		// buttonOK
		this.buttonOK = new JButton("        OK        "); // Die Leerzeichen sollen die size des Buttons anpassen.
		this.setConstraints(new Integer(3), new Integer(9), new Double(0.5), new Double(1.0), new Integer(1), new Integer(1), new Integer(GridBagConstraints.PAGE_END),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(2), new Integer(2), new Integer(2));
		this.frame.getContentPane().add(this.buttonOK, this.c);
		// buttonAbbrechen
		this.buttonAbbrechen = new JButton("Abbrechen");
		this.setConstraints(new Integer(2), new Integer(9), new Double(0.5), new Double(1.0), new Integer(1), new Integer(1), new Integer(GridBagConstraints.PAGE_END),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(2), new Integer(2), new Integer(2));
		this.frame.getContentPane().add(this.buttonAbbrechen, this.c);
		// labelAnzahlSpieler
		this.labelAnzahlSpieler = new JLabel("Wählen Sie die Anzahl der Spieler aus.");
		this.setConstraints(new Integer(1), new Integer(0), new Double(0.5), new Double(0.0), new Integer(1), new Integer(2), new Integer(GridBagConstraints.CENTER),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(2), new Integer(2), new Integer(2));
		this.frame.getContentPane().add(this.labelAnzahlSpieler, this.c);
		// comboBoxAnzahlSpieler
		this.comboBoxAnzahlSpieler = new JComboBox();	
		this.setConstraints(new Integer(1), new Integer(1), new Double(0.5), new Double(0.0), new Integer(1), new Integer(2), new Integer(GridBagConstraints.CENTER),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(2), new Integer(20), new Integer(2));
		this.füllen(this.comboBoxAnzahlSpieler);
		this.frame.getContentPane().add(this.comboBoxAnzahlSpieler, this.c);
		this.comboBoxAnzahlSpieler.addActionListener(this);
		// labelFarbeSpieler
		this.labelFarbeSpieler = new JLabel("Wählen Sie die Farbe der Spieler aus.");
		this.setConstraints(new Integer(1), new Integer(2), new Double(0.5), new Double(0.0), new Integer(1), new Integer(2), new Integer(GridBagConstraints.CENTER),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(2), new Integer(2), new Integer(2));
		this.frame.getContentPane().add(this.labelFarbeSpieler, this.c);
		// labelSpieler1
		this.labelSpieler1 = new JLabel("Spieler 1");
		this.setConstraints(new Integer(1), new Integer(3), new Double(0.5), new Double(0.0), new Integer(1), new Integer(1), new Integer(GridBagConstraints.CENTER),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(2), new Integer(2), new Integer(2));
		this.frame.getContentPane().add(this.labelSpieler1, this.c);
		// labelSpieler 2
		this.labelSpieler2 = new JLabel("Spieler 2");
		this.setConstraints(new Integer(1), new Integer(4), new Double(0.5), new Double(0.0), new Integer(1), new Integer(1), new Integer(GridBagConstraints.CENTER),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(2), new Integer(2), new Integer(2));
		this.frame.getContentPane().add(this.labelSpieler2, this.c);
		// labelSpieler 3
		this.labelSpieler3 = new JLabel("Spieler 3");
		this.setConstraints(new Integer(1), new Integer(5), new Double(0.5), new Double(0.0), new Integer(1), new Integer(1), new Integer(GridBagConstraints.CENTER),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(2), new Integer(2), new Integer(2));
		this.frame.getContentPane().add(this.labelSpieler3, this.c);
		this.labelSpieler3.setVisible(false);
		// labelSpieler 4
		this.labelSpieler4 = new JLabel("Spieler 4");
		this.setConstraints(new Integer(1), new Integer(6), new Double(0.5), new Double(0.0), new Integer(1), new Integer(1), new Integer(GridBagConstraints.CENTER),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(2), new Integer(2), new Integer(2));
		this.frame.getContentPane().add(this.labelSpieler4, this.c);
		this.labelSpieler4.setVisible(false);
		// labelSpieler 5
		this.labelSpieler5 = new JLabel("Spieler 5");
		this.setConstraints(new Integer(1), new Integer(7), new Double(0.5), new Double(0.0), new Integer(1), new Integer(1), new Integer(GridBagConstraints.CENTER),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(2), new Integer(2), new Integer(2));
		this.frame.getContentPane().add(this.labelSpieler5, this.c);
		this.labelSpieler5.setVisible(false);
		// labelSpieler 6
		this.labelSpieler6 = new JLabel("Spieler 6");
		this.setConstraints(new Integer(1), new Integer(8), new Double(0.5), new Double(0.0), new Integer(1), new Integer(1), new Integer(GridBagConstraints.CENTER),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(2), new Integer(20), new Integer(2));
		this.frame.getContentPane().add(this.labelSpieler6, this.c);
		this.labelSpieler6.setVisible(false);
		// comboBoxSpieler 1
		this.comboBoxFarbeSpieler1 = new JComboBox();
		this.setConstraints(new Integer(2), new Integer(3), new Double(0.5), new Double(0.0), new Integer(1), new Integer(1), new Integer(GridBagConstraints.CENTER),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(2), new Integer(2), new Integer(2));
		this.füllen(this.comboBoxFarbeSpieler1);
		this.frame.getContentPane().add(this.comboBoxFarbeSpieler1, this.c);
		// comboBoxSpieler 2
		this.comboBoxFarbeSpieler2 = new JComboBox();
		this.setConstraints(new Integer(2), new Integer(4), new Double(0.5), new Double(0.0), new Integer(1), new Integer(1), new Integer(GridBagConstraints.CENTER),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(2), new Integer(2), new Integer(2));
		this.füllen(this.comboBoxFarbeSpieler2);
		this.frame.getContentPane().add(this.comboBoxFarbeSpieler2, this.c);
		// comboBoxSpieler 3
		this.comboBoxFarbeSpieler3 = new JComboBox();
		this.setConstraints(new Integer(2), new Integer(5), new Double(0.5), new Double(0.0), new Integer(1), new Integer(1), new Integer(GridBagConstraints.CENTER),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(2), new Integer(2), new Integer(2));
		this.füllen(this.comboBoxFarbeSpieler3);
		this.frame.getContentPane().add(this.comboBoxFarbeSpieler3, this.c);
		this.comboBoxFarbeSpieler3.setVisible(false);
		// comboBoxSpieler 4
		this.comboBoxFarbeSpieler4 = new JComboBox();
		this.setConstraints(new Integer(2), new Integer(6), new Double(0.5), new Double(0.0), new Integer(1), new Integer(1), new Integer(GridBagConstraints.CENTER),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(2), new Integer(2), new Integer(2));
		this.füllen(this.comboBoxFarbeSpieler4);
		this.frame.getContentPane().add(this.comboBoxFarbeSpieler4, this.c);
		this.comboBoxFarbeSpieler4.setVisible(false);
		// comboBoxSpieler 5
		this.comboBoxFarbeSpieler5 = new JComboBox();
		this.setConstraints(new Integer(2), new Integer(7), new Double(0.5), new Double(0.0), new Integer(1), new Integer(1), new Integer(GridBagConstraints.CENTER),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(2), new Integer(2), new Integer(2));
		this.füllen(this.comboBoxFarbeSpieler5);
		this.frame.getContentPane().add(this.comboBoxFarbeSpieler5, this.c);
		this.comboBoxFarbeSpieler5.setVisible(false);
		// comboBoxSpieler 6
		this.comboBoxFarbeSpieler6 = new JComboBox();
		this.setConstraints(new Integer(2), new Integer(8), new Double(0.5), new Double(0.0), new Integer(1), new Integer(1), new Integer(GridBagConstraints.CENTER),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(2), new Integer(20), new Integer(2));
		this.füllen(this.comboBoxFarbeSpieler6);
		this.frame.getContentPane().add(this.comboBoxFarbeSpieler6, this.c);
		this.comboBoxFarbeSpieler6.setVisible(false);
		// panelLeer
		this.panelLeer = new JPanel();
		this.setConstraints(new Integer(0), new Integer(0), new Double(0.5), new Double(0.0), new Integer(10), new Integer(1), new Integer(GridBagConstraints.CENTER),
							new Integer(GridBagConstraints.HORIZONTAL), new Integer(2), new Integer(2), new Integer(2), new Integer(80));
		this.frame.getContentPane().add(this.panelLeer, this.c);
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
	
	/*
	 * Hilfsmethode
	 */
	private void füllen(JComboBox comboBox){
		
		if (comboBox == this.comboBoxAnzahlSpieler){
		
			comboBox.addItem(new String("2 Spieler"));
			comboBox.addItem(new String("3 Spieler"));
			comboBox.addItem(new String("4 Spieler"));
			comboBox.addItem(new String("6 Spieler"));
		}else{
		
			Farbe[] arrayFarben = Farbe.values();
			
			for(Farbe f : arrayFarben){
				if(f != Farbe.KF && f != Farbe.Frei)
					comboBox.addItem(f);
			}
		}
	}
	
	public void actionPerformed(ActionEvent e){
		JComboBox cb = (JComboBox)e.getSource();
        String str = (String)cb.getSelectedItem();
        updateGUI(str);
	}
	
	/*
	 *	Hilfsmethode
	 */
	private void updateGUI(String str){
		
		if(str.equals(new String("2 Spieler"))){
			this.comboBoxFarbeSpieler3.setVisible(false);
			this.labelSpieler3.setVisible(false);
			this.comboBoxFarbeSpieler4.setVisible(false);
			this.labelSpieler4.setVisible(false);
			this.comboBoxFarbeSpieler5.setVisible(false);
			this.labelSpieler5.setVisible(false);
			this.comboBoxFarbeSpieler6.setVisible(false);
			this.labelSpieler6.setVisible(false);
		}else{
			if(str.equals(new String("3 Spieler"))){
				this.comboBoxFarbeSpieler3.setVisible(true);
				this.labelSpieler3.setVisible(true);
				this.comboBoxFarbeSpieler4.setVisible(false);
				this.labelSpieler4.setVisible(false);
				this.comboBoxFarbeSpieler5.setVisible(false);
				this.labelSpieler5.setVisible(false);
				this.comboBoxFarbeSpieler6.setVisible(false);
				this.labelSpieler6.setVisible(false);
			}else{
				if(str.equals(new String("4 Spieler"))){
					this.comboBoxFarbeSpieler3.setVisible(true);
					this.labelSpieler3.setVisible(true);
					this.comboBoxFarbeSpieler4.setVisible(true);
					this.labelSpieler4.setVisible(true);
					this.comboBoxFarbeSpieler5.setVisible(false);
					this.labelSpieler5.setVisible(false);
					this.comboBoxFarbeSpieler6.setVisible(false);
					this.labelSpieler6.setVisible(false);
				}else{
					this.comboBoxFarbeSpieler3.setVisible(true);
					this.labelSpieler3.setVisible(true);
					this.comboBoxFarbeSpieler4.setVisible(true);
					this.labelSpieler4.setVisible(true);
					this.comboBoxFarbeSpieler5.setVisible(true);
					this.labelSpieler5.setVisible(true);
					this.comboBoxFarbeSpieler6.setVisible(true);
					this.labelSpieler6.setVisible(true);
				}
			}
		}	
	}
}