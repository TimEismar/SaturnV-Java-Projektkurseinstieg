
/**
 * Beschreiben Sie hier die Klasse SaturnV.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class SaturnV
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    /**
     * Konstruktor für Objekte der Klasse SaturnV
     */
    public SaturnV()
    {
        // Instanzvariable initialisieren
        x = 0;
        
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public int beispielMethode(int y)
    {
        // tragen Sie hier den Code ein
        return x + y;
    }
    
    public void RaketenStart()
    {
       
        
        // Leergewicht ; Treibstoffgewicht; Brenndauer
        double[] stufe1 = {136, 2035, 150};
        double[] stufe2 = {43.1, 426.8, 360};
        double[] stufe3 = {15.4, 103.4, 165};
        
        //Gewicht
        double gewicht = 0;
        gewicht += stufe1[0]; gewicht += stufe1[1]; gewicht += stufe2[0]; gewicht += stufe2[1]; gewicht += stufe3[0]; gewicht += stufe3[1];
        System.out.println(gewicht);
        
        //Treibstoffmenge + Brenndauer pro Stufe
        double st1Treibstoff = stufe1[1];  
        double st1Brenndauer = stufe1[2];
        double st2Treibstoff = stufe2[1];
        double st2Brenndauer = stufe2[2];
        double st3Treibstoff = stufe3[1];  
        double st3Brenndauer = stufe3[2];
        
        //Treibstoff pro Sekunde
        double trPerSec1 = st1Treibstoff / st1Brenndauer;
        System.out.println("TrSec1: " + trPerSec1);
        double trPerSec2 = st2Treibstoff / st2Brenndauer;
        System.out.println("TrSec2: " + trPerSec2);
        double trPerSec3 = st3Treibstoff / st3Brenndauer;
        System.out.println("TrSec3: " + trPerSec3);
        
        //Grundvariabeln
        double hoehe = 0;
        double speedTr = 5000;
        double accel = 0;
        double height = 0;
        boolean i = false;
        int a = 0;
        int n = 0;
       
        //start
        
        /*while (i = false){
            accel = accel + trPerSec / gewicht * speedTr;
            System.out.println("Accel:" + accel);
            
            height = height + accel;
            System.out.println("Height" + height);
            
            System.out.println("I" + i);
            
           
             i = (a == 150);
             System.out.println("Converted to Bool: "+a);
        
       
        }*/
        //ST1
        while (n < 151){
            accel = accel + trPerSec1 / gewicht * speedTr;
            System.out.println("Accel: " + accel);
            
            height = height + accel;
            System.out.println("Height: " + height);
            
            System.out.println("I" + n);
            
            gewicht = gewicht - trPerSec1;
            
            System.out.println("Gewicht: " + gewicht);
           
            n = n + 1;
        
       
        }
        
        //Stufentrennung1
         gewicht = gewicht - stufe1[0];
         System.out.println("Stufe 1 getrennt aktuelles Gewicht: " + gewicht);
         n = 0;
        //ST2
        while (n < 361){
            accel = accel + trPerSec2 / gewicht * speedTr;
            System.out.println("Accel: " + accel);
            
            height = height + accel;
            System.out.println("Height: " + height);
            
            System.out.println("I" + n);
            
             gewicht = gewicht - trPerSec2;
            
            System.out.println("Gewicht: " + gewicht);
           
            n = n + 1;
        
       
        }
        
        //Stufentrennung2
         gewicht = gewicht - stufe2[0];
         System.out.println("Stufe 1 getrennt aktuelles Gewicht: " + gewicht);
         n = 0;
        //ST3
        while (n < 166){
            accel = accel + trPerSec3 / gewicht * speedTr;
            System.out.println("Accel: " + accel);
            
            height = height + accel;
            System.out.println("Height: " + height);
            
            System.out.println("I" + n);
            
             gewicht = gewicht - trPerSec3;
            
            System.out.println("Gewicht: " + gewicht);
           
            n = n + 1;
        
       
        }
        
        System.out.println("Endhöhe: " + height);
        System.out.println("Endspeed: " + accel);
    }
  
}
