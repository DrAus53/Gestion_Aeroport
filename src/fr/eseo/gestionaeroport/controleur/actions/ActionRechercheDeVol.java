package fr.eseo.gestionaeroport.controleur.actions;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractAction;

import fr.eseo.gestionaeroport.controleur.baseDeDonnees.ConnexionBDD;
import fr.eseo.gestionaeroport.dao.VolDAO;
import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueListeDeVols;
import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

public class ActionRechercheDeVol extends AbstractAction {

	public static final String NOM_ACTION = "Valider";
	private FenetreGestionAeroport fenetreGestionAeroport;

	public ActionRechercheDeVol(FenetreGestionAeroport fenetreGestionAeroport) {
		super(NOM_ACTION);
		this.fenetreGestionAeroport = fenetreGestionAeroport.getInstance();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String sqlaeroportdepart = fenetreGestionAeroport.getPanneauRechercheVol().getJTextFieldAeroportDepart()
				.getText();
		String sqlaeroportarrivee = fenetreGestionAeroport.getPanneauRechercheVol().getJTextFielAeroportArrivee()
				.getText();
		String sqldate = fenetreGestionAeroport.getPanneauRechercheVol().getJTextFieldDate().getText();

		String sqlheure = fenetreGestionAeroport.getPanneauRechercheVol().getJTextFieldHeure().getText();
		Connection conn = ConnexionBDD.connexion();
		// Création d'un objet Statement
		try {
			Statement state = conn.createStatement();
			VolDAO volDAO = new VolDAO(conn);
			int idaeroportdepart = volDAO.getIdAeroport(sqlaeroportdepart);
			List<String> damien = new ArrayList<String>();
			BoiteDialogueListeDeVols boite = new BoiteDialogueListeDeVols(500, 300, volDAO.find(obj));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
