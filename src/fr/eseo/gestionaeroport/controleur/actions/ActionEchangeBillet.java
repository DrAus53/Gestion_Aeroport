package fr.eseo.gestionaeroport.controleur.actions;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.swing.AbstractAction;

import fr.eseo.gestionaeroport.controleur.baseDeDonnees.ConnexionBDD;
import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueErreurBdd;
import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueTexteVide;
import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueTrajetAnnuleNonRemb;
import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueTrajetAnnuleRemb;
import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueTrajetNonTrouve;
import fr.eseo.gestionaeroport.vue.boitedialogue.BoiteDialogueUtilisateurInconnu;
import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

/**
 * 
 * Classe pour supprimer une reservation dans la base de donnée après clic sur
 * le bouton valider
 *
 */

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
		String presenceReservation = "";
		// System.out.println("\n" + numVol + "\n" + nomPas + "\n" + rembChB);
		if (!numVol.equals("") && numVol.length() > 0) {
			if (!nomPas.equals("") && numVol.length() > 0) {
				if (!prenomPas.equals("") && prenomPas.length() > 0) {
					// recherche de l'id utilisateur dans la BDD à partire du nom et prenom:
					try {
						Statement state = ConnexionBDD.connexion().createStatement();
						ResultSet result = state.executeQuery("SELECT idutilisateur FROM utilisateur WHERE nom ='"
								+ nomPas + "' AND prenom ='" + prenomPas + "';");
						ResultSetMetaData resultMeta = result.getMetaData();
						while (result.next()) {
							// resultat de la recherche
							idutilisateur = result.getString("idutilisateur");
							// System.out.println(idutilisateur);
						}
						if (idutilisateur.equals("")) {
							// Utilisateur innexistant
							BoiteDialogueUtilisateurInconnu jopUtilisateurInconnu = new BoiteDialogueUtilisateurInconnu();
						} else {
							// Si l'utilisateur a bien été trouvé:
							try {
								// recherche de la bonne supression de la reservation:
								result = state.executeQuery("SELECT * FROM reservation WHERE idtrajet = '" + numVol
										+ "' AND idutilisateur = '" + idutilisateur + "';");
								resultMeta = result.getMetaData();
								while (result.next()) {
									presenceReservation = result.getString("idreservation");
								}
								if (presenceReservation.equals("")) {
									// Utilisateur innexistant
									BoiteDialogueTrajetNonTrouve jopUtilisateurTrajetNonTrouve = new BoiteDialogueTrajetNonTrouve();
								} else {
									try {
										// suprimer la reservation de la BDD:
										state.execute("DELETE FROM reservation WHERE idtrajet = '" + numVol
												+ "' AND idutilisateur = '" + idutilisateur + "';");
										if (rembChB) {
											// boite de dialogue: trajet bien remboursé:
											BoiteDialogueTrajetAnnuleRemb jopTrajetTrajetAnnuleRemb = new BoiteDialogueTrajetAnnuleRemb();
										}
										if (!rembChB) {
											// boite de dialogue: trajet bien annulé:
											BoiteDialogueTrajetAnnuleNonRemb jopTrajetAnnuleNonRemb = new BoiteDialogueTrajetAnnuleNonRemb();
										}
									} catch (Exception e) {
										// Erreur BDD + Boite de dialogue
										BoiteDialogueErreurBdd jopTrajetErreurBdd = new BoiteDialogueErreurBdd();
										e.printStackTrace();
									}
								}
							} catch (Exception e) {
								// Erreur BDD + Boite de dialogue
								BoiteDialogueErreurBdd jopTrajetErreurBdd = new BoiteDialogueErreurBdd();
								e.printStackTrace();
							}
						}
					} catch (Exception e) {
						// Erreur BDD + Boite de dialogue
						BoiteDialogueErreurBdd jopTrajetErreurBdd = new BoiteDialogueErreurBdd();
						e.printStackTrace();
					}
				}
			}
		}
		if (numVol.equals("") || nomPas.equals("") || prenomPas.equals("")) {
			// les champs ne sont pas remplis :
			BoiteDialogueTexteVide jopTextVide = new BoiteDialogueTexteVide();
		}
	}

}
