package Beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import Domain.Hotels;
import Domain.Pays;
import Domain.Reservat;
import Beans.CalendarView;


@ManagedBean
public class MonBean {
	
	private List <Pays> listePays ;
	
	private List <Hotels> listeHostels;
	
	private boolean afficher;
	
	private Reservat res;
	
	
	
	private CalendarView Range;
	
	
	
	
	public CalendarView getRange() {
		return Range;
	}


	public void setRange(CalendarView range) {
		Range = range;
	}


//	public int getNbjours() {
//		return nbjours;
//	}
//
//
//	public void setNbjours(int nbjours) {
//		this.nbjours = nbjours;
//	}


	public Reservat getRes() {
		return res;
	}


	public void setRes(Reservat res) {
		this.res = res;
	}


	public boolean isAfficher() {
		return afficher;
	}


	public void setAfficher(boolean afficher) {
		this.afficher = afficher;
	}


	public List<Hotels> getListeHostels() {
		return listeHostels;
	}


	public void setListeHostels(List<Hotels> listeHostels) {
		this.listeHostels = listeHostels;
	}


	public List<Pays> getListePays() {
		return listePays;
	}


	public void setListePays(List<Pays> listePays) {
		this.listePays = listePays;
	}


	/*
	public List<Pays> getListePays() {
		return listePays;
	}

	public void setListePays(List<Pays> listePays) {
		this.listePays = listePays;
	}
*/
	@PostConstruct
	public void init () {
		
		
		Pays p1 = new Pays();
		List <Hotels> listeHostels1 = new <Hotels> ArrayList() ;
		listeHostels1.add(new Hotels("chemin de terre","francois", "888210545", 5));
		listeHostels1.add(new Hotels("grand chemin","claude", "11054545", 10));
		p1.setNomPays("Portugual");
		p1.setListeHostels(listeHostels1);
		
		Pays p2 = new Pays();
		List <Hotels> listeHostels2 = new <Hotels> ArrayList() ;
		listeHostels2.add(new Hotels("avenue bla","matra", "210545", 215));
		listeHostels2.add(new Hotels("avenue dupont","frank", "00054545", 4581));
		p2.setNomPays("Russie");
		p2.setListeHostels(listeHostels2);
		
		Pays p3 = new Pays();
		List <Hotels> listeHostels3 = new <Hotels> ArrayList() ;
		listeHostels3.add(new Hotels("rue principale","hotelll", "021545", 15));
		listeHostels3.add(new Hotels("rue secondaire","momostelll", "54545", 81));
		
		p3.setNomPays("Chine");
		p3.setListeHostels(listeHostels3);
		
		listePays = new <Pays> ArrayList() ;
		listePays.add(p1);
		listePays.add(p2);
		listePays.add(p3);
		
		
		
		
	
	
	
	}
	
	public void changerafficher (Pays payschoisi) 
	{
		
		payschoisi.setAfficher(true);
		
		
	}
	
	
	
	public void hotelselec (Hotels hotelchoisi) 
	{
		res.setHotel(hotelchoisi);
		
	}
	
	
	
	
	
	
	
	

	
	

}
