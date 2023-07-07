package tw.org.iii.teresaaaaapp;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MyBallGame extends JFrame{
	private MyPanel myPanel;
	
	public MyBallGame() {
		setLayout(new BorderLayout());
	
		myPanel = new MyPanel();
		add(myPanel, BorderLayout.CENTER);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new MyBallGame();
	}

}