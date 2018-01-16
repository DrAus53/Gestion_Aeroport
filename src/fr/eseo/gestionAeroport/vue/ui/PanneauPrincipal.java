package fr.eseo.gestionAeroport.vue.ui;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class PanneauPrincipal extends JPanel {

	public PanneauPrincipal(int largeur, int hauteur) {
		super();
		BoxLayout box = new BoxLayout(this, BoxLayout.Y_AXIS);
		this.setLayout(box);
		this.setSize(largeur, hauteur);
		this.setBackground(Color.CYAN);
	}

}
