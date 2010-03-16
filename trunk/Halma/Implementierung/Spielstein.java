public class Spielstein{
	
	private Farbe farbe;
	private int[][] position;
	
	public Spielstein(){
	
	}
	
	public Spielstein(int[][] position, String farbe){

	}
	
	public Farbe getFarbe(){
		return farbe;
	}
	
	public int[][] getPosition(){
		return position;
	}
	
	public void setFarbe(Farbe farbe){
		this.farbe = farbe;
	}
	
	public void setPosition(int[][] position){
		this.position = position;
	}
}