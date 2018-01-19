package fr.eseo.gestionaeroport.controleur.actions;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;

import javax.swing.AbstractAction;

import fr.eseo.gestionaeroport.GestionAeroport;
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
@SuppressWarnings("serial")
public class ActionEchangeBillet extends AbstractAction {

	public static final String NOM_ACTION = "Valider";

	public ActionEchangeBillet() {
		super(NOM_ACTION);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String numVol = FenetreGestionAeroport.getInstance().getPanneauEchangeBillet().getNumVolJtf().getText();
		String nomPas = FenetreGestionAeroport.getInstance().getPanneauEchangeBillet().getNomPasJtf().getText();
		boolean rembChB = FenetreGestionAeroport.getInstance().getPanneauEchangeBillet().getRembChB().isSelected();
		String prenomPas = FenetreGestionAeroport.getInstance().getPanneauEchangeBillet().getPrenomPasJtf().getText();
		String idutilisateur = "";
		String presenceReservation = "";

		if (!numVol.equals("") && numVol.length() > 0) {
			if (!nomPas.equals("") && numVol.length() > 0) {
				if (!prenomPas.equals("") && prenomPas.length() > 0) {
					// recherche de l'id utilisateur dans la BDD à partire du nom et prenom:
					try {
						Statement state = ConnexionBDD.connexion().createStatement();
						ResultSet result = state.executeQuery("SELECT idutilisateur FROM utilisateur WHERE nom ='"
								+ nomPas + "' AND prenom ='" + prenomPas + "';");
						while (result.next()) {
							// resultat de la recherche
							idutilisateur = result.getString("idutilisateur");
						}
						if (idutilisateur.equals("")) {
							// Utilisateur innexistant
							new BoiteDialogueUtilisateurInconnu();
						} else {
							// Si l'utilisateur a bien été trouvé:
							try {
								// recherche de la bonne supression de la reservation:
								result = state.executeQuery("SELECT * FROM reservation WHERE idtrajet = '" + numVol
										+ "' AND idutilisateur = '" + idutilisateur + "';");
								while (result.next()) {
									presenceReservation = result.getString("idreservation");
								}
								if (presenceReservation.equals("")) {
									// Utilisateur innexistant
									new BoiteDialogueTrajetNonTrouve();
								} else {
									try {
										// suprimer la reservation de la BDD:
										state.execute("DELETE FROM reservation WHERE idtrajet = '" + numVol
												+ "' AND idutilisateur = '" + idutilisateur + "';");
										if (rembChB) {
											// boite de dialogue: trajet bien remboursé:
											new BoiteDialogueTrajetAnnuleRemb();
										}
										if (!rembChB) {
											// boite de dialogue: trajet bien annulé:
											new BoiteDialogueTrajetAnnuleNonRemb();
										}
									} catch (Exception e) {
										// Erreur BDD + Boite de dialogue
										new BoiteDialogueErreurBdd();
										GestionAeroport.getLogger().log(Level.INFO, e.toString());
									}
								}
							} catch (Exception e) {
								// Erreur BDD + Boite de dialogue
								new BoiteDialogueErreurBdd();
								GestionAeroport.getLogger().log(Level.INFO, e.toString());
							}
						}
					} catch (Exception e) {
						// Erreur BDD + Boite de dialogue
						new BoiteDialogueErreurBdd();
						GestionAeroport.getLogger().log(Level.INFO, e.toString());
					}
				}
			}
		}
		if (numVol.equals("") || nomPas.equals("") || prenomPas.equals("")) {
			// les champs ne sont pas remplis :
			new BoiteDialogueTexteVide();
		}
	}

}
