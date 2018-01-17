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

import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

public class PanneauEnregistrerUnNouvelAvion extends JPanel {

	public PanneauEnregistrerUnNouvelAvion(int largeur, int hauteur) {
		super();
		this.setSize(largeur, hauteur);
		this.setBackground(FenetreGestionAeroport.COULEUR_FOND_PANNEAUX);
		/// on ajoute un cadre autour du jpanel (de 4 pixels)
		this.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, FenetreGestionAeroport.COULEUR_CADRE_PANNEAUX));
		initComponents();
	}

	public PanneauEnregistrerUnNouvelAvion() {
		this(FenetreGestionAeroport.LARGEUR_PANNEAU_PAR_DEFAUT, FenetreGestionAeroport.HAUTEUR_PANNEAU_PAR_DEFAUT);
	}

	private void initComponents() {
		// Layout
		this.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		/// on ajoute un marge autour du composant
		constraints.insets = new Insets(2, 2, 2, 2);

		// Zone de titre
		JLabel zoneTitre = new JLabel("Enregistrer un avion");
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

		// Type = constructeur
		JLabel constructeur = new JLabel("Constructeur");
		constraints.gridwidth = 1;
		constraints.gridx = 0;
		constraints.gridy = 2;
		this.add(constructeur, constraints);

		// Nom = Modele
		JLabel label = new JLabel("Modèle");
		constraints.weightx = 0.5;
		constraints.gridwidth = 1;
		constraints.gridx = 0;
		constraints.gridy = 1;
		this.add(label, constraints);

		JTextField jtf = new JTextField();
		jtf.setColumns(10);
		constraints.weightx = 0.5;
		constraints.gridwidth = 1;
		constraints.gridx = 1;
		constraints.gridy = 1;
		this.add(jtf, constraints);

		JTextField jtfa = new JTextField();
		jtfa.setColumns(10);
		constraints.weightx = 0.5;
		constraints.gridwidth = 1;
		constraints.gridx = 1;
		constraints.gridy = 2;
		this.add(jtfa, constraints);

		JLabel labela = new JLabel("nbplaces");
		constraints.gridwidth = 1;
		constraints.gridx = 0;
		constraints.gridy = 3;
		this.add(labela, constraints);

		JTextField jtfb = new JTextField();
		jtfb.setColumns(10);
		constraints.weightx = 0.5;
		constraints.gridwidth = 1;
		constraints.gridx = 1;
		constraints.gridy = 3;
		this.add(jtfb, constraints);

		// valider
		JButton validerBout = new JButton("Valider");
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
