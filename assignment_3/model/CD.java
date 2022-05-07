package video_rental.model;



public class CD {
	private String titel;
	private double verleihpreis;
	private boolean isAngebot = false;
	private double rebattpreis ;
	private boolean isaus = false ;
	private ItemGenre itemgenre;
	private boolean explicitLabel;
	
	
	

	
	public CD(String titel, double verleihpreis, boolean isAngebot, double rebattpreis,ItemGenre itemg,boolean explicitLabel) {
		this.titel = titel;
		this.verleihpreis = verleihpreis;
		this.isAngebot = isAngebot;
		this.rebattpreis = rebattpreis;
		this.explicitLabel = explicitLabel;
		this.itemgenre = itemg;
	}
	
	public CD(String titel, double verleihpreis) {
		this.titel = titel;
		this.verleihpreis = verleihpreis;
		this.rebattpreis = verleihpreis;
		this.explicitLabel = false;
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
	
	public void setIsaus(boolean isaus) {
		this.isaus = isaus;
	}
	public boolean Isaus() {
		return isaus;
	}
	
	public boolean isExplicitLabel() {
		return explicitLabel;
	}

	public void setExplicitLabel(boolean explicitLabel) {
		this.explicitLabel = explicitLabel;
	}

	
	public String str() {
		
		return "[CD: "+getTitle()+" , "+getPrice()+"Euro]";
		
	}
	
}
