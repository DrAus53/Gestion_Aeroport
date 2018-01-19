package fr.eseo.gestionaeroport.controleur.actions;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;

import javax.swing.AbstractAction;

import fr.eseo.gestionaeroport.GestionAeroport;
import fr.eseo.gestionaeroport.controleur.baseDeDonnees.ConnexionBDD;
import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueErreurBdd;
import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueTexteVide;
import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

/**
 * 
 * Classe pour visualiser les personnes qui embarquent dans un vol après clic
 * sur le bouton valider
 *
 */
@SuppressWarnings("serial")
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
				while (result.next()) {
					System.out.println(result.getString("nompassagers"));
					// TODO
				}
			} catch (Exception e) {
				// Erreur BDD + Boite de dialogue
				new BoiteDialogueErreurBdd();
				GestionAeroport.getLogger().log(Level.INFO, e.toString());
			}
		} else {
			// les champs ne sont pas remplis :
			new BoiteDialogueTexteVide();
		}
	}

}
