package fr.eseo.gestionaeroport.vue.boitedialogue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

@SuppressWarnings("serial")
public class BoiteDialogueReserverUnVol extends JDialog {

	public BoiteDialogueReserverUnVol(int largeur, int hauteur) {
		super();
		this.setPreferredSize(new Dimension(largeur, hauteur));
		// au milieu de l'écran
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		this.setUndecorated(true);

		this.initialisationComposants();

		this.setVisible(true);
	}

	public BoiteDialogueReserverUnVol() {
		this(300, 170);
	}

	private void initialisationComposants() {
		JPanel panneau = new JPanel();
		// Layout
		panneau.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		/// on ajoute un marge autour du composant
		constraints.insets = new Insets(2, 2, 2, 2);

		// Panneau client
		JPanel panClient = new JPanel();
		panClient.setLayout(new GridBagLayout());
		panClient.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createMatteBorder(1, 1, 1, 1, FenetreGestionAeroport.COULEUR_ACCENTUATION),
				"Identité du client"));

		// Nom
		JLabel labelNom = new JLabel("Nom");
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.CENTER;
		panClient.add(labelNom, constraints);

		JTextField jtfNom = new JTextField();
		jtfNom.setColumns(15);
		jtfNom.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		constraints.weightx = 0.5;
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.LINE_START;
		panClient.add(jtfNom, constraints);

		// Prénom
		JLabel labelPrenom = new JLabel("Prénom");
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.CENTER;
		panClient.add(labelPrenom, constraints);

		JTextField jtfPrenom = new JTextField();
		jtfPrenom.setColumns(15);
		jtfPrenom.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		constraints.weightx = 0.5;
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.LINE_START;
		panClient.add(jtfPrenom, constraints);

		// Adresse Mail
		JLabel labelAdresseMail = new JLabel("Adresse mail");
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.CENTER;
		panClient.add(labelAdresseMail, constraints);

		JTextField jtfAdresseMail = new JTextField();
		jtfAdresseMail.setColumns(15);
		jtfAdresseMail
				.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		constraints.weightx = 0;
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.LINE_START;
		panClient.add(jtfAdresseMail, constraints);

		// contraintes du panneau
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.LINE_START;
		panneau.add(panClient, constraints);

		// Nombre de places
		JLabel labelNbPlace = new JLabel("Nombre de places");
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.CENTER;
		panneau.add(labelNbPlace, constraints);

		JTextField jtfNbPlace = new JTextField();
		jtfNbPlace.setColumns(7);
		jtfNbPlace.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		constraints.weightx = 0;
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.LINE_START;
		panneau.add(jtfNbPlace, constraints);

		// boutton enregistrer
		JButton buttonAnnuler = new JButton("Enregistrer");
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
		panneau.add(buttonAnnuler, constraints);

		// boutton annuler
		JButton buttonEnregister = new JButton("Annuler");
		constraints.anchor = GridBagConstraints.LINE_END;
		buttonEnregister.setPreferredSize(new Dimension(70, 30));
		/// couleur du texte
		buttonEnregister.setForeground(Color.WHITE);
		/// on peint l'interieur
		buttonEnregister.setBackground(FenetreGestionAeroport.COULEUR_ACCENTUATION);
		/// on peint les bordures
		buttonEnregister
				.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		/// on enleve l'effet focus
		buttonEnregister.setFocusPainted(false);
		/// on positionne la case
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weighty = 0;
		constraints.fill = GridBagConstraints.NONE;
		panneau.add(buttonEnregister, constraints);

		this.add(panneau);
		this.pack();
	}
}
