package fr.eseo.gestionAeroport.modele.baseDeDonnees;

public class Aeroport {

	// ID
	private int idaeroport;

	// nom
	private String nomaeroport;

	// ville
	private String ville;

	// pays
	private String pays;

	public Aeroport(int idaeroport, String nomaeroport, String ville, String pays) {
		this.idaeroport = idaeroport;
		this.nomaeroport = nomaeroport;
		this.ville = ville;
		this.pays = pays;
	}

	public Aeroport() {
		this.idaeroport = 0;
		this.nomaeroport = "";
		this.ville = "";
		this.pays = "";
	}

	public int getIdaeroport() {
		return idaeroport;
	}

	public void setIdaeroport(int idaeroport) {
		this.idaeroport = idaeroport;
	}

	public String getNomaeroport() {
		return nomaeroport;
	}

	public void setNomaeroport(String nomaeroport) {
		this.nomaeroport = nomaeroport;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

}
