import java.util.ArrayList;

public class Spielbrett{
	
	private int anzahlSpieler;
	private int anzahlZuege;
	
	ArrayList<ArrayList<Farbe>> spielbrett;
	
	public Spielbrett(){
		spielbrett = new ArrayList<ArrayList<Farbe>>();
		for(int y = 0; y < 17; y++){
			ArrayList<Farbe> aList = new ArrayList<Farbe>();
			spielbrett.add(y, aList);
			for(int x = 0; x < 25; x++){
				if((y%2 = 0 && x%2 = 0) || (y%2 = 1 && x%2 = 1)){
					spielbrett.get(y).add(x, Farbe.Frei);
				}else{
					spielbrett.get(y).add(x, Farbe.KF);
				}
				if(((x < (12-y) || x > (12+y)) && y < 4) || ((x < ((24-y) || x > y) && y > 12) ){
					spielbrett.get(y).add(x, Farbe.KF);
				}
				if((x < (y-4) || x > (28-y)) && (y > 4 && y < 9)){
					spielbrett.get(y).add(x, Farbe.KF);
				}
				if((x < (12-y) || x > (y+12) && (y > 8 && y < 12)){
					spielbrett.get(y).add(x, Farbe.KF);
				}
			}
		}
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