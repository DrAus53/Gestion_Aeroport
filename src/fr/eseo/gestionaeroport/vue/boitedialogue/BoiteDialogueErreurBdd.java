package fr.eseo.gestionaeroport.vue.boitedialogue;

import java.awt.Dimension;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class BoiteDialogueErreurBdd extends JOptionPane {

	public BoiteDialogueErreurBdd(int largeur, int hauteur) {
		super();
		this.setPreferredSize(new Dimension(largeur, hauteur));

		this.initialisationComposants();

		this.setVisible(true);
	}

	public BoiteDialogueErreurBdd() {
		this(350, 170);
	}

	private void initialisationComposants() {
		BoiteDialogueErreurBdd.showMessageDialog(null, "Erreur lors de l'accès à la base de donnée", "Erreur",
				JOptionPane.ERROR_MESSAGE);
	}
}
