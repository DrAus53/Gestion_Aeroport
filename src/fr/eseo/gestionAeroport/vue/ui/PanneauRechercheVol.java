package fr.eseo.gestionAeroport.vue.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.text.MessageFormat;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanneauRechercheVol extends JPanel {

	private static final long serialVersionUID = 1L;
	private FenetreGestionAeroport fenetreGestionAeroport;

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
		BoxLayout box = new BoxLayout(this, BoxLayout.Y_AXIS);
		this.setLayout(box);
		this.setSize(300, 300);
		this.setBackground(Color.RED);

		JLabel label = new JLabel("Recherche Vol");
		this.add(label, BorderLayout.NORTH);
		initComponents();

	}

	private void initComponents() {
		ButtonGroup group = new ButtonGroup();
		JFormattedTextField jtf = new JFormattedTextField(MessageFormat.class);
		jtf.setPreferredSize(new Dimension(150, 30));
		JLabel label = new JLabel("depart");
		add(label, BorderLayout.EAST);
		add(jtf, BorderLayout.CENTER);

		JButton confirmer = new JButton("confirmer");
		confirmer.setPreferredSize(new Dimension(150, 30));
		confirmer.setActionCommand("confirmer");
		group.add(confirmer);
		add(confirmer, BorderLayout.EAST);
		this.setVisible(true);
	}

}
