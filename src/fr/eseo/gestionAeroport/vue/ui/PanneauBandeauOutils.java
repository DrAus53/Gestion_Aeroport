package fr.eseo.gestionAeroport.vue.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class PanneauBandeauOutils extends javax.swing.JPanel {

	private static final long serialVersionUID = 1L;

	public static final int LARGEUR_PAR_DEFAUT = 100;
	public static final int HAUTEUR_PAR_DEFAUT = 75;
	public static final Color COULEUR_FOND_PAR_DEFAUT = Color.black;

	public int largeur;
	public int hauteur;

	private JMenuBar menuBar = new JMenuBar();
	private JMenu menuProfil = new JMenu("Profil");
	private JMenuItem itemNom = new JMenuItem("Nom");
	private JMenuItem itemPrenom = new JMenuItem("Prenom");
	private JMenuItem itemLogin = new JMenuItem("Login");
	private JMenuItem itemAdresseMail = new JMenuItem("AdresseMail");
	private JMenuItem itemModifer = new JMenuItem("Modifer");
	private JMenuItem itemDeconexion = new JMenuItem("Deconexion");

	public PanneauBandeauOutils(int largeur, int hauteur, Color fond, FenetreGestionAeroport fenetre) {
		this.largeur = largeur;
		this.hauteur = hauteur;

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

		this.menuProfil.add(itemNom);
		this.menuProfil.add(itemPrenom);
		this.menuProfil.add(itemLogin);
		this.menuProfil.add(itemAdresseMail);
		this.menuProfil.add(itemModifer);
		this.menuProfil.addSeparator();
		this.menuProfil.add(itemDeconexion);

		menuBar.add(menuProfil);
		this.add(menuBar, BorderLayout.EAST);

		/*
		 * boutonProfil.setMaximumSize(new Dimension(100, 50));
		 * boutonProfil.setAlignmentX(RIGHT_ALIGNMENT); this.add(boutonProfil);
		 */
		repaint();
	}
}
