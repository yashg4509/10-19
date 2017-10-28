import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator implements MouseListener{
	static JFrame frame = new JFrame();
	static JTextField text = new JTextField();
	static JTextField text2 = new JTextField();
	static JPanel btnPanel = new JPanel();
	static JPanel txtPanel = new JPanel();
	static JPanel ansPanel = new JPanel();
	static JPanel contentPanel = new JPanel();
	static JButton add = new JButton("add");
	static JButton sub = new JButton("sub");
	static JButton mul = new JButton("mul");
	static JButton div = new JButton("div");
	int ans;
	JLabel ansLabel;
	String txtAns = text.getText();
	String txtAns2 = text2.getText();
	int ans1;
	int ans2;
	
	public void ans() {
		ansPanel.add(ansLabel);
	}
	public void inputOutput() {
		txtPanel.add(text);
		txtPanel.add(text2);
	}
	
	public void add() {
		add.addMouseListener(this);
		btnPanel.add(add);
	}
	
	public void sub() {
		sub.addMouseListener(this);
		btnPanel.add(sub);
	}
	
	public void mul() {
		mul.addMouseListener(this);
		btnPanel.add(mul);
	}
	
	public void div() {
		div.addMouseListener(this);
		btnPanel.add(div);
	}
	
	public static void main(String[] args) {
		SimpleCalculator c = new SimpleCalculator();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		txtPanel.setLayout(new BoxLayout(txtPanel, BoxLayout.PAGE_AXIS));
		contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
		contentPanel.add(txtPanel);
		contentPanel.add(btnPanel);
		contentPanel.add(ansPanel);
		frame.setVisible(true);
		c.inputOutput();
		c.add();
		c.sub();
		c.mul();
		c.div();
		frame.add(contentPanel);
		frame.pack();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getSource() == add) {
			try {
			ans1 = Integer.parseInt(txtAns);
			ans2 = Integer.parseInt(txtAns2);
			}
			catch (Exception ex) {
				ex.printStackTrace();
			}
			ans = ans1 + ans2;
			ansLabel.setText(Integer.toString(ans));
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
