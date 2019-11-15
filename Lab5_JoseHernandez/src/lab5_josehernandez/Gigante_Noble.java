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
public class Gigante_Noble extends Carta {

    public Gigante_Noble() {
    }

    public Gigante_Noble(String nombre) {
        super(nombre);
    }
    
    

    public Gigante_Noble(String nombre, double daño, int pts_vida, String objetivo, String velocidad, int coste_elixir, String tipo) {
        super(nombre, daño, pts_vida, "Terrestres", "Media", 6, "Comun");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
