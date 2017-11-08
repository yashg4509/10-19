import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExamPracticeI1 implements MouseListener{
	JFrame frame = new JFrame("Level 1 Exam Individual Practice");
	JPanel btnPanel = new JPanel();
	JButton yellow = new JButton();
	JButton red = new JButton();
	JButton blue = new JButton();
	JButton green = new JButton();
	
	ExamPracticeI1 ep;
	
	public void generate() {
		yellow.addMouseListener(this);
		red.addMouseListener(this);
		blue.addMouseListener(this);
		green.addMouseListener(this);
		yellow.setOpaque(true);
		red.setOpaque(true);
		blue.setOpaque(true);
		green.setOpaque(true);
		yellow.setBackground(Color.YELLOW);
		red.setBackground(Color.red);
		blue.setBackground(Color.BLUE);
		green.setBackground(Color.green);
		btnPanel.add(yellow);
		btnPanel.add(red);
		btnPanel.add(blue);
		btnPanel.add(green);
		frame.add(btnPanel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		ExamPracticeI1 test = new ExamPracticeI1();
		test.generate();
	}
	
	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		}

	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource() == yellow) {
			ep.speak("yellow");
		}
		
		if(e.getSource() == blue) {
			ep.speak("blue");
		}
		
		if(e.getSource() == red) {
			ep.speak("red");
		}
		
		if(e.getSource() == green) {
			ep.speak("green");
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
