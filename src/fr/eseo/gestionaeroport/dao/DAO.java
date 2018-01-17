package fr.eseo.gestionaeroport.dao;

import java.sql.Connection;

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
	 * @return boolean
	 */
	public abstract void create(T obj);

	/**
	 * Méthode pour effacer
	 * 
	 * @param obj
	 * @return boolean
	 */
	public abstract boolean delete(T obj);

	/**
	 * Méthode de mise à jour
	 * 
	 * @param obj
	 * @return boolean
	 */
	public abstract boolean update(T obj);

	/**
	 * Méthode de recherche des informations
	 * 
	 * @param id
	 * @return T
	 */
	public abstract T find(int id);
}
