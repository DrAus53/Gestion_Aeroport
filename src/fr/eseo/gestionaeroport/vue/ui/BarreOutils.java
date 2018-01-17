package fr.eseo.gestionaeroport.vue.ui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class BarreOutils extends JMenuBar {

	private static final long serialVersionUID = 1L;

	private static final int LARGEUR_PAR_DEFAUT = 1350;
	private static final int HAUTEUR_PAR_DEFAUT = 75;
	private static final Color COULEUR_FOND_PAR_DEFAUT = Color.black;

	private JMenu menuProfil = new JMenu("Profil");
	private JMenuItem itemNom = new JMenuItem("Nom");
	private JMenuItem itemPrenom = new JMenuItem("Prenom");
	private JMenuItem itemLogin = new JMenuItem("Login");
	private JMenuItem itemAdresseMail = new JMenuItem("AdresseMail");
	private JMenuItem itemModifer = new JMenuItem("Modifer");
	private JMenuItem itemDeconexion = new JMenuItem("Deconexion");

	public BarreOutils(int largeur, int hauteur, Color fond) {

		this.setBackground(fond);
		this.setPreferredSize(new Dimension(largeur, hauteur));
		initComponents();
	}

	public BarreOutils() {
		this(LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT, COULEUR_FOND_PAR_DEFAUT);
	}

	private void initComponents() {

		this.menuProfil.add(itemNom);
		this.menuProfil.add(itemPrenom);
		this.menuProfil.add(itemLogin);
		this.menuProfil.add(itemAdresseMail);
		this.menuProfil.add(itemModifer);
		this.menuProfil.addSeparator();
		this.menuProfil.add(itemDeconexion);

		this.add(menuProfil);

		/*
		 * boutonProfil.setMaximumSize(new Dimension(100, 50));
		 * boutonProfil.setAlignmentX(RIGHT_ALIGNMENT); this.add(boutonProfil);
		 */
		repaint();
	}
}