package video_rental.model;

public enum MovieGenre {
	Action,
	Comedy,
	Drama,
	Fantasy,
	Horror,
	Mystery,
	Romance;
	
	public String getGenre() {
		
		return this.name();
	}
}
