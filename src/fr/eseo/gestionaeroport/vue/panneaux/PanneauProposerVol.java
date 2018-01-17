package fr.eseo.gestionaeroport.vue.panneaux;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanneauProposerVol extends JPanel {
	private static final long serialVersionUID = 1L;

	public PanneauProposerVol() {
		initComponent();
	}

	private void initComponent() {
		this.setLayout(new GridBagLayout());
		this.setBackground(Color.green);
		// this.setSize(50, 150);
		// this.setBounds(0, 0, 50, 150);
		// this.setPreferredSize(new Dimension(200, 200));
		GridBagConstraints constraints = new GridBagConstraints();
		// constraints.gridwidth = 1;

		JLabel labelNouveauVol = new JLabel("Proposer un nouveauVol");
		constraints.gridx = 0;
		constraints.gridy = 0;
		this.add(labelNouveauVol, constraints);

		JLabel labelDepart = new JLabel("Depart : ");
		constraints.gridx = 0;
		constraints.gridy = 1;
		this.add(labelDepart, constraints);

		JTextField jTextFieldDepart = new JTextField();
		jTextFieldDepart.setPreferredSize(new Dimension(100, 18));
		constraints.gridx = 1;
		constraints.gridy = 1;
		this.add(jTextFieldDepart, constraints);

		JLabel labelDate = new JLabel("Date : ");
		constraints.gridx = 0;
		constraints.gridy = 2;
		this.add(labelDate, constraints);

		/*
		 * peut-être utiliser plutôt un calendrier ->
		 * http://www.javacodex.com/Swing/Swing-Calendar
		 */
		JTextField jTextFieldDate = new JTextField();
		jTextFieldDate.setPreferredSize(new Dimension(100, 18));
		jTextFieldDate.setText("JJ/MM/AAAA");
		constraints.gridx = 1;
		constraints.gridy = 2;
		this.add(jTextFieldDate, constraints);

		JTextField jTextFieldHeure = new JTextField();
		jTextFieldHeure.setPreferredSize(new Dimension(100, 18));
		jTextFieldHeure.setText("00h00");
		constraints.gridx = 2;
		constraints.gridy = 2;
		this.add(jTextFieldHeure, constraints);

		JLabel labelArrivee = new JLabel("Arrivée : ");
		constraints.gridx = 0;
		constraints.gridy = 4;
		this.add(labelArrivee, constraints);

		JTextField jTextFieldArrivee = new JTextField();
		jTextFieldArrivee.setPreferredSize(new Dimension(100, 18));
		constraints.gridx = 1;
		constraints.gridy = 4;
		this.add(jTextFieldArrivee, constraints);

		JLabel labelDateArrivee = new JLabel("Date : ");
		constraints.gridx = 0;
		constraints.gridy = 5;
		this.add(labelDateArrivee, constraints);

		JTextField jTextFieldDateArrivee = new JTextField();
		jTextFieldDateArrivee.setPreferredSize(new Dimension(100, 18));
		jTextFieldDateArrivee.setText("JJ/MM/AAAA");
		constraints.gridx = 1;
		constraints.gridy = 5;
		this.add(jTextFieldDateArrivee, constraints);

		JTextField jTextFieldHeureArrivée = new JTextField();
		jTextFieldHeureArrivée.setPreferredSize(new Dimension(100, 18));
		jTextFieldHeureArrivée.setText("00h00");
		constraints.gridx = 2;
		constraints.gridy = 5;
		this.add(jTextFieldHeureArrivée, constraints);

		JLabel labelIdAvion = new JLabel("Numéro avion : ");
		constraints.gridx = 0;
		constraints.gridy = 6;
		this.add(labelIdAvion, constraints);

		JTextField jTextFieldIdAvion = new JTextField();
		jTextFieldIdAvion.setPreferredSize(new Dimension(100, 18));
		constraints.gridx = 1;
		constraints.gridy = 6;
		this.add(jTextFieldIdAvion, constraints);

		JButton jButtonValider = new JButton("Valider");
		jButtonValider.setPreferredSize(new Dimension(100, 108));
		constraints.gridx = 4;
		constraints.gridy = 0;
		constraints.gridheight = 7;
		this.add(jButtonValider, constraints);
	}
}
