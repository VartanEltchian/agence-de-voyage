package Domain;

import java.util.List;

public class Pays {
	
	private String nomPays;
	private List <Hotels> listeHostels;
	private boolean afficher;
	
	
	
	
	

	public Pays(String nomPays, List<Hotels> listeHostels, boolean afficher) {
		super();
		this.nomPays = nomPays;
		this.listeHostels = listeHostels;
		this.afficher = afficher;
	}

	public boolean isAfficher() {
		return afficher;
	}

	public void setAfficher(boolean afficher) {
		this.afficher = afficher;
	}

	public Pays(String nomPays, List<Hotels> listeHostels) {
		super();
		this.nomPays = nomPays;
		this.listeHostels = listeHostels;
	}

	public Pays() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pays(String nomPays) {
		super();
		this.nomPays = nomPays;
	}

	public String getNomPays() {
		return nomPays;
	}

	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	public List<Hotels> getListeHostels() {
		return listeHostels;
	}

	public void setListeHostels(List<Hotels> listeHostels) {
		this.listeHostels = listeHostels;
	}
	
	

}
