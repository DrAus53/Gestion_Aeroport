package fr.eseo.gestionaeroport.vue.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import fr.eseo.gestionaeroport.controleur.actions.ActionConnexion;

public class PanneauConnexion extends JPanel {

	private static final long serialVersionUID = 1L;
	public FenetreConnexion fenetre;

	public JTextField jTextFieldLogin;
	public JTextField jTextFieldMdp;

	public PanneauConnexion() {
		initComponent();
	}

	public void initComponent() {
		this.setLayout(new GridBagLayout());
		this.setBackground(Color.green);
		GridBagConstraints constraints = new GridBagConstraints();

		JLabel labelBienvenu = new JLabel("Bienvenu !");
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 2;
		this.add(labelBienvenu, constraints);
		constraints.gridwidth = 1;

		JLabel labelLogin = new JLabel("Login : ");
		constraints.gridx = 0;
		constraints.gridy = 1;
		this.add(labelLogin, constraints);

		JTextField jTextFieldLogin = new JTextField();
		jTextFieldLogin.setPreferredSize(new Dimension(120, 18));
		constraints.gridx = 1;
		constraints.gridy = 1;
		this.add(jTextFieldLogin, constraints);

		JLabel labelMdp = new JLabel("Mot de passe : ");
		constraints.gridx = 0;
		constraints.gridy = 2;
		this.add(labelMdp, constraints);

		JTextField jTextFieldMdp = new JTextField();
		jTextFieldMdp.setPreferredSize(new Dimension(120, 18));
		constraints.gridx = 1;
		constraints.gridy = 2;
		this.add(jTextFieldMdp, constraints);

		JButton jButtonValider = new JButton(new ActionConnexion(this.fenetre));
		constraints.gridx = 0;
		constraints.gridy = 3;
		constraints.gridwidth = 2;
		this.add(jButtonValider, constraints);
	}
}
