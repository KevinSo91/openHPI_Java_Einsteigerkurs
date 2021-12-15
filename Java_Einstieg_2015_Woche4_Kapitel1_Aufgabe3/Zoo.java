package Java_Einstieg_2015_Woche4_Kapitel1_Aufgabe3;
import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {
    // Lege hier das Attribut tiere an:
    HashMap<String,ArrayList<Object>> tiere = new HashMap<>();
    
    public Zoo() {
        Papagei alex = new Papagei();
        alex.setName("Alex");
        Papagei jaspar = new Papagei();
        jaspar.setName("Jaspar");
        Papagei kiki = new Papagei();
        kiki.setName("Kiki");
        Pinguin tux = new Pinguin();
        tux.setName("Tux");
        Pinguin nestor = new Pinguin();
        nestor.setName("Nestor");
        
        // Fuelle hier die Listen und die Map
        ArrayList<Papagei> papageien = new ArrayList<>();
        papageien.add(alex);
        papageien.add(jaspar);
        papageien.add(kiki);        
        ArrayList<Pinguin> pinguine = new ArrayList<>();
        pinguine.add(tux);
        pinguine.add(nestor);
        tiere.put("Papagei", papageien);
        tiere.put("Pinguine", pinguine);

    }

    public static void main(String args[]) {
        Zoo zoo = new Zoo();
        System.out.println("Im Zoo leben " + zoo.getTiere().size() + " Arten.");
        System.out.println("Es gibt " + zoo.getTiere().get("Pinguin").size() + " Pinguine");
        System.out.println("und " + zoo.getTiere().get("Papagei").size() + " Papageien.");
    }

    public HashMap<String, ArrayList<Object>> getTiere() {
        return tiere;
    }
}