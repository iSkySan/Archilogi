package Mediator;

import java.util.ArrayList;

public abstract class  TourDeControle implements Mediator{

    private ArrayList<Appareil> appareils = new ArrayList<Appareil>();

    public void addAppareil(Appareil appareil){
        appareils.add(appareil);
    }

    public void notify(Appareil appareil){

        }
    }

    public String toString(){
        String str = "";
        for(Appareil appareil : appareils){
            str += appareil.toString() + "\n";
        }
        return str;
    }

    public void removeAppareil(Appareil appareil){
        appareils.remove(appareil);
    }



}
