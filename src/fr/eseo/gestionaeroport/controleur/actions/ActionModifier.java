package fr.eseo.gestionaeroport.controleur.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import fr.eseo.gestionaeroport.GestionAeroport;
import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueModifierUtilisateur;
import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

public class ActionModifier extends AbstractAction {

	private FenetreGestionAeroport fenetreGestionAeroport;
	public static final String NOM_ACTION = "Modifier";

	public ActionModifier(FenetreGestionAeroport fenetreGestionAeroport) {
		super(NOM_ACTION);
		this.fenetreGestionAeroport = fenetreGestionAeroport;
	}

	public ActionModifier() {
		super(NOM_ACTION);
		this.fenetreGestionAeroport = fenetreGestionAeroport.getInstance();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		BoiteDialogueModifierUtilisateur jopModifierCompteUtilisateurConnecte = new BoiteDialogueModifierUtilisateur(
				GestionAeroport.getUtilisateurConnecte());

	}
}
