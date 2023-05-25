package com.cc.java;

public class App {

	public static void main(String[] args) {
        Mitarbeiter mitarbeiter1 = new Mitarbeiter("Dampf", "Hans", "Entwickler", 2021);
        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Ming", "Phil", "Designer", 2022);
        Mitarbeiter mitarbeiter3 = new Mitarbeiter("Sauer", "Siggi", "Hausmeister", 2023);

        output(mitarbeiter1.getInfo("vorname", "name")); 
        output(mitarbeiter2.getInfo("vorname", "name", "funktion")); 
        output(mitarbeiter3.getInfo( "vorname", "name", "funktion", "eintrittsjahr")); 
    }


	private static void output(String outStr) {
		System.out.println(outStr);
	}


}