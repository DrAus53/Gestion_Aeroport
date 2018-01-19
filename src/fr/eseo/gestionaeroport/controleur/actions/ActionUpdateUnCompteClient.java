package fr.eseo.gestionaeroport.controleur.actions;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.AbstractAction;

import fr.eseo.gestionaeroport.controleur.baseDeDonnees.ConnexionBDD;
import fr.eseo.gestionaeroport.modele.Utilisateur;
import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

public class ActionUpdateUnCompteClient extends AbstractAction {
	private FenetreGestionAeroport fenetreGestionAeroport;
	public static final String NOM_ACTION = "Enregistrer";

	public ActionUpdateUnCompteClient(FenetreGestionAeroport fenetreGestionAeroport) {
		super(NOM_ACTION);
		this.fenetreGestionAeroport = fenetreGestionAeroport;
	}

	public ActionUpdateUnCompteClient() {
		super(NOM_ACTION);
		this.fenetreGestionAeroport = fenetreGestionAeroport.getInstance();
	}

	@Override
	// Appel de la fonction avec le bouton Valider de la fenetre Modifier Un Compte
	// Client et modification dans la base donnée
	public void actionPerformed(ActionEvent arg0) {
		// Connexion à la base de donnée
		Connection conn = ConnexionBDD.connexion();
		// Création d'un objet Statement
		Utilisateur neww = FenetreGestionAeroport.getInstance().getPanneauModifierUnCompteClient()
				.getActionModifierUnCompteClient().getBoiteclient().getUtilisateur();
		String newNom = neww.getNom();
		String newPrenom = neww.getPrenom();
		String newLogin = neww.getLogin();
		String newAdresseMail = neww.getAdresseMail();
		String newMdp = neww.getMotDePasse();
		String idutilisateur;
		try {
			Statement state = ConnexionBDD.connexion().createStatement();
			// Retrouve l'identifiant de l'utilisateur à modifier
			ResultSet result = state
					.executeQuery("SELECT idutilisateur FROM utilisateur WHERE idutilisateur ='" + neww.getId() + "';");
			while (result.next()) {
				idutilisateur = result.getString("idutilisateur");

			}
			// Update de la base de donnée
			int resultat = state.executeUpdate("UPDATE utilisateur SET nom='" + newNom + "', prenom='" + newPrenom
					+ "', login='" + newLogin + "', adressemail='" + newAdresseMail + "', motdepasse='" + newMdp
					+ "' WHERE idutilisateur='" + neww.getId() + "';");

		} catch (Exception e) {

		}
	}

}
