package fr.eseo.gestionaeroport.controleur.actions;

import java.awt.event.ActionEvent;
import java.sql.Statement;
import java.util.logging.Level;

import javax.swing.AbstractAction;

import fr.eseo.gestionaeroport.GestionAeroport;
import fr.eseo.gestionaeroport.controleur.baseDeDonnees.ConnexionBDD;
import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueNewAvionKo;
import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueNewAvionOk;
import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueTexteVide;
import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

/**
 * 
 * Classe pour enregistrer un avion dans la base de donnée après clic sur le
 * bouton validier
 *
 */
@SuppressWarnings("serial")
public class ActionEnregistrerAvion extends AbstractAction {

	public static final String NOM_ACTION = "Valider";

	public ActionEnregistrerAvion() {
		super(NOM_ACTION);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String nomAvion = FenetreGestionAeroport.getInstance().getPanneauEnregistrerUnNouvelAvion().modeleJtf.getText();
		String typeAvion = FenetreGestionAeroport.getInstance().getPanneauEnregistrerUnNouvelAvion().constructeurJtf
				.getText();
		String nbplace = FenetreGestionAeroport.getInstance().getPanneauEnregistrerUnNouvelAvion().nbrPlaceJtf
				.getText();

		if (!nomAvion.equals("")) {
			if (!typeAvion.equals("")) {
				if (!nbplace.equals("")) {
					try {
						Statement state = ConnexionBDD.connexion().createStatement();
						state.execute("INSERT INTO avion (nomavion, typeavion, nombreplaces, idcompagnie) VALUES('"
								+ nomAvion + "', '" + typeAvion + "','" + nbplace + "','1')");
						new BoiteDialogueNewAvionOk();
						FenetreGestionAeroport.getInstance();
					} catch (Exception e) {
						new BoiteDialogueNewAvionKo();
						GestionAeroport.getLogger().log(Level.INFO, e.toString());
					}
				}
			}
		}
		if (nomAvion.equals("") || typeAvion.equals("") || nbplace.equals("")) {
			new BoiteDialogueTexteVide();
		}
	}
}
