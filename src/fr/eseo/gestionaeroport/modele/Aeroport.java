package fr.eseo.gestionaeroport.modele;

public class Aeroport {

	public int getIdAeroport() {
		return idAeroport;
	}

	public void setIdAeroport(int idAeroport) {
		this.idAeroport = idAeroport;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
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

	public String getNomTerminal() {
		return nomTerminal;
	}

	public void setNomTerminal(String nomTerminal) {
		this.nomTerminal = nomTerminal;
	}

	public int idAeroport;
	public String nom;
	public String ville;
	public String pays;
	public String nomTerminal;

	public Aeroport(int idAeroport, String nom, String nomTerminal, String ville, String pays) {
		this.idAeroport = idAeroport;
		this.nom = nom;
		this.ville = ville;
		this.pays = pays;
		this.nomTerminal = nomTerminal;
	}

	public void ajouter() {
	}

	public void supprimer(Aeroport aeroport) {
	}

	public void modifier() {
	}

}
