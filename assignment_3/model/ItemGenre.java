package video_rental.model;

public enum ItemGenre {
	Klassik,
	Jazz,
	Pop,
	Rock,
	HipHop,
	Rap,
	Techno,
	Schlager;
	
	public String getGenre() {
		
		return this.name();
	}
	
	
}
