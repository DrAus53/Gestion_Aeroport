package fr.eseo.gestionaeroport.controleur.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueProposerVol;

public class ActionProposerVol extends AbstractAction {
	private static final long serialVersionUID = 1L;

	public static final String NOM_ACTION = "Valider";

	public ActionProposerVol() {
		super(NOM_ACTION);

	}

	public void actionPerformed(ActionEvent arg0) {
		BoiteDialogueProposerVol boite = new BoiteDialogueProposerVol();
	}
}
