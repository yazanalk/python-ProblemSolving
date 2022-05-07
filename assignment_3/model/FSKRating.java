package video_rental.model;

public enum FSKRating {
	FSK0,
	FSK6,
	FSK12,
	FSK16,
	FSK18;
	
	public String getFSK() {
		
		return this.name();
	}
	
	public boolean darfAuslehen(int alter) {
		switch(this) {
			case FSK0:
				return true;
			case FSK6:
				if(alter >=6) return true;
				break;
			case FSK12:
				if(alter >=12) return true;
				break;
			case FSK16:
				if(alter >=16) return true;
				break;
			case FSK18:
				if(alter >=18) return true;
				break;
		}	
		
		return false;
	}
}
