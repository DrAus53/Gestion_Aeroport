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

@SuppressWarnings("serial")
public class ActionRechercheDeVol extends AbstractAction {

	public static final String NOM_ACTION = "Valider";

	public ActionRechercheDeVol() {
		super(NOM_ACTION);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			Connection conn = ConnexionBDD.connexion();
			// Création d'un objet Statement
			Statement state = conn.createStatement();
			VolDAO volDAO = new VolDAO(conn);

			String aeroportdepart = FenetreGestionAeroport.getInstance().getPanneauRechercheVol()
					.getJTextFieldAeroportDepart().getText();

			String aeroportarrivee = FenetreGestionAeroport.getInstance().getPanneauRechercheVol()
					.getJTextFielAeroportArrivee().getText();
			String dateTxt = FenetreGestionAeroport.getInstance().getPanneauRechercheVol().getJTextFieldDate()
					.getText();

			if (!aeroportdepart.equals("") && !aeroportarrivee.equals("") && !dateTxt.equals("")) {

				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				Date date = new Date();
				try {
					date = dateFormat.parse(dateTxt);
					System.out.print(date);
				} catch (ParseException e) {
					// Auto-generated catch block
					e.printStackTrace();
				}

				Vol vol = new Vol(date,
						volDAO.getIdAeroport(FenetreGestionAeroport.getInstance().getPanneauRechercheVol()
								.getJTextFieldAeroportDepart()),
						volDAO.getIdAeroport(FenetreGestionAeroport.getInstance().getPanneauRechercheVol()
								.getJTextFielAeroportArrivee()),
						1);

				new BoiteDialogueListeDeVols(700, 300, volDAO.find(vol));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
