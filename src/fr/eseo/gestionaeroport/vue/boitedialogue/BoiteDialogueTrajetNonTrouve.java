package fr.eseo.gestionaeroport.vue.boitedialogue;

import java.awt.Dimension;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class BoiteDialogueTrajetNonTrouve extends JOptionPane {

	public BoiteDialogueTrajetNonTrouve(int largeur, int hauteur) {
		super();
		this.setPreferredSize(new Dimension(largeur, hauteur));

		this.initialisationComposants();

		this.setVisible(true);
	}

	public BoiteDialogueTrajetNonTrouve() {
		this(350, 170);
	}

	private void initialisationComposants() {
		BoiteDialogueTrajetNonTrouve.showMessageDialog(null, "Trajet non trouvé dans la base de donnée",
				"Trajet non trouvé", JOptionPane.OK_CANCEL_OPTION);
	}
}
