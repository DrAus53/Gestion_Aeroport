package fr.eseo.gestionaeroport.vue.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import fr.eseo.gestionaeroport.GestionAeroport;
import fr.eseo.gestionaeroport.modele.Utilisateur;
import fr.eseo.gestionaeroport.vue.panneaux.PanneauEchangeBillet;
import fr.eseo.gestionaeroport.vue.panneaux.PanneauEmbarquement;
import fr.eseo.gestionaeroport.vue.panneaux.PanneauEnregistrerUnNouvelAvion;
import fr.eseo.gestionaeroport.vue.panneaux.PanneauModifierUnCompteClient;
import fr.eseo.gestionaeroport.vue.panneaux.PanneauProposerVol;
import fr.eseo.gestionaeroport.vue.panneaux.PanneauRechercheVol;

@SuppressWarnings("serial")
public class FenetreGestionAeroport extends JFrame {

	private static FenetreGestionAeroport instance;
	public static final String TITRE_PAR_DEFAUT = "ESEO Airlines - Gestion d'Aéroport";

	private static final int LARGEUR_FENETRE_MIN = 500;
	private static final int HAUTEUR_FENETRE_MIN = 300;

	public static final int LARGEUR_PANNEAU_PAR_DEFAUT = 300;
	public static final int HAUTEUR_PANNEAU_PAR_DEFAUT = 30;

	public static final int LARGEUR_BOITE_DIALOGUE_PAR_DEFAUT = 500;
	public static final int HAUTEUR_BOITE_DIALOGUE_PAR_DEFAUT = 300;

	public static final Color COULEUR_FOND_FENETRE = new Color(144, 164, 174);
	public static final Color COULEUR_CADRE_PANNEAUX = new Color(0, 105, 92);
	public static final Color COULEUR_FOND_PANNEAUX = new Color(242, 244, 244);
	public static final Color COULEUR_ACCENTUATION = new Color(165, 214, 167);
	public static final Color COULEUR_BANDEAU = new Color(23, 32, 42);

	private BarreOutils barreOutils;
	private PanneauRechercheVol panneauRechercheVol;
	private PanneauProposerVol panneauProposerVol;
	private PanneauEnregistrerUnNouvelAvion panneauEnregistrerUnNouvelAvion;
	private PanneauModifierUnCompteClient panneauModifierUnCompteClient;
	private PanneauEchangeBillet panneauEchangeBillet;
	private PanneauEmbarquement panneauEmbarquement;

	private FenetreGestionAeroport() {
		super();
		this.setTitle(TITRE_PAR_DEFAUT);
		this.setIconImage(new ImageIcon("icone_avion.png").getImage());

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setResizable(true);
		this.setMinimumSize(new Dimension(LARGEUR_FENETRE_MIN, HAUTEUR_FENETRE_MIN));

		this.getContentPane().setBackground(COULEUR_FOND_FENETRE);

		// A GARDER pour pouvoir obtenir la dimension de la fenetre lors de
		// l'initialisation des composants
		this.setVisible(true);

		initialisationComposants();

		this.setVisible(true);
	}

	public static FenetreGestionAeroport getInstance() {
		if (FenetreGestionAeroport.instance == null) {
			FenetreGestionAeroport.instance = new FenetreGestionAeroport();
		}
		return FenetreGestionAeroport.instance;
	}

	private void initialisationComposants() {
		// Utilisation d'un gridBagLayout
		this.getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.BOTH;
		/// ajoute une marge entre les panels (haut, gauche, bas, droite)
		constraints.insets = new Insets(20, 15, 20, 15);

		int hauteurBandeauOutil = Math.max((int) (this.getHeight() / 25), 20);

		// Bandeau outils
		this.barreOutils = new BarreOutils((int) this.getSize().getWidth(), hauteurBandeauOutil, COULEUR_BANDEAU);
		this.setJMenuBar(this.barreOutils);

		this.panneauRechercheVol = new PanneauRechercheVol();
		constraints.gridx = 0;
		constraints.gridy = 1;
		this.getContentPane().add(this.panneauRechercheVol, constraints);

		this.panneauProposerVol = new PanneauProposerVol();
		constraints.gridx = 1;
		constraints.gridy = 1;
		this.getContentPane().add(this.panneauProposerVol, constraints);

		this.panneauEnregistrerUnNouvelAvion = new PanneauEnregistrerUnNouvelAvion();
		constraints.gridx = 0;
		constraints.gridy = 2;
		this.getContentPane().add(this.panneauEnregistrerUnNouvelAvion, constraints);

		this.panneauModifierUnCompteClient = new PanneauModifierUnCompteClient();
		constraints.gridx = 1;
		constraints.gridy = 2;
		this.getContentPane().add(this.panneauModifierUnCompteClient, constraints);

		this.panneauEchangeBillet = new PanneauEchangeBillet();
		constraints.gridx = 0;
		constraints.gridy = 3;
		this.getContentPane().add(panneauEchangeBillet, constraints);

		this.panneauEmbarquement = new PanneauEmbarquement();
		constraints.gridx = 1;
		constraints.gridy = 3;
		this.getContentPane().add(panneauEmbarquement, constraints);
	}

	public PanneauRechercheVol getPanneauRechercheVol() {
		return panneauRechercheVol;
	}

	public PanneauProposerVol getPanneauProposerVol() {
		return panneauProposerVol;
	}

	public PanneauEnregistrerUnNouvelAvion getPanneauEnregistrerUnNouvelAvion() {
		return panneauEnregistrerUnNouvelAvion;
	}

	public PanneauModifierUnCompteClient getPanneauModifierUnCompteClient() {
		return panneauModifierUnCompteClient;
	}

	public PanneauEchangeBillet getPanneauEchangeBillet() {
		return panneauEchangeBillet;
	}

	public PanneauEmbarquement getPanneauEmbarquement() {
		return panneauEmbarquement;
	}

	public static void fermerFenetre() {
		instance.dispose();
		GestionAeroport.getInstance();
		GestionAeroport.setUtilisateurConnecte(new Utilisateur(null, null, null, null, null));
		FenetreConnexion fenetre = FenetreConnexion.getInstance();
		fenetre.setVisible(true);

	}

}
