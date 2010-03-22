package view;
import model.*;
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
		Farbe[] arrayFarben = Farbe.values();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setSize(300, 200);
		
		this.setLayout(new GridLayout(4, 1, 10, 10));
		
		this.buttonAbbrechen = new JButton("Abbrechen");
		this.buttonOK = new JButton("OK");
		this.labelFarbeSpielbrett = new JLabel("Farbe des Spielbretts auswählen");
		
		this.comboBoxFarbeSpielbrett = new JComboBox();
		for(Farbe f : arrayFarben){
			if(f != Farbe.KF && f != Farbe.Frei)
				this.comboBoxFarbeSpielbrett.addItem(f);
		}		
		
		this.getContentPane().add(this.labelFarbeSpielbrett);
		this.getContentPane().add(this.comboBoxFarbeSpielbrett);
		this.getContentPane().add(this.buttonAbbrechen);
		this.getContentPane().add(this.buttonOK);
		
		this.show();
	}
}