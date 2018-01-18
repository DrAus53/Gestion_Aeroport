package fr.eseo.gestionaeroport.controleur.actions;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.AbstractAction;

import fr.eseo.gestionaeroport.GestionAeroport;
import fr.eseo.gestionaeroport.controleur.baseDeDonnees.ConnexionBDD;
import fr.eseo.gestionaeroport.modele.Utilisateur;
import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueErreurBdd;
import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueTexteVide;
import fr.eseo.gestionaeroport.vue.ui.FenetreConnexion;

public class ActionConnexion extends AbstractAction {
	private static final long serialVersionUID = 1L;

	private FenetreConnexion fenetreConnexion;
	public static final String NOM_ACTION = "Connexion";

	private Utilisateur utilisateurConnecte;

	public ActionConnexion(FenetreConnexion fenetreConnexion) {
		super(NOM_ACTION);
		this.fenetreConnexion = fenetreConnexion;
	}

	public ActionConnexion() {
		super(NOM_ACTION);
		this.fenetreConnexion = fenetreConnexion.getInstance();
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
					ResultSetMetaData resultMeta = result.getMetaData();
					// si on trouve un utilisateur:
					while (result.next()) {
						this.utilisateurConnecte = new Utilisateur(Integer.parseInt(result.getString("idutilisateur")),
								result.getString("prenom"), result.getString("nom"), result.getString("motdepasse"),
								result.getString("login"), result.getString("adressemail"));
						// System.out.print("Utilisateur Connecté");
						GestionAeroport.setUtilisateurConnecte(this.utilisateurConnecte);
						FenetreConnexion.fermerFenetre();
					}
				} catch (SQLException e) {
					// Boite de dialogue
					BoiteDialogueErreurBdd jopTrajetErreurBdd = new BoiteDialogueErreurBdd();
					e.printStackTrace();
				}
			}
		}
		if (login.equals("") || login.length() < 1 || mdp.equals("") || mdp.length() < 1) {
			BoiteDialogueTexteVide jopTrajetTexteVide = new BoiteDialogueTexteVide();
		}
	}
}
