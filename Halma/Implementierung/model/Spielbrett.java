package model;
 
import java.util.ArrayList;

public class Spielbrett{
	
	private Integer anzahlSpieler;
	private Integer anzahlZuege;
	
	private ArrayList<ArrayList<Farbe>> spielbrett;
	
	public Spielbrett(){
		spielbrett = new ArrayList<ArrayList<Farbe>>();
		for(int y = 0; y < 17; y++){
			ArrayList<Farbe> aList = new ArrayList<Farbe>();
			spielbrett.add(y, aList);
			for(int x = 0; x < 25; x++){
				if((y%2 == 0 && x%2 == 0) || (y%2 == 1 && x%2 == 1)){
					spielbrett.get(y).add(x, Farbe.Frei);
				}else{
					spielbrett.get(y).add(x, Farbe.KF);
				}
				// bis hierhin wurde nur ein Schachbrettmuster erzeugt
				if(((x < (12-y) || x > (12+y)) && y < 4) || ((x > (28-y)) || (x < (y-4))) && y > 12){
					spielbrett.get(y).add(x, Farbe.KF);
				} 
				// hier wurde das Muster für die untere und obere Ecke des Halmabretts erzeugt
				if((x < (y-4) || x > (28-y)) && (y > 4 && y < 9)){
					spielbrett.get(y).add(x, Farbe.KF);
				}
				// hier wurde das Muster für die linke und rechte untere Ecke des Halmabretts erzeugt
				if((x < (12-y) || x > (y+12)) && (y > 8 && y < 12)){
					spielbrett.get(y).add(x, Farbe.KF);
				}
				// hier wurde das Muster für die linke und rechte obere Ecke des Halmabretts erzeugt
			}
		}
	}
	
	public Integer zaehleZuege(String name){
		return new Integer(0);
	}
	
	public Spieler werIstDran(){
		return new Spieler(Farbe.Weiss,"Default");
	}
	
	public Boolean ueberpruefeZug(){
		return true;
	}
	
	public Integer getAnzahlSpieler(){
		return new Integer(this.anzahlSpieler.intValue());
	}
	
	public Integer getAnzahlZuege(){
		return new Integer(this.anzahlZuege.intValue());
	}
	
	public void setAnzahlSpieler(Integer anzahlSpieler){
		if (anzahlSpieler.intValue() < 2 || anzahlSpieler.intValue() == 5 || anzahlSpieler.intValue() > 6){
			System.out.println("Die Anzahl der Spieler darf nur 2, 3, 4 oder 6 betragen!");
		}else{
			this.anzahlSpieler = new Integer(anzahlSpieler.intValue());
		}
	}
	
	public void setAnzahlZuege(Integer anzahlZuege){
		this.anzahlZuege = new Integer(anzahlZuege.intValue());
	}
}