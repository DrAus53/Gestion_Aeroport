package fr.eseo.gestionaeroport.controleur.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

/**
 * 
 * Classe pour déconnecter l'utilisateur et revenir à la fenêtre de connexion
 * après clic sur le bouton Deconnexion
 *
 */

public class ActionDeconnexion extends AbstractAction {

	private static final long serialVersionUID = 1L;
	public static final String NOM_ACTION = "Deconnexion";

	public ActionDeconnexion() {
		super(NOM_ACTION);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		FenetreGestionAeroport.fermerFenetre();
	}

}
