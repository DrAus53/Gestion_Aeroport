package fr.eseo.gestionAeroport.vue.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanneauEchangeBillet extends JPanel {

	public PanneauEchangeBillet(int largeur, int hauteur) {
		this.setSize(largeur, hauteur);
		this.setBackground(FenetreGestionAeroport.COULEUR_FOND_PANNEAUX);
		/// on ajoute un cadre autour du jpanel (de 4 pixels)
		this.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, FenetreGestionAeroport.COULEUR_CADRE_PANNEAUX));
		initialisation();
	}

	public PanneauEchangeBillet() {
		this(FenetreGestionAeroport.LARGEUR_PANNEAU_PAR_DEFAUT, FenetreGestionAeroport.HAUTEUR_PANNEAU_PAR_DEFAUT);
	}

	private void initialisation() {
		// Layout
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		/// on ajoute un marge autour du composant
		gbc.insets = new Insets(2, 2, 2, 2);

		// Zone de titre
		JLabel zoneTitre = new JLabel("Echange billet");
		zoneTitre.setFont(new Font("Berlin Sans FB Demi", 1, 30));
		zoneTitre.setForeground(FenetreGestionAeroport.COULEUR_CADRE_PANNEAUX);
		/// On positionne la case au départ
		gbc.gridx = 0;
		gbc.gridy = 0;
		/// On choisit la taille du titre
		gbc.gridheight = 1;
		gbc.gridwidth = 3;
		this.add(zoneTitre, gbc);

		// numero de vol
		JLabel numVolTxt = new JLabel("Numéro de vol :");
		/// On positionne la case
		gbc.gridx = 0;
		gbc.gridy = 1;
		/// On choisit la taille
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		this.add(numVolTxt, gbc);

		JTextField numVolJtf = new JTextField();
		numVolJtf.setColumns(15);
		numVolJtf.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		/// On positionne la case
		gbc.gridx = 1;
		gbc.gridy = 1;
		/// On choisit la taille
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		this.add(numVolJtf, gbc);

		// nom du passager
		JLabel nomPasTxt = new JLabel("Nom du passager :");
		/// On positionne la case
		gbc.gridx = 0;
		gbc.gridy = 2;
		/// On choisit la taille
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		this.add(nomPasTxt, gbc);

		JTextField nomPasJtf = new JTextField();
		nomPasJtf.setColumns(15);
		nomPasJtf.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		/// On positionne la case
		gbc.gridx = 1;
		gbc.gridy = 2;
		/// On choisit la taille
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		this.add(nomPasJtf, gbc);

		// remboursement
		JCheckBox rembChB = new JCheckBox("Remboursement");
		/// On positionne la case
		gbc.gridx = 0;
		gbc.gridy = 3;
		/// On choisit la taille
		gbc.gridheight = 1;
		gbc.gridwidth = 2;
		this.add(rembChB, gbc);

		// valider
		JButton validerBout = new JButton("Valider");
		validerBout.setPreferredSize(new Dimension(100, 70));
		validerBout.setForeground(Color.WHITE);
		// validerBout.setOpaque(false);
		/// on peint l'interieur
		validerBout.setBackground(FenetreGestionAeroport.COULEUR_ACCENTUATION);
		/// on peint les bordures
		validerBout.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		/// on enleve l'effet focus
		validerBout.setFocusPainted(false);
		/// on positionne la case
		gbc.gridx = 2;
		gbc.gridy = 1;
		/// On choisit la taille
		gbc.gridheight = GridBagConstraints.REMAINDER; // on rempli jusqu'a la dernière ligne du layout
		gbc.gridwidth = 1;
		this.add(validerBout, gbc);
	}

}
