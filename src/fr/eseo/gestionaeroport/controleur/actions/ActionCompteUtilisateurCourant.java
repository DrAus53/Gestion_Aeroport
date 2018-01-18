package fr.eseo.gestionaeroport.controleur.actions;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.swing.AbstractAction;

import fr.eseo.gestionaeroport.controleur.baseDeDonnees.ConnexionBDD;
import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueTexteVide;
import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

public class ActionCompteUtilisateurCourant extends AbstractAction {

	private FenetreGestionAeroport fenetreGestionAeroport;
	public static final String NOM_ACTION = "Valider";

	public ActionCompteUtilisateurCourant(FenetreGestionAeroport fenetreGestionAeroport) {
		super(NOM_ACTION);
		this.fenetreGestionAeroport = fenetreGestionAeroport;
	}

	public ActionCompteUtilisateurCourant() {
		super(NOM_ACTION);
		this.fenetreGestionAeroport = fenetreGestionAeroport.getInstance();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String numVol = FenetreGestionAeroport.getInstance().getPanneauEmbarquement().getjTextFieldNumVol().getText();
		String idutilisateur = "";
		if (!numVol.equals("") && numVol.length() > 0) {
			try {
				Statement state = ConnexionBDD.connexion().createStatement();
				ResultSet result = state
						.executeQuery("SELECT idutilisateur FROM reservation WHERE idTrajet ='" + numVol + "';");
				ResultSetMetaData resultMeta = result.getMetaData();
				while (result.next()) {
					// resultat de la recherche
					idutilisateur = result.getString("idutilisateur");
					// System.out.println(idutilisateur);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else {
			// les champs ne sont pas remplis :
			BoiteDialogueTexteVide jopTextVide = new BoiteDialogueTexteVide();
		}
	}

}
