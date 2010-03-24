package view;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SpielBeendenFenster extends JFrame{
	
	private JButton buttonJa, buttonNein;
	private JLabel labelSpielBeenden;
	private JPanel panelLeer1, panelLeer2;
	private GridBagConstraints cBJa, cBNein, cLSpielBeenden, cPLeer1, cPLeer2;
	
	public SpielBeendenFenster(){
	
		super("Spiel beenden");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		this.getContentPane().setLayout(new GridBagLayout());
		
		this.buttonJa = new JButton("Ja");
		this.cBJa = new GridBagConstraints();
		this.cBJa.gridx = 2;
		this.cBJa.gridy = 1;
		this.cBJa.fill = GridBagConstraints.HORIZONTAL;
		this.cBJa.insets = new Insets(2,2,2,2);
		this.getContentPane().add(buttonJa, cBJa);
		
		this.buttonNein = new JButton("         Nein         ");
		this.cBNein = new GridBagConstraints();
		this.cBNein.gridx = 1;
		this.cBNein.gridy = 1;
		this.cBNein.fill = GridBagConstraints.HORIZONTAL;
		this.cBNein.insets = new Insets(2,2,2,2);
		this.getContentPane().add(buttonNein, cBNein);
		
		this.labelSpielBeenden = new JLabel("Möchten Sie das Spiel wirklich beenden?");
		this.cLSpielBeenden = new GridBagConstraints();
		this.cLSpielBeenden.gridx = 1;
		this.cLSpielBeenden.gridy = 0;
		this.cLSpielBeenden.gridwidth = 2;
		this.cLSpielBeenden.fill = GridBagConstraints.HORIZONTAL;
		this.cLSpielBeenden.insets = new Insets(2,2,2,2);
		this.getContentPane().add(labelSpielBeenden, cLSpielBeenden);
		
		this.panelLeer1 = new JPanel();
		this.cPLeer1 = new GridBagConstraints();
		this.cPLeer1.gridx = 0;
		this.cPLeer1.gridy = 0;
		this.cPLeer1.gridheight = 2;
		this.cPLeer1.fill = GridBagConstraints.HORIZONTAL;
		this.cPLeer1.insets = new Insets(0,0,0,0);
		this.getContentPane().add(panelLeer1, cPLeer1);
		
		this.panelLeer2 = new JPanel();
		this.cPLeer2 = new GridBagConstraints();
		this.cPLeer2.gridx = 3;
		this.cPLeer2.gridy = 0;
		this.cPLeer2.gridwidth = 2;
		this.cPLeer2.fill = GridBagConstraints.HORIZONTAL;
		this.cPLeer2.insets = new Insets(0,0,0,0);
		this.getContentPane().add(panelLeer2, cPLeer2);
		
		this.pack();
		
		this.setVisible(true);
	}
}