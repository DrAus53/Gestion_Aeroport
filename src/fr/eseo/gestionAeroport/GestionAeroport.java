package fr.eseo.gestionAeroport;

import javax.swing.SwingUtilities;

import fr.eseo.gestionAeroport.vue.ui.FenetreGestionAeroport;

public class GestionAeroport {

	static FenetreGestionAeroport fenetre;

	public GestionAeroport() {
		lancerFenetreAvecConstructeur();
	}

	public static void lancerFenetreAvecConstructeur() {
		fenetre = FenetreGestionAeroport.getInstance();
		fenetre.setVisible(true);
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
