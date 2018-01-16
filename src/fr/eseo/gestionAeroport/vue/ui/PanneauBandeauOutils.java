package fr.eseo.gestionAeroport.vue.ui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class PanneauBandeauOutils extends javax.swing.JPanel {

	private static final long serialVersionUID = 1L;

	FenetreGestionAeroport fenetre;

	public static final int LARGEUR_PAR_DEFAUT = 100;
	public static final int HAUTEUR_PAR_DEFAUT = 75;
	public static final Color COULEUR_FOND_PAR_DEFAUT = Color.black;

	public int largeur;
	public int hauteur;

	private ButtonGroup buttonGroup = new ButtonGroup();

	public PanneauBandeauOutils(int largeur, int hauteur, Color fond, FenetreGestionAeroport fenetre) {
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.fenetre = fenetre;

		this.setBackground(fond);
		this.setPreferredSize(new Dimension(this.largeur, this.hauteur));
		BoxLayout box = new BoxLayout(this, BoxLayout.Y_AXIS);
		this.setLayout(box);
		initComponents();
	}

	public PanneauBandeauOutils() {
		this(LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT, COULEUR_FOND_PAR_DEFAUT, null);
	}

	private void initComponents() {

		JButton boutonProfil = new JButton();
		this.add(boutonProfil);

		repaint();
	}
}
