package video_rental;

import video_rental.model.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inventory inv = new Inventory();
		//DVD(String titel, double verleihpreis, boolean isAngebot, double rebattpreis,FSKRating fsk)
		//public DVD(String titel, double verleihpreis, boolean isAngebot, double rebattpreis,MovieGenre moviegenre ,FSKRating fsk)
		DVD dvd1 = new DVD("DVD1", 12.24, false, 12.24,MovieGenre.Action , FSKRating.FSK12);
		DVD dvd2 = new DVD("DVD2", 15.12, false, 15.12,MovieGenre.Action,FSKRating.FSK16);
		DVD dvd3 = new DVD("DVD3", 54.54, true, 40.24,MovieGenre.Action ,FSKRating.FSK18);
		DVD dvd4 = new DVD("DVD4", 65.41, false, 65.41,MovieGenre.Action ,FSKRating.FSK6);
		DVD dvd5 = new DVD("DVD5", 65.14, true, 59.24,MovieGenre.Action,FSKRating.FSK0);
		DVD dvd6 = new DVD("DVD6", 11.43, false, 11.43,MovieGenre.Action,FSKRating.FSK0);
		DVD dvd7 = new DVD("DVD7", 87.45, false, 87.45,MovieGenre.Action,FSKRating.FSK12);
		DVD dvd8 = new DVD("DVD8", 47.29, false, 47.29,MovieGenre.Action,FSKRating.FSK0);
		DVD dvd9 = new DVD("DVD9", 14.68, false, 14.68,MovieGenre.Action,FSKRating.FSK16);
		DVD dvd10 = new DVD("DVD10", 69.36, false,  69.36,MovieGenre.Action,FSKRating.FSK6);
		
		// CD(String titel, double verleihpreis, boolean isAngebot, double rebattpreis,boolean explicitLabel)
		CD cd1 = new CD("CD1", 15.14,true,12.14,ItemGenre.Jazz,false);
		CD cd2 = new CD("CD2", 12.43,false,12.43,ItemGenre.Jazz,false);
		CD cd3 = new CD("CD3", 17.98,false,17.98,ItemGenre.Jazz,false);
		CD cd4 = new CD("CD4", 19.31,false,19.31,ItemGenre.Jazz,true);
		CD cd5 = new CD("CD5", 40.14,true,40.10,ItemGenre.Jazz,false);
		CD cd6 = new CD("CD6", 13.22,false,13.22,ItemGenre.Jazz,false);
		CD cd7 = new CD("CD7", 12.24,false,12.24,ItemGenre.Jazz,false);
		CD cd8 = new CD("CD8", 18.28,false,18.28,ItemGenre.Jazz,false);
		CD cd9 = new CD("CD9", 11.8,false,11.8,ItemGenre.Jazz,true);
		CD cd10 = new CD("CD10", 8.12,true,7.12,ItemGenre.Jazz,false);
		
		
		DVD [] dvds = {dvd1,dvd2,dvd3,dvd4,dvd5,dvd6,dvd7,dvd8,dvd9,dvd10};
		CD [] cds = {cd1,cd2,cd3,cd4,cd5,cd6,cd7,cd8,cd9,cd10};
		for (DVD dvd:dvds) {
			inv.addDVD(dvd);
		}
		for (CD cd:cds) {
			inv.addCD(cd);
		}
		
		System.out.println(inv.str());
		
		//Customer(String vorname , String nachname , int alter)
		Customer cust = new Customer("Egal" , "nachEgal",18);
		cust.ausleihenDVD(dvd1);
		cust.ausleihenDVD(dvd2);
		cust.ausleihenDVD(dvd3);
		cust.ausleihenCD(cd1);
		cust.ausleihenCD(cd2);
		cust.ausleihenCD(cd9);
		
		
		
		
		
		
	}

}
