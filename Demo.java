class Demo{
	public static void main(String[] args) {	
		System.out.println("Scrable");
		Speler speler1 = new Speler();
		System.out.println( speler1.plank );
	}
}
class Speler{
	String naam;
	Plankje plank = new Plankje();
}
class Plankje{
	
}