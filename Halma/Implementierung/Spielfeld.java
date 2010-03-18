public class Spielfeld{
	
	private Boolean besetzt;
	private Farbe farbe;
	
	public Spielfeld(){
		this.besetzt = new Boolean();
		this.farbe = Farbe.Rot;
	}
	
	public Boolean isBesetzt(){
		return besetzt;
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