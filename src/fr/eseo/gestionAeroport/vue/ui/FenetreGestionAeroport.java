package fr.eseo.gestionAeroport.vue.ui;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class FenetreGestionAeroport extends JFrame {

	private static FenetreGestionAeroport instance;
	public static final String TITRE_PAR_DEFAUT = "Gestion d'Aeroport";

	public static int HAUTEUR_PANNEAU_PAR_DEFAUT = 150;
	public static int LARGEUR_PANNEAU_PAR_DEFAUT = 400;

	private PanneauPrincipal panneauPrincipal;
	private PanneauBandeauOutils panneauBandeauOutils;
	private PanneauEchangeBillet panneauEchangeBillet;

	public FenetreGestionAeroport() {
		super();
		this.setTitle(TITRE_PAR_DEFAUT);
		this.setIconImage(new ImageIcon("icone_avion.png").getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setResizable(true);
		this.setLocationRelativeTo(null);

		int hauteurBandeauOutil = (int) Math.max(this.getSize().getHeight() / 10, 50);

		// Bandeau outils
		this.panneauBandeauOutils = new PanneauBandeauOutils((int) this.getSize().getWidth(), hauteurBandeauOutil,
				Color.BLACK, this);
		this.add("North", this.panneauBandeauOutils);

		// ajout du panneau principal
		this.panneauPrincipal = new PanneauPrincipal((int) this.getSize().getWidth(),
				(int) this.getSize().getHeight() - hauteurBandeauOutil);
		this.add(panneauPrincipal);
		// AJout du panneau échange billet
		this.panneauEchangeBillet = new PanneauEchangeBillet();
		this.add(panneauEchangeBillet);
	}

	public static FenetreGestionAeroport getInstance() {
		if (FenetreGestionAeroport.instance == null) {
			FenetreGestionAeroport.instance = new FenetreGestionAeroport();
		}
		return FenetreGestionAeroport.instance;
	}

}
