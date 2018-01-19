package fr.eseo.gestionaeroport.controleur.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import fr.eseo.gestionaeroport.GestionAeroport;
import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueModifierUtilisateur;

/**
 * 
 * Classe pour trouver le compte de l'utilisateur à modifier et ouvrir la boite
 * de dialogue correspondante
 *
 */
@SuppressWarnings("serial")
public class ActionModifier extends AbstractAction {

	public static final String NOM_ACTION = "Modifier";

	private BoiteDialogueModifierUtilisateur boiteDialogueModifierUtilisateur;

	public ActionModifier() {
		super(NOM_ACTION);
	}

	public BoiteDialogueModifierUtilisateur getBoiteDialogueModifierUtilisateur() {
		return boiteDialogueModifierUtilisateur;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		boiteDialogueModifierUtilisateur = new BoiteDialogueModifierUtilisateur(
				GestionAeroport.getUtilisateurConnecte());

	}
}
