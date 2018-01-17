package fr.eseo.gestionaeroport;

import javax.swing.SwingUtilities;

import fr.eseo.gestionaeroport.vue.ui.FenetreConnexion;

public class GestionAeroport {

	// static FenetreGestionAeroport fenetre;
	static FenetreConnexion fenetreConnexion;

	public GestionAeroport() {
		lancerFenetreAvecConstructeur();
	}

	public static void lancerFenetreAvecConstructeur() {
		// fenetre = FenetreGestionAeroport.getInstance();
		// fenetre.setVisible(true);
		fenetreConnexion = FenetreConnexion.getInstance();
		fenetreConnexion.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				GestionAeroport.lancerFenetreAvecConstructeur();
			}
		});
	}
}
