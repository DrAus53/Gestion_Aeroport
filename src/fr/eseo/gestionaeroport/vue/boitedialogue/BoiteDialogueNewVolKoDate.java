package fr.eseo.gestionaeroport.vue.boitedialogue;

import java.awt.Dimension;

import javax.swing.JOptionPane;

public class BoiteDialogueNewVolKoDate extends JOptionPane {

	private static final long serialVersionUID = 1L;

	public BoiteDialogueNewVolKoDate(int largeur, int hauteur) {
		super();
		this.setPreferredSize(new Dimension(largeur, hauteur));

		this.initialisationComposants();

		this.setVisible(true);
	}

	public BoiteDialogueNewVolKoDate() {
		this(350, 170);
	}

	private void initialisationComposants() {
		BoiteDialogueNewVolKoDate.showMessageDialog(null, "Entrez donc une date valide ;)", "Erreur",
				JOptionPane.ERROR_MESSAGE);
	}
}
