package fr.eseo.gestionaeroport.vue.panneaux;

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

import fr.eseo.gestionaeroport.vue.ui.FenetreGestionAeroport;

public class PanneauModifierUnCompteClient extends JPanel {

	private static final long serialVersionUID = 1L;
	private FenetreGestionAeroport fenetreGestionAeroport;
	GridBagConstraints constraints = new GridBagConstraints();

	public PanneauModifierUnCompteClient(int largeur, int l) {
		super();
		BoxLayout box = new BoxLayout(this, BoxLayout.Y_AXIS);
		this.setLayout(box);
		this.setSize(new Dimension(largeur, l));
		this.setBackground(Color.gray);
		JLabel label = new JLabel("Modifier un compte client");
		this.add(label, BorderLayout.NORTH);
		initComponents();

	}

	public PanneauModifierUnCompteClient() {
		super();
		this.setLayout(new GridBagLayout());
		constraints.gridx = 0;
		constraints.gridy = 0;
		this.setSize(30, 300);
		this.setBackground(Color.gray);
		JLabel label = new JLabel("Modifier un compte client");
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

		JLabel labelarrive = new JLabel("prénom");
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

		JButton jButtonValider = new JButton("Valider");
		jButtonValider.setPreferredSize(new Dimension(100, 108));
		constraints.gridx = 2;
		constraints.gridy = 0;
		constraints.gridheight = 5;
		this.add(jButtonValider, constraints);
	}

}
