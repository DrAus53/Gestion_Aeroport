package fr.eseo.gestionaeroport.controleur.actions;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.swing.AbstractAction;

import fr.eseo.gestionaeroport.controleur.baseDeDonnees.ConnexionBDD;
import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueErreurBdd;
import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueTexteVide;
import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

public class ActionEmbarquement extends AbstractAction {

	public static final String NOM_ACTION = "Valider";

	public ActionEmbarquement() {
		super(NOM_ACTION);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String numVol = FenetreGestionAeroport.getInstance().getPanneauEmbarquement().getjTextFieldNumVol().getText();
		if (!numVol.equals("") && numVol.length() > 0) {
			try {
				Statement state = ConnexionBDD.connexion().createStatement();
				ResultSet result = state
						.executeQuery("SELECT nompassagers FROM vol WHERE numerovol ='" + numVol + "';");
				ResultSetMetaData resultMeta = result.getMetaData();
				while (result.next()) {
					System.out.println(result.getString("nompassagers"));
				}
			} catch (Exception e) {
				// Erreur BDD + Boite de dialogue
				BoiteDialogueErreurBdd jopTrajetErreurBdd = new BoiteDialogueErreurBdd();
				e.printStackTrace();
			}
		} else {
			// les champs ne sont pas remplis :
			BoiteDialogueTexteVide jopTextVide = new BoiteDialogueTexteVide();
		}
	}

}
