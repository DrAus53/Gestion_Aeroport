package fr.eseo.gestionaeroport.vue.boitedialogue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

@SuppressWarnings("serial")
public class BoiteDialogueProposerVol extends JDialog {

	public BoiteDialogueProposerVol(int largeur, int hauteur) {
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

	public BoiteDialogueProposerVol() {
		this(260, 160);
	}

	private void initialisationComposants() {
		JPanel panneau = new JPanel();
		// Layout
		panneau.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		/// on ajoute un marge autour du composant
		constraints.insets = new Insets(2, 2, 2, 2);

		// boutton enregistrer
		JButton buttonAnnuler = new JButton("Ta mère !");
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
		JButton buttonEnregister = new JButton("Casse toi");
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
