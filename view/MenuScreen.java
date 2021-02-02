package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuScreen {

	private JFrame window;

	public MenuScreen(JFrame window) {
		this.window = window;
	}

	public void init() {
		Container cp = window.getContentPane();
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(400, 200));
		panel.setLayout(new GridLayout(2, 1));

		JButton calcButton = new JButton("Calculator Stimulator");
		JButton piggybankButton = new JButton("PiggyBank Stimulator");
		panel.add(calcButton);
		panel.add(piggybankButton);
		cp.add(BorderLayout.CENTER, panel);

		calcButton.addActionListener( e -> 
			System.out.println("Calc button is pressed")
		);

		piggybankButton.addActionListener( e -> 
			System.out.println("Piggybank button is pressed")
		);

	}
	
}
