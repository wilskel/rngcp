package rngcp;

import javax.swing.JFrame;

public class ChordApp {
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("RCPG");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Chord_Panel panel = new Chord_Panel();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}
