package no.hvl.dat100.oppgave4;

import java.io.File;

import no.hvl.dat100.oppgave3.Blogg;

public class SkrivBlogg {
	private String mappe;
	private String filnavn;

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		try {
			File myFile = new File("Skrive blogg.txt");
			
			if (myFile.createNewFile()) {
				System.out.println("filen er opretta " + myFile.getName());
			} else {
				System.out.println("filen eksisterer allerede");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return true;
		
	}
}
