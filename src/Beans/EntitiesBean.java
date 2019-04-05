package Beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import Domain.Hotels;

@ManagedBean
public class EntitiesBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String adresse;
	private String nom;
	private String telephone;
	private int prixnuit;
	private String nomPays;
	private int id;
	private String date_debut;
	private String date_fin;
	private int prix;
	private Hotels hotel;
	private List <Hotels> listeHostelspays = new ArrayList();
	
	//Pays p = new Pays();
	
	//listeHostelspays.add(new Hotels ("Portugual","rue du port","super","0577889944",12));
	//listeHostelspays.add(new Hotels ("Portugual","rue du lllt","srio","05714",222));
	//listeHostelspays.add(new Hotels ("Portugual","rue du dosse","palat","12145454",21));
	
	public EntitiesBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EntitiesBean(String adresse, String nom, String telephone, int prixnuit, String nomPays, int id,
			String date_debut, String date_fin, int prix, Hotels hotel, List<Hotels> listeHostels) {
		super();
		this.adresse = adresse;
		this.nom = nom;
		this.telephone = telephone;
		this.prixnuit = prixnuit;
		this.nomPays = nomPays;
		this.id = id;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.prix = prix;
		this.hotel = hotel;
		//this.listeHostels = listeHostels;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getPrixnuit() {
		return prixnuit;
	}

	public void setPrixnuit(int prixnuit) {
		this.prixnuit = prixnuit;
	}

	public String getNomPays() {
		return nomPays;
	}

	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(String date_debut) {
		this.date_debut = date_debut;
	}

	public String getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(String date_fin) {
		this.date_fin = date_fin;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public Hotels getHotel() {
		return hotel;
	}

	public void setHotel(Hotels hotel) {
		this.hotel = hotel;
	}
/*
	public List<Hotels> getListeHostels() {
		return listeHostels;
	}

	public void setListeHostels(List<Hotels> listeHostels) {
		this.listeHostels = listeHostels;
	}*/

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
