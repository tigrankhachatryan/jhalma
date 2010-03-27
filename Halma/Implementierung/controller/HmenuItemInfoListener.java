package controller;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HmenuItemInfoListener extends BasicMenuItemUI.MouseInputHandler{
	
	private JMenuItem menuItemInfo;
	
	public HmenuItemInfoListener(JMenuItem menuItemInfo){
		
		this.menuItemInfo = menuItemInfo;
	}
	
	public void mouseClicked(MouseEvent e){
		
	}
}