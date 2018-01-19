package fr.eseo.gestionaeroport.vue.panneaux;

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

import fr.eseo.gestionaeroport.controleur.actions.ActionEchangeBillet;
import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

@SuppressWarnings("serial")
/**
 * Panneau qui contient l'interface utilisateur pour échanger ou rembourser un
 * billet d'un utilisateur
 * 
 * @author Tanguy SUARD
 *
 */
public class PanneauEchangeBillet extends JPanel {

	private JTextField numVolJtf;
	private JTextField nomPasJtf;
	private JTextField prenomPasJtf;
	private JCheckBox rembChB;

	PanneauEchangeBillet(int largeur, int hauteur) {
		super();
		this.setSize(largeur, hauteur);
		this.setBackground(FenetreGestionAeroport.COULEUR_FOND_PANNEAUX);
		/// on ajoute un cadre autour du jpanel (de 4 pixels)
		this.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, FenetreGestionAeroport.COULEUR_CADRE_PANNEAUX));
		initialisation();
	}

	public PanneauEchangeBillet() {
		this(FenetreGestionAeroport.LARGEUR_PANNEAU_PAR_DEFAUT, FenetreGestionAeroport.HAUTEUR_PANNEAU_PAR_DEFAUT);
	}

	public JTextField getNumVolJtf() {
		return numVolJtf;
	}

	public JTextField getNomPasJtf() {
		return nomPasJtf;
	}

	public JTextField getPrenomPasJtf() {
		return prenomPasJtf;
	}

	public JCheckBox getRembChB() {
		return rembChB;
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
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		/// On positionne le titre au milieu
		gbc.anchor = GridBagConstraints.CENTER;
		this.add(zoneTitre, gbc);

		// numero de vol
		JLabel numVolTxt = new JLabel("Numéro de vol ");
		/// On positionne la case
		gbc.gridx = 0;
		gbc.gridy = 1;
		/// On choisit la taille
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		/// on le centre
		gbc.anchor = GridBagConstraints.CENTER;
		this.add(numVolTxt, gbc);

		this.numVolJtf = new JTextField();
		this.numVolJtf.setColumns(15);
		this.numVolJtf
				.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		/// On positionne la case
		gbc.gridx = 1;
		gbc.gridy = 1;
		/// On choisit la taille
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		this.add(this.numVolJtf, gbc);

		// nom du passager
		JLabel nomPasTxt = new JLabel("Nom du passager ");
		/// On positionne la case
		gbc.gridx = 0;
		gbc.gridy = 2;
		/// On choisit la taille
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		this.add(nomPasTxt, gbc);

		this.nomPasJtf = new JTextField();
		this.nomPasJtf.setColumns(15);
		this.nomPasJtf
				.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		/// On positionne la case
		gbc.gridx = 1;
		gbc.gridy = 2;
		/// On choisit la taille
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		this.add(this.nomPasJtf, gbc);

		// prénom du passager
		JLabel prenomPasTxt = new JLabel("Prénom du passager ");
		/// On positionne la case
		gbc.gridx = 0;
		gbc.gridy = 3;
		/// On choisit la taille
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		this.add(prenomPasTxt, gbc);

		this.prenomPasJtf = new JTextField();
		this.prenomPasJtf.setColumns(15);
		this.prenomPasJtf
				.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		/// On positionne la case
		gbc.gridx = 1;
		gbc.gridy = 3;
		/// On choisit la taille
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		this.add(this.prenomPasJtf, gbc);

		// remboursement
		this.rembChB = new JCheckBox("Remboursement");
		this.rembChB.setOpaque(false);
		/// On positionne la case
		gbc.gridx = 0;
		gbc.gridy = 4;
		/// On choisit la taille
		gbc.gridheight = 1;
		gbc.gridwidth = 2;
		this.add(this.rembChB, gbc);

		// valider
		JButton validerBout = new JButton(new ActionEchangeBillet());
		validerBout.setPreferredSize(new Dimension(70, 30));
		/// couleur du texte
		validerBout.setForeground(Color.WHITE);
		/// on peint l'interieur
		validerBout.setBackground(FenetreGestionAeroport.COULEUR_ACCENTUATION);
		/// on peint les bordures
		validerBout.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		/// on enleve l'effet focus
		validerBout.setFocusPainted(false);
		/// on positionne la case
		gbc.gridx = 2;
		gbc.gridy = 1;
		/// on choisit la taille
		gbc.gridheight = GridBagConstraints.REMAINDER; // on rempli jusqu'a la dernière ligne du layout
		gbc.gridwidth = 1;
		/// remplissage de la case en horizontal et vertical
		gbc.fill = GridBagConstraints.BOTH;
		/// on met le bouton à gauche
		gbc.anchor = GridBagConstraints.LINE_END;
		this.add(validerBout, gbc);
	}

}
