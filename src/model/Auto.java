package model;

import java.util.List;

public class Auto {
    
    private String rendszam;
    private String szin;
    private String[] extrak = new String[5];
    
    public Auto(String rendszam, String szin) {
        this.rendszam = rendszam;
        this.szin = szin;
        this.extrak[0] = "";
    }
    
    public void extratKer(String extra){
        int i = 0;
        while (this.extrak[i] != "") {            
            i++;
        }
        this.extrak[i] = extra;
    }

    public void atFest(String szinre){
        this.setSzin(szinre);
    }
    
    private void setSzin(String szin) {
        this.szin = szin;
    }
    
    public String getRendszam() {
        return rendszam;
    }

    public String getSzin() {
        return szin;
    }

    public String[] getExtrak() {
        return extrak;
    }
    
    
    
}
