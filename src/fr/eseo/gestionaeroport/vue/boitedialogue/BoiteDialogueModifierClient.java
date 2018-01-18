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

import fr.eseo.gestionaeroport.controleur.actions.ActionUpdateUnCompteClient;
import fr.eseo.gestionaeroport.modele.Utilisateur;
import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

@SuppressWarnings("serial")
public class BoiteDialogueModifierClient extends JDialog {

	private Utilisateur utilisateur;

	private JTextField jtfNom;
	private JTextField jtfPrenom;
	private JTextField jtfAdresseMail;
	private JTextField jtfLogin;
	private JTextField jtfMotDePasse;
	public FenetreGestionAeroport fenetre;

	public BoiteDialogueModifierClient(int largeur, int hauteur, Utilisateur utilisateur) {
		super();
		this.setPreferredSize(new Dimension(largeur, hauteur));
		this.setUtilisateur(utilisateur);
		// au milieu de l'écran
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		this.setUndecorated(true);

		this.initialisationComposants();

		this.setVisible(true);
	}

	public BoiteDialogueModifierClient() {
		this(300, 170, new Utilisateur(0, null, null, null, null, null));
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Utilisateur getUtilisateur() {
		utilisateur.setNom(jtfNom.getText());
		utilisateur.setPrenom(jtfPrenom.getText());
		utilisateur.setAdresseMail(jtfAdresseMail.getText());
		utilisateur.setLogin(jtfLogin.getText());
		utilisateur.setMotDePasse(jtfMotDePasse.getText());
		return utilisateur;
	}

	private void initialisationComposants() {
		JPanel panneau = new JPanel();
		// Layout
		panneau.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		/// on ajoute un marge autour du composant
		constraints.insets = new Insets(2, 2, 2, 2);

		// Nom
		JLabel labelNom = new JLabel("Nom");
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.CENTER;
		panneau.add(labelNom, constraints);

		jtfNom = new JTextField(utilisateur.getNom());
		jtfNom.setColumns(15);
		jtfNom.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		constraints.weightx = 0.5;
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.LINE_START;
		panneau.add(jtfNom, constraints);

		// Prénom
		JLabel labelPrenom = new JLabel("Prénom");
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.CENTER;
		panneau.add(labelPrenom, constraints);

		jtfPrenom = new JTextField(utilisateur.getNom());
		jtfPrenom.setColumns(15);
		jtfPrenom.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		constraints.weightx = 0.5;
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.LINE_START;
		panneau.add(jtfPrenom, constraints);

		// Adresse Mail
		JLabel labelAdresseMail = new JLabel("Adresse mail");
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.CENTER;
		panneau.add(labelAdresseMail, constraints);

		jtfAdresseMail = new JTextField(utilisateur.getAdresseMail());
		jtfAdresseMail.setColumns(15);
		jtfAdresseMail
				.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		constraints.weightx = 0;
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.LINE_START;
		panneau.add(jtfAdresseMail, constraints);

		// Login
		JLabel labelLogin = new JLabel("Login");
		constraints.gridx = 0;
		constraints.gridy = 3;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.CENTER;
		panneau.add(labelLogin, constraints);

		jtfLogin = new JTextField(utilisateur.getLogin());
		jtfLogin.setColumns(15);
		jtfLogin.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		constraints.weightx = 0;
		constraints.gridx = 1;
		constraints.gridy = 3;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.LINE_START;
		panneau.add(jtfLogin, constraints);

		// Mot de passe
		JLabel labelMotDePasse = new JLabel("Mot de passe");
		constraints.gridx = 0;
		constraints.gridy = 4;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.CENTER;
		panneau.add(labelMotDePasse, constraints);

		jtfMotDePasse = new JTextField(utilisateur.getMotDePasse());
		jtfMotDePasse.setColumns(15);
		jtfMotDePasse
				.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, FenetreGestionAeroport.COULEUR_ACCENTUATION));
		constraints.weightx = 0;
		constraints.gridx = 1;
		constraints.gridy = 4;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.LINE_START;
		panneau.add(jtfMotDePasse, constraints);

		// boutton enregistrer
		JButton buttonAnnuler = new JButton(new ActionUpdateUnCompteClient(this.fenetre));
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
		constraints.gridy = 5;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weighty = 0;
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.LINE_END;
		panneau.add(buttonAnnuler, constraints);

		// boutton annuler
		JButton buttonEnregister = new JButton("Annuler");
		constraints.anchor = GridBagConstraints.LINE_START;
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
		constraints.gridy = 5;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weighty = 0;
		constraints.fill = GridBagConstraints.NONE;
		panneau.add(buttonEnregister, constraints);

		this.add(panneau);
		this.pack();
	}
}
