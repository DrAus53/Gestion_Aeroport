package fr.eseo.gestionaeroport.vue.boitedialogue;

import java.awt.Dimension;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class BoiteDialogueTrajetAnnuleOk extends JOptionPane {

	public BoiteDialogueTrajetAnnuleOk(int largeur, int hauteur) {
		super();
		this.setPreferredSize(new Dimension(largeur, hauteur));

		this.initialisationComposants();

		this.setVisible(true);
	}

	public BoiteDialogueTrajetAnnuleOk() {
		this(350, 170);
	}

	private void initialisationComposants() {
		BoiteDialogueTrajetAnnuleOk.showMessageDialog(null, "Le trajet a bien été supprimé", "Information",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
