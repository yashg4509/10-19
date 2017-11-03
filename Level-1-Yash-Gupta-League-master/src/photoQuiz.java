
import java.awt.*;
import java.net.*;
import javax.swing.*;

public class photoQuiz {
	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
		
		String imgLink = "https://cdn.kastatic.org/images/marketing/share-thumb-b.jpg";
		 Component comp;
		comp = createImage(imgLink);
		quizWindow.add(comp);
		quizWindow.pack();
		String ans = JOptionPane.showInputDialog("What is the name of this company?");
		if (ans.equals("khan academy") || ans.equals("Khan Academy")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		else {
			System.out.println("Incorrect!");
		}
		quizWindow.remove(comp);
		String imgLink2 = "http://static.comicvine.com/uploads/original/12/129924/3503000-justin_llama_biber_by_beep16-d35h1b0.jpg";
		Component comp2;
		comp2 = createImage(imgLink2);
		quizWindow.add(comp2);
		quizWindow.pack();
		String q = JOptionPane.showInputDialog("What animal is this?");
		if ((q.equals("llama") || (q.equals("Llama")))) {
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		else {
			System.out.println("Incorrect!");
		}
	
	}
	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
}