package fr.eseo.gestionaeroport.controleur.actions;

import java.awt.event.ActionEvent;
//import java.sql.Statement;

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
		String shit = "";

		if (!shit.equals("")) {
			if (!shit.equals("")) {
				if (!shit.equals("")) {
					try {

						BoiteDialogueNewVolOk valid = new BoiteDialogueNewVolOk();
						FenetreGestionAeroport.getInstance();
					} catch (Exception e) {
						BoiteDialogueNewVolKo error = new BoiteDialogueNewVolKo();
						e.printStackTrace();
					}
				}
			}
		}
		if (shit.equals("") || shit.equals("") || shit.equals("")) {
			BoiteDialogueNewVolKo error = new BoiteDialogueNewVolKo();
		}
	}
}
