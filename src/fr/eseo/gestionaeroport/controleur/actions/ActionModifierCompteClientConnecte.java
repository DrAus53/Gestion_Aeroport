package fr.eseo.gestionaeroport.controleur.actions;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.AbstractAction;

import fr.eseo.gestionaeroport.GestionAeroport;
import fr.eseo.gestionaeroport.controleur.baseDeDonnees.ConnexionBDD;
import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

public class ActionModifierCompteClientConnecte extends AbstractAction {

	private FenetreGestionAeroport fenetreGestionAeroport;
	public static final String NOM_ACTION = "Valider";

	public ActionModifierCompteClientConnecte(FenetreGestionAeroport fenetreGestionAeroport) {
		super(NOM_ACTION);
		this.fenetreGestionAeroport = fenetreGestionAeroport;
	}

	public ActionModifierCompteClientConnecte() {
		super(NOM_ACTION);
		this.fenetreGestionAeroport = fenetreGestionAeroport.getInstance();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// récupération des zones de saisie de texte:
		String newNom = FenetreGestionAeroport.getInstance().getMenuBar().get
		String newPrenom = FenetreGestionAeroport.getInstance().getPanneauEchangeBillet().numVolJtf.getText();
		String newLogin = FenetreGestionAeroport.getInstance().getPanneauEchangeBillet().numVolJtf.getText();
		String newAdresseMail = FenetreGestionAeroport.getInstance().getPanneauEchangeBillet().numVolJtf.getText();
		String newMdp = FenetreGestionAeroport.getInstance().getPanneauEchangeBillet().numVolJtf.getText();
		String idutilisateur;
		try {
			Statement state = ConnexionBDD.connexion().createStatement();
			ResultSet result = state.executeQuery("SELECT idutilisateur FROM utilisateur WHERE idutilisateur ='"
					+ GestionAeroport.getUtilisateurConnecte().getId() + "';");
			while (result.next()) {
				idutilisateur = result.getString("idutilisateur");
				// On met à jour les champs
				result.updateString("nom", newNom);
				result.updateString("prenom", newPrenom);
				result.updateString("login", newLogin);
				result.updateString("adressemail", newAdresseMail);
				result.updateString("motdepasse", newMdp);
				// On valide
				result.updateRow();
			}
		} catch (Exception e) {

		}
	}
}
