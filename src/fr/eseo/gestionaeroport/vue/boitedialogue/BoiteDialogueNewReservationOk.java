package fr.eseo.gestionaeroport.vue.boitedialogue;

import java.awt.Dimension;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class BoiteDialogueNewReservationOk extends JOptionPane {

	public BoiteDialogueNewReservationOk(int largeur, int hauteur) {
		super();
		this.setPreferredSize(new Dimension(largeur, hauteur));

		this.initialisationComposants();

		this.setVisible(true);
	}

	public BoiteDialogueNewReservationOk() {
		this(300, 170);
	}

	private void initialisationComposants() {
		BoiteDialogueNewReservationOk.showMessageDialog(null, "Nouvelle réservation effectuée", "Information",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
