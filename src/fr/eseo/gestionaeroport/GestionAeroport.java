package fr.eseo.gestionaeroport;

import javax.swing.SwingUtilities;

import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueListeDeVols;
import fr.eseo.gestionaeroport.vue.ui.FenetreConnexion;

public class GestionAeroport {

	static FenetreConnexion fenetreConnexion;

	public GestionAeroport() {
		lancerFenetreAvecConstructeur();
	}

	public static void lancerFenetreAvecConstructeur() {
		fenetreConnexion = FenetreConnexion.getInstance();
		fenetreConnexion.setVisible(true);
		new BoiteDialogueListeDeVols();
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
