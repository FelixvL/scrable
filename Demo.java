package scrable;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// extra text nog meer


class Demo{
	public static void main(String[] args) {
		Speler speler1 = new Speler();
		speler1.plank.plankjeVullen();
		System.out.println("wilt u \nruilen (r) of \nwoord uitleggen (w)");
		speler1.keuze();
		System.out.println("Bedankt voor het spelen");
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
	public void keuze() {
		int eindeKeuze = 0;
		Scanner invoer = new Scanner(System.in);		
		while(eindeKeuze == 0) {
			String mogelijkheden = invoer.nextLine();
			
			switch(mogelijkheden) {
			case "r":
				toonPlankje();
				plank.ruilenLetter();
				toonPlankje();
				break;
			case "w":
				System.out.println("Leg uw woord uit");
				String uitTeLeggenWoord = invoer.nextLine();
				System.out.println("ingevoerd is "+ uitTeLeggenWoord);
				break;
			case "q":
				System.out.println("u wilt stoppen");
				return;
			default:
				System.out.println("Maak andere keuze");
			}
		}
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
		
		stenenOpPlankje.remove(0);
		stenenOpPlankje.add( Stenenzakje.stenen.get(0) );
		Stenenzakje.stenen.remove(0);
		
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
		for( int i = 0; i < 200 ; i++) {
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











