package fr.eseo.gestionaeroport.controleur.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

public class ActionEchangeBillet extends AbstractAction {

	private FenetreGestionAeroport fenetreGestionAeroport;
	public static final String NOM_ACTION = "Valider";

	public ActionEchangeBillet(FenetreGestionAeroport fenetreGestionAeroport) {
		super(NOM_ACTION);
		this.fenetreGestionAeroport = fenetreGestionAeroport;
	}

	public ActionEchangeBillet() {
		super(NOM_ACTION);
		this.fenetreGestionAeroport = fenetreGestionAeroport.getInstance();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String numVol = FenetreGestionAeroport.getInstance().getPanneauEchangeBillet().numVolJtf.getText();
		String nomPas = FenetreGestionAeroport.getInstance().getPanneauEchangeBillet().nomPasJtf.getText();
		String rembChB = FenetreGestionAeroport.getInstance().getPanneauEchangeBillet().rembChB.getText();
		System.out.println(numVol + "\n" + nomPas + "\n" + rembChB);
	}

}
