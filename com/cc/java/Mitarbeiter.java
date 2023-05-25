package com.cc.java;

public class Mitarbeiter {
    private String familyName;
    private String firstName;
    private String role;
    private int yearOfEntry;

    public Mitarbeiter(String familyName, String firstName, String role, int yearOfEntry) {
        this.familyName = familyName;
        this.firstName = firstName;
        this.role = role;
        this.yearOfEntry = yearOfEntry;
    }

    public String getInfo(String... fields) {      // Variable Anzahl von Argumenten
        StringBuilder sb = new StringBuilder();
        for (String field : fields) {              // Schleife für alle Felder
            switch (field) {
                case "name":
                    sb.append(this.familyName).append(" ");
                    break;
                case "vorname":
                    sb.append(this.firstName).append(" ");
                    break;
                case "funktion":
                    sb.append(this.role).append(" ");
                    break;
                case "eintrittsjahr":
                    sb.append(this.yearOfEntry).append(" ");
                    break;
                default:
                    sb.append("Das passt hier nicht!").append(" ");
                    break;
            }
        }
        return sb.toString();
    }
}