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

	public static final String NOM_ACTION = "Validé";

	public ActionModifierCompteClientConnecte() {
		super(NOM_ACTION);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// récupération de l'utilisateur modifié
		Utilisateur newUtilisateur = FenetreGestionAeroport.getInstance().getBarreOutils().getActionModifier()
				.getBoiteDialogueModifierUtilisateur().getUtilisateur();
		String idutilisateur;
		try {
			Statement state = ConnexionBDD.connexion().createStatement();
			ResultSet result = state.executeQuery("SELECT idutilisateur FROM utilisateur WHERE idutilisateur ='"
					+ GestionAeroport.getUtilisateurConnecte().getId() + "';");
			while (result.next()) {
				idutilisateur = result.getString("idutilisateur");
				// On met à jour les champs
				result.updateString("nom", newUtilisateur.getNom());
				result.updateString("prenom", newUtilisateur.getPrenom());
				result.updateString("login", newUtilisateur.getLogin());
				result.updateString("adressemail", newUtilisateur.getAdresseMail());
				result.updateString("motdepasse", newUtilisateur.getMotDePasse());
				// On valide
				result.updateRow();
			}
		} catch (Exception e) {

		}
	}
}
