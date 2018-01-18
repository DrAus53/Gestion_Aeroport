package fr.eseo.gestionaeroport.controleur.actions;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.swing.AbstractAction;

import fr.eseo.gestionaeroport.controleur.baseDeDonnees.ConnexionBDD;
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
		boolean rembChB = FenetreGestionAeroport.getInstance().getPanneauEchangeBillet().rembChB.isSelected();
		String prenomPas = FenetreGestionAeroport.getInstance().getPanneauEchangeBillet().prenomPasJtf.getText();
		String idutilisateur = "";
		System.out.println("\n" + numVol + "\n" + nomPas + "\n" + rembChB);
		if (!numVol.equals("") && numVol.length() > 0) {
			if (!nomPas.equals("") && numVol.length() > 0) {
				// recherche de l'id utilisateur dans la BDD à partire du nom:
				try {
					Statement state = ConnexionBDD.connexion().createStatement();
					ResultSet result = state.executeQuery("SELECT idutilisateur FROM utilisateur WHERE nom ='" + nomPas
							+ "' AND prenom ='" + prenomPas + "';");
					ResultSetMetaData resultMeta = result.getMetaData();
					while (result.next()) {
						idutilisateur = result.getString("idutilisateur");
						System.out.println(idutilisateur);
					}
					try {
						// suprimer la reservation de ma BDD:
						state.execute("DELETE FROM reservation WHERE idtrajet = '" + numVol + "' AND idutilisateur = '"
								+ idutilisateur + "';");
						// BoiteDialogueNewAvionOk jop1 = new BoiteDialogueNewAvionOk();
						// FenetreGestionAeroport.getInstance();
					} catch (Exception e) {
						// BoiteDialogueNewAvionKo jop2 = new BoiteDialogueNewAvionKo();
						e.printStackTrace();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
