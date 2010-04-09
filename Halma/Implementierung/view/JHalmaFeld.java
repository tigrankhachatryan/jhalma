package view;

import model.*;
import java.awt.AWTEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RadialGradientPaint;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.util.HashMap;

import javax.swing.JComponent;

/**
 * JHalmaFeld - a class that implements a lightweight component.
 * It represents a field of the chinese checkers boardgame
 * Can be used to develop a chinese checkers game.
 * @author Lars, Simon
 * @version 1.0
 */
public class JHalmaFeld extends JComponent {
	/*
	 * Default serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	/*
	 * Private Attributes
	 */
	private Farbe halmaFarbe;
	private Color farbe;
	private boolean NAF;
	private Position position;
	private HashMap<RenderingHints.Key,Object> renderingHints;
	
	/*
	 * Private Methods
	 */
	private void setRenderingSettings() {
		this.renderingHints.put(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		this.renderingHints.put(RenderingHints.KEY_COLOR_RENDERING,RenderingHints.VALUE_COLOR_RENDER_QUALITY);		
	}
	
	private void getHSBComponents(Color color, float[] hsbComponents) {
		if(hsbComponents.length == 3){
			int R = color.getRed();
			int G = color.getGreen();
			int B = color.getBlue();
			Color.RGBtoHSB(R, G, B, hsbComponents);
		}
		else throw new IllegalArgumentException("hsbComponents must have length 3.");
		
	}
	
	
	/*
	 * Public Methods and Constructors
	 */
	/**
	 * Contructor.
	 * Initializes the field as a non-playable field.
	 * @param p The position of the field given by a Position Object
	 */
	JHalmaFeld(Position p){
		this(Farbe.KF, p);		
	}
	
	/**
	 * Constructor.
	 * Initializes the field with the given value
	 * for its color property
	 * @param farbe A color of the enum type Farbe
	 * @param p The position of the field given by a Position Object
	 */
	JHalmaFeld(Farbe farbe, Position p){
		this.setFarbe(farbe);
		switch (this.halmaFarbe){
		case Blau: 
			this.farbe = Color.getHSBColor(0.667f, 0.75f, 1.0f);
			break;
		case Gelb:
			this.farbe = Color.getHSBColor(0.167f, 0.75f, 1.0f);
			break;
		case Gruen:
			this.farbe = Color.getHSBColor(0.333f, 0.75f, 1.0f);
			break;
		case Rot:
			this.farbe = Color.getHSBColor(0f, 0.75f, 1.0f);
			break;
		case Schwarz:
			this.farbe = Color.getHSBColor(0.5f, 0.1f, 0.5f);
			break;
		case Weiss:
			this.farbe = Color.getHSBColor(0.5f, 0.1f, 1f);
			break;
		case KF:
			this.farbe = new Color(0,0,0,0);
			this.NAF = true;
		}
		this.position = new Position(p.getX(),p.getY());
		this.renderingHints = new HashMap<RenderingHints.Key,Object>();
		this.setRenderingSettings();
		this.enableEvents(AWTEvent.MOUSE_EVENT_MASK);
	}
	

	

	/**
	 * @param farbe the farbe to set
	 */
	public void setFarbe(Farbe farbe) {
		this.halmaFarbe = farbe;
	}

	/**
	 * @return the farbe
	 */
	public Farbe getFarbe() {
		return halmaFarbe;
	}

	/**
	 * @return the position
	 */
	public Position getPosition() {
		return new Position(this.position.getX(),this.position.getY());
	}

	public void paint(Graphics g){
		 if(!(g instanceof Graphics2D)){System.out.print("error");}
		 else{
			 Graphics2D g2d = (Graphics2D)g;
			 			 
			 Dimension size = this.getSize();
			 Point2D center = new Point2D.Float(size.height / 2f, size.height / 2f);
			 float radius = (float)size.getHeight() / 2f;
			 
			 float[] hsbComponents = new float[3];
			 this.getHSBComponents(this.farbe,hsbComponents);
			 
			 float[] dist = {0.0f, 0.5f, 0.75f, 1.0f};
			 Color c1 = Color.getHSBColor(hsbComponents[0], hsbComponents[1] / 1.3f,hsbComponents[2]);
			 Color c2 = Color.getHSBColor(hsbComponents[0], hsbComponents[1] / 1.5f,hsbComponents[2]);
			 Color c3 = Color.getHSBColor(hsbComponents[0], hsbComponents[1]/ 3f,hsbComponents[2]);
			 Color[] colors = {this.farbe, c1, c2, c3};
			 assert dist.length == colors.length : "radialGradient parameter müssen übereinstimmen";
			 RadialGradientPaint paint = new RadialGradientPaint(center, radius, dist, colors);
			     
			 Ellipse2D.Float circle = new Ellipse2D.Float(0, 0, size.height, size.height);
			 			 
			 g2d.setRenderingHints(this.renderingHints);
			 g2d.setPaint(paint);
			 g2d.fill(circle);
			 g2d.draw(circle);
		 }
			 
	}
		
	/**
	* Paints the button and distribute an action event to all listeners.
	*/
	public void processMouseEvent(MouseEvent e) {

	    switch(e.getID()) {
	    
	    case MouseEvent.MOUSE_PRESSED:
	    	if(!this.NAF)
	    		super.processMouseEvent(e);
	    	repaint(); 
		    break;
	    
	    case MouseEvent.MOUSE_RELEASED:    	
	    	if(!this.NAF) 
	    		super.processMouseEvent(e);
		    break;
	    
	    case MouseEvent.MOUSE_ENTERED:
	    	if(!this.NAF)
	    		super.processMouseEvent(e);
	    	repaint();
	    	break;
	    
	    case MouseEvent.MOUSE_EXITED:
	    	if(!this.NAF)
	    		super.processMouseEvent(e);
	    	repaint();
		    break;
		
	    default:
	    
	    }
	    
	    
	}
	
	public boolean contains(int x, int y) {
		int r = this.getSize().height/2;
		return (((r-x)*(r-x) + (r-y)*(r-y)) <= r*r);
	}
	
	public boolean isKF(){
		return this.NAF;
	}
	
}
