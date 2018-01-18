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
		BoiteDialogueTrajetNonTrouve.showMessageDialog(null, "Trajet non trouv� dans la base de donn�e",
				"Trajet non trouv�", JOptionPane.OK_CANCEL_OPTION);
	}
}
