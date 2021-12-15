package Java_Einstieg_2015_Woche4_Kapitel1_Aufgabe1;

public class Papagei {
    String name = "";
 
    public void setName(String name) {
        this.name = name;
    }   
    
    public String gibSatz() {
        return "Hallo, ich bin " + name;
    }
}