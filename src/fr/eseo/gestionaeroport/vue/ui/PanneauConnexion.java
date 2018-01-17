package fr.eseo.gestionaeroport.vue.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import fr.eseo.gestionaeroport.controleur.actions.ActionConnexion;

public class PanneauConnexion extends JPanel {

	private static final long serialVersionUID = 1L;
	public FenetreConnexion fenetre;

	private JTextField jTextFieldLogin;
	private JTextField jTextFieldMdp;

	public PanneauConnexion() {
		initComponent();
	}

	public JTextField getjTextFieldLogin() {
		return jTextFieldLogin;
	}

	public JTextField getjTextFieldMdp() {
		return jTextFieldMdp;
	}

	public void initComponent() {
		this.setLayout(new GridBagLayout());
		this.setBackground(new Color(38, 138, 255));
		this.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, new Color(255, 81, 38)));
		GridBagConstraints constraints = new GridBagConstraints();

		JLabel labelBienvenu = new JLabel("Bienvenu !");
		labelBienvenu.setFont(new Font("Berlin Sans FB Demi", 1, 30));
		labelBienvenu.setForeground(FenetreGestionAeroport.COULEUR_CADRE_PANNEAUX);
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 2;
		this.add(labelBienvenu, constraints);
		constraints.gridwidth = 1;

		JLabel labelLogin = new JLabel("Login : ");
		constraints.gridx = 0;
		constraints.gridy = 1;
		this.add(labelLogin, constraints);

		this.jTextFieldLogin = new JTextField();
		jTextFieldLogin.setPreferredSize(new Dimension(120, 18));
		jTextFieldLogin.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 208, 38)));
		constraints.gridx = 1;
		constraints.gridy = 1;
		this.add(jTextFieldLogin, constraints);

		JLabel labelMdp = new JLabel("Mot de passe : ");
		constraints.gridx = 0;
		constraints.gridy = 2;
		this.add(labelMdp, constraints);

		this.jTextFieldMdp = new JTextField();
		jTextFieldMdp.setPreferredSize(new Dimension(120, 18));
		jTextFieldMdp.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 208, 38)));
		constraints.gridx = 1;
		constraints.gridy = 2;
		this.add(jTextFieldMdp, constraints);

		JButton jButtonValider = new JButton(new ActionConnexion(this.fenetre));
		constraints.gridx = 0;
		constraints.gridy = 3;
		constraints.gridwidth = 2;
		jButtonValider.setPreferredSize(new Dimension(70, 30));
		/// couleur du texte
		jButtonValider.setForeground(Color.WHITE);
		/// on peint l'interieur
		jButtonValider.setBackground(new Color(255, 208, 38));
		/// on peint les bordures
		jButtonValider.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(255, 208, 38)));
		/// on enleve l'effet focus
		jButtonValider.setFocusPainted(false);
		this.add(jButtonValider, constraints);
	}
}
