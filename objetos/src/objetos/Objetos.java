package objetos;

/**
 *
 * @author MarekLegends
 */
public class Objetos {


    public static void main(String[] args) {
        
        //Gacela
        Gacela gacela = new Gacela("Bambi", 5);
        //Cocodrilo
        Cocodrilo cocodrilo = new Cocodrilo("Dandil", 60, 26);
        
        //System.out.println(gacela.getVelocidad());
        //gacela.correr();
        //System.out.println(gacela.getVelocidad());
        
        cocodrilo.morder(gacela);
        System.out.println(gacela.getVida());
        cocodrilo.morder(gacela);
        
    }
    
}
