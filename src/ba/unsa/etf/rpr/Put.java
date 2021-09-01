package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.function.Function;

public class Put implements Comparable<Put> {
    private ArrayList<Let> letovi;
    public Put() {
        letovi = new ArrayList<>();
    }

    public Put(Let l) {
        letovi = new ArrayList<Let>();
        letovi.add(l);
    }

    public ArrayList<Let> getLetovi() {
        return letovi;
    }

    public void setLetovi(ArrayList<Let> letovi) {
        this.letovi = letovi;
    }

    public void push(Let l) { letovi.add(l); }
    public void pushFront(Let l) { letovi.add(0, l); }

    public void pop() { letovi.remove(letovi.size()-1); }

    public Let first() { return letovi.get(0); }
    public Let last() { return letovi.get(letovi.size()-1); }

    // Sumiraj letove po funkciji f, koristi se zbog zadatka sa lambdom
    public Double suma(Function<Let, Double> f) {
        Double rezultat = 0.0;
        for(Let l : letovi) rezultat += f.apply(l);
        return rezultat;
    }


    public double ukupnaDuzina() {
        double rezultat = 0;
        for(Let l : letovi) rezultat += l.duzinaLeta();
        return rezultat;
    }

    @Override
    public int compareTo(Put sl) {
        double d = this.ukupnaDuzina();
        double d2 = sl.ukupnaDuzina();
        if (d < d2) return -1;
        if (d > d2) return 1;
        return 0;
    }

}



