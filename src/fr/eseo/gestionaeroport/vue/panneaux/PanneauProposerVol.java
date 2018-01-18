package fr.eseo.gestionaeroport.vue.panneaux;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.sql.Connection;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import fr.eseo.gestionaeroport.controleur.actions.ActionProposerVol;
import fr.eseo.gestionaeroport.controleur.baseDeDonnees.ConnexionBDD;
import fr.eseo.gestionaeroport.dao.AeroportDAO;
import fr.eseo.gestionaeroport.dao.AvionDAO;
import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

public class PanneauProposerVol extends JPanel {
	private static final long serialVersionUID = 1L;

	public PanneauProposerVol(int largeur, int hauteur) {
		super();
		this.setSize(largeur, hauteur);
		this.setBackground(FenetreGestionAeroport.COULEUR_FOND_PANNEAUX);
		// on ajoute un cadre autour du jpanel (de 4 pixels)
		this.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, FenetreGestionAeroport.COULEUR_CADRE_PANNEAUX));
		initComponent();
	}

	public PanneauProposerVol() {
		this(FenetreGestionAeroport.LARGEUR_PANNEAU_PAR_DEFAUT, FenetreGestionAeroport.HAUTEUR_PANNEAU_PAR_DEFAUT);
	}

	// Accesseurs
	JTextField jTextFieldDepartDate = new JTextField();

	public JTextField getJTextFieldDateDepart() {
		return jTextFieldDepartDate;
	}

	JTextField jTextFieldDateArrivee = new JTextField();

	public JTextField getJTextFieldDateArrivee() {
		return jTextFieldDateArrivee;
	}

	Connection conn = ConnexionBDD.connexion();
	Object[] villes = new AeroportDAO(conn).affiche();

	JComboBox<Object> jComboBoxDepartAeroport = new JComboBox<>(villes);

	public JComboBox<Object> getJComboBoxDepartAeroport() {
		return jComboBoxDepartAeroport;
	}

	JComboBox<Object> jComboBoxArriveeAeroport = new JComboBox<>(villes);

	public JComboBox<Object> getJComboBoxArriveeAeroport() {
		return jComboBoxArriveeAeroport;
	}

	private void initComponent() {
		// Layout
		this.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		/// on ajoute un marge autour du composant
		constraints.insets = new Insets(2, 2, 2, 2);

		// Zone de titre
		JLabel zoneTitre = new JLabel("Proposer un nouveau vol");
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

		// Depart
		JLabel labelDepart = new JLabel("Depart");
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.CENTER;
		this.add(labelDepart, constraints);

		JLabel labelDepartAeroport = new JLabel("Aéroport");
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.CENTER;
		this.add(labelDepartAeroport, constraints);

		jComboBoxDepartAeroport
				.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		constraints.gridx = 2;
		constraints.gridy = 1;
		constraints.gridwidth = 2;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		this.add(jComboBoxDepartAeroport, constraints);

		JLabel labelDate = new JLabel("Date");
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.LINE_END;
		this.add(labelDate, constraints);

		/*
		 * peut-être utiliser plutôt un calendrier ->
		 * http://www.javacodex.com/Swing/Swing-Calendar
		 */

		jTextFieldDepartDate.setColumns(7);
		jTextFieldDepartDate
				.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		jTextFieldDepartDate.setText("AAAA-MM-JJ");
		constraints.gridx = 2;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		this.add(jTextFieldDepartDate, constraints);

		JTextField jTextFieldHeure = new JTextField();
		jTextFieldHeure
				.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		jTextFieldHeure.setText("00h00");
		constraints.gridx = 3;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		this.add(jTextFieldHeure, constraints);

		// Arrivée
		JLabel labelArrivee = new JLabel("Arrivée");
		constraints.gridx = 0;
		constraints.gridy = 3;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.fill = GridBagConstraints.NONE;
		this.add(labelArrivee, constraints);

		JLabel labelArriveeAeroport = new JLabel("Aéroport");
		constraints.gridx = 1;
		constraints.gridy = 3;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.LINE_END;
		constraints.fill = GridBagConstraints.NONE;
		this.add(labelArriveeAeroport, constraints);

		jComboBoxArriveeAeroport
				.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		constraints.gridx = 2;
		constraints.gridy = 3;
		constraints.gridwidth = 2;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		this.add(jComboBoxArriveeAeroport, constraints);

		JLabel labelDateArrivee = new JLabel("Date");
		constraints.gridx = 1;
		constraints.gridy = 4;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.LINE_END;
		constraints.fill = GridBagConstraints.NONE;
		this.add(labelDateArrivee, constraints);

		jTextFieldDateArrivee.setText("AAAA-MM-JJ");
		jTextFieldDateArrivee
				.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		constraints.gridx = 2;
		constraints.gridy = 4;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		this.add(jTextFieldDateArrivee, constraints);

		JTextField jTextFieldHeureArrivee = new JTextField();
		jTextFieldHeureArrivee.setText("00h00");
		jTextFieldHeureArrivee
				.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		constraints.gridx = 3;
		constraints.gridy = 4;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		this.add(jTextFieldHeureArrivee, constraints);

		JLabel labelIdAvion = new JLabel("Avion affecté");
		constraints.gridx = 0;
		constraints.gridy = 5;
		constraints.gridwidth = 2;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.fill = GridBagConstraints.NONE;
		this.add(labelIdAvion, constraints);

		Object[] avions = new AvionDAO(conn).affiche();

		JComboBox<Object> jComboBoxAvion = new JComboBox<>(avions);
		jComboBoxAvion
				.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		constraints.gridx = 2;
		constraints.gridy = 5;
		constraints.gridwidth = 2;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		this.add(jComboBoxAvion, constraints);

		// valider
		JButton validerBout = new JButton(new ActionProposerVol());
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
		constraints.gridx = 4;
		constraints.gridy = 1;
		/// on choisit la taille
		constraints.gridheight = GridBagConstraints.REMAINDER; // on rempli jusqu'a la dernière ligne du layout
		constraints.gridwidth = 1;
		/// remplissage de la case en horizontal et vertical
		constraints.fill = GridBagConstraints.BOTH;
		/// on met le bouton à gauche
		constraints.anchor = GridBagConstraints.LINE_END;
		this.add(validerBout, constraints);
	}
}
