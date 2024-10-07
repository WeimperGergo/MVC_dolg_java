package controller;

import model.ProgramModell;
import model.Auto;
import view.FelugroMegjelenit;

public class AutosController {
        private ProgramModell prg;
        private final FelugroMegjelenit megj;
    public AutosController() {
        prg = new ProgramModell();
        megj = new FelugroMegjelenit();
        
        String beker = megj.felugroMegj();
        if(beker == "A"){
            megj.autoAdat(autoAdatok(prg.a1));
        }
        else if(beker == "S"){
            megj.szinezoNezet();
        }
        else if(beker == "X"){
            // Extra logikája...
        }
        
    }
    
    public String autoAdatok(Auto auto){
        //szinEllenoriz();
        return "Rendszám: " + auto.getRendszam() + "\nSzín: " ;
    }
    
    public String szinEllenoriz(String ertek){
        switch (ertek) {
            case "Fh":
                return "fehér";
            case "P":
                return "piros";
            case "Z":
                return "zöld";
            case "K":
                return "kék";
            default:
                return "fekete";
        }
    }
    
    
}
