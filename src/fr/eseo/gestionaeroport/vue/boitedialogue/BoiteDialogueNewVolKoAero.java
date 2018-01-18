package fr.eseo.gestionaeroport.vue.boitedialogue;

import java.awt.Dimension;

import javax.swing.JOptionPane;

public class BoiteDialogueNewVolKoAero extends JOptionPane {

	private static final long serialVersionUID = 1L;

	public BoiteDialogueNewVolKoAero(int largeur, int hauteur) {
		super();
		this.setPreferredSize(new Dimension(largeur, hauteur));

		this.initialisationComposants();

		this.setVisible(true);
	}

	public BoiteDialogueNewVolKoAero() {
		this(350, 170);
	}

	private void initialisationComposants() {
		BoiteDialogueNewVolKoAero.showMessageDialog(null, "N'atterrissez pas o� vous avez d�coll� x)", "Erreur",
				JOptionPane.ERROR_MESSAGE);
	}
}
