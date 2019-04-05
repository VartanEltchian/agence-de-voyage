package Domain;

public class Reservation extends Hotels {
	
	private int id;
	private String date_debut;
	private String date_fin;
	private int prix;
	private Hotels hotel;
	
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*public Reservation(String nomPays, String adresse, String nom, String telephone, int prixnuit) {
		super(nomPays, adresse, nom, telephone, prixnuit);
		// TODO Auto-generated constructor stub
	}
	
	public Reservation(String nomPays, String nom, int id, String date_debut, String date_fin, int prix, Hotels hotel) {
		super(nomPays, nom);
		this.id = id;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.prix = prix;
		this.hotel = hotel;
	}
	*/
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
	
	
	
	

}
