package fr.eseo.gestionaeroport.vue.boitedialogue;

import java.awt.Dimension;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class BoiteDialogueNewAvionKo extends JOptionPane {

	public BoiteDialogueNewAvionKo(int largeur, int hauteur) {
		super();
		this.setPreferredSize(new Dimension(largeur, hauteur));

		this.initialisationComposants();

		this.setVisible(true);
	}

	public BoiteDialogueNewAvionKo() {
		this(350, 170);
	}

	private void initialisationComposants() {
		BoiteDialogueNewAvionKo.showMessageDialog(null, "Erreur lors de l'enregistrement du nouvel avion", "Erreur",
				JOptionPane.ERROR_MESSAGE);
	}
}
