package fr.eseo.gestionaeroport.modele.baseDeDonnees;

public class EstPersonnel {
	public int numUtilisateur;
	private boolean gereAeroport;
	private boolean gereCompagnie;
	private boolean gerePersonnel;

	public EstPersonnel(int numUtilisateur, boolean gereAeroport, boolean gereCompagnie, boolean gerePersonnel) {
		this.numUtilisateur = numUtilisateur;
		this.gereAeroport = gereAeroport;
		this.gereCompagnie = gereCompagnie;
		this.gerePersonnel = gerePersonnel;
	}

	public EstPersonnel() {
		this.numUtilisateur = 0;
		this.gereAeroport = false;
		this.gereCompagnie = false;
		this.gerePersonnel = false;
	}

	public int getNumUtilisateur() {
		return numUtilisateur;
	}

	public void setNumUtilisateur(int numUtilisateur) {
		this.numUtilisateur = numUtilisateur;
	}

	public boolean isGereAeroport() {
		return gereAeroport;
	}

	public void setGereAeroport(boolean gereAeroport) {
		this.gereAeroport = gereAeroport;
	}

	public boolean isGereCompagnie() {
		return gereCompagnie;
	}

	public void setGereCompagnie(boolean gereCompagnie) {
		this.gereCompagnie = gereCompagnie;
	}

	public boolean isGerePersonnel() {
		return gerePersonnel;
	}

	public void setGerePersonnel(boolean gerePersonnel) {
		this.gerePersonnel = gerePersonnel;
	}
}
