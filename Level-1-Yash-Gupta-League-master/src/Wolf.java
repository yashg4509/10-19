
public class Wolf {
String name;
int feet;
int eyes;
int nose;
int legs;

Wolf(String name, int feet, int nose, int eyes) {
	this.name = name;
	this.feet = feet;
	this.eyes = eyes;
	this.nose = 3;
	this.legs = 5;
}
public String toString() {
	String str = "My animal's name is " + this.name + ". He has " + 
this.feet + " feet. He also has " + this.eyes + " eyes. He also has " + this.nose +
" nose. He also has " + this.legs + " legs.";
	return str;
}

public static void main(String[] args) {
	Wolf tiger = new Wolf("Weirdo", 3, 5, 30); 
	System.out.println(tiger.eyes);
	System.out.println(tiger.feet);
	System.out.println(tiger.legs);
	System.out.println(tiger.name);
	System.out.println(tiger.nose);
	System.out.println(tiger.toString());
}
}
