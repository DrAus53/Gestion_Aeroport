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

public class PanneauRechercheVol extends JPanel {

	private static final long serialVersionUID = 1L;
	private FenetreGestionAeroport fenetreGestionAeroport;
	GridBagConstraints constraints = new GridBagConstraints();

	public PanneauRechercheVol(int largeur, int l) {
		super();
		BoxLayout box = new BoxLayout(this, BoxLayout.Y_AXIS);
		this.setLayout(box);
		this.setSize(new Dimension(largeur, l));
		this.setBackground(Color.RED);
		JLabel label = new JLabel("Recherche Vol");
		this.add(label, BorderLayout.NORTH);
		initComponents();

	}

	public PanneauRechercheVol() {
		super();
		this.setLayout(new GridBagLayout());
		constraints.gridx = 0;
		constraints.gridy = 0;
		this.setSize(30, 300);
		this.setBackground(Color.RED);
		JLabel label = new JLabel("Recherche Vol");
		this.add(label, constraints);
		initComponents();
	}

	private void initComponents() {
		ButtonGroup group = new ButtonGroup();
		JLabel label = new JLabel("départ");
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

		JLabel labelarrive = new JLabel("arrivee");
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

		JLabel labeldate = new JLabel("date");
		constraints.gridwidth = 1;
		constraints.gridx = 0;
		constraints.gridy = 3;
		this.add(labeldate, constraints);

		JTextField jtfdate = new JTextField("JJ/MM/AAAA");
		jtfa.setColumns(10);
		constraints.weightx = 0.5;
		constraints.gridwidth = 1;
		constraints.gridx = 1;
		constraints.gridy = 3;
		add(jtfdate, constraints);

		JLabel labelheure = new JLabel("heure");
		constraints.gridwidth = 1;
		constraints.gridx = 0;
		constraints.gridy = 4;
		this.add(labelheure, constraints);

		JTextField jtfheure = new JTextField("H/MIN");
		jtfa.setColumns(10);
		constraints.weightx = 1;
		constraints.gridwidth = 1;
		constraints.gridx = 1;
		constraints.gridy = 4;
		add(jtfheure, constraints);

		JButton jButtonValider = new JButton("Valider");
		jButtonValider.setPreferredSize(new Dimension(100, 108));
		constraints.gridx = 2;
		constraints.gridy = 0;
		constraints.gridheight = 5;
		this.add(jButtonValider, constraints);
	}

}
