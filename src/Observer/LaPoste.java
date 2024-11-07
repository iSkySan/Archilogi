package Observer;

import java.util.HashSet;

public class LaPoste {
    private HashSet<BoiteALettre> abonnes= new HashSet<BoiteALettre>();

   public void subscribe(BoiteALettre boite) {
        abonnes.add(boite);
    }
   public boolean unsubscribe(BoiteALettre boite) {
        return  abonnes.remove(boite);
    }
  public  void publish(String message) {
        for (BoiteALettre boite : abonnes) {

            boite.update(message);
        }
    }

}
