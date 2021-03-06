package fr.eseo.gestionaeroport.vue.panneaux;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import fr.eseo.gestionaeroport.controleur.actions.ActionRechercheDeVol;
import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

/**
 * 
 * Classe de panneau pour avoir les informations du vol de l'utilisateur
 * Aeroport d�part Aeroport arriv� Date Heure
 *
 */
public class PanneauRechercheVol extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField jtfAeroportDepart;
	private JTextField jtfAeroportArrivee;
	private JTextField jtfDateDepart;
	private JTextField jtfHeureDepart;

	public PanneauRechercheVol(int largeur, int hauteur) {
		super();
		this.setSize(new Dimension(largeur, hauteur));
		this.setBackground(FenetreGestionAeroport.COULEUR_FOND_PANNEAUX);
		// ajoute un cadre autour du jpanel (de 4 pixels)
		this.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, FenetreGestionAeroport.COULEUR_CADRE_PANNEAUX));
		initComponents();

	}

	public PanneauRechercheVol() {
		this(FenetreGestionAeroport.LARGEUR_PANNEAU_PAR_DEFAUT, FenetreGestionAeroport.HAUTEUR_PANNEAU_PAR_DEFAUT);
	}

	public JTextField getJTextFieldAeroportDepart() {
		return jtfAeroportDepart;
	}

	public JTextField getJTextFielAeroportArrivee() {
		return jtfAeroportArrivee;
	}

	public JTextField getJTextFieldDate() {
		return jtfDateDepart;
	}

	public JTextField getJTextFieldHeure() {
		return jtfHeureDepart;
	}

	private void initComponents() {
		// Layout
		this.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(2, 2, 2, 2);

		// Zone de titre
		JLabel zoneTitre = new JLabel("Rechercher un vol");
		zoneTitre.setFont(new Font("Berlin Sans FB Demi", 1, 30));
		zoneTitre.setForeground(FenetreGestionAeroport.COULEUR_CADRE_PANNEAUX);
		/// On positionne la case au d�part
		constraints.gridx = 0;
		constraints.gridy = 0;
		/// On choisit la taille du titre
		constraints.gridheight = 1;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		/// On positionne le titre au milieu
		constraints.anchor = GridBagConstraints.CENTER;
		this.add(zoneTitre, constraints);

		// Aeroport de d�part
		JLabel label = new JLabel("d�part");
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weightx = 0.5;
		this.add(label, constraints);

		jtfAeroportDepart = new JTextField();
		jtfAeroportDepart.setColumns(15);
		jtfAeroportDepart
				.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		constraints.anchor = GridBagConstraints.LINE_START;
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weightx = 0.5;
		this.add(jtfAeroportDepart, constraints);

		// Aeroport d'arriv�e
		JLabel labelarrive = new JLabel("arrivee");
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weightx = 0.5;
		this.add(labelarrive, constraints);

		jtfAeroportArrivee = new JTextField();
		jtfAeroportArrivee.setColumns(15);
		jtfAeroportArrivee
				.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		constraints.anchor = GridBagConstraints.LINE_START;
		constraints.weightx = 0.5;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.gridx = 1;
		constraints.gridy = 2;
		add(jtfAeroportArrivee, constraints);

		// Bouton pour la date
		JLabel labeldate = new JLabel("date");
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.gridx = 0;
		constraints.gridy = 3;
		this.add(labeldate, constraints);

		jtfDateDepart = new JTextField("AAAA-MM-JJ");
		jtfDateDepart.setColumns(10);
		jtfDateDepart
				.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		constraints.anchor = GridBagConstraints.LINE_START;
		constraints.weightx = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.gridx = 1;
		constraints.gridy = 3;
		add(jtfDateDepart, constraints);

		// Bouton pour l'heure
		JLabel labelheure = new JLabel("heure");
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.gridx = 0;
		constraints.gridy = 4;
		this.add(labelheure, constraints);

		jtfHeureDepart = new JTextField("H:MIN:S");
		constraints.anchor = GridBagConstraints.LINE_START;
		jtfHeureDepart.setColumns(10);
		jtfHeureDepart
				.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		constraints.weightx = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.gridx = 1;
		constraints.gridy = 4;
		add(jtfHeureDepart, constraints);

		// Bouton Valider
		JButton validerBout = new JButton(new ActionRechercheDeVol());
		constraints.anchor = GridBagConstraints.LINE_END;
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
		constraints.gridx = 2;
		constraints.gridy = 1;
		/// on choisit la taille
		constraints.gridheight = GridBagConstraints.REMAINDER; // on rempli jusqu'a la derni�re ligne du layout
		constraints.gridwidth = 1;
		/// remplissage de la case en horizontal et vertical
		constraints.fill = GridBagConstraints.BOTH;
		this.add(validerBout, constraints);
	}

}
