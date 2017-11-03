package SeaCreature;
/*
 * 1. In a Runner class, make a SeaCreature called “Spongebob”. Use the methods below to make him eat and laugh.
 * 2. Make Patrick and Squidward and print their name, have them eat, and make them laugh.
 */

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SeaCreature {

	private String name;

	SeaCreature(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name;
	}

	public void eat() {
		System.out.println(name + " is eating krabby patties");
	}
	
	public void printName() {
		System.out.println(name);
	}

	public void laugh() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(
					 this.name + ".wav").toURI().toURL());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public void kill() {
		System.out.println(name + " has been shocked and strangled to death by a jellyfish, run over by Ms.Puffins, and eaten by Keith. BYE BYE " + name + "!");
	}
}
