package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PiggBankSimulator {


	private JFrame window;
	private JTextArea display = new JTextArea();

	public PiggBankSimulator(JFrame window) {
		this.window = window;
		window.setTitle("Piggy Bank Simulator");
	}

	public void init() {
		Container cp = window.getContentPane();

		var scrollPane = new JScrollPane(display, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
		JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	scrollPane.setPreferredSize(new Dimension(500, 500));

	cp.add(BorderLayout.CENTER, scrollPane);
	}
}
