package fr.eseo.gestionaeroport.modele;

public class Compagnie {

	// Variables

	private int idCompagnie;
	private char nom;
	private char description;

	// Constructeur

	public Compagnie(int id, char nom, char description) {
		this.idCompagnie = id;
		this.nom = nom;
		this.description = description;
	}

	// Accesseurs

	public int getId() {
		return idCompagnie;
	}

	public void setId(int id) {
		this.idCompagnie = id;
	}

	public char getNom() {
		return nom;
	}

	public void setNom(char nom) {
		this.nom = nom;
	}

	public char getDescription() {
		return description;
	}

	public void setDescription(char description) {
		this.description = description;
	}

	// Methodes

}
