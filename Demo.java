import java.util.ArrayList;
import java.util.Random;

class Demo{
	public static void main(String[] args) {	
		System.out.println("Scrable");
		Speler speler1 = new Speler();
		System.out.println( speler1.plank );
		System.out.println( speler1.plank.steentje.letter );
	}
}
class Speler{
	String naam;
	Plankje plank = new Plankje();
}
class Plankje{
	Steen steentje = Stenenzakje.stenen.get(0);
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
		char getal = (char)(husselaar.nextInt(26) + 65);
		Steen steentje = new Steen(getal);
		stenen.add(steentje);
	}
}











