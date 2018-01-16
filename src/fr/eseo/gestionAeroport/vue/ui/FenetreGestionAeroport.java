package fr.eseo.gestionAeroport.vue.ui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class FenetreGestionAeroport extends JFrame {

	private static FenetreGestionAeroport instance;
	public static final String TITRE_PAR_DEFAUT = "Gestion d'Aeroport";

	public static final int LARGEUR_PANNEAU_PAR_DEFAUT = 300;
	public static final int HAUTEUR_PANNEAU_PAR_DEFAUT = 30;

	public static final Color COULEUR_FOND_FENETRE = new Color(38, 138, 255);
	public static final Color COULEUR_CADRE_PANNEAUX = new Color(255, 81, 38);
	public static final Color COULEUR_FOND_PANNEAUX = new Color(255, 255, 255);
	public static final Color COULEUR_ACCENTUATION = new Color(255, 208, 38);
	public static final Color COULEUR_BANDEAU = new Color(23, 32, 42);

	private BarreOutils barreOutils;
	private PanneauRechercheVol panneauRechercheVol;
	private PanneauProposerVol panneauProposerVol;
	private PanneauEnregistrerUnNouvelAvion panneauEnregistrerUnNouvelAvion;
	private PanneauModifierUnCompteClient panneauModifierUnCompteClient;
	private PanneauEchangeBillet panneauEchangeBillet;

	public FenetreGestionAeroport() {
		super();
		this.setTitle(TITRE_PAR_DEFAUT);
		this.setIconImage(new ImageIcon("icone_avion.png").getImage());

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setResizable(true);

		this.getContentPane().setBackground(COULEUR_FOND_FENETRE);

		this.getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.BOTH;
		constraints.insets = new Insets(10, 10, 10, 10);

		this.setVisible(true);

		int hauteurBandeauOutil = Math.max((int) (this.getSize().getHeight() / 25), 20);

		// Bandeau outils
		this.barreOutils = new BarreOutils((int) this.getSize().getWidth(), hauteurBandeauOutil, COULEUR_BANDEAU);
		this.setJMenuBar(this.barreOutils);

		constraints.gridwidth = 1;

		this.panneauRechercheVol = new PanneauRechercheVol();
		constraints.gridx = 0;
		constraints.gridy = 1;
		this.getContentPane().add(this.panneauRechercheVol, constraints);
		// this.getContentPane().add(this.panneauRechercheVol);
		// this.setVisible(true);

		this.panneauProposerVol = new PanneauProposerVol();
		constraints.gridx = 1;
		constraints.gridy = 1;
		this.getContentPane().add(this.panneauProposerVol, constraints);
		// this.getContentPane().add(this.panneauEnregistrerUnNouvelAvion);
		// this.setVisible(true);

		this.panneauEnregistrerUnNouvelAvion = new PanneauEnregistrerUnNouvelAvion();
		constraints.gridx = 0;
		constraints.gridy = 2;
		this.getContentPane().add(this.panneauEnregistrerUnNouvelAvion, constraints);
		// this.getContentPane().add(this.panneauModifierUnCompteClient);

		this.panneauModifierUnCompteClient = new PanneauModifierUnCompteClient();
		constraints.gridx = 1;
		constraints.gridy = 2;
		this.getContentPane().add(this.panneauModifierUnCompteClient, constraints);

		this.panneauEchangeBillet = new PanneauEchangeBillet();
		constraints.gridx = 0;
		constraints.gridy = 3;
		this.getContentPane().add(panneauEchangeBillet, constraints);

		this.setVisible(true);

	}

	public static FenetreGestionAeroport getInstance() {
		if (FenetreGestionAeroport.instance == null) {
			FenetreGestionAeroport.instance = new FenetreGestionAeroport();
		}
		return FenetreGestionAeroport.instance;
	}

}
