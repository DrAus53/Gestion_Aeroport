package fr.eseo.gestionAeroport.vue.ui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FenetreGestionAeroport extends JFrame {

	private static FenetreGestionAeroport instance;
	public static final String TITRE_PAR_DEFAUT = "Gestion d'Aeroport";
	private static PanneauPrincipal panneauPrincipal;

	private PanneauBandeauOutils panneauBandeauOutils;

	public FenetreGestionAeroport() {
		super();
		this.setTitle(TITRE_PAR_DEFAUT);
		this.setIconImage(new ImageIcon("icone_avion.png").getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setResizable(true);
		this.setLocationRelativeTo(null);

		// Bandeau outils
		this.panneauBandeauOutils = new PanneauBandeauOutils();
		this.add("North", this.panneauBandeauOutils);

		// ajout du panneau principal
		this.panneauPrincipal = new PanneauPrincipal((int) this.getSize().getWidth(),
				(int) this.getSize().getHeight() - 75);
		this.add(panneauPrincipal);
	}

	public static FenetreGestionAeroport getInstance() {
		if (FenetreGestionAeroport.instance == null) {
			FenetreGestionAeroport.instance = new FenetreGestionAeroport();
		}
		return FenetreGestionAeroport.instance;
	}

}
