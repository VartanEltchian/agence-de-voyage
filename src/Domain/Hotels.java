package Domain;

public class Hotels {
	
	private String adresse;
	private String nom;
	private String telephone;
	private int prixnuit;
	
	public Hotels() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	/*
	public Hotels(String nomPays, String nom) {
		super(nomPays);
		this.nom = nom;
	}

*/

	public Hotels(String adresse, String nom, String telephone, int prixnuit) {
		super();
		this.adresse = adresse;
		this.nom = nom;
		this.telephone = telephone;
		this.prixnuit = prixnuit;
	}





	/*
	public Hotels(String nomPays, String adresse, String nom, String telephone, int prixnuit) {
		super(nomPays);
		this.adresse = adresse;
		this.nom = nom;
		this.telephone = telephone;
		this.prixnuit = prixnuit;
	}
*/
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
	
	
	
	
	
	

}
