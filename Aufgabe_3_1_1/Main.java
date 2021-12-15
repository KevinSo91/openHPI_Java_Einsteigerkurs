// In dieser Aufgabe geht es darum, sichtbare Attribute anderer Klassen auszugeben. Vorgegeben ist die Klasse Papagei.
// Diese Klasse enthält drei Attribute. Deine Aufgabe ist es, alle Attribute auf der Kommandozeile auszugeben, auf die du aus der Klasse Main heraus zugreifen kannst.
// Die Reihenfolge der Attribute ist dabei egal, jedes Attribut darf aber nur einmal ausgegeben werden. Gebe die Attribute in jeweils einer separaten Zeile aus.

package Aufgabe_3_1_1;

public class Main 
    {
        public static void main(String[] args) 
        {
            Papagei alex = new Papagei();
            // Gebe hier die Variablen aus:
            // System.out.println(alex.alter);
            System.out.println("Läuft...");
            System.out.println(alex.hungrig);
        }
    }