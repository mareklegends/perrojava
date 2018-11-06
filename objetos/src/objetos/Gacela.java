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
public class Gacela {
    
    private String nombre;
    private int peso;
    private int edad;
    private int vida;
    private int velocidad;

    public Gacela(String nombre, int peso, int edad, int vida, int velocidad) {
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
        this.vida = vida;
        velocidad = 0;
    }

    public Gacela(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        peso=0;
        vida=2;
        velocidad=0;
    }
    
    public Gacela(){
        nombre = "";
        peso = 0;
        edad = 0;      
        vida = 0;
        velocidad = 0;
    }
    
    public void correr(){
        setVelocidad(getVelocidad() + 10);
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

    /**
     * @return the vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * @param vida the vida to set
     */
    public void setVida(int vida) {
        this.vida = vida;
    }

    /**
     * @return the velocidad
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * @param velocidad the velocidad to set
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

}