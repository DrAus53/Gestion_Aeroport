package fr.eseo.gestionaeroport.modele;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Vol {
	public int numeroVol;
	private Time heureDepart;
	private Time heureArrivee;
	private Date dateDepart;
	private Date dateArrive;
	private int idaeroportDepart;
	private int idaeroportArrivee;
	private List<String> nomPassagers;
	private int nombrePassagers;
	private Compagnie compagnie;
	private int idavion;
	private String place;

	public Vol(int numeroVol, Date dateDepart, Date dateArrivee, int idaeroportDepart, int idaeroportArrivee,
			List<String> nomPassagers, int nombrePassagers, int idavion, String place) {
		super();
		this.numeroVol = numeroVol;
		this.setIdaeroportDepart(idaeroportDepart);
		this.setIdaeroportArrivee(idaeroportArrivee);
		this.nomPassagers = nomPassagers;
		this.nombrePassagers = nombrePassagers;
		this.setIdavion(idavion);
		this.place = place;
		this.dateDepart = dateDepart;
		this.dateArrive = dateArrivee;
	}

	public Vol(int numeroVol, Date dateDepart, Date dateArrivee, int idaeroportDepart, int idaeroportArrivee,
			int nombrePassagers, Time heureDepart, Time heureArrivee) {
		super();
		this.numeroVol = numeroVol;
		this.setIdaeroportDepart(idaeroportDepart);
		this.setIdaeroportArrivee(idaeroportArrivee);
		this.nombrePassagers = nombrePassagers;
		this.dateDepart = dateDepart;
		this.dateArrive = dateArrivee;
	}

	public Vol(Date dateDepart, int idaeroportDepart, int idaeroportArrivee, int nombrePassagers) {
		super();
		this.setIdaeroportDepart(idaeroportDepart);
		this.setIdaeroportArrivee(idaeroportArrivee);

		this.nombrePassagers = nombrePassagers;
		this.setIdavion(idavion);

		this.dateDepart = dateDepart;

	}

	// getters and setters:
	public int getnumeroVol() {
		return numeroVol;
	}

	public void setnumeroVol(int numeroVol) {
		this.numeroVol = numeroVol;
	}

	public Date getHeureDepart() {
		return heureDepart;
	}

	public void setHeureDepart(Time heureDepart) {
		this.heureDepart = heureDepart;
	}

	public Time getHeureArrivee() {
		return heureArrivee;
	}

	public void setHeureArrivee(Time heureArrivee) {
		this.heureArrivee = heureArrivee;
	}

	public List<String> getNomPassagers() {
		return nomPassagers;
	}

	public void setNomPassagers(List<String> nomPassagers) {
		this.nomPassagers = nomPassagers;
	}

	public int getNombrePassagers() {
		return nombrePassagers;
	}

	public void setNombrePassagers(int nombrePassagers) {
		this.nombrePassagers = nombrePassagers;
	}

	public Compagnie getCompagnie() {
		return compagnie;
	}

	public void setCompagnie(Compagnie compagnie) {
		this.compagnie = compagnie;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getIdaeroportDepart() {
		return idaeroportDepart;
	}

	public void setIdaeroportDepart(int idaeroportDepart) {
		this.idaeroportDepart = idaeroportDepart;
	}

	public int getIdaeroportArrivee() {
		return idaeroportArrivee;
	}

	public void setIdaeroportArrivee(int idaeroportArrivee) {
		this.idaeroportArrivee = idaeroportArrivee;
	}

	public int getIdavion() {
		return idavion;
	}

	public void setIdavion(int idavion) {
		this.idavion = idavion;
	}

	public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public Date getDateArrive() {
		return dateArrive;
	}

	public void setDateArrive(Date dateArrive) {
		this.dateArrive = dateArrive;
	}
}
