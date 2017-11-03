import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Whackamole implements MouseListener {
	Random r = new Random();
	JFrame frame = new JFrame("Whack a Button for Fame and Glory");
	JButton mole = new JButton("mole!");
	JPanel panel;
	int counter = 0;
	Date timeAtStart;

	public void drawButtons() {
		panel = new JPanel();
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(600, 420);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLayout(new GridLayout());
		int rand = r.nextInt(23);
		System.out.println(rand);

		for (int i = 0; i < 24; i++) {
			JButton btn = new JButton();
			btn.addMouseListener(this);

			if (rand == i) {
				mole.addMouseListener(this);
				panel.add(mole);
			} else {
				panel.add(btn);
			}
		}

	}

	public static void main(String[] args) {
		Whackamole me = new Whackamole();
		me.timeAtStart = new Date();
		me.drawButtons();
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() != mole) {
			speak("DORK");
		} else {
			counter++;

			if (counter > 10) {
				endGame(timeAtStart, counter);
			}

			frame.remove(panel);
			frame.dispose();
			drawButtons();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

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
