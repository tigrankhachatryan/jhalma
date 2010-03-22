package model;

public class Spielfeld{
	
	private Boolean besetzt;
	private Farbe farbe;
	
	public Spielfeld(Boolean besetzt, Farbe farbe){
		this.besetzt = new Boolean(besetzt.booleanValue());
		this.farbe = Farbe.farbe;
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