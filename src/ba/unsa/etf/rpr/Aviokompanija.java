package ba.unsa.etf.rpr;

import javax.naming.SizeLimitExceededException;
import javax.swing.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aviokompanija {
     private int maxLetovi;
     private ArrayList<Let> letovi=new ArrayList<>();


    public Aviokompanija(int maxLetovi) {
        this.maxLetovi = maxLetovi;
    }


    public void registrujLet(Aerodrom polazniAerodrom, Aerodrom dolazniAerodrom, LocalTime polazak, LocalTime dolazak, boolean brzi) throws SizeLimitExceededException {
        if(letovi.size()>=maxLetovi)
            throw new SizeLimitExceededException("Nema mjesta");
        if(brzi){
            letovi.add(new BrziLet(polazniAerodrom,dolazniAerodrom,polazak,dolazak));
        }
        else{
            letovi.add(new Let(polazniAerodrom,dolazniAerodrom,polazak,dolazak));
        }
    }

    public int brojLetova() {
        return letovi.size();
    }

    public Map<String, List<Let>> dolazniLetovi() {
        HashMap<String,List<Let>> novaMapa=new HashMap<>();
        for(Let l:letovi){
            String grad=l.getDolazniAerodrom().getGrad();
            if(!novaMapa.containsKey(grad))
                novaMapa.put(grad,new ArrayList<Let>());

            novaMapa.get(grad).add(l);

        }
return novaMapa;
    }
}
