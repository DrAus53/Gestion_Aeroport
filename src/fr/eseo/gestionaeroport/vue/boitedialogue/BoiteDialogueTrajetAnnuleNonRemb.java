package fr.eseo.gestionaeroport.vue.boitedialogue;

import java.awt.Dimension;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class BoiteDialogueTrajetAnnuleNonRemb extends JOptionPane {

	public BoiteDialogueTrajetAnnuleNonRemb(int largeur, int hauteur) {
		super();
		this.setPreferredSize(new Dimension(largeur, hauteur));

		this.initialisationComposants();

		this.setVisible(true);
	}

	public BoiteDialogueTrajetAnnuleNonRemb() {
		this(350, 170);
	}

	private void initialisationComposants() {
		BoiteDialogueTrajetAnnuleNonRemb.showMessageDialog(null,
				"Le trajet a bien été annulé. Veuillez utiliser le panneau recherche de vol pour changer le billet.",
				"Information", JOptionPane.INFORMATION_MESSAGE);
	}
}
