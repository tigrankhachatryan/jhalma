package model;
 
public class Spielfeld{
	
	private Boolean besetzt;
	private Farbe farbe;
	private Position position;
	
	public Spielfeld(Boolean besetzt, Farbe farbe, Position position){
		this.besetzt = new Boolean(besetzt.booleanValue());
		this.farbe = farbe;
		this.position = position;
	}
	
	public Boolean isBesetzt(){
		return new Boolean(this.besetzt.booleanValue());
	}
	
	public Farbe getFarbe(){
		return farbe;
	}
	
	public void setBesetzt(Boolean besetzt){
		this.besetzt = new Boolean(besetzt.booleanValue());
	}
	
	public void setFarbe(Farbe farbe){
		this.farbe = farbe;
	}
}