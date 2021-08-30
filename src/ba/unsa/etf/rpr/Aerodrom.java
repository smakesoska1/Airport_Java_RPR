package ba.unsa.etf.rpr;

public class Aerodrom {
    private String nazivAerodroma,grad,sifra;
    private double sirina,duzina;

    public Aerodrom(String nazivAerodroma, String grad, String sifra, double sirina, double duzina) {
        this.nazivAerodroma = nazivAerodroma;
        this.grad = grad;
        this.sifra = sifra;
        this.sirina = sirina;
        this.duzina = duzina;
    }


    public String getNazivAerodroma() {
        return nazivAerodroma;
    }

    public void setNazivAerodroma(String nazivAerodroma) {
        this.nazivAerodroma = nazivAerodroma;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        
    }

    public double getSirina() {
        return sirina;
    }

    public void setSirina(double sirina) {
        this.sirina = sirina;
    }

    public double getDuzina() {
        return duzina;
    }

    public void setDuzina(double duzina) {
        this.duzina = duzina;
    }


}
