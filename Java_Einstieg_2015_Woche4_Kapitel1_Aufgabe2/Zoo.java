package Java_Einstieg_2015_Woche4_Kapitel1_Aufgabe2;

import java.util.HashMap;

public class Zoo {
    // Lege hier das Attribut papageien an:
    HashMap<String, Papagei> papageien = new HashMap<>();
    
    public Zoo() {
        Papagei alex = new Papagei();
        alex.setName("Alex");
        Papagei jaspar = new Papagei();
        jaspar.setName("Jaspar");
        Papagei kiki = new Papagei();
        kiki.setName("Kiki");
        // Fuelle hier die Map
        papageien.put("Alex", alex);
        papageien.put("Jaspar", jaspar);
        papageien.put("Kiki", kiki);
    }
    
    public HashMap getPapageien() {
        return papageien;
    }
    
    public static void main(String args[]) {
        Zoo zoo = new Zoo();
        if (zoo.getPapageien().get("Alex") != null) {
            System.out.println("Es gibt einen Papagei mit dem Namen Alex");
        }
        if (zoo.getPapageien().get("Berta") == null) {
            System.out.println("Im Zoo lebt kein Papagei mit den Namen Berta");
        }
    }
}