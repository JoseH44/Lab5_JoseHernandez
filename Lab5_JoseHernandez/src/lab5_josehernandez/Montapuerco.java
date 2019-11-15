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
public class Montapuerco extends Carta {

    public Montapuerco() {
        super();
    }

    public Montapuerco(String nombre, double daño, int pts_vida, String objetivo, String velocidad, int coste_elixir, String tipo) {
        super("Montapuerco", daño, pts_vida, "Terrestres", "Alta", 4, "Especial");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
