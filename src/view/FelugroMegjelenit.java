package view;

import javax.swing.JOptionPane;

public class FelugroMegjelenit {

    private int nezetSzam = 0;
    
    
    public FelugroMegjelenit() {
        
    }
    
    public String felugroMegj(){
        return JOptionPane.showInputDialog(null, "A - Autó adatainak megjelenítése"
                + "\nS - Autó átszínezése\nX - Extra hozzáadása (max 5)", "Autós program", 1);
    }
    
    public String szinezoNezet(){
        return JOptionPane.showInputDialog(null, "Fk - Fekete\nFh - Fehér\n"
                + "P - Piros\nZ - Zöld\nK - Kék", "Autó - átszínezés", 1);
        
    }
    
    
    
    public String autoAdat(String szoveg){
        return JOptionPane.showInputDialog(null, szoveg, "Autó - átszínezés", 1);
    }
    
    
    public int getNezetSzam() {
        return nezetSzam;
    }

    
}
