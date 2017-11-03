import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
 
/** We’re going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be loaded. **/

public class BookOfIllusions extends MouseAdapter {
	boolean mouseClicked;
	/*
	 * Here we are instantiating our BookOfIllusions class and calling it’s createBook() method. This is because we want to get out of the
	 * static main method, so that we can add a click listener to each illusion.
	 */

	public static void main(String[] args) throws Exception {
		BookOfIllusions illusions = new BookOfIllusions();
		illusions.createBook();
		
		
	}
JLabel icon;
JLabel icon2;
JLabel ad1;
JLabel ad2;
	// 1. Make a JFrame variable and initialize it using "new JFrame()"
	JFrame newFrame = new JFrame();
	private void createBook() {
		// 2. make the frame visible
		newFrame.setVisible(true);
		// 3. set the size of the frame
		newFrame.setSize(600, 420);
		// 4. find 2 images and save them to your project’s default package
		// 5. make a variable to hold the location of your image. e.g. "illusion.jpg"
		String leagueImg = "leagueImg.jpg";
		// 6. create a variable of type "JLabel" but don’t initialize it yet
		
		// 7. use the "loadImage..." methods below to initialize your JLabel
		icon = loadImageFromComputer(leagueImg);
		// 8. add your JLabel to the frame
		newFrame.add(icon);
		// 9. call the pack() method on the frame
		newFrame.pack();
		// 10. add a mouse listener to your frame (hint: use *this*)
		newFrame.addMouseListener(this);
	}

	public void mousePressed(MouseEvent e) {
		// 11. Print "clicked!" to the console when the mouse is pressed
		if (mouseClicked == true) {
			JOptionPane.showMessageDialog(null, "THIS IS A WITTY POP - UP AD!!!");
			newFrame.remove(icon2);
			ad1 = loadImageFromComputer("stupidAd1.png");
			newFrame.add(ad1);
			System.out.println("Clicked");
			newFrame.pack();
			JOptionPane.showMessageDialog(null, "THIS IS ANOTHER WITTY POP - UP AD!!!");
			newFrame.remove(ad1);
			ad2 = loadImageFromComputer("stupid.gif");
			newFrame.add(ad2);
			System.out.println("Clicked");
			newFrame.pack();
			}
		// 12. remove everything from the frame that was added earlier
			else {
		newFrame.remove(icon);
		// 13. load a new image like before (this is more than one line of code)
		icon2 = loadImageFromComputer("level-1-icon.png");
		newFrame.add(icon2);
		// 14. pack the frame
		newFrame.pack();
			}
		mouseClicked = true;
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups
	
	
	

	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}
