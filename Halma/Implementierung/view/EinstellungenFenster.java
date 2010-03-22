package view;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;

public class EinstellungenFenster extends JFrame{
	
	JButton buttonAbbrechen, buttonOK;
	JLabel labelFarbeSpielbrett;
	JComboBox comboBoxFarbeSpielbrett;
	
	public EinstellungenFenster(){
	
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setSize(300, 200);
		
		this.setLayout(new GridLayout(4, 4, 10, 10));
		
		this.buttonAbbrechen = new JButton("Abbrechen");
		this.buttonOK = new JButton("OK");
		this.labelFarbeSpielbrett = new JLabel("Farbe des Spielbretts auswählen");
		this.comboBoxFarbeSpielbrett = new JComboBox();
		this.comboBoxFarbeSpielbrett.addItem(Farbe.Blau);
		this.comboBoxFarbeSpielbrett.addItem(Farbe.Rot);
		this.comboBoxFarbeSpielbrett.addItem(Farbe.Gelb);
		this.comboBoxFarbeSpielbrett.addItem(Farbe.Gruen);
		this.comboBoxFarbeSpielbrett.addItem(Farbe.Schwarz);
		this.comboBoxFarbeSpielbrett.addItem(Farbe.Weiss);
		this.comboBoxFarbeSpielbrett.addItem(Farbe.Braun);
		
		this.getContentPane().add(this.labelFarbeSpielbrett);
		this.getContentPane().add(this.comboBoxFarbeSpielbrett);
		this.getContentPane().add(this.buttonAbbrechen);
		this.getContentPane().add(this.buttonOK);
		
		this.show();
	}
}