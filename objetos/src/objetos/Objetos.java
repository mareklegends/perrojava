package objetos;

/**
 *
 * @author MarekLegends
 */
public class Objetos {


    public static void main(String[] args) {
        
        Perro lasi,lasi2;
        lasi = new Perro();
        lasi2 = new Perro("Lasi", "Golden", 10, true);
        
        
        lasi2.datosPerro();
        lasi.ladrar(5);
  
        
    }
    
}
