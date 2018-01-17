package fr.eseo.gestionaeroport.vue.boitedialogue;

import java.awt.Dimension;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class BoiteDialogueNewAvionOk extends JOptionPane {

	public BoiteDialogueNewAvionOk(int largeur, int hauteur) {
		super();
		this.setPreferredSize(new Dimension(largeur, hauteur));

		this.initialisationComposants();

		this.setVisible(true);
	}

	public BoiteDialogueNewAvionOk() {
		this(300, 170);
	}

	private void initialisationComposants() {
		BoiteDialogueNewAvionOk.showMessageDialog(null, "Nouvel avion enregistré", "Information",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
