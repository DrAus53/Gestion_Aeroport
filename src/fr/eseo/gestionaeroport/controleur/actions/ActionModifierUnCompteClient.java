package fr.eseo.gestionaeroport.controleur.actions;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;

import javax.swing.AbstractAction;

import fr.eseo.gestionaeroport.GestionAeroport;
import fr.eseo.gestionaeroport.controleur.baseDeDonnees.ConnexionBDD;
import fr.eseo.gestionaeroport.dao.UtilisateurDAO;
import fr.eseo.gestionaeroport.modele.Utilisateur;
import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueModifierClient;
import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

/**
 * 
 * Classe pour trouver le compte client à modifier
 *
 */
@SuppressWarnings("serial")
public class ActionModifierUnCompteClient extends AbstractAction {

	public static final String NOM_ACTION = "Valider";

	private BoiteDialogueModifierClient boiteclient;

	public ActionModifierUnCompteClient() {
		super(NOM_ACTION);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Connection conn = ConnexionBDD.connexion();

		// Création d'un objet Statement
		try {
			conn.createStatement();
		} catch (SQLException e) {
			GestionAeroport.getLogger().log(Level.INFO, e.toString());
		}

		// Récupérer le prénom et le nom
		UtilisateurDAO utilisateurDAO = new UtilisateurDAO(conn);
		String nom = FenetreGestionAeroport.getInstance().getPanneauModifierUnCompteClient().getJTextFieldNom()
				.getText();
		String prenom = FenetreGestionAeroport.getInstance().getPanneauModifierUnCompteClient().getJTextFielPrenom()
				.getText();

		// Récupère l'utilisateur avec le nom et prénom à modifier
		if (!nom.equals("") && !prenom.equals("")) {
			Utilisateur utilisateur = utilisateurDAO.find(new Utilisateur(prenom, nom)).get(0);
			boiteclient = new BoiteDialogueModifierClient(500, 300, utilisateur);
		}
	}

	public BoiteDialogueModifierClient getBoiteclient() {
		return boiteclient;
	}

}
