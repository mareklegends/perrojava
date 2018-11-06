package objetos;

/**
 *
 * @author MarekLegends
 */
public class Perro {
    
    //Varibales principales
    
    private String nombre;
    private String raza;
    private int edad;
    private boolean vacunado;
   
    public Perro(){
        nombre = "Lasi";
        raza = "Golden";
        edad = 2;
        vacunado = true;
    }
    
    public Perro(String nombre){
        this.nombre=nombre;
    }
    
    public Perro(String nombre, String raza, int edad, boolean vacunado){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.vacunado = vacunado;
    }
    
    public void ladrar(int volumen){
        for (int i = 0; i < volumen; i++) {
            System.out.println("Guau guau");
        }
    }
    
    
   public void datosPerro(){
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Raza: " + this.getRaza());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Vacunado: " + this.isVacunado());           
  }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the vacunado
     */
    public boolean isVacunado() {
        return vacunado;
    }

    /**
     * @param vacunado the vacunado to set
     */
    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }
   
  
 
}
    
    
    

