package fr.eseo.gestionAeroport.vue.ui;

import javax.swing.JFrame;

public class FenetreGestionAeroport extends JFrame {

	private static FenetreGestionAeroport instance;
	public static final String TITRE_PAR_DEFAUT = "Gestion d'Aeroport";

	public FenetreGestionAeroport() {
		super();

	}

	public static FenetreGestionAeroport getInstance() {
		if (FenetreGestionAeroport.instance == null) {
			FenetreGestionAeroport.instance = new FenetreGestionAeroport();
		}
		return FenetreGestionAeroport.instance;
	}

}
