package fr.eseo.gestionAeroport.modele;

public class Compagnie {

	// Variables

	private int id;
	private char nom;
	private char description;

	// Constructeur

	public Compagnie(int id, char nom, char description) {
		this.id = id;
		this.nom = nom;
		this.description = description;
	}

	// Accesseurs

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
