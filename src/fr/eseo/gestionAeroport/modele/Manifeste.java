package fr.eseo.gestionAeroport.modele;

public class Manifeste {

	// Variables

	private int idManifeste;
	private Vol vol;
	private Compagnie compagnie;
	private Avion avion;

	// Constructeur

	public Manifeste(int idManifeste, Vol vol, Compagnie compagnie, Avion avion) {
		super();
		this.idManifeste = idManifeste;
		this.vol = vol;
		this.compagnie = compagnie;
		this.avion = avion;
	}

	// Accesseurs

	public int getIdManifeste() {
		return idManifeste;
	}

	public void setIdManifeste(int idManifeste) {
		this.idManifeste = idManifeste;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	public Compagnie getCompagnie() {
		return compagnie;
	}

	public void setCompagnie(Compagnie compagnie) {
		this.compagnie = compagnie;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	// Methodes

}