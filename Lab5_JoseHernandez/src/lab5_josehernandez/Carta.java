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
public class Carta {

    private String nombre;
    private double daño;
    private int pts_vida;
    private String objetivo;
    private String velocidad;
    private int coste_elixir;
    private String tipo;

    public Carta() {
    }

    public Carta(String nombre) {
        this.nombre = nombre;
    }
    
    

    public Carta(String nombre, double daño, int pts_vida, String objetivo, String velocidad, int coste_elixir, String tipo) {
        this.nombre = nombre;
        this.daño = daño;
        this.pts_vida = pts_vida;
        this.objetivo = objetivo;
        this.velocidad = velocidad;
        this.coste_elixir = coste_elixir;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDaño() {
        return daño;
    }

    public void setDaño(double daño) {
        this.daño = daño;
    }

    public int getPts_vida() {
        return pts_vida;
    }

    public void setPts_vida(int pts_vida) {
        this.pts_vida = pts_vida;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public int getCoste_elixir() {
        return coste_elixir;
    }

    public void setCoste_elixir(int coste_elixir) {
        this.coste_elixir = coste_elixir;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
