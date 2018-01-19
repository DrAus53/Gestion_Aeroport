package fr.eseo.gestionaeroport.controleur.actions;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.AbstractAction;

import fr.eseo.gestionaeroport.controleur.baseDeDonnees.ConnexionBDD;
import fr.eseo.gestionaeroport.dao.VolDAO;
import fr.eseo.gestionaeroport.modele.Vol;
import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueNewVolKo;
import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueNewVolKoAero;
import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueNewVolKoDate;
import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueNewVolOk;
import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

/**
 * 
 * Classe pour proposer un nouveau vol dans la base de donnée
 *
 */

public class ActionProposerVol extends AbstractAction {

	private static final long serialVersionUID = 1L;
	public static final String NOM_ACTION = "Valider";

	public ActionProposerVol(FenetreGestionAeroport fenetreGestionAeroport) {
		super(NOM_ACTION);

	}

	public ActionProposerVol() {
		super(NOM_ACTION);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		// Déclaration des variables
		String aeroportdepart = "";
		String aeroportarrivee = "";
		int idaeroportdepart = 35;
		int idaeroportarrivee = 36;
		String avion = "";
		int idavion = 50;
		int anneeD = 0;
		int anneeA = 0;
		int moisD = 0;
		int moisA = 0;
		int jourD = 0;
		int jourA = 0;
		Date dateD = null;
		Date dateA = null;
		List<String> nomPassagers = new ArrayList<String>();
		nomPassagers.add("Damien");
		Connection conn = ConnexionBDD.connexion();
		VolDAO volproposeDAO = new VolDAO(conn);
		Vol volpropose = new Vol(666, dateD, dateA, idaeroportdepart, idaeroportarrivee, nomPassagers, 666, idavion,
				"zz");

		try {

			// Récupération des dates et affectation aux variables
			anneeD = Integer.parseInt(FenetreGestionAeroport.getInstance().getPanneauProposerVol()
					.getJTextFieldDateDepart().getText().split("-")[0]);
			moisD = Integer.parseInt(FenetreGestionAeroport.getInstance().getPanneauProposerVol()
					.getJTextFieldDateDepart().getText().split("-")[1]);
			jourD = Integer.parseInt(FenetreGestionAeroport.getInstance().getPanneauProposerVol()
					.getJTextFieldDateDepart().getText().split("-")[2]);
			anneeA = Integer.parseInt(FenetreGestionAeroport.getInstance().getPanneauProposerVol()
					.getJTextFieldDateArrivee().getText().split("-")[0]);
			moisA = Integer.parseInt(FenetreGestionAeroport.getInstance().getPanneauProposerVol()
					.getJTextFieldDateArrivee().getText().split("-")[1]);
			jourA = Integer.parseInt(FenetreGestionAeroport.getInstance().getPanneauProposerVol()
					.getJTextFieldDateArrivee().getText().split("-")[2]);
			// Récupération des aéroports/avions et affectation aux variables
			aeroportdepart = FenetreGestionAeroport.getInstance().getPanneauProposerVol().getJComboBoxDepartAeroport()
					.getSelectedItem().toString();
			aeroportarrivee = FenetreGestionAeroport.getInstance().getPanneauProposerVol().getJComboBoxArriveeAeroport()
					.getSelectedItem().toString();
			avion = FenetreGestionAeroport.getInstance().getPanneauProposerVol().getJComboBoxAvion().getSelectedItem()
					.toString();

			// Conversion des dates au format de la BDD
			SimpleDateFormat dateFormatD = new SimpleDateFormat("yyyy-MM-dd");
			String dateTexteD = "" + anneeD + "-" + moisD + "-" + jourD;
			dateD = dateFormatD.parse(dateTexteD);
			SimpleDateFormat dateFormatA = new SimpleDateFormat("yyyy-MM-dd");
			String dateTexteA = "" + anneeA + "-" + moisA + "-" + jourA;
			dateA = dateFormatA.parse(dateTexteA);
			// récupération des id d'aéroports
			idaeroportdepart = volproposeDAO.getIdAeroportStr(aeroportdepart);
			idaeroportarrivee = volproposeDAO.getIdAeroportStr(aeroportarrivee);
			// récupération de l'id d'avion
			System.out.println(avion);
			// int result = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
			// ResultSet.CONCUR_READ_ONLY)
			// .executeUpdate("SELECT idavion FROM avion WHERE nomavion='avion'");

			// Vérification que l'aéroport de départ et différent de celui d'arrivée
			if (idaeroportarrivee != idaeroportdepart) {

				try {
					// Recontruction du vol avec les données modifiées
					volpropose = new Vol(666, dateD, dateA, idaeroportdepart, idaeroportarrivee, nomPassagers, 666,
							idavion, "666");
					// Création du vol dans la base de données
					volproposeDAO.create(volpropose);
					BoiteDialogueNewVolOk valid = new BoiteDialogueNewVolOk();
					FenetreGestionAeroport.getInstance();
				} catch (Exception e) {
					BoiteDialogueNewVolKo error = new BoiteDialogueNewVolKo();
					e.printStackTrace();
				}

			} else {
				BoiteDialogueNewVolKoAero error = new BoiteDialogueNewVolKoAero();
			}

		} catch (Exception e) {

			BoiteDialogueNewVolKoDate error = new BoiteDialogueNewVolKoDate();
			e.printStackTrace();
		}
	}
}