package fr.eseo.gestionaeroport.controleur.actions;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.AbstractAction;

import fr.eseo.gestionaeroport.GestionAeroport;
import fr.eseo.gestionaeroport.controleur.baseDeDonnees.ConnexionBDD;
import fr.eseo.gestionaeroport.modele.Utilisateur;
import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

public class ActionModifierCompteClientConnecte extends AbstractAction {

	public static final String NOM_ACTION = "Valid�";

	public ActionModifierCompteClientConnecte() {
		super(NOM_ACTION);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// R�cup�ration de l'utilisateur modifi�
		Utilisateur newUtilisateur = FenetreGestionAeroport.getInstance().getBarreOutils().getActionModifier()
				.getBoiteDialogueModifierUtilisateur().getUtilisateur();
		String idutilisateur = "";
		try {
			Statement state = ConnexionBDD.connexion().createStatement();
			ResultSet result = state.executeQuery("SELECT idutilisateur FROM utilisateur WHERE idutilisateur ='"
					+ GestionAeroport.getUtilisateurConnecte().getId() + "';");
			while (result.next()) {
				idutilisateur = result.getString("idutilisateur");
			}
			// Update de la base de donn�e de l'ancien avec le nouveau
			int resultat = state.executeUpdate("UPDATE utilisateur SET nom='" + newUtilisateur.getNom() + "', prenom='"
					+ newUtilisateur.getPrenom() + "', login='" + newUtilisateur.getLogin() + "', adressemail='"
					+ newUtilisateur.getAdresseMail() + "', motdepasse='" + newUtilisateur.getMotDePasse()
					+ "' WHERE idutilisateur='" + idutilisateur + "';");
			GestionAeroport.setUtilisateurConnecte(newUtilisateur);
		} catch (Exception e) {

		}
	}
}
