package fr.eseo.gestionaeroport.controleur.actions;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.AbstractAction;

import fr.eseo.gestionaeroport.controleur.baseDeDonnees.ConnexionBDD;
import fr.eseo.gestionaeroport.dao.UtilisateurDAO;
import fr.eseo.gestionaeroport.modele.Utilisateur;
import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueModifierClient;
import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

public class ActionModifierUnCompteClient extends AbstractAction {
	private FenetreGestionAeroport fenetreGestionAeroport;
	public static final String NOM_ACTION = "Valider";
	BoiteDialogueModifierClient boiteclient;

	public ActionModifierUnCompteClient(FenetreGestionAeroport fenetreGestionAeroport) {
		super(NOM_ACTION);
		this.fenetreGestionAeroport = fenetreGestionAeroport;
	}

	public ActionModifierUnCompteClient() {
		super(NOM_ACTION);
		this.fenetreGestionAeroport = fenetreGestionAeroport.getInstance();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Connection conn = ConnexionBDD.connexion();
		// Création d'un objet Statement
		try {
			Statement state = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		UtilisateurDAO utilisateurDAO = new UtilisateurDAO(conn);
		String nom = fenetreGestionAeroport.getPanneauModifierUnCompteClient().getJTextFieldNom().getText();
		String prenom = fenetreGestionAeroport.getPanneauModifierUnCompteClient().getJTextFielPrenom().getText();
		if (!nom.equals("") && !prenom.equals("")) {
			Utilisateur utilisateur = utilisateurDAO.find(new Utilisateur(prenom, nom));
			boiteclient = new BoiteDialogueModifierClient(500, 300, utilisateur);
		}
	}

	public BoiteDialogueModifierClient getBoiteclient() {
		return boiteclient;
	}

}
