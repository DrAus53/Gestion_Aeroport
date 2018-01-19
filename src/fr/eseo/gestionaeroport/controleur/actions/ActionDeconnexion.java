package fr.eseo.gestionaeroport.controleur.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

/**
 * 
 * Classe pour d�connecter l'utilisateur et revenir � la fen�tre de connexion
 * apr�s clic sur le bouton Deconnexion
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
