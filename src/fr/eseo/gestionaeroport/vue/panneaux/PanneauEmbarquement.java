package fr.eseo.gestionaeroport.vue.panneaux;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

public class PanneauEmbarquement extends JPanel {

	private static final long serialVersionUID = 1L;
	private FenetreGestionAeroport fenetreGestionAeroport;

	public PanneauEmbarquement(int largeur, int hauteur) {
		this.setSize(largeur, hauteur);
		this.setBackground(FenetreGestionAeroport.COULEUR_FOND_PANNEAUX);
		this.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, FenetreGestionAeroport.COULEUR_CADRE_PANNEAUX));
		initComponent();
	}

	public PanneauEmbarquement() {
		this(FenetreGestionAeroport.LARGEUR_PANNEAU_PAR_DEFAUT, FenetreGestionAeroport.HAUTEUR_PANNEAU_PAR_DEFAUT);
	}

	private void initComponent() {
		this.setLayout(new GridBagLayout());

		this.setBackground(Color.PINK);
		// this.setSize(50, 150);
		// this.setBounds(0, 0, 50, 150);
		GridBagConstraints constraints = new GridBagConstraints();
		// constraints.gridwidth = 1;

		JLabel labelEmbarquement = new JLabel("Embarquement");
		constraints.gridx = 0;
		constraints.gridy = 0;
		this.add(labelEmbarquement, constraints);

		JLabel labelNumVol = new JLabel("Numéro de vol : ");
		constraints.gridx = 0;
		constraints.gridy = 1;
		this.add(labelNumVol, constraints);

		JTextField jTextFieldNumVol = new JTextField();
		constraints.gridx = 1;
		constraints.gridy = 1;
		this.add(jTextFieldNumVol, constraints);

		JButton jButtonValider = new JButton("Valider");
		constraints.gridx = 2;
		constraints.gridy = 0;
		constraints.gridheight = 2;
		this.add(jButtonValider, constraints);
	}
}
