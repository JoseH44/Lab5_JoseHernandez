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

    public Mazo() {
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

    @Override
    public String toString() {
        return "" + coste;
    }
    
    

}
