package Domain;


public class Reservat {
	
	private Hotels hotel;
	private int nbjours;
	public Reservat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reservat(Hotels hotel, int nbjours) {
		super();
		this.hotel = hotel;
		this.nbjours = nbjours;
	}
	public Hotels getHotel() {
		return hotel;
	}
	public void setHotel(Hotels hotel) {
		this.hotel = hotel;
	}
	public int getNbjours() {
		return nbjours;
	}
	public void setNbjours(int nbjours) {
		this.nbjours = nbjours;
	}
	
	

}
