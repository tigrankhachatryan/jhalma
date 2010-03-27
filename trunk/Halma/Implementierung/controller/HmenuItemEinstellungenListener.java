package controller;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HmenuItemEinstellungenListener extends BasicMenuItemUI.MouseInputHandler{
	
	private JMenuItem menuItemEinstellungen;
	
	public HmenuItemEinstellungenListener(JMenuItem menuItemEinstellungen){
		
		this.menuItemEinstellungen = menuItemEinstellungen;
	}
	
	public void mouseClicked(MouseEvent e){
		
	}
}