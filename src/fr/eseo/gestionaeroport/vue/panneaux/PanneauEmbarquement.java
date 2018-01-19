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

import fr.eseo.gestionaeroport.controleur.actions.ActionEmbarquement;
import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

/**
 * Panneau qui contient l'interface utilisateur pour afficher la liste des
 * passagers d'un vol à partir du numero de vol
 * 
 * @author Tanguy SUARD
 *
 */
@SuppressWarnings("serial")
public class PanneauEmbarquement extends JPanel {

	private JTextField jTextFieldNumVol;

	public PanneauEmbarquement(int largeur, int hauteur) {
		this.setSize(largeur, hauteur);
		this.setBackground(FenetreGestionAeroport.COULEUR_FOND_PANNEAUX);
		this.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, FenetreGestionAeroport.COULEUR_CADRE_PANNEAUX));
		initComponent();
	}

	public PanneauEmbarquement() {
		this(FenetreGestionAeroport.LARGEUR_PANNEAU_PAR_DEFAUT, FenetreGestionAeroport.HAUTEUR_PANNEAU_PAR_DEFAUT);
	}

	public JTextField getjTextFieldNumVol() {
		return jTextFieldNumVol;
	}

	private void initComponent() {
		this.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(2, 2, 2, 2);

		JLabel zoneTitre = new JLabel("Liste des passagers");
		zoneTitre.setFont(new Font("Berlin Sans FB Demi", 1, 30));
		zoneTitre.setForeground(FenetreGestionAeroport.COULEUR_CADRE_PANNEAUX);
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridheight = 1;
		constraints.gridwidth = 3;
		this.add(zoneTitre, constraints);

		JLabel labelNumVol = new JLabel("Numéro de vol  ");
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridheight = 1;
		constraints.gridwidth = 1;
		this.add(labelNumVol, constraints);

		this.jTextFieldNumVol = new JTextField();
		this.jTextFieldNumVol.setColumns(15);
		this.jTextFieldNumVol
				.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.gridheight = 1;
		constraints.gridwidth = 1;
		this.add(this.jTextFieldNumVol, constraints);

		// valider
		JButton jButtonValider = new JButton(new ActionEmbarquement());
		jButtonValider.setPreferredSize(new Dimension(70, 30));
		/// couleur du texte
		jButtonValider.setForeground(Color.WHITE);
		/// on peint l'interieur
		jButtonValider.setBackground(FenetreGestionAeroport.COULEUR_ACCENTUATION);
		/// on peint les bordures
		jButtonValider
				.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		/// on enleve l'effet focus
		jButtonValider.setFocusPainted(false);
		/// on positionne la case
		constraints.gridx = 2;
		constraints.gridy = 1;
		/// on choisit la taille
		constraints.gridheight = GridBagConstraints.REMAINDER;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		/// remplissage de la case en horizontal et vertical
		constraints.fill = GridBagConstraints.BOTH;
		this.add(jButtonValider, constraints);
	}
}
