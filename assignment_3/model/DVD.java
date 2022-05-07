package video_rental.model;

/**
 * Diese Klasse ist DVD Klasse für Speichrung der DVDS Informationen
 * @author Yazan Alkhatib &lt;yazan.khatib.sy@gmail.com&gt;
 * @version 03.05.2022
 */
public class DVD {
	/**Titel des DVDS*/
	private String titel;
	private double verleihpreis;
	private boolean isAngebot = false;
	private double rebattpreis ;
	private FSKRating fskinfo;
	private MovieGenre moviegenre;
	private boolean isaus = false ;
	
	/**
	 * @author Yazan Alkhatib &lt;yazan.khatib.sy@gmail.com&gt;
	 * @return die Typ der Movie
	 */
	public MovieGenre getMoviegenre() {
		return moviegenre;
	}
	/**
	 * @author Yazan Alkhatib &lt;yazan.khatib.sy@gmail.com&gt;
	 * @param moviegenre typ der Movie
	 */
	public void setMoviegenre(MovieGenre moviegenre) {
		this.moviegenre = moviegenre;
	}

	public DVD(String titel, double verleihpreis, boolean isAngebot, double rebattpreis,MovieGenre moviegenre ,FSKRating fsk) {
		this.titel = titel;
		this.verleihpreis = verleihpreis;
		this.isAngebot = isAngebot;
		this.rebattpreis = rebattpreis;
		this.fskinfo = fsk;
		this.moviegenre = moviegenre;
	}
	
	public DVD(String titel, double verleihpreis) {
		this.titel = titel;
		this.verleihpreis = verleihpreis;
		this.rebattpreis = verleihpreis;
		this.fskinfo = FSKRating.FSK0;
	}
	
	
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}

	public void setVerleihpreis(double verleihpreis) {
		if(verleihpreis >= 0) {
			this.verleihpreis = verleihpreis;
		}
	}
	
	public void setAngebot(boolean isAngebot) {
		this.isAngebot = isAngebot;
	}
	
	public void setRebattpreis(double rebattpreis) {
		if(isAngebot == true && rebattpreis < verleihpreis) {
			this.rebattpreis = rebattpreis;
		}
	}
	
	public String getTitle() {
		
		return titel;
	}
	
	public double getPrice() {
		
		if(isAngebot == true) {
			
			return rebattpreis;
		}
		
		else return verleihpreis;
	}
	
	public FSKRating getfsk(){
		return fskinfo;
	}
	
	public void setIsaus(boolean isaus) {
		this.isaus = isaus;
	}
	public boolean Isaus() {
		return isaus;
	}
	
	public String str() {
		
		return "[DVD: "+getTitle()+" , "+getPrice()+"Euro]";
		
	}
	
	
	
	
	
	
	
}
