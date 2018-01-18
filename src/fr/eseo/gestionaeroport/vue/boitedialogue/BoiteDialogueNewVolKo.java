package fr.eseo.gestionaeroport.vue.boitedialogue;

import java.awt.Dimension;

import javax.swing.JOptionPane;

public class BoiteDialogueNewVolKo extends JOptionPane {

	private static final long serialVersionUID = 1L;

	public BoiteDialogueNewVolKo(int largeur, int hauteur) {
		super();
		this.setPreferredSize(new Dimension(largeur, hauteur));

		this.initialisationComposants();

		this.setVisible(true);
	}

	public BoiteDialogueNewVolKo() {
		this(350, 170);
	}

	private void initialisationComposants() {
		BoiteDialogueNewVolKo.showMessageDialog(null, "Erreur lors de l'enregistrement du vol.", "Erreur",
				JOptionPane.ERROR_MESSAGE);
	}
}
