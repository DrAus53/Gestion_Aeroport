package fr.eseo.gestionaeroport.modele;

public class Utilisateur {

	private String prenom;
	private String nom;
	private String motDePasse;
	private String login;
	private String adresseMail;

	public Utilisateur(String prenom, String nom, String motDePasse, String login, String adresseMail) {
		this.prenom = prenom;
		this.nom = nom;
		this.motDePasse = motDePasse;
		this.login = login;
		this.adresseMail = adresseMail;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getAdresseMail() {
		return adresseMail;
	}

	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}

	public void annuler(int numReservation) {
		// TODO
	}

}
