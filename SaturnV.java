
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
    private int t;
    private int z;

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
    
    public void RaketenStart(int intervall)
    {
        
        //Arrays Stufe 1 Stufe 2 Stufe 3
        int[] leergewicht = {136000, 43100, 15400};
        int[] treibstoffgewicht = {2035000, 426800, 103400};
        int[] brenndauer = {150, 360, 165};
       
       //Variabeln
        double gewicht = leergewicht[0] + leergewicht[1] + leergewicht[2] + treibstoffgewicht[0] + treibstoffgewicht[1] + treibstoffgewicht[2];
        double hoehe = 0;
        double speedTr = 5000;
        double deltaV = 0;
        double height = 0;
        double speed = 0;
        
        
     
        System.out.println("Zeit, Geschwindigkeit, DeltaV, Gewicht");
        for(int n = 0; n < 3; n++){
            for(int i = 0; i < brenndauer[n]; i = i + intervall ){
                double trPerSec = treibstoffgewicht[n] / brenndauer[n];
                deltaV = trPerSec / gewicht * speedTr;
                speed = speed + deltaV;
                gewicht = gewicht - trPerSec;
        
                if(n == 0){
                    System.out.println(i + "                      " + speed + "                        " + deltaV + "                            " + gewicht);
                    t = i;
                }
                else{
                    if(n==1){
            int r = i + t;
            System.out.println(r + "                      " + speed + "                        " + deltaV + "                            " + gewicht);
            z = r;
        }
        else{
        int g = i + z;
        System.out.println(g + "                      " + speed + "                        " + deltaV + "                            " + gewicht);
    }
        }
    }
    
}
            
        
        
        
    }
    }
    
  

