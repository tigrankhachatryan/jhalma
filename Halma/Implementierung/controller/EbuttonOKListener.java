package controller;
import model.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EbuttonOKListener implements ActionListener{
	
	private JFrame frame;
	private Farbe farbeSpielbrett;
	
	public EbuttonOKListener(JFrame frame, Farbe f){
		
		this.frame = frame;
		this.farbeSpielbrett = f;
	}
	
	public void actionPerformed(ActionEvent e){
	
	}
}