package fr.eseo.gestionaeroport.controleur.actions;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.AbstractAction;

import fr.eseo.gestionaeroport.controleur.baseDeDonnees.ConnexionBDD;
import fr.eseo.gestionaeroport.dao.VolDAO;
import fr.eseo.gestionaeroport.modele.Vol;
import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueListeDeVols;
import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

public class ActionRechercheDeVol extends AbstractAction {

	public static final String NOM_ACTION = "Valider";
	private FenetreGestionAeroport fenetreGestionAeroport;

	public ActionRechercheDeVol(FenetreGestionAeroport fenetreGestionAeroport) {
		super(NOM_ACTION);
		this.fenetreGestionAeroport = fenetreGestionAeroport;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			Connection conn = ConnexionBDD.connexion();
			// Création d'un objet Statement
			Statement state = conn.createStatement();
			VolDAO volDAO = new VolDAO(conn);

			System.out.println(Integer.parseInt(FenetreGestionAeroport.getInstance().getPanneauRechercheVol()
					.getJTextFieldDate().getText().split("-")[0]));

			int annee = Integer.parseInt(FenetreGestionAeroport.getInstance().getPanneauRechercheVol()
					.getJTextFieldDate().getText().split("-")[0]);
			int mois = Integer.parseInt(FenetreGestionAeroport.getInstance().getPanneauRechercheVol()
					.getJTextFieldDate().getText().split("-")[1]);
			int jour = Integer.parseInt(FenetreGestionAeroport.getInstance().getPanneauRechercheVol()
					.getJTextFieldDate().getText().split("-")[2]);
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			System.out.println(new Date(annee, mois, jour));
			String dateTexte = "" + annee + "-" + mois + "-" + jour;
			Date date = null;
			try {
				date = dateFormat.parse(dateTexte);
				System.out.print(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			BoiteDialogueListeDeVols boite = new BoiteDialogueListeDeVols(500, 300,
					volDAO.find(new Vol(date,
							volDAO.getIdAeroport(FenetreGestionAeroport.getInstance().getPanneauRechercheVol()
									.getJTextFieldAeroportDepart()),
							volDAO.getIdAeroport(FenetreGestionAeroport.getInstance().getPanneauRechercheVol()
									.getJTextFielAeroportArrivee()),
							1)));

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
