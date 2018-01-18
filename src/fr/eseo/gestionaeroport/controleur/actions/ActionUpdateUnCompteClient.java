package fr.eseo.gestionaeroport.controleur.actions;

import java.awt.event.ActionEvent;
import java.sql.Connection;

import javax.swing.AbstractAction;

import fr.eseo.gestionaeroport.controleur.baseDeDonnees.ConnexionBDD;
import fr.eseo.gestionaeroport.modele.Utilisateur;
import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

public class ActionUpdateUnCompteClient extends AbstractAction {

	public static final String NOM_ACTION = "Enregistrer";

	public ActionUpdateUnCompteClient() {
		super(NOM_ACTION);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Connection conn = ConnexionBDD.connexion();
		// Création d'un objet Statement
		Utilisateur neww = FenetreGestionAeroport.getInstance().getPanneauModifierUnCompteClient()
				.getActionModifierUnCompteClient().getBoiteclient().getUtilisateur();

	}

}
