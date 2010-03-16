public class Spielbrett{
	
	private int anzahlSpieler;
	private int anzahlZuege;
	
	public Spielbrett(){
	
	}
	
	public int zaehleZuege(String name){
	
	}
	
	public String werIstDran(){
	
	}
	
	public boolean ueberpruefeZug(){
	
	}
	
	public int getAnzahlSpieler(){
		return anzahlSpieler;
	}
	
	public int getAnzahlZuege(){
		return anzahlZuege;
	}
	
	public void setAnzahlSpieler(int anzahlSpieler){
		if (anzahlSpieler < 2 || anzahlSpieler == 5 || anzahlSpieler > 6){
			System.out.println("Die Anzahl der Spieler darf nur 2, 3, 4 oder 6 betragen!");
		}else{
			this.anzahlSpieler = anzahlSpieler;
		}
	}
	
	public void setAnzahlZuege(int anzahlZuege){
		this.anzahlZuege = anzahlZuege;
	}
}