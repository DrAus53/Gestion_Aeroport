package fr.eseo.gestionaeroport.vue.ui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FenetreConnexion extends JFrame {

	private static FenetreConnexion instance;
	public static final String TITRE_PAR_DEFAUT = "Connexion";

	public static final int LARGEUR_PANNEAU_PAR_DEFAUT = 300;
	public static final int HAUTEUR_PANNEAU_PAR_DEFAUT = 30;

	private static PanneauConnexion panneauConnexion;

	public FenetreConnexion() {
		this.setTitle(TITRE_PAR_DEFAUT);
		this.setIconImage(new ImageIcon("icone_avion.png").getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setResizable(true);
		this.setVisible(true);

		this.panneauConnexion = new PanneauConnexion();
		this.add(this.panneauConnexion);

	}

	public static FenetreConnexion getInstance() {
		if (FenetreConnexion.instance == null) {
			FenetreConnexion.instance = new FenetreConnexion();
		}
		return FenetreConnexion.instance;
	}

	public static void fermerFenetre() {
		instance.dispose();
	}

	public static String findLogin() {
		return FenetreConnexion.panneauConnexion.jTextFieldLogin.getText();
	}

	public String findMdp() {
		return instance.panneauConnexion.jTextFieldMdp.getText();
	}
}
