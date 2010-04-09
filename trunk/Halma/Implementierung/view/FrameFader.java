package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

@SuppressWarnings("all")
public class FrameFader implements ActionListener{
	private JFrame frame;
	private Timer timer;
	private boolean fadeIn;
	private int speed;
		
	public FrameFader(JFrame frame){
		this.frame = frame;
		this.speed = 100;
		this.timer = new Timer(this.speed,this);
		this.fadeIn = false;
		com.sun.awt.AWTUtilities.setWindowOpacity(this.frame, 0f);
	}
	public void fade(){
		this.fadeIn = !this.fadeIn;
		this.timer.start();
	}	
	public static boolean isTransparencySupported(){
		return com.sun.awt.AWTUtilities.isTranslucencySupported(com.sun.awt.AWTUtilities.Translucency.TRANSLUCENT);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(fadeIn){
			 if(com.sun.awt.AWTUtilities.getWindowOpacity(this.frame) <= 0.9f)
				 com.sun.awt.AWTUtilities.setWindowOpacity(this.frame,	com.sun.awt.AWTUtilities.getWindowOpacity(this.frame) + 0.1f);
			 else{
				this.timer.stop();
			 	com.sun.awt.AWTUtilities.setWindowOpacity(this.frame, 1f);
			 }
		}
		else{
			if(com.sun.awt.AWTUtilities.getWindowOpacity(this.frame) >= 0.1f)
				 com.sun.awt.AWTUtilities.setWindowOpacity(this.frame,	com.sun.awt.AWTUtilities.getWindowOpacity(this.frame) - 0.1f);
			else{
				this.timer.stop();
				com.sun.awt.AWTUtilities.setWindowOpacity(this.frame, 0f);
			}
		}
	}
	/**
	 * @param speed the speed to set in milliseconds per 0.1 alpha
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	/**
	 * @return the speed in milliseconds per 0.1 alpha
	 */
	public int getSpeed() {
		return speed;
	}
	
}
