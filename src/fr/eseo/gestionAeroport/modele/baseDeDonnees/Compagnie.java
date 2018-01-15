package fr.eseo.gestionAeroport.modele.baseDeDonnees;

public class Compagnie {

	// ID
	private int idcompagnie;

	// nom
	private String nomcompagnie;

	// description
	private String description;

	public Compagnie(int idcompagnie, String nomcompagnie, String description) {
		this.idcompagnie = idcompagnie;
		this.nomcompagnie = nomcompagnie;
		this.description = description;
	}

	public Compagnie() {
		this(0, "", "");
	}

	public int getIdcompagnie() {
		return idcompagnie;
	}

	public void setIdcompagnie(int idcompagnie) {
		this.idcompagnie = idcompagnie;
	}

	public String getNomcompagnie() {
		return nomcompagnie;
	}

	public void setNomcompagnie(String nomcompagnie) {
		this.nomcompagnie = nomcompagnie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
