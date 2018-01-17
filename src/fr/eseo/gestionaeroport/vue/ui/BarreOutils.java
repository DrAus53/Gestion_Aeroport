package fr.eseo.gestionaeroport.vue.ui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import fr.eseo.gestionaeroport.GestionAeroport;
import fr.eseo.gestionaeroport.controleur.actions.ActionDeconnexion;

public class BarreOutils extends JMenuBar {

	private static final long serialVersionUID = 1L;

	private static final int LARGEUR_PAR_DEFAUT = 1350;
	private static final int HAUTEUR_PAR_DEFAUT = 75;
	private static final Color COULEUR_FOND_PAR_DEFAUT = Color.black;

	private JMenu menuProfil;
	private JMenuItem itemNom;
	private JMenuItem itemPrenom;
	private JMenuItem itemLogin;
	private JMenuItem itemAdresseMail;
	private JMenuItem itemModifer = new JMenuItem("Modifer");
	private JMenuItem itemDeconnexion = new JMenuItem(new ActionDeconnexion());

	public BarreOutils(int largeur, int hauteur, Color fond) {
		;
		menuProfil = new JMenu("Profil");
		GestionAeroport.getInstance();
		itemNom = new JMenuItem(GestionAeroport.getUtilisateurConnecte().getNom());
		itemPrenom = new JMenuItem(GestionAeroport.getUtilisateurConnecte().getPrenom());
		itemLogin = new JMenuItem(GestionAeroport.getUtilisateurConnecte().getLogin());
		itemAdresseMail = new JMenuItem(GestionAeroport.getUtilisateurConnecte().getAdresseMail());

		this.setBackground(fond);
		this.setPreferredSize(new Dimension(largeur, hauteur));
		initComponents();
	}

	public BarreOutils() {
		this(LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT, COULEUR_FOND_PAR_DEFAUT);
	}

	private void initComponents() {

		menuProfil.setForeground(Color.white);
		this.menuProfil.add(itemNom);
		this.menuProfil.add(itemPrenom);
		this.menuProfil.add(itemLogin);
		this.menuProfil.add(itemAdresseMail);
		this.menuProfil.add(itemModifer);
		this.menuProfil.addSeparator();
		this.menuProfil.add(itemDeconnexion);

		this.add(menuProfil);

		/*
		 * boutonProfil.setMaximumSize(new Dimension(100, 50));
		 * boutonProfil.setAlignmentX(RIGHT_ALIGNMENT); this.add(boutonProfil);
		 */
		repaint();
	}
}
