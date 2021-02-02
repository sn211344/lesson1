package controller;

import view.PiggBankSimulator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PBStatsListener implements ActionListener{

	private PiggBankSimulator panel;

	public PBStatsListener(PiggBankSimulator panel) {
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int nickels = 0;
		int dimes = 0;
		int quarters = 0;
		for (var coin : panel.getPiggyBank().getCoinHistory()) {
			switch (coin.getValue()) {
				case 5: ++ nickels; break;
				case 10: ++ dimes; break;
				case 25: ++ quarters; break;
			}
		}
		String em = panel.getDisplay().getText();
		em += "\nCoin Stats\n";
		panel.getDisplay().setText(em + "Nickels: " + nickels + "\nDimes: " + dimes + "\nQuarters: " + quarters);

	}
	
}
