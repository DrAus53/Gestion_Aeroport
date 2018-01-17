package fr.eseo.gestionaeroport.vue.boitedialogue;

import java.awt.Dimension;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class BoiteDialogueNewReservationKo extends JOptionPane {

	public BoiteDialogueNewReservationKo(int largeur, int hauteur) {
		super();
		this.setPreferredSize(new Dimension(largeur, hauteur));

		this.initialisationComposants();

		this.setVisible(true);
	}

	public BoiteDialogueNewReservationKo() {
		this(350, 170);
	}

	private void initialisationComposants() {
		BoiteDialogueNewReservationKo.showMessageDialog(null, "Erreur lors de l'enregistrement de la réservation",
				"Erreur", JOptionPane.ERROR_MESSAGE);
	}
}
