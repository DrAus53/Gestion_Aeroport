package fr.eseo.gestionaeroport.controleur.actions;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;

import javax.swing.AbstractAction;

import fr.eseo.gestionaeroport.GestionAeroport;
import fr.eseo.gestionaeroport.controleur.baseDeDonnees.ConnexionBDD;
import fr.eseo.gestionaeroport.modele.Utilisateur;
import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

/**
 * 
 * Classe pour mettre � jour l'utilisateur de la base de donn�e
 *
 */
@SuppressWarnings("serial")
public class ActionUpdateUnCompteClient extends AbstractAction {

	public static final String NOM_ACTION = "Enregistrer";

	public ActionUpdateUnCompteClient() {
		super(NOM_ACTION);
	}

	@Override
	// Appel de la fonction avec le bouton Valider de la fenetre Modifier Un Compte
	// Client et modification dans la base donn�e
	public void actionPerformed(ActionEvent arg0) {

		Utilisateur neww = FenetreGestionAeroport.getInstance().getPanneauModifierUnCompteClient()
				.getActionModifierUnCompteClient().getBoiteclient().getUtilisateur();
		String newNom = neww.getNom();
		String newPrenom = neww.getPrenom();
		String newLogin = neww.getLogin();
		String newAdresseMail = neww.getAdresseMail();
		String newMdp = neww.getMotDePasse();
		try {
			// Connexion � la base de donn�e et cr�ation d'un objet Statement
			Statement state = ConnexionBDD.connexion().createStatement();
			// Retrouve l'identifiant de l'utilisateur � modifier
			ResultSet result = state
					.executeQuery("SELECT idutilisateur FROM utilisateur WHERE idutilisateur ='" + neww.getId() + "';");
			while (result.next()) {

			}
			// Update de la base de donn�e
			state.executeUpdate("UPDATE utilisateur SET nom='" + newNom + "', prenom='" + newPrenom + "', login='"
					+ newLogin + "', adressemail='" + newAdresseMail + "', motdepasse='" + newMdp
					+ "' WHERE idutilisateur='" + neww.getId() + "';");
			FenetreGestionAeroport.getInstance().getPanneauModifierUnCompteClient().getActionModifierUnCompteClient()
					.getBoiteclient().dispose();

		} catch (Exception e) {
			GestionAeroport.getLogger().log(Level.INFO, e.toString());
		}
	}

}
