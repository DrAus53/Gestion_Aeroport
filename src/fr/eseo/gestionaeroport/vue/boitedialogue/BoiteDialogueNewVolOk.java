package fr.eseo.gestionaeroport.vue.boitedialogue;

import java.awt.Dimension;

import javax.swing.JOptionPane;

public class BoiteDialogueNewVolOk extends JOptionPane {

	private static final long serialVersionUID = 1L;

	public BoiteDialogueNewVolOk(int largeur, int hauteur) {
		super();
		this.setPreferredSize(new Dimension(largeur, hauteur));

		this.initialisationComposants();

		this.setVisible(true);
	}

	public BoiteDialogueNewVolOk() {
		this(350, 170);
	}

	private void initialisationComposants() {
		BoiteDialogueNewVolOk.showMessageDialog(null, "Vol enregistré.", "Succès", JOptionPane.INFORMATION_MESSAGE);
	}
}
