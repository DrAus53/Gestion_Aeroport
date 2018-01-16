package fr.eseo.gestionAeroport.vue.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanneauEnregistrerUnNouvelAvion extends JPanel {
	private static final long serialVersionUID = 1L;
	private FenetreGestionAeroport fenetreGestionAeroport;
	GridBagConstraints constraints = new GridBagConstraints();

	public PanneauEnregistrerUnNouvelAvion(int largeur, int l) {
		super();
		BoxLayout box = new BoxLayout(this, BoxLayout.Y_AXIS);
		this.setLayout(box);
		this.setSize(new Dimension(largeur, l));
		this.setBackground(Color.RED);
		JLabel label = new JLabel("Recherche Vol");
		this.add(label, BorderLayout.NORTH);
		initComponents();

	}

	public PanneauEnregistrerUnNouvelAvion() {
		super();
		this.setLayout(new GridBagLayout());
		constraints.gridx = 0;
		constraints.gridy = 0;
		this.setSize(30, 300);
		this.setBackground(Color.GREEN);
		JLabel label = new JLabel("Enregistrer un avion");
		this.add(label, constraints);
		initComponents();
	}

	private void initComponents() {
		ButtonGroup group = new ButtonGroup();
		JLabel label = new JLabel("nom");
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
		add(jtf, constraints);

		JLabel labelarrive = new JLabel("type");
		constraints.gridwidth = 1;
		constraints.gridx = 0;
		constraints.gridy = 2;

		this.add(labelarrive, constraints);

		JTextField jtfa = new JTextField();
		jtfa.setColumns(10);
		constraints.weightx = 0.5;
		constraints.gridwidth = 1;
		constraints.gridx = 1;
		constraints.gridy = 2;
		add(jtfa, constraints);

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
		add(jtfb, constraints);

		JButton confirmer = new JButton("confirmer");
		constraints.weightx = 0.5;
		constraints.gridwidth = 1;
		constraints.gridheight = 3;
		constraints.gridx = 2;
		constraints.gridy = 1;
		confirmer.setActionCommand("confirmer");
		group.add(confirmer);
		add(confirmer, constraints);

	}
}
