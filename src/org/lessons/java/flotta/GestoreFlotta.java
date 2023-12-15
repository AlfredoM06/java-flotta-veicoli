package org.lessons.java.flotta;

import java.util.ArrayList;
import java.util.List;


public class GestoreFlotta {
    private List<Veicolo> veicoli;

    public GestoreFlotta() {
        veicoli = new ArrayList<>();
    }



    public void addVeicolo (Veicolo veicolo) {
        veicoli.add(veicolo);


    }

    public int getNumeroAuto(){
        int contatore = 0;
        for (Veicolo veicolo : veicoli){
            if(veicolo instanceof Automobile){
                contatore++;
            }
        }
        return contatore;
    }

    public int getNumeroMoto(){

        int contatore = 0;
        for(Veicolo veicolo : veicoli){
            if(veicolo instanceof Motocicletta){
            contatore++;
        }
    }
    return contatore;
    }


    public Veicolo findPlate (String plate){
        for (Veicolo veicolo : veicoli){
            if (veicolo.getPlate().equals(plate) ){
                return veicolo;
            }
        }
        return null;
    }
}
