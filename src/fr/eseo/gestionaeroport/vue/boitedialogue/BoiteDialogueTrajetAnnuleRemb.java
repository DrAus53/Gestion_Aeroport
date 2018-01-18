package fr.eseo.gestionaeroport.vue.boitedialogue;

import java.awt.Dimension;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class BoiteDialogueTrajetAnnuleRemb extends JOptionPane {

	public BoiteDialogueTrajetAnnuleRemb(int largeur, int hauteur) {
		super();
		this.setPreferredSize(new Dimension(largeur, hauteur));

		this.initialisationComposants();

		this.setVisible(true);
	}

	public BoiteDialogueTrajetAnnuleRemb() {
		this(350, 170);
	}

	private void initialisationComposants() {
		BoiteDialogueTrajetAnnuleRemb.showMessageDialog(null, "Le trajet a bien été annulé et remboursé", "Information",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
