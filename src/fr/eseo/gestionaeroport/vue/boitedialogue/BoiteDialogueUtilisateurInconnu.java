package fr.eseo.gestionaeroport.vue.boitedialogue;

import java.awt.Dimension;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class BoiteDialogueUtilisateurInconnu extends JOptionPane {

	public BoiteDialogueUtilisateurInconnu(int largeur, int hauteur) {
		super();
		this.setPreferredSize(new Dimension(largeur, hauteur));

		this.initialisationComposants();

		this.setVisible(true);
	}

	public BoiteDialogueUtilisateurInconnu() {
		this(350, 170);
	}

	private void initialisationComposants() {
		BoiteDialogueUtilisateurInconnu.showMessageDialog(null, "Utilisateur non trouv� dans la base de donn�e",
				"Utilisateur inconnu", JOptionPane.OK_CANCEL_OPTION);
	}
}
