package Java_Einstieg_2015_Woche3_Kapitel3_Aufgabe3;

public class Papagei extends Vogel
{
// Achtung: bitte nutzt in dieser Klasse die Variable geraeusch, falls diese geerbt wurde. Das Setzen der Variable kann zum Beispiel im Konstruktor geschehen. Schaut euch eventuell die Klasse Vogel an, um ein Beispiel für solch eine Zuweisung zu haben.
    
    private String name;
    
    
    public Papagei()
    {
        //private String name = "";
        this.geraeusch = "Mein Name ist" + this.name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }
}