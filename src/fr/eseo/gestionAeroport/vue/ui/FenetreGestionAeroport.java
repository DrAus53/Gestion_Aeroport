package fr.eseo.gestionAeroport.vue.ui;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class FenetreGestionAeroport extends JFrame {

	private static FenetreGestionAeroport instance;
	public static final String TITRE_PAR_DEFAUT = "Gestion d'Aeroport";

	public static final int LARGEUR_PANNEAU_PAR_DEFAUT = 300;
	public static final int HAUTEUR_PANNEAU_PAR_DEFAUT = 30;

	PanneauBandeauOutils panneauBandeauOutils;
	PanneauRechercheVol panneauRechercheVol;
	PanneauEnregistrerUnNouvelAvion panneauEnregistrerUnNouvelAvion;
	PanneauModifierUnCompteClient panneauModifierUnCompteClient;

	public FenetreGestionAeroport() {
		super();
		this.setTitle(TITRE_PAR_DEFAUT);
		this.setLayout(new GridLayout(5, 3));
		this.setIconImage(new ImageIcon("icone_avion.png").getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

		int hauteurBandeauOutil = (int) Math.max(this.getSize().getHeight() / 10, 50);

		// Bandeau outils b
		this.panneauBandeauOutils = new PanneauBandeauOutils();
		this.getContentPane().add(this.panneauBandeauOutils);
		this.setVisible(true);

		this.panneauRechercheVol = new PanneauRechercheVol();
		this.getContentPane().add(this.panneauRechercheVol);
		this.setVisible(true);

		this.panneauEnregistrerUnNouvelAvion = new PanneauEnregistrerUnNouvelAvion();
		this.getContentPane().add(this.panneauEnregistrerUnNouvelAvion);
		this.setVisible(true);

		this.panneauModifierUnCompteClient = new PanneauModifierUnCompteClient();
		this.getContentPane().add(this.panneauModifierUnCompteClient);
		this.setVisible(true);

	}

	public static FenetreGestionAeroport getInstance() {
		if (FenetreGestionAeroport.instance == null) {
			FenetreGestionAeroport.instance = new FenetreGestionAeroport();
		}
		return FenetreGestionAeroport.instance;
	}

}
