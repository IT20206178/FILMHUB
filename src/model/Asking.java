package model;

public class Asking {
	//assign variables
	private int id;
	private String uname;
	private String uid;
	private String phone;
	private String film;
	private String date;
	
	//overload constructor
	public Asking(int id, String uname, String uid, String phone, String film, String date) {
		
		//pass parameter values to the variables
		this.id = id;
		this.uname = uname;
		this.uid = uid;
		this.phone = phone;
		this.film = film;
		this.date = date;
	}
	
	//getters
	public int getId() {
		return id;
	}
	
	public String getUname() {
		return uname;
	}
	
	public String getUid() {
		return uid;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getFilm() {
		return film;
	}
	
	public String getDate() {
		return date;
	}
	
	
}



