package fr.eseo.gestionaeroport;

import javax.swing.SwingUtilities;

import fr.eseo.gestionaeroport.modele.Utilisateur;
import fr.eseo.gestionaeroport.vue.ui.FenetreConnexion;

public class GestionAeroport {

	static FenetreConnexion fenetreConnexion;
	private static Utilisateur utilisateurConnecte;
	private static GestionAeroport instance;

	public GestionAeroport() {
		lancerFenetreAvecConstructeur();
	}

	public static void lancerFenetreAvecConstructeur() {
		fenetreConnexion = FenetreConnexion.getInstance();
		fenetreConnexion.setVisible(true);
	}

	public static Utilisateur getUtilisateurConnecte() {
		return utilisateurConnecte;
	}

	public static void setUtilisateurConnecte(Utilisateur utilisateurConnecte) {
		GestionAeroport.getInstance().utilisateurConnecte = utilisateurConnecte;
	}

	public static GestionAeroport getInstance() {
		if (GestionAeroport.instance == null) {
			GestionAeroport.instance = new GestionAeroport();
		}
		return GestionAeroport.instance;
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
