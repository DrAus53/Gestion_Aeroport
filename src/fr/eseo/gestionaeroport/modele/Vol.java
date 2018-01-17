package fr.eseo.gestionaeroport.modele;

import java.util.Date;
import java.util.List;

public class Vol {
	public int idVol;
	private Date heureDepart;
	private Date heureArrivee;
	private Aeroport aeroportDepart;
	private Aeroport aeroportArrivee;
	private List<String> nomPassagers;
	private int nombrePassagers;
	private Compagnie compagnie;
	private Avion avion;
	private String place;

	public Vol(int idVol, Date heureDepart, Date heureArrivee, Aeroport aeroportDepart, Aeroport aeroportArrivee,
			List<String> nomPassagers, int nombrePassagers, Avion avion, String place) {
		super();
		this.idVol = idVol;
		this.heureDepart = heureDepart;
		this.heureArrivee = heureArrivee;
		this.aeroportDepart = aeroportDepart;
		this.aeroportArrivee = aeroportArrivee;
		this.nomPassagers = nomPassagers;
		this.nombrePassagers = nombrePassagers;
		this.avion = avion;
		this.place = place;
	}

	// getters and setters:
	public int getIdVol() {
		return idVol;
	}

	public void setIdVol(int idVol) {
		this.idVol = idVol;
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

	public Aeroport getAeroportDepart() {
		return aeroportDepart;
	}

	public void setAeroportDepart(Aeroport aeroportDepart) {
		this.aeroportDepart = aeroportDepart;
	}

	public Aeroport getAeroportArrivee() {
		return aeroportArrivee;
	}

	public void setAeroportArrivee(Aeroport aeroportArrivee) {
		this.aeroportArrivee = aeroportArrivee;
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

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
}
