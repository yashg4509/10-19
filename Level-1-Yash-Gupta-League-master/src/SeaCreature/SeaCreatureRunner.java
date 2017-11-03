package SeaCreature;

public class SeaCreatureRunner {
	public static void main(String[] args) {
		SeaCreature ploob = new SeaCreature("Spongebob");
		SeaCreature ploob2 = new SeaCreature("Patrick");
		SeaCreature ploob3 = new SeaCreature("Squidward");
		ploob.laugh();
		ploob.eat();
		ploob2.printName();
		ploob2.laugh();
		ploob2.eat();
		ploob3.printName();
		ploob3.laugh();
		ploob3.eat();
		ploob.kill();
		ploob.laugh();
		ploob2.kill();
		ploob2.laugh();
		ploob3.kill();
		ploob3.laugh();
	}
}
