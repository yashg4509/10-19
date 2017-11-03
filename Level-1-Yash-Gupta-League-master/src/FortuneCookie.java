package general;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class FortuneCookie implements ActionListener{
JFrame frame = new JFrame();
JButton btn = new JButton();
Random rand = new Random();


public void showButtons() {
	frame.setVisible(true);
	frame.setResizable(false);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLocationRelativeTo(null);
	btn.addActionListener(this);
	frame.add(btn);
	frame.pack();
	System.out.println(rand.nextInt(5));
	
}

public static void main(String[] args) {
	FortuneCookie cookie = new FortuneCookie();
	cookie.showButtons();

}

public void actionPerformed(ActionEvent arg0) {
	if(arg0.getSource() == btn) {
		System.out.println(rand.nextInt(5));
		if (rand.nextInt(5) == 0) {
			JOptionPane.showMessageDialog(null, "You will be very lonely, however very smart in math.");
		}
		
		if (rand.nextInt(5) == 1) {
		JOptionPane.showMessageDialog(null, "You will be neither smart nor athletic nor not lonely.");
		}
		
		if(rand.nextInt(5) == 2) {
			JOptionPane.showMessageDialog(null, "You will work at Google, Amazon, Facebook, and Apple.");
		}
		
		if(rand.nextInt(5) == 3) {
			JOptionPane.showMessageDialog(null, "You will be a great programmer and good at school.");
		}
		
		if(rand.nextInt(5) == 4) {
			JOptionPane.showMessageDialog(null, "You are gonna become a great athelete.");
		}
	}
	
}
}
