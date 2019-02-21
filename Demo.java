package scrable;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// extra text nog meer


class Demo{
	public static void main(String[] args) {
		Stenenzakje.toonAlleStenen();
		Speler speler1 = new Speler();
		speler1.plank.plankjeVullen();
		speler1.toonPlankje();
		System.out.println("wilt u \nruilen (r) of \nwoord uitleggen (w)");
		Scanner invoer = new Scanner(System.in);
		System.out.println( invoer.nextLine() );
		
		speler1.toonPlankje();
		System.out.println("Bedankt voor het spelen");
		Stenenzakje.toonAlleStenen();
	}
}
class Speler{
	String naam;
	Plankje plank = new Plankje();
	
	public void toonPlankje() {
		String antwoord = "";
		for(int i = 0 ; i < plank.stenenOpPlankje.size() ; i++) {
			antwoord = antwoord + plank.stenenOpPlankje.get(i).letter;
		}
		System.out.println(antwoord);
	}
	
}
class Plankje{
	ArrayList<Steen> stenenOpPlankje = new ArrayList();
	void plankjeVullen() {
		for(int i = 0 ; i < 7; i ++) {
			stenenOpPlankje.add(  Stenenzakje.stenen.get(0)   );
			Stenenzakje.stenen.remove(0);
		}
	}
	void ruilenLetter() {
		
	}
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
	static void toonAlleStenen() {
		for(Steen s : stenen) {  // tijdelijk
			System.out.print(s.letter);  
		}
	}
}











