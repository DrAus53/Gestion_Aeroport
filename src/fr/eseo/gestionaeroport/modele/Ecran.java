package fr.eseo.gestionaeroport.modele;

public class Ecran {
public int idEcran;
public Manifeste manifeste;

public int getIdEcran() {
	return idEcran;
}

public void setIdEcran(int idEcran) {
	this.idEcran = idEcran;
}

public Manifeste getManifeste() {
	return manifeste;
}

public void setManifeste(Manifeste manifeste) {
	this.manifeste = manifeste;
}

public Ecran(int idEcran, Manifeste manifeste) {
	super();
	this.idEcran = idEcran;
	this.manifeste = manifeste;
}

public void creer() {
	
}
public void afficher() {
	
}
public void modifier() {
	
}
public void supprimer() {
	
}

}
