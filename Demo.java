package scrable;
import java.util.ArrayList;
import java.util.Random;

// extra text

class Demo{
	public static void main(String[] args) {	
		Speler speler1 = new Speler();
		speler1.plank.plankjeVullen();
		speler1.toonPlankje();
		
	}
}
class Speler{
	String naam;
	Plankje plank = new Plankje();
	
	public void toonPlankje() {
		String antwoord = "";
		for(int i = 0 ; i < 7 ; i++) {
			antwoord = antwoord + plank.stenenOpPlankje.get(i).letter;
		}
		System.out.println(antwoord);
	}
	
}
class Plankje{
	ArrayList<Steen> stenenOpPlankje = new ArrayList();
	void plankjeVullen() {
		for(int i = 0 ; i < 7; i ++) {
			stenenOpPlankje.add(  Stenenzakje.stenen.get(i)   );
		}
	}
	
	Steen steentje = Stenenzakje.stenen.get(0);
	Steen steentje2 = Stenenzakje.stenen.get(1);
}
class Steen{
	char letter;
	Steen(char eenLetter){
		letter = eenLetter;
	}
}
class Stenenzakje{
	static ArrayList<Steen> stenen = new ArrayList();
	static Random husselaar = new Random();
	static{
		for( int i = 0; i < 20 ; i++) {
			char getal = (char)(husselaar.nextInt(26) + 65);
			Steen steentje = new Steen(getal);
			stenen.add(steentje);
		}
	}
}











