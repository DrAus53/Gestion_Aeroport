package fr.eseo.gestionaeroport.controleur.actions;

import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.AbstractAction;

//import fr.eseo.gestionaeroport.controleur.baseDeDonnees.ConnexionBDD;

import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueNewVolKo;
import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueNewVolOk;
import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

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

		// D�claration des variables
		String aeroportdepart = "";
		String aeroportarrivee = "";
		int idaeroportdepart = 0;
		int idaeroportarrivee = 0;
		String avion = "";
		int idavion = 0;
		int anneeD = 0;
		int anneeA = 0;
		int moisD = 0;
		int moisA = 0;
		int jourD = 0;
		int jourA = 0;

		try {

			// R�cup�ration des dates et affectation aux variables
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
			// R�cup�ration des a�roports/avions et affectation aux variables
			aeroportdepart = FenetreGestionAeroport.getInstance().getPanneauProposerVol().getJComboBoxDepartAeroport()
					.getSelectedItem().toString();
			aeroportarrivee = FenetreGestionAeroport.getInstance().getPanneauProposerVol().getJComboBoxArriveeAeroport()
					.getSelectedItem().toString();
			avion = FenetreGestionAeroport.getInstance().getPanneauProposerVol().getJComboBoxArriveeAeroport()
					.getSelectedItem().toString();

			// Conversion des dates au format de la BDD
			SimpleDateFormat dateFormatD = new SimpleDateFormat("yyyy-MM-dd");
			String dateTexteD = "" + anneeD + "-" + moisD + "-" + jourD;
			Date dateD = dateFormatD.parse(dateTexteD);
			SimpleDateFormat dateFormatA = new SimpleDateFormat("yyyy-MM-dd");
			String dateTexteA = "" + anneeA + "-" + moisA + "-" + jourA;
			Date dateA = dateFormatA.parse(dateTexteA);

			if (idaeroportarrivee != idaeroportdepart) {

				BoiteDialogueNewVolOk valid = new BoiteDialogueNewVolOk();
				FenetreGestionAeroport.getInstance();

			} else {
				BoiteDialogueNewVolKo error = new BoiteDialogueNewVolKo();
			}

		} catch (Exception e) {

			BoiteDialogueNewVolKo error = new BoiteDialogueNewVolKo();
			e.printStackTrace();
		}
	}
}