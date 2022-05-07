package video_rental.model;

public class Customer {
	private String vorname;
	private String nachname;
	private int alter;
	private int kn;
	private static int act_kn = 1;
	private DVD [] dvds;
	private CD [] cds;
	private int dvdindex = 0;
	private int cdindex = 0;
	
	

	public Customer(String vorname , String nachname , int alter) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
		dvds = new DVD[10];
		cds = new CD[10];
		
		this.kn = act_kn;
		act_kn++;
		
	}
	
	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public int getKn() {
		return kn;
	}

	public void setKn(int kn) {
		this.kn = kn;
	}
	
	public void ausleihenDVD(DVD dvd) {
		if(dvd.Isaus() == false && dvd.getfsk().darfAuslehen(alter) == true) {
			dvds[dvdindex] = dvd;
			dvdindex++;
		}
		else {
			System.out.println(dvd.getTitel()+" kann nicht ausgeliehen werden");
		}
	}
	
	public void ausleihenCD(CD cd) {
		if(cd.Isaus() == false) {
			if(cd.isExplicitLabel() == true && alter < 18) {
				System.out.println(cd.getTitel()+" kann nicth azsgeleiehen werden");
				return;
			}
			
			cds[cdindex] = cd;
			cdindex++;
		}
		else {
			System.out.println(cd.getTitel()+" kann nicht augeliehen werden");	
		}
	}
	
	public void zuruckDVD(DVD dvd) {
		for(int i = 0 ; i <dvds.length ; i++) {
			//3
			if(dvd  == dvds[i]) {
				for(int j = i + 1 ; j < dvds.length ; j++) {
					dvds[j - 1] = dvds[j];
				}
				dvds[dvds.length - 1] = null;
			}
		}
		
	}
	
	public void zuruckCD(CD cd) {
		for(int i = 0 ; i <cds.length ; i++) {
			//3
			if(cd  == cds[i]) {
				for(int j = i + 1 ; j < cds.length ; j++) {
					cds[j - 1] = cds[j];
				}
				cds[cds.length - 1] = null;
			}
		}
		
	}
	
}
