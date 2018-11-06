/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author alumno
 */
public class Cocodrilo {
    
    //Varibales principales
    
    private String nombre;
    private int peso;
    private int edad;
    
        

    public Cocodrilo(String nombre, int peso, int edad) {
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
    }

   
    
    public void morder(Gacela victima){
      victima.setVida(victima.getVida()-1);

      if (victima.getVida()==0) {
          System.out.println("La " + victima.getNombre() +" muere.");
      }
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
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
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
 
    
    
    
}