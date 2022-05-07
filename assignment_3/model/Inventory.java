package video_rental.model;

public class Inventory {
	DVD [] dvdsammlung;
	CD [] cdsammlung;
	int anzahldvd ;
	int anzahlcd ;
	
	public Inventory() {
		
		dvdsammlung = new DVD[10];
		cdsammlung = new CD[10];
		anzahldvd = 0;
		anzahlcd = 0;
	}
	
	public void addDVD(DVD item) {
		
		if(anzahldvd < 10) {
			dvdsammlung[anzahldvd] = item;
			
			anzahldvd++;
		}
		
	}
	
	public void addCD(CD item) {
		if(anzahlcd < 10) {
			cdsammlung[anzahlcd] = item;
			
			anzahlcd++;
		}
		
	}
	public DVD[] getDVDs() {
		
		return dvdsammlung;
	}
	
	
	public CD[] getCDs() {
		
		return cdsammlung;
	}
	
	public String str() {
		
		String result = "Inventar:";
		
		String dvds="DVDs:\n";
		
		for(int i  = 0 ; i < anzahldvd ; i++) {
			DVD eine = dvdsammlung[i];
			
			dvds = dvds+eine.str()+"\n";
		}
		
		String cds="CDs:\n";
		
		for(int i  = 0 ; i < anzahldvd ; i++) {
			CD eine = cdsammlung[i];
			
			cds = cds+eine.str()+"\n";
		}
		
		result = result + dvds + cds;
		
		return result;
		
	}
	
}
