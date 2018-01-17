package fr.eseo.gestionaeroport.modele;

import java.util.Date;
import java.util.List;

public class Vol {
	public int numeroVol;
	private Date heureDepart;
	private Date heureArrivee;
	private int idaeroportDepart;
	private int idaeroportArrivee;
	private List<String> nomPassagers;
	private int nombrePassagers;
	private Compagnie compagnie;
	private int idavion;
	private String place;

	public Vol(int numeroVol, Date heureDepart, Date heureArrivee, int idaeroportDepart, int idaeroportArrivee,
			List<String> nomPassagers, int nombrePassagers, int idavion, String place) {
		super();
		this.numeroVol = numeroVol;
		this.heureDepart = heureDepart;
		this.heureArrivee = heureArrivee;
		this.setIdaeroportDepart(idaeroportDepart);
		this.setIdaeroportArrivee(idaeroportArrivee);
		this.nomPassagers = nomPassagers;
		this.nombrePassagers = nombrePassagers;
		this.setIdavion(idavion);
		this.place = place;
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

	public void setHeureDepart(Date heureDepart) {
		this.heureDepart = heureDepart;
	}

	public Date getHeureArrivee() {
		return heureArrivee;
	}

	public void setHeureArrivee(Date heureArrivee) {
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
}
