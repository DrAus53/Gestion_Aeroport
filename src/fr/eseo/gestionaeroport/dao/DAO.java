package fr.eseo.gestionaeroport.dao;

import java.sql.Connection;

import fr.eseo.gestionaeroport.controleur.baseDeDonnees.ConnexionBDD;

public abstract class DAO<T> {

	protected Connection conn = ConnexionBDD.connexion();

	public DAO(Connection conn) {
		this.conn = conn;
	}

	/**
	 * M�thode de cr�ation
	 * 
	 * @param obj
	 * @return boolean
	 */
	public abstract void create(T obj);

	/**
	 * M�thode pour effacer
	 * 
	 * @param obj
	 * @return boolean
	 */
	public abstract boolean delete(T obj);

	/**
	 * M�thode de mise � jour
	 * 
	 * @param obj
	 * @return boolean
	 */
	public abstract boolean update(T obj);

	/**
	 * M�thode de recherche des informations
	 * 
	 * @param id
	 * @return T
	 */
	public abstract T find(int id);
}
