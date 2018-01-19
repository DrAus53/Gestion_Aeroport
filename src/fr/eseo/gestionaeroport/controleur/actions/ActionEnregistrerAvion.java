package fr.eseo.gestionaeroport.controleur.actions;

import java.awt.event.ActionEvent;
import java.sql.Statement;

import javax.swing.AbstractAction;

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

public class ActionEnregistrerAvion extends AbstractAction {

	private FenetreGestionAeroport fenetreGestionAeroport;
	public static final String NOM_ACTION = "Valider";

	public ActionEnregistrerAvion(FenetreGestionAeroport fenetreGestionAeroport) {
		super(NOM_ACTION);
		this.fenetreGestionAeroport = fenetreGestionAeroport;
	}

	public ActionEnregistrerAvion() {
		super(NOM_ACTION);
		this.fenetreGestionAeroport = fenetreGestionAeroport.getInstance();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String nomAvion = FenetreGestionAeroport.getInstance().getPanneauEnregistrerUnNouvelAvion().modeleJtf.getText();
		String typeAvion = FenetreGestionAeroport.getInstance().getPanneauEnregistrerUnNouvelAvion().constructeurJtf
				.getText();
		String nbplace = FenetreGestionAeroport.getInstance().getPanneauEnregistrerUnNouvelAvion().nbrPlaceJtf
				.getText();
		System.out.println(nomAvion + "\n" + typeAvion + "\n" + nbplace);
		if (!nomAvion.equals("")) {
			if (!typeAvion.equals("")) {
				if (!nbplace.equals("")) {
					try {
						Statement state = ConnexionBDD.connexion().createStatement();
						state.execute("INSERT INTO avion (nomavion, typeavion, nombreplaces, idcompagnie) VALUES('"
								+ nomAvion + "', '" + typeAvion + "','" + nbplace + "','1')");
						BoiteDialogueNewAvionOk jop1 = new BoiteDialogueNewAvionOk();
						FenetreGestionAeroport.getInstance();
					} catch (Exception e) {
						BoiteDialogueNewAvionKo jop2 = new BoiteDialogueNewAvionKo();
						e.printStackTrace();
					}
				}
			}
		}
		if (nomAvion.equals("") || typeAvion.equals("") || nbplace.equals("")) {
			BoiteDialogueTexteVide jop2 = new BoiteDialogueTexteVide();
		}
	}
}
