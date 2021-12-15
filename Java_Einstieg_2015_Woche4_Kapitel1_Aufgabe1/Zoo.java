package Java_Einstieg_2015_Woche4_Kapitel1_Aufgabe1;

import java.util.ArrayList;

public class Zoo {
    // Lege hier das Attribut papageien an:
    ArrayList <Papagei> papageien = new ArrayList<>();
    
    public Zoo() {
        Papagei alex = new Papagei();
        alex.setName("Alex");
        Papagei jaspar = new Papagei();
        jaspar.setName("Jaspar");
        Papagei kiki = new Papagei();
        kiki.setName("Kiki");
        // Fuelle hier die Liste
        papageien.add(alex);
        papageien.add(jaspar);
        papageien.add(kiki);
    }
    
    public ArrayList<Papagei> getPapageien() {
        return papageien;
    }
    
    public static void main(String args[]) {
        Zoo zoo = new Zoo();
        for (int i = 0; i < zoo.getPapageien().size(); i++) {
            System.out.println(zoo.getPapageien().get(i).gibSatz());
        }
    }
}