package view;
import model.*;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;

public class EinstellungenFenster extends JFrame{
	
	JButton buttonAbbrechen, buttonOK;
	JLabel labelFarbeSpielbrett;
	JComboBox comboBoxFarbeSpielbrett;
	JPanel panelLeer;
	GridBagConstraints cBAbbrechen, cBOK, cLFarbeSpielbrett, cCBFarbeSpielbrett, cPLeer;
	
	public EinstellungenFenster(){
	
		super("Einstellungen");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//this.setSize(300, 150); wird durch this.pack(); hinfällig
		this.getContentPane().setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		this.getContentPane().setLayout(new GridBagLayout());
		
		this.buttonAbbrechen = new JButton("Abbrechen");
		this.cBAbbrechen = new GridBagConstraints();
		this.cBAbbrechen.gridx = 2;
		this.cBAbbrechen.gridy = 3;
		this.cBAbbrechen.weightx = 0.5;
		this.cBAbbrechen.weighty = 1.0;
		this.cBAbbrechen.anchor = GridBagConstraints.PAGE_END;
		this.cBAbbrechen.fill = GridBagConstraints.HORIZONTAL;
		this.cBAbbrechen.insets = new Insets(2,50,2,2);
		this.getContentPane().add(buttonAbbrechen, cBAbbrechen);
		
		this.buttonOK = new JButton("OK");
		this.cBOK = new GridBagConstraints();
		this.cBOK.gridx = 3;
		this.cBOK.gridy = 3;
		this.cBOK.weightx = 0.5;
		this.cBOK.weighty = 1.0;
		this.cBOK.anchor = GridBagConstraints.PAGE_END;
		this.cBOK.fill = GridBagConstraints.HORIZONTAL;
		this.cBOK.insets = new Insets(2,2,2,2);
		this.getContentPane().add(buttonOK, cBOK);
		
		this.labelFarbeSpielbrett = new JLabel("Farbe des Spielbretts");
		this.cLFarbeSpielbrett = new GridBagConstraints();
		this.cLFarbeSpielbrett.gridx = 0;
		this.cLFarbeSpielbrett.gridy = 0;
		this.cLFarbeSpielbrett.weightx = 0.5;
		this.cLFarbeSpielbrett.fill = GridBagConstraints.HORIZONTAL;
		this.cLFarbeSpielbrett.insets = new Insets(2,2,2,2);
		this.getContentPane().add(labelFarbeSpielbrett, cLFarbeSpielbrett);
		
		this.comboBoxFarbeSpielbrett = new JComboBox();
		this.cCBFarbeSpielbrett = new GridBagConstraints();
		this.cCBFarbeSpielbrett.gridx = 0;
		this.cCBFarbeSpielbrett.gridy = 1;
		this.cCBFarbeSpielbrett.weightx = 0.5;
		this.cCBFarbeSpielbrett.fill = GridBagConstraints.HORIZONTAL;
		this.cCBFarbeSpielbrett.insets = new Insets(2,2,2,2);
		
		Farbe[] arrayFarben = Farbe.values();
		
		for(Farbe f : arrayFarben){
			if(f != Farbe.KF && f != Farbe.Frei)
				this.comboBoxFarbeSpielbrett.addItem(f);
		}		
		this.getContentPane().add(comboBoxFarbeSpielbrett, cCBFarbeSpielbrett);
		
		this.panelLeer = new JPanel();
		this.cPLeer = new GridBagConstraints();
		this.cPLeer.gridx = 0;
		this.cPLeer.gridy = 2;
		this.cPLeer.gridwidth = 3;
		this.cPLeer.weightx = 0.5;
		this.cPLeer.fill = GridBagConstraints.HORIZONTAL;
		this.cPLeer.insets = new Insets(0,0,100,100);
		this.getContentPane().add(panelLeer, cPLeer);
		
		this.pack();
		
		this.setVisible(true);
	}
}