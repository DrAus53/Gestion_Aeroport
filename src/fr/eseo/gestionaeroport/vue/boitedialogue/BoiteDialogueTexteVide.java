package fr.eseo.gestionaeroport.vue.boitedialogue;

import java.awt.Dimension;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class BoiteDialogueTexteVide extends JOptionPane {

	public BoiteDialogueTexteVide(int largeur, int hauteur) {
		super();
		this.setPreferredSize(new Dimension(largeur, hauteur));

		this.initialisationComposants();

		this.setVisible(true);
	}

	public BoiteDialogueTexteVide() {
		this(350, 170);
	}

	private void initialisationComposants() {
		BoiteDialogueTexteVide.showMessageDialog(null, "Veuillez remplir toutes les zones de texte", "Attention",
				JOptionPane.WARNING_MESSAGE);
	}
}
