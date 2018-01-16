package fr.eseo.gestionAeroport.vue.ui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class FenetreGestionAeroport extends JFrame {

	private static FenetreGestionAeroport instance;
	public static final String TITRE_PAR_DEFAUT = "Gestion d'Aeroport";

	public static final int LARGEUR_PANNEAU_PAR_DEFAUT = 300;
	public static final int HAUTEUR_PANNEAU_PAR_DEFAUT = 30;

	private PanneauBandeauOutils panneauBandeauOutils;
	private PanneauRechercheVol panneauRechercheVol;
	private PanneauProposerVol panneauProposerVol;
	private PanneauEnregistrerUnNouvelAvion panneauEnregistrerUnNouvelAvion;
	private PanneauModifierUnCompteClient panneauModifierUnCompteClient;
	private PanneauEchangeBillet panneauEchangeBillet;

	public FenetreGestionAeroport() {
		super();
		this.setTitle(TITRE_PAR_DEFAUT);
		this.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		this.setIconImage(new ImageIcon("icone_avion.png").getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setResizable(true);
		// this.setLocationRelativeTo(null);
		this.setVisible(true);

		int hauteurBandeauOutil = (int) Math.max(this.getSize().getHeight() / 10, 50);

		// Bandeau outils
		this.panneauBandeauOutils = new PanneauBandeauOutils((int) this.getSize().getWidth() - 20, 50, Color.black,
				null);
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 5;
		this.add(this.panneauBandeauOutils, constraints);
		constraints.gridwidth = 1;

		this.panneauRechercheVol = new PanneauRechercheVol();
		constraints.gridx = 0;
		constraints.gridy = 1;
		this.add(this.panneauRechercheVol, constraints);
		// this.getContentPane().add(this.panneauRechercheVol);
		// this.setVisible(true);

		this.panneauProposerVol = new PanneauProposerVol();
		constraints.gridx = 1;
		constraints.gridy = 1;
		this.add(this.panneauProposerVol, constraints);
		// this.getContentPane().add(this.panneauEnregistrerUnNouvelAvion);
		// this.setVisible(true);

		this.panneauEnregistrerUnNouvelAvion = new PanneauEnregistrerUnNouvelAvion();
		constraints.gridx = 0;
		constraints.gridy = 2;
		this.add(this.panneauEnregistrerUnNouvelAvion, constraints);
		// this.getContentPane().add(this.panneauModifierUnCompteClient);

		this.panneauModifierUnCompteClient = new PanneauModifierUnCompteClient();
		constraints.gridx = 1;
		constraints.gridy = 2;
		this.add(this.panneauModifierUnCompteClient, constraints);

		this.panneauEchangeBillet = new PanneauEchangeBillet();
		constraints.gridx = 0;
		constraints.gridy = 3;
		this.add(panneauEchangeBillet, constraints);

		this.setVisible(true);

	}

	public static FenetreGestionAeroport getInstance() {
		if (FenetreGestionAeroport.instance == null) {
			FenetreGestionAeroport.instance = new FenetreGestionAeroport();
		}
		return FenetreGestionAeroport.instance;
	}

}
