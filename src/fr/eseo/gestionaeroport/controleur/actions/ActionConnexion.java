package fr.eseo.gestionaeroport.controleur.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import fr.eseo.gestionaeroport.vue.ui.FenetreConnexion;

public class ActionConnexion extends AbstractAction {
	private static final long serialVersionUID = 1L;

	private FenetreConnexion fenetreConnexion;
	public static final String NOM_ACTION = "Connexion";

	public ActionConnexion(FenetreConnexion fenetreConnexion) {
		super(NOM_ACTION);
		this.fenetreConnexion = fenetreConnexion;
	}

	public ActionConnexion() {
		super(NOM_ACTION);
		this.fenetreConnexion = fenetreConnexion.getInstance();
	}

	public void actionPerformed(ActionEvent arg0) {

		String login = FenetreConnexion.findLogin();
		String mdp = FenetreConnexion.findMdp();

		if (login != null && !login.equals("") && login.length() >= 5) {
			if (mdp != null && !mdp.equals("") && mdp.length() >= 5) {

				FenetreConnexion.fermerFenetre();
			}
		}
	}
}
