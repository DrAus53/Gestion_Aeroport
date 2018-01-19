package fr.eseo.gestionaeroport.vue.boitedialogue;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

import fr.eseo.gestionaeroport.dao.AeroportDAO;
import fr.eseo.gestionaeroport.modele.Vol;
import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

@SuppressWarnings("serial")
public class BoiteDialogueListeDeVols extends JDialog {

	private List<Vol> listeVols;

	public BoiteDialogueListeDeVols(int largeur, int hauteur, List<Vol> listeVols) {
		super();

		this.setListeVols(listeVols);

		this.setPreferredSize(new Dimension(largeur, hauteur));
		// au milieu de l'écran
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.setTitle("Liste des vols");
		this.setUndecorated(false);

		this.initialisationComposants();

		this.setVisible(true);
	}

	public BoiteDialogueListeDeVols() {
		this(FenetreGestionAeroport.LARGEUR_BOITE_DIALOGUE_PAR_DEFAUT,
				FenetreGestionAeroport.HAUTEUR_BOITE_DIALOGUE_PAR_DEFAUT, new ArrayList<Vol>());
	}

	public List<Vol> getListeVols() {
		return listeVols;
	}

	public void setListeVols(List<Vol> listeVols) {
		this.listeVols = listeVols;
	}

	private void initialisationComposants() {
		JPanel panTable = new JPanel();
		// Layout
		panTable.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		/// on ajoute un marge autour du composant
		constraints.insets = new Insets(2, 2, 2, 2);

		String[] entetes = { "<html><center>Numéro<br/>de vol</center></html>",
				"<html><center>Aéroport<br/>de départ</center></html>",
				"<html><center>Date de<br/>départ</center></html>", "<html><center>Heure de<br/>départ</center></html>",
				"<html><center>Aéroport<br/>d'arrivée</center></html>",
				"<html><center>Date de<br/>d'arrivée</center></html>",
				"<html><center>Heure<br/>d'arrivée</center></html>",
				"<html><center>Nombre de<br/>passagers</center></html>" };

		Object[][] donnees = listeVolToTable(this.getListeVols());

		JTable tableauVol = new JTable(donnees, entetes);

		JTableHeader header = tableauVol.getTableHeader();
		header.setBackground(FenetreGestionAeroport.COULEUR_ACCENTUATION);
		header.setAlignmentX(CENTER_ALIGNMENT);
		header.setAlignmentY(CENTER_ALIGNMENT);

		// création d'une scroll barre
		JScrollPane scroll = new JScrollPane(tableauVol);
		// le tableau ne se redimmenssionne pas tous seul
		// tableauVol.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.gridheight = 1;
		/// remplissage de la case en horizontal et vertical
		constraints.fill = GridBagConstraints.BOTH;
		constraints.weightx = 1;
		constraints.weighty = 1;
		panTable.add(scroll, constraints);

		this.add(panTable);
		this.pack();
	}

	/**
	 * Méthode transforme une liste de vols en tableau avec sur chaque ligne un vol
	 * différent et où les colonnes correspondent à l'affichage voulu.
	 * 
	 * @param listeVols
	 * @return donneesTableau
	 * @author Tanguy SUARD
	 */
	private Object[][] listeVolToTable(List<Vol> listeVols) {
		if (listeVols != null) {
			int taille = listeVols.size();
			// 8 colones dans le tableau à afficher
			Object[][] donneesTableau = new String[taille][8];

			int ligneTableau = 0;

			for (Vol vol : listeVols) {
				donneesTableau[ligneTableau][0] = String.valueOf(vol.getnumeroVol());
				donneesTableau[ligneTableau][1] = AeroportDAO.getNomAeroport(vol.getIdaeroportArrivee());
				if (vol.getDateDepart() != null) {
					donneesTableau[ligneTableau][2] = vol.getDateDepart().toString();
				}
				if (vol.getHeureDepart() != null) {
					donneesTableau[ligneTableau][3] = vol.getHeureDepart().toString();
				}
				donneesTableau[ligneTableau][4] = AeroportDAO.getNomAeroport(vol.getIdaeroportArrivee());
				if (vol.getDateArrive() != null) {
					donneesTableau[ligneTableau][5] = vol.getDateArrive().toString();
				}
				if (vol.getHeureArrivee() != null) {
					donneesTableau[ligneTableau][6] = vol.getHeureArrivee().toString();
				}
				donneesTableau[ligneTableau][7] = String.valueOf(vol.getNombrePassagers());
			}

			return donneesTableau;
		} else {
			System.out.println("Liste vol null");
			return null;
		}
	}

}
