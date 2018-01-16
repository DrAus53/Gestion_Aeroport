package fr.eseo.gestionAeroport.vue.ui;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanneauPrincipal extends JPanel {

	public static int HAUTEUR_PANNEAU_PAR_DEFAUT = 150;
	public static int LARGEUR_PANNEAU_PAR_DEFAUT = 400;

	private PanneauEchangeBillet panneauEchangeBillet;

	public PanneauPrincipal(int largeur, int hauteur) {
		super();
		BoxLayout box = new BoxLayout(this, BoxLayout.Y_AXIS);
		this.setLayout(box);
		this.setSize(largeur, hauteur);
		this.setBackground(Color.CYAN);

		// AJout du panneau échange billet
		this.panneauEchangeBillet = new PanneauEchangeBillet();
		this.add(panneauEchangeBillet);
	}

}
