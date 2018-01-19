package fr.eseo.gestionaeroport.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import fr.eseo.gestionaeroport.GestionAeroport;
import fr.eseo.gestionaeroport.modele.Utilisateur;

public class UtilisateurDAO extends DAO<Utilisateur> {

	public UtilisateurDAO(Connection conn) {
		super(conn);
	}

	public void create(Utilisateur obj) {

	}

	public void delete(Utilisateur obj) {

	}

	// Update l'utilisateur obj avec l'utilisateur obj1
	public void update(Utilisateur obj, Utilisateur obj1) {
		if (!obj.getPrenom().equals(obj1.getPrenom())) {
			try {
				this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
						.executeUpdate("UPDATE Utilisateur SET prenom='" + obj1.getPrenom() + "', adressemail='"
								+ obj1.getNom() + "'" + " WHERE prenom='" + obj.getPrenom() + "';");
			} catch (SQLException e) {
				GestionAeroport.getLogger().log(Level.INFO, e.toString());
			}

		}
		if (!obj.getNom().equals(obj1.getNom())) {
			try {
				this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
						.executeUpdate("UPDATE Utilisateur SET nom='" + obj1.getNom() + "', adressemail='"
								+ obj1.getAdresseMail() + "'" + " WHERE prenom='" + obj.getPrenom() + "';");
			} catch (SQLException e) {
				GestionAeroport.getLogger().log(Level.INFO, e.toString());
			}
		}

	}

	// Retourne la liste des utilisateurs dans la base de donnée ayant le même
	// prénom et nom
	public List<Utilisateur> find(Utilisateur obj) {
		List<Utilisateur> utilisateur = new ArrayList<Utilisateur>();
		try {
			ResultSet result = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeQuery("SELECT * FROM Utilisateur WHERE prenom=" + "'" + obj.getPrenom() + "'" + "AND nom="
							+ "'" + obj.getNom() + "';");
			while (result.next()) {
				utilisateur.add(new Utilisateur(result.getInt("idutilisateur"), result.getString("prenom"),
						result.getString("nom"), result.getString("motdepasse"), result.getString("login"),
						result.getString("adressemail")));
			}
		} catch (SQLException e) {
			GestionAeroport.getLogger().log(Level.INFO, e.toString());
		}
		return utilisateur;

	}

	@Override
	public Object[] affiche() {
		// TODO Auto-generated method stub
		return null;
	}

}
