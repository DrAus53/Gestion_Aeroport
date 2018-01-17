package fr.eseo.gestionaeroport.vue.boitedialogue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

@SuppressWarnings("serial")
public class BoiteDialogueListeDeVols extends JDialog {

	public BoiteDialogueListeDeVols(int largeur, int hauteur) {
		super();
		this.setPreferredSize(new Dimension(largeur, hauteur));
		// au milieu de l'�cran
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		this.setTitle("Liste des vols");
		this.setUndecorated(true);

		this.initialisationComposants();

		this.setVisible(true);
	}

	public BoiteDialogueListeDeVols() {
		this(FenetreGestionAeroport.LARGEUR_BOITE_DIALOGUE_PAR_DEFAUT,
				FenetreGestionAeroport.HAUTEUR_BOITE_DIALOGUE_PAR_DEFAUT);
	}

	private void initialisationComposants() {
		JPanel panTable = new JPanel();
		// Layout
		panTable.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		/// on ajoute un marge autour du composant
		constraints.insets = new Insets(2, 2, 2, 2);

		String[] entetes = { "<html><center>Num�ro<br/>de vol</center></html>",
				"<html><center>A�roport<br/>de d�part</center></html>",
				"<html><center>Date de<br/>d�part</center></html>", "<html><center>Heure de<br/>d�part</center></html>",
				"<html><center>A�roport<br/>d'arriv�e</center></html>",
				"<html><center>Date de<br/>d�part</center></html>", "<html><center>Heure<br/>d'arriv�e</center></html>",
				"<html><center>Nombre de<br/>passagers</center></html>" };

		Object[][] donnees = {};
		// TODO

		JTable tableauVol = new JTable(donnees, entetes);

		JTableHeader header = tableauVol.getTableHeader();
		header.setBackground(FenetreGestionAeroport.COULEUR_ACCENTUATION);
		header.setAlignmentX(CENTER_ALIGNMENT);
		header.setAlignmentY(CENTER_ALIGNMENT);

		// cr�ation d'une scroll barre
		JScrollPane scroll = new JScrollPane(tableauVol);
		// le tableau ne se redimmenssionne pas tous seul
		tableauVol.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.gridheight = 1;
		/// remplissage de la case en horizontal et vertical
		constraints.fill = GridBagConstraints.BOTH;
		constraints.weightx = 1;
		constraints.weighty = 1;
		panTable.add(scroll, constraints);

		// boutton annuler
		JButton buttonAnnuler = new JButton("Annuler");
		constraints.anchor = GridBagConstraints.LINE_END;
		buttonAnnuler.setPreferredSize(new Dimension(70, 30));
		/// couleur du texte
		buttonAnnuler.setForeground(Color.WHITE);
		/// on peint l'interieur
		buttonAnnuler.setBackground(FenetreGestionAeroport.COULEUR_ACCENTUATION);
		/// on peint les bordures
		buttonAnnuler
				.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		/// on enleve l'effet focus
		buttonAnnuler.setFocusPainted(false);
		/// on positionne la case
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weighty = 0;
		constraints.fill = GridBagConstraints.NONE;
		panTable.add(buttonAnnuler, constraints);

		this.add(panTable);
		this.pack();
	}
}
