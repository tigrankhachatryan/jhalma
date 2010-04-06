package test;

import view.*;
import model.*;

public class TestModel{
	
	public static void main(String[] args){
		
		Spielbrett halmafeld = new Spielbrett();
		
		for(int y = 0; y < 17; y++){
			for(int x = 0; x < 25; x++){
				Position position = new Position(new Integer(x), new Integer(y));
				if(halmafeld.getSpielfeld(position).getFarbe().equals(Farbe.KF)){
					System.out.print("-");
				}else{
					System.out.print("*");
				}
				if(x == 24){
					System.out.print("\n");
				}
			}
		}
	}
}
