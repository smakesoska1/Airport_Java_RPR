package ba.unsa.etf.rpr;

import java.time.LocalTime;

public class Let {
    private Aerodrom dolazniAerodrom;
    private Aerodrom polazniAerodrom;
    private LocalTime vrijemePolaska,vrijemeDolaska;

    public Let(Aerodrom polazniAerodrom, Aerodrom dolazniAerodrom, LocalTime vrijemePolaska, LocalTime vrijemeDolaska) {
        this.polazniAerodrom = polazniAerodrom;
        this.dolazniAerodrom = dolazniAerodrom;

        this.vrijemePolaska = vrijemePolaska;
        this.vrijemeDolaska = vrijemeDolaska;
    }


    public Aerodrom getDolazniAerodrom() {
        return dolazniAerodrom;
    }

    public void setDolazniAerodrom(Aerodrom dolazniAerodrom) {
        this.dolazniAerodrom = dolazniAerodrom;
    }

    public Aerodrom getPolazniAerodrom() {
        return polazniAerodrom;
    }

    public void setPolazniAerodrom(Aerodrom polazniAerodrom) {
        this.polazniAerodrom = polazniAerodrom;
    }

    public LocalTime getVrijemePolaska() {
        return vrijemePolaska;
    }

    public void setVrijemePolaska(LocalTime vrijemePolaska) {
        this.vrijemePolaska = vrijemePolaska;
    }

    public LocalTime getVrijemeDolaska() {
        return vrijemeDolaska;
    }

    public void setVrijemeDolaska(LocalTime vrijemeDolaska) {
        this.vrijemeDolaska = vrijemeDolaska;
    }


    public int trajanje() {
        int rezultat=(vrijemeDolaska.getHour()-vrijemePolaska.getHour())*60+(vrijemeDolaska.getMinute()-vrijemePolaska.getMinute());
        return rezultat;
    }

    public double duzinaLeta() {
        return Math.sqrt((dolazniAerodrom.getDuzina()-polazniAerodrom.getDuzina())*(dolazniAerodrom.getDuzina()-polazniAerodrom.getDuzina())+(dolazniAerodrom.getSirina()-polazniAerodrom.getSirina())*(dolazniAerodrom.getSirina()-polazniAerodrom.getSirina()));
    }
}