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
		System.out.println(login);
		String mdp = this.fenetreConnexion.findMdp();
		if (login != null) {
			if (mdp != null) {

			}
		}
		this.fenetreConnexion.fermerFenetre();
	}
}
