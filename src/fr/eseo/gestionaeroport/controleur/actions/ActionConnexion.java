package fr.eseo.gestionaeroport.controleur.actions;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;

import javax.swing.AbstractAction;

import fr.eseo.gestionaeroport.GestionAeroport;
import fr.eseo.gestionaeroport.controleur.baseDeDonnees.ConnexionBDD;
import fr.eseo.gestionaeroport.modele.Utilisateur;
import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueErreurBdd;
import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueTexteVide;
import fr.eseo.gestionaeroport.vue.ui.FenetreConnexion;

/**
 * 
 * Classe pour vérifier que l'utilisateur et son mot de passe sont bien
 * enregistré dans la base de donnée après clic sur le bouton Connexion
 *
 */
@SuppressWarnings("serial")
public class ActionConnexion extends AbstractAction {

	public static final String NOM_ACTION = "Connexion";

	private Utilisateur utilisateurConnecte;

	public ActionConnexion() {
		super(NOM_ACTION);
	}

	public Utilisateur getUtilisateurConnecte() {
		return utilisateurConnecte;
	}

	public void actionPerformed(ActionEvent arg0) {

		String login = FenetreConnexion.findLogin();
		String mdp = FenetreConnexion.findMdp();

		if (login != null && !login.equals("") && login.length() >= 1) {
			if (mdp != null && !mdp.equals("") && mdp.length() >= 1) {
				// requête utilisateur:
				try {
					Statement state = ConnexionBDD.connexion().createStatement();

					ResultSet result = state.executeQuery(
							"SELECT * FROM utilisateur WHERE login='" + login + "' AND motdepasse='" + mdp + "'");
					// si on trouve un utilisateur:
					while (result.next()) {
						this.utilisateurConnecte = new Utilisateur(Integer.parseInt(result.getString("idutilisateur")),
								result.getString("prenom"), result.getString("nom"), result.getString("motdepasse"),
								result.getString("login"), result.getString("adressemail"));
						GestionAeroport.setUtilisateurConnecte(this.utilisateurConnecte);
						FenetreConnexion.fermerFenetre();
					}
				} catch (SQLException e) {
					// Boite de dialogue
					new BoiteDialogueErreurBdd();
					GestionAeroport.getLogger().log(Level.INFO, e.toString());
				}
			}
		}
		if (login.equals("") || login.length() < 1 || mdp.equals("") || mdp.length() < 1) {
			new BoiteDialogueTexteVide();
		}
	}
}
