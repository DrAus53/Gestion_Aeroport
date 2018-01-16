package fr.eseo.gestionAeroport.vue.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanneauEchangeBillet extends JPanel {

	public PanneauEchangeBillet(int largeur, int hauteur) {
		this.setBackground(Color.YELLOW);
		this.setSize(largeur, hauteur);
		initialisation();
	}

	public PanneauEchangeBillet() {
		this(FenetreGestionAeroport.LARGEUR_PANNEAU_PAR_DEFAUT, FenetreGestionAeroport.HAUTEUR_PANNEAU_PAR_DEFAUT);
	}

	private void initialisation() {
		// Layout
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		// Zone de titre
		JLabel zoneTitre = new JLabel("Echange billet");
		zoneTitre.setFont(new Font("Arial Black", 1, 20));
		/// On positionne la case au départ
		gbc.gridx = 0;
		gbc.gridy = 0;
		/// On choisit la taille du titre
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		this.add(zoneTitre);

		// numero de vol
		JLabel numVolTxt = new JLabel("Numéro de vol :");
		/// On positionne la case
		gbc.gridx = 0;
		gbc.gridy = 1;
		/// On choisit la taille
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		this.add(numVolTxt);

		JTextField numVolJtf = new JTextField();
		numVolJtf.setColumns(20);
		/// On positionne la case
		gbc.gridx = 1;
		gbc.gridy = 1;
		/// On choisit la taille
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		this.add(numVolJtf);

		// nom du passager
		JLabel nomPasTxt = new JLabel("Nom du passager :");
		/// On positionne la case
		gbc.gridx = 0;
		gbc.gridy = 2;
		/// On choisit la taille
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		this.add(nomPasTxt);

		JTextField nomPasJtf = new JTextField();
		numVolJtf.setColumns(20);
		/// On positionne la case
		gbc.gridx = 1;
		gbc.gridy = 2;
		/// On choisit la taille
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		this.add(nomPasJtf);

		// remboursement
		JCheckBox rembChB = new JCheckBox("Remboursement");
		/// On positionne la case
		gbc.gridx = 0;
		gbc.gridy = 3;
		/// On choisit la taille
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		this.add(rembChB);

	}

}
