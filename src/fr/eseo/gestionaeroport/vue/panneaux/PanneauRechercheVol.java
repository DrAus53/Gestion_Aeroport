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
 * Aeroport départ Aeroport arrivé Date Heure
 *
 */
public class PanneauRechercheVol extends JPanel {

	private static final long serialVersionUID = 1L;
	JTextField jtf;
	JTextField jtfa;
	JTextField jtfdate;
	JTextField jtfheure;
	public FenetreGestionAeroport fenetre;

	public PanneauRechercheVol(int largeur, int l) {
		super();
		this.setSize(new Dimension(largeur, l));
		this.setBackground(FenetreGestionAeroport.COULEUR_FOND_PANNEAUX);
		/// ajoute un cadre autour du jpanel (de 4 pixels)
		this.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, FenetreGestionAeroport.COULEUR_CADRE_PANNEAUX));
		initComponents();

	}

	public PanneauRechercheVol() {
		this(FenetreGestionAeroport.LARGEUR_PANNEAU_PAR_DEFAUT, FenetreGestionAeroport.HAUTEUR_PANNEAU_PAR_DEFAUT);
	}

	public JTextField getJTextFieldAeroportDepart() {
		return jtf;
	}

	public JTextField getJTextFielAeroportArrivee() {
		return jtfa;
	}

	public JTextField getJTextFieldDate() {
		return jtfdate;
	}

	public JTextField getJTextFieldHeure() {
		return jtfheure;
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
		/// On positionne la case au départ
		constraints.gridx = 0;
		constraints.gridy = 0;
		/// On choisit la taille du titre
		constraints.gridheight = 1;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		/// On positionne le titre au milieu
		constraints.anchor = GridBagConstraints.CENTER;
		this.add(zoneTitre, constraints);

		// Bouton pour l'aeroport de départ
		JLabel label = new JLabel("départ");
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weightx = 0.5;
		this.add(label, constraints);

		jtf = new JTextField();
		jtf.setColumns(15);
		jtf.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		constraints.anchor = GridBagConstraints.LINE_START;
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weightx = 0.5;
		this.add(jtf, constraints);

		// Bouton pour l'aeroport d'arrivé
		JLabel labelarrive = new JLabel("arrivee");
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weightx = 0.5;
		this.add(labelarrive, constraints);

		jtfa = new JTextField();
		jtfa.setColumns(15);
		jtfa.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		constraints.anchor = GridBagConstraints.LINE_START;
		constraints.weightx = 0.5;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.gridx = 1;
		constraints.gridy = 2;
		add(jtfa, constraints);

		// Bouton pour la date
		JLabel labeldate = new JLabel("date");
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.gridx = 0;
		constraints.gridy = 3;
		this.add(labeldate, constraints);

		jtfdate = new JTextField("AAAA-MM-JJ");
		jtfdate.setColumns(10);
		jtfdate.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		constraints.anchor = GridBagConstraints.LINE_START;
		constraints.weightx = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.gridx = 1;
		constraints.gridy = 3;
		add(jtfdate, constraints);

		// Bouton pour l'heure
		JLabel labelheure = new JLabel("heure");
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.gridx = 0;
		constraints.gridy = 4;
		this.add(labelheure, constraints);

		jtfheure = new JTextField("H:MIN:S");
		constraints.anchor = GridBagConstraints.LINE_START;
		jtfheure.setColumns(10);
		jtfheure.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		constraints.weightx = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.gridx = 1;
		constraints.gridy = 4;
		add(jtfheure, constraints);

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
		constraints.gridheight = GridBagConstraints.REMAINDER; // on rempli jusqu'a la dernière ligne du layout
		constraints.gridwidth = 1;
		/// remplissage de la case en horizontal et vertical
		constraints.fill = GridBagConstraints.BOTH;
		this.add(validerBout, constraints);
	}

}
