package fr.eseo.gestionaeroport.dao;

import java.sql.Connection;
import java.util.List;

import fr.eseo.gestionaeroport.controleur.baseDeDonnees.ConnexionBDD;

public abstract class DAO<T> {

	protected Connection conn = ConnexionBDD.connexion();

	public DAO(Connection conn) {
		this.conn = conn;
	}

	/**
	 * Méthode de création
	 * 
	 * @param obj
	 * 
	 */
	public abstract void create(T obj);

	/**
	 * Méthode pour effacer
	 * 
	 * @param obj
	 * @return boolean
	 */
	public abstract void delete(T obj);

	/**
	 * Méthode de mise à jour
	 * 
	 * @param obj1
	 * @return boolean
	 */
	public abstract void update(T obj, T obj1);

	/**
	 * Méthode de recherche des informations
	 * 
	 * @param id
	 * @return T
	 */
	public abstract List<T> find(T obj);

	/**
	 * Méthode de recherche de toutes les informations
	 * 
	 * @return T
	 */
	public abstract Object[] affiche();
}
