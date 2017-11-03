import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExamPractice implements MouseListener{
	JFrame frame = new JFrame("Level 1 Exam Practice");
	JPanel btnPanel = new JPanel();
	JButton btn1 = new JButton();
	JButton btn2 = new JButton();
	
	public void generate() {
		btn1.addMouseListener(this);
		btn2.addMouseListener(this);
		btn1.setOpaque(true);
		btn2.setOpaque(true);
		btn1.setBackground(Color.red);
		btn2.setBackground(Color.GREEN);
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		frame.add(btnPanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setSize(300, 70);
		frame.setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		ExamPractice p = new ExamPractice();
		p.generate();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource() == btn1) {
			btn1.setBackground(Color.green);
			btn2.setBackground(Color.RED);
		}
		
		if(e.getSource() == btn2) {
			btn2.setBackground(Color.green);
			btn1.setBackground(Color.red);
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
