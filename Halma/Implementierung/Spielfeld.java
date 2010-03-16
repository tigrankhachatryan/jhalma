public class Spielfeld{
	
	private boolean besetzt;
	private Farbe farbe;
	
	public Spielfeld(){
	
	}
	
	public boolean istBesetzt(int[][] position){
	
	}
	
	public boolean isBesetzt(){
		return besetzt;
	}
	
	public Farbe getFarbe(){
		return farbe;
	}
	
	public void setBesetzt(boolean besetzt){
		this.besetzt = besetzt;
	}
	
	public void setFarbe(Farbe farbe){
		this.farbe = farbe;
	}
}