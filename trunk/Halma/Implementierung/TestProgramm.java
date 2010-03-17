public class TestProgramm{
	public static void main(String[] args){
		
		Spielbrett halmafeld = new Spielbrett();
		
		for(int y = 0; y < 17; y++){
			for(int x = 0; x < 25; x++){
				if(halmafeld.spielbrett.get(y).get(x).equals(Farbe.KF)){
					System.out.print("/");
				}else{
					System.out.print("*");
				}
				if(x = 24){
					System.out.print(/n);
				}
			}
		}
	}
}