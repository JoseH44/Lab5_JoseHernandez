/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_josehernandez;

/**
 *
 * @author jrdjh
 */
public class Mazo {

    private double coste;
    private int cant_cartas;
    private String nombre;

    public Mazo() {
    }

    public Mazo(String nombre) {
        this.nombre = nombre;
    }
    

    public Mazo(double coste) {
        this.coste = coste;
        this.cant_cartas = 3;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public int getCant_cartas() {
        return cant_cartas;
    }

    public void setCant_cartas(int cant_cartas) {
        this.cant_cartas = cant_cartas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    @Override
    public String toString() {
        return nombre;
    }

}
