package fr.eseo.gestionAeroport.vue.ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanneauEchangeBillet extends JPanel {

	public PanneauEchangeBillet(int largeur, int hauteur) {
		this.setBackground(Color.YELLOW);
		this.setSize(largeur, hauteur);
		initialisation();
	}

	public PanneauEchangeBillet() {
		this(FenetreGestionAeroport.LARGEUR_PANNEAU_PAR_DEFAUT, FenetreGestionAeroport.LARGEUR_PANNEAU_PAR_DEFAUT);
	}

	private void initialisation() {
		// Zone de titre
		JLabel zoneTitre = new JLabel("Echange billet");
		zoneTitre.setFont(new Font("Arial Black", 1, 20));
		this.add(zoneTitre);

		// numero de vol
		JLabel numVolTxt = new JLabel("Numéro de vol :");
		this.add(numVolTxt);

		// nom du passager

		// remboursement

	}

}
