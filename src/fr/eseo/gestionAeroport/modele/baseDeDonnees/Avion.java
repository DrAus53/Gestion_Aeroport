package fr.eseo.gestionAeroport.modele.baseDeDonnees;

public class Avion {
	public int idAvion;
	private String nomAvion;
	private String typeAvion;
	private int nombrePlaces;
	private int idCompagnie;

	public Avion(int idAvion, String nomAvion, String typeAvion, int nombrePlaces, int idCompagnie) {
		this.idAvion = idAvion;
		this.nomAvion = nomAvion;
		this.typeAvion = typeAvion;
		this.nombrePlaces = nombrePlaces;
		this.idCompagnie = idCompagnie;
	}

	public Avion() {
		this.idAvion = 0;
		this.nomAvion = "";
		this.typeAvion = "";
		this.nombrePlaces = 0;
		this.idCompagnie = 0;
	}

	public int getIdAvion() {
		return idAvion;
	}

	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
	}

	public String getNomAvion() {
		return nomAvion;
	}

	public void setNomAvion(String nomAvion) {
		this.nomAvion = nomAvion;
	}

	public String getTypeAvion() {
		return typeAvion;
	}

	public void setTypeAvion(String typeAvion) {
		this.typeAvion = typeAvion;
	}

	public int getNombrePlaces() {
		return nombrePlaces;
	}

	public void setNombrePlaces(int nombrePlaces) {
		this.nombrePlaces = nombrePlaces;
	}

	public int getIdCompagnie() {
		return idCompagnie;
	}

	public void setIdCompagnie(int idCompagnie) {
		this.idCompagnie = idCompagnie;
	}
}
