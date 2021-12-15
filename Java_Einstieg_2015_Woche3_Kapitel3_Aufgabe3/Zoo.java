package Java_Einstieg_2015_Woche3_Kapitel3_Aufgabe3;

/*
In dieser Aufgabe soll in der Klasse Zoo ein Array mit Vögeln erstellt werden. 

Das erste Element des Arrays ist ein Pinguin, 
Element zwei und drei sind Papageien 
Element vier ist ein Specht.  

Jeder dieser Vögel soll fähig sein ein typisches Geräusch zu machen. 
Der Papagei sagt: Mein Name ist + seinen Namen. Die Papageien können unterschiedliche Namen haben.
Der Pinguin sagt: Trrrrrrrooo (am besten ihr kopiert das von hier, damit auch die Anzahl der Buchstaben stimmt)
Der Specht sagt: KlopfKlopf

Wir haben die Klassen der einzelnen Vögel schon für euch vorbereitet. 
Eure Aufgabe ist es 
1. die Vererbungshierarchie zu implementieren,
2. in jeder Klasse ein Attribut, das das Geräusch enthält, zu implementieren und
3. in jeder Klasse einen Getter für dieses Attribut zu implementieren.
4. In der Klasse Papagei soll die Möglichkeit geschaffen werden jedem Papagei einen separaten Namen zu geben. Um von aussen auf diesen Namen zugreifen zu können soll es einen Getter für dieses Attribut geben (getName).

In der Klass Zoo sollt ihr dann noch eine Methode implementieren die jedes der Geräusche der einzelnen Vögel im Array auf einer neuen Zeile der Kommandozeile ausgibt.  Auch diese Methode haben wir schon für euch vorbereitet.
*/

public class Zoo {
   private Vogel[] voegelImZoo; 

   public Zoo() {
      // Bitte erzeugt hier das oben deklarierte Array voegelImZoo und fügt die in der Aufgabenstellung geforderten Vögel zum Array hinzu
      //voegelImZoo = new Vogel {new Pinguin(), new Papagei(), new Papagei(), new Specht()}
      voegelImZoo[0] = new Pinguin();
      voegelImZoo[1] = new Papagei();
      voegelImZoo[2] = new Papagei();
      voegelImZoo[3] = new Specht();
   }
   
   // Bitte vervollständigt diese Methode
   public void machtGeraeusche(Vogel[] voegel) {
      
      
   }
   
   // Bitte vervollständigt diese Methode
   public Vogel[] getVoegel() {

   }

   public static void main(String args[]) {		
      Zoo zoo = new Zoo();
      //Bitte ruft hier die Methode machtGeraeusche auf und übergebt den richtigen Wert als Parameter.

   }
}