package view;
import model.*;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;

public class NeuesSpielFenster extends JFrame{

		private JButton buttonOK, buttonAbbrechen;
		private JLabel labelAnzahlSpieler, labelFarbeSpieler, labelSpieler1, labelSpieler2, labelSpieler3, labelSpieler4, labelSpieler5, labelSpieler6;
		private JComboBox comboBoxAnzahlSpieler, comboBoxFarbeSpieler1, comboBoxFarbeSpieler2, comboBoxFarbeSpieler3, comboBoxFarbeSpieler4, comboBoxFarbeSpieler5, comboBoxFarbeSpieler6;
		private JPanel panelLeer;
		private GridBagConstraints cBOK, cBAbbrechen, cLAnzahlSpieler, cLFarbeSpieler, cLSpieler1, cLSpieler2, cLSpieler3, cLSpieler4, cLSpieler5, cLSpieler6, cCBAnzahlSpieler,
									cCBFarbeSpieler1, cCBFarbeSpieler2, cCBFarbeSpieler3, cCBFarbeSpieler4, cCBFarbeSpieler5, cCBFarbeSpieler6, cPLeer;
		
		public NeuesSpielFenster(){
				
		super("Neues Spiel");
				
		Farbe[] arrayFarben = Farbe.values();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		this.getContentPane().setLayout(new GridBagLayout());
		
		this.buttonOK = new JButton("        OK        ");
		this.cBOK = new GridBagConstraints();
		this.cBOK.gridx = 3;
		this.cBOK.gridy = 9;
		this.cBOK.weightx = 0.5;
		this.cBOK.weighty = 1.0;
		this.cBOK.anchor = GridBagConstraints.PAGE_END;
		this.cBOK.fill = GridBagConstraints.HORIZONTAL;
		this.cBOK.insets = new Insets(2,2,2,2);
		this.getContentPane().add(buttonOK, cBOK);
		
		this.buttonAbbrechen = new JButton("Abbrechen");
		this.cBAbbrechen = new GridBagConstraints();
		this.cBAbbrechen.gridx = 2;
		this.cBAbbrechen.gridy = 9;
		this.cBAbbrechen.weightx = 0.5;
		this.cBAbbrechen.weighty = 1.0;
		this.cBAbbrechen.anchor = GridBagConstraints.PAGE_END;
		this.cBAbbrechen.fill = GridBagConstraints.HORIZONTAL;
		this.cBAbbrechen.insets = new Insets(2,2,2,2);
		this.getContentPane().add(buttonAbbrechen, cBAbbrechen);
		
		this.labelAnzahlSpieler = new JLabel("Wählen Sie die Anzahl der Spieler aus.");
		this.cLAnzahlSpieler = new GridBagConstraints();
		this.cLAnzahlSpieler.gridx = 1;
		this.cLAnzahlSpieler.gridy = 0;
		this.cLAnzahlSpieler.gridwidth = 2;
		this.cLAnzahlSpieler.weightx = 0.5;
		this.cLAnzahlSpieler.fill = GridBagConstraints.HORIZONTAL;
		this.cLAnzahlSpieler.insets = new Insets(2,2,2,2);
		this.getContentPane().add(labelAnzahlSpieler, cLAnzahlSpieler);
		
		this.comboBoxAnzahlSpieler = new JComboBox();
		this.cCBAnzahlSpieler = new GridBagConstraints();
		this.cCBAnzahlSpieler.gridx = 1;
		this.cCBAnzahlSpieler.gridy = 1;
		this.cCBAnzahlSpieler.gridwidth = 2;
		this.cCBAnzahlSpieler.weightx = 0.5;
		this.cCBAnzahlSpieler.fill = GridBagConstraints.HORIZONTAL;
		this.cCBAnzahlSpieler.insets = new Insets(2,2,20,2);
		this.comboBoxAnzahlSpieler.addItem(new String("2 Spieler"));
		this.comboBoxAnzahlSpieler.addItem(new String("3 Spieler"));
		this.comboBoxAnzahlSpieler.addItem(new String("4 Spieler"));
		this.comboBoxAnzahlSpieler.addItem(new String("6 Spieler"));
		this.getContentPane().add(comboBoxAnzahlSpieler, cCBAnzahlSpieler);
		
		this.labelFarbeSpieler = new JLabel("Wählen Sie die Farbe der Spieler aus.");
		this.cLFarbeSpieler = new GridBagConstraints();
		this.cLFarbeSpieler.gridx = 1;
		this.cLFarbeSpieler.gridy = 2;
		this.cLFarbeSpieler.gridwidth = 2;
		this.cLFarbeSpieler.weightx = 0.5;
		this.cLFarbeSpieler.fill = GridBagConstraints.HORIZONTAL;
		this.cLFarbeSpieler.insets = new Insets(2,2,2,2);
		this.getContentPane().add(labelFarbeSpieler, cLFarbeSpieler);
		
		this.labelSpieler1 = new JLabel("Spieler 1");
		this.cLSpieler1 = new GridBagConstraints();
		this.cLSpieler1.gridx = 1;
		this.cLSpieler1.gridy = 3;
		this.cLSpieler1.weightx = 0.5;
		this.cLSpieler1.fill = GridBagConstraints.HORIZONTAL;
		this.cLSpieler1.insets = new Insets(2,2,2,2);
		this.getContentPane().add(labelSpieler1, cLSpieler1);
		
		this.labelSpieler2 = new JLabel("Spieler 2");
		this.cLSpieler2 = new GridBagConstraints();
		this.cLSpieler2.gridx = 1;
		this.cLSpieler2.gridy = 4;
		this.cLSpieler2.weightx = 0.5;
		this.cLSpieler2.fill = GridBagConstraints.HORIZONTAL;
		this.cLSpieler2.insets = new Insets(2,2,2,2);
		this.getContentPane().add(labelSpieler2, cLSpieler2);
		
		this.labelSpieler3 = new JLabel("Spieler 3");
		this.cLSpieler3 = new GridBagConstraints();
		this.cLSpieler3.gridx = 1;
		this.cLSpieler3.gridy = 5;
		this.cLSpieler3.weightx = 0.5;
		this.cLSpieler3.fill = GridBagConstraints.HORIZONTAL;
		this.cLSpieler3.insets = new Insets(2,2,2,2);
		this.getContentPane().add(labelSpieler3, cLSpieler3);
		
		this.labelSpieler4 = new JLabel("Spieler 4");
		this.cLSpieler4 = new GridBagConstraints();
		this.cLSpieler4.gridx = 1;
		this.cLSpieler4.gridy = 6;
		this.cLSpieler4.weightx = 0.5;
		this.cLSpieler4.fill = GridBagConstraints.HORIZONTAL;
		this.cLSpieler4.insets = new Insets(2,2,2,2);
		this.getContentPane().add(labelSpieler4, cLSpieler4);
		
		this.labelSpieler5 = new JLabel("Spieler 5");
		this.cLSpieler5 = new GridBagConstraints();
		this.cLSpieler5.gridx = 1;
		this.cLSpieler5.gridy = 7;
		this.cLSpieler5.weightx = 0.5;
		this.cLSpieler5.fill = GridBagConstraints.HORIZONTAL;
		this.cLSpieler5.insets = new Insets(2,2,2,2);
		this.getContentPane().add(labelSpieler5, cLSpieler5);
		
		this.labelSpieler6 = new JLabel("Spieler 6");
		this.cLSpieler6 = new GridBagConstraints();
		this.cLSpieler6.gridx = 1;
		this.cLSpieler6.gridy = 8;
		this.cLSpieler6.weightx = 0.5;
		this.cLSpieler6.fill = GridBagConstraints.HORIZONTAL;
		this.cLSpieler6.insets = new Insets(2,2,20,2);
		this.getContentPane().add(labelSpieler6, cLSpieler6);
		
		this.comboBoxFarbeSpieler1 = new JComboBox();
		this.cCBFarbeSpieler1 = new GridBagConstraints();
		this.cCBFarbeSpieler1.gridx = 2;
		this.cCBFarbeSpieler1.gridy = 3;
		this.cCBFarbeSpieler1.weightx = 0.5;
		this.cCBFarbeSpieler1.fill = GridBagConstraints.HORIZONTAL;
		this.cCBFarbeSpieler1.insets = new Insets(2,2,2,2);
		
		for(Farbe f : arrayFarben){
			if(f != Farbe.KF && f != Farbe.Frei)
				this.comboBoxFarbeSpieler1.addItem(f);
		}		
		this.getContentPane().add(comboBoxFarbeSpieler1, cCBFarbeSpieler1);
		
		this.comboBoxFarbeSpieler2 = new JComboBox();
		this.cCBFarbeSpieler2 = new GridBagConstraints();
		this.cCBFarbeSpieler2.gridx = 2;
		this.cCBFarbeSpieler2.gridy = 4;
		this.cCBFarbeSpieler2.weightx = 0.5;
		this.cCBFarbeSpieler2.fill = GridBagConstraints.HORIZONTAL;
		this.cCBFarbeSpieler2.insets = new Insets(2,2,2,2);
		
		for(Farbe f : arrayFarben){
			if(f != Farbe.KF && f != Farbe.Frei)
				this.comboBoxFarbeSpieler2.addItem(f);
		}		
		this.getContentPane().add(comboBoxFarbeSpieler2, cCBFarbeSpieler2);
		
		this.comboBoxFarbeSpieler3 = new JComboBox();
		this.cCBFarbeSpieler3 = new GridBagConstraints();
		this.cCBFarbeSpieler3.gridx = 2;
		this.cCBFarbeSpieler3.gridy = 5;
		this.cCBFarbeSpieler3.weightx = 0.5;
		this.cCBFarbeSpieler3.fill = GridBagConstraints.HORIZONTAL;
		this.cCBFarbeSpieler3.insets = new Insets(2,2,2,2);
		
		for(Farbe f : arrayFarben){
			if(f != Farbe.KF && f != Farbe.Frei)
				this.comboBoxFarbeSpieler3.addItem(f);
		}	
		this.getContentPane().add(comboBoxFarbeSpieler3, cCBFarbeSpieler3);
		
		this.comboBoxFarbeSpieler4 = new JComboBox();
		this.cCBFarbeSpieler4 = new GridBagConstraints();
		this.cCBFarbeSpieler4.gridx = 2;
		this.cCBFarbeSpieler4.gridy = 6;
		this.cCBFarbeSpieler4.weightx = 0.5;
		this.cCBFarbeSpieler4.fill = GridBagConstraints.HORIZONTAL;
		this.cCBFarbeSpieler4.insets = new Insets(2,2,2,2);
		
		for(Farbe f : arrayFarben){
			if(f != Farbe.KF && f != Farbe.Frei)
				this.comboBoxFarbeSpieler4.addItem(f);
		}	
		this.getContentPane().add(comboBoxFarbeSpieler4, cCBFarbeSpieler4);
		
		this.comboBoxFarbeSpieler5 = new JComboBox();
		this.cCBFarbeSpieler5 = new GridBagConstraints();
		this.cCBFarbeSpieler5.gridx = 2;
		this.cCBFarbeSpieler5.gridy = 7;
		this.cCBFarbeSpieler5.weightx = 0.5;
		this.cCBFarbeSpieler5.fill = GridBagConstraints.HORIZONTAL;
		this.cCBFarbeSpieler5.insets = new Insets(2,2,2,2);
		
		for(Farbe f : arrayFarben){
			if(f != Farbe.KF && f != Farbe.Frei)
				this.comboBoxFarbeSpieler5.addItem(f);
		}	
		this.getContentPane().add(comboBoxFarbeSpieler5, cCBFarbeSpieler5);
		
		this.comboBoxFarbeSpieler6 = new JComboBox();
		this.cCBFarbeSpieler6 = new GridBagConstraints();
		this.cCBFarbeSpieler6.gridx = 2;
		this.cCBFarbeSpieler6.gridy = 8;
		this.cCBFarbeSpieler6.weightx = 0.5;
		this.cCBFarbeSpieler6.fill = GridBagConstraints.HORIZONTAL;
		this.cCBFarbeSpieler6.insets = new Insets(2,2,20,2);
		
		for(Farbe f : arrayFarben){
			if(f != Farbe.KF && f != Farbe.Frei)
				this.comboBoxFarbeSpieler6.addItem(f);
		}	
		this.getContentPane().add(comboBoxFarbeSpieler6, cCBFarbeSpieler6);
		
		this.panelLeer = new JPanel();
		this.cPLeer = new GridBagConstraints();
		this.cPLeer.gridx = 0;
		this.cPLeer.gridy = 0;
		this.cPLeer.gridheight = 10;
		this.cPLeer.weightx = 0.5;
		this.cPLeer.fill = GridBagConstraints.HORIZONTAL;
		this.cPLeer.insets = new Insets(2,2,2,80);
		this.getContentPane().add(panelLeer, cPLeer);
		
		this.pack();
		
		this.setVisible(true);
		}
}