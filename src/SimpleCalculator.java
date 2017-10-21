import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SimpleCalculator {
	static JFrame frame;
	static JTextField text = new JTextField();
	static JTextField text2 = new JTextField();
	static JButton add = new JButton("add");
	static JButton sub = new JButton("sub");
	static JButton mul = new JButton("mul");
	static JButton div = new JButton("div");
	JLabel ans;
	
	public void add() {
		
	}
	
	public void sub() {
		
	}
	
	public void mul() {
		
	}
	
	public void div() {
		
	}
	
	public static void main(String[] args) {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(text);
		frame.add(text2);
		frame.add(add);
		frame.add(sub);
		frame.add(mul);
		frame.add(div);
		frame.pack();
	}
}
