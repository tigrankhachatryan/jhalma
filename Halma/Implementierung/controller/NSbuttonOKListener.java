package controller;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NSbuttonOKListener implements ActionListener{
	
	private JFrame frame;
	private String anzahlSpieler;
	private Farbe fSpieler1, fSpieler2, fSpieler3, fSpieler4, fSpieler5, fSpieler6;
	
	public NSbuttonOKListener(JFrame frame, String str, Farbe f1, Farbe f2, Farbe f3, Farbe f4, Farbe f5, Farbe f6){
		
		this.frame = frame;
		this.anzahlSpieler = str;
		this.fSpieler1 = f1;
		this.fSpieler2 = f2;
		this.fSpieler3 = f3;
		this.fSpieler4 = f4;
		this.fSpieler5 = f5;
		this.fSpieler6 = f6;
	}
	
	public void actionPerformed(ActionEvent e){
		
	}
}