package fr.eseo.gestionAeroport.modele;

public class Avion {

	// Variables

	private int id;
	private char nom;
	private char type;
	private char constructeur;
	private int nbPlaces;
	private Compagnie nomCompagnie;

	// Constructeur

	public Avion(int id, char nom, char type, char constructeur, int nbPlaces, Compagnie nomCompagnie) {
		this.id = id;
		this.nom = nom;
		this.type = type;
		this.constructeur = constructeur;
		this.nbPlaces = nbPlaces;
		this.nomCompagnie = nomCompagnie;
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

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public char getConstructeur() {
		return constructeur;
	}

	public void setConstructeur(char constructeur) {
		this.constructeur = constructeur;
	}

	public int getNbPlaces() {
		return nbPlaces;
	}

	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}

	public Compagnie getNomCompagnie() {
		return nomCompagnie;
	}

	public void setNomCompagnie(Compagnie nomCompagnie) {
		this.nomCompagnie = nomCompagnie;
	}

	// Methodes

}
