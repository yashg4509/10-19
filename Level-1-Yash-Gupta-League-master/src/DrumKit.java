import java.applet.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.net.*;
import javax.swing.*;

import javafx.scene.input.MouseEvent;

public class DrumKit extends MouseAdapter{
	JLabel drumLabel;
	
	public static void main(String[] args) throws Exception {
		new DrumKit().getGoing();
	}

	void getGoing() throws MalformedURLException {
		JFrame x = new JFrame();
		x.setVisible(true);
		x.setSize(600, 420);
		x.setTitle("Yash's Frame");
		JPanel y = new JPanel();
		x.add(y);
		String strikePro = "https://media.sweetwater.com/api/i/ha-c31919039ae2d3a4__q-85__hmac-8702cb2583fc734b19c826aaea9f9d5c25edc992/images/items/1800/StrikePro-xlarge.jpg";
		drumLabel = createLabelImage(strikePro);
		y.add(drumLabel);
		y.setLayout(new GridLayout());
		x.pack();
		drumLabel.addMouseListener(null);
	}
	public void mouseClicked(MouseEvent e) {
		JLabel drumClicked = (JLabel) e.getSource();
	}
	private JLabel createLabelImage(String fileName)
			throws MalformedURLException{
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image" + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
	
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}
}
