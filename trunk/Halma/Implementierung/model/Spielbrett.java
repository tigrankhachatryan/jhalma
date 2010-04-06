package model;
 
import java.util.ArrayList;

public class Spielbrett{
	
	private Integer anzahlSpieler;
	private Integer anzahlZuege;
	
	private ArrayList<ArrayList<Spielfeld>> spielbrett;
	
	public Spielbrett(){
		spielbrett = new ArrayList<ArrayList<Spielfeld>>();
		for(int y = 0; y < 17; y++){
			ArrayList<Spielfeld> aList = new ArrayList<Spielfeld>();
			// in jeden Index von spielbrett kommt nochmals eine ArrayList hinein, sodass man eine 2dim ArrayList erhält
			spielbrett.add(y, aList);
			for(int x = 0; x < 25; x++){
				// hier wird ein Schachbrettmuster erzeugt
				if((y%2 == 0 && x%2 == 0) || (y%2 == 1 && x%2 == 1)){
					spielbrett.get(y).add(x, new Spielfeld(false, Farbe.Frei, new Position(new Integer(x), new Integer(y))));
				}else{
					spielbrett.get(y).add(x, new Spielfeld(true, Farbe.KF, new Position(new Integer(x), new Integer(y))));
				}
				// hier wird das Muster für die untere und obere Ecke des Halmabretts erzeugt
				if(((x < (12-y) || x > (12+y)) && y < 4) || ((x > (28-y)) || (x < (y-4))) && y > 12){
					spielbrett.get(y).add(x, new Spielfeld(true, Farbe.KF, new Position(new Integer(x), new Integer(y))));
				}
				// hier wird das Muster für die linke und rechte untere Ecke des Halmabretts erzeugt
				if((x < (y-4) || x > (28-y)) && (y > 4 && y < 9)){
					spielbrett.get(y).add(x, new Spielfeld(true, Farbe.KF, new Position(new Integer(x), new Integer(y))));
				}
				// hier wird das Muster für die linke und rechte obere Ecke des Halmabretts erzeugt
				if((x < (12-y) || x > (y+12)) && (y > 8 && y < 12)){
					spielbrett.get(y).add(x, new Spielfeld(true, Farbe.KF, new Position(new Integer(x), new Integer(y))));
				}
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
	
	public Spielfeld getSpielfeld(Position position){
		return spielbrett.get(position.getY()).get(position.getX());
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