import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level1Exam implements MouseListener{
	JFrame frame = new JFrame("Level 1 Exam - Yash Gupta");
	JButton yellow = new JButton();
	JButton red = new JButton();
	JButton blue = new JButton();
	JButton green = new JButton();
	JPanel btnPanel = new JPanel();
	
	public void setup() {
		//Buttons
		yellow.addMouseListener(this);
		red.addMouseListener(this);
		blue.addMouseListener(this);
		green.addMouseListener(this);
		yellow.setOpaque(true);
		red.setOpaque(true);
		blue.setOpaque(true);
		green.setOpaque(true);
		yellow.setBackground(Color.yellow);
		red.setBackground(Color.red);
		blue.setBackground(Color.blue);
		green.setBackground(Color.green);
		
		//Button Panel
		btnPanel.add(yellow);
		btnPanel.add(red);
		btnPanel.add(blue);
		btnPanel.add(green);
		
		//Frame
		frame.add(btnPanel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
	}
	
	public void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Level1Exam exam = new Level1Exam();
		exam.setup();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource() == yellow) {
			speak("yellow");
		}
		
		if(e.getSource() == red) {
			speak("red");
		}

		if(e.getSource() == blue) {
			speak("blue");
		}

		if(e.getSource() == green) {
			speak("green");
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
