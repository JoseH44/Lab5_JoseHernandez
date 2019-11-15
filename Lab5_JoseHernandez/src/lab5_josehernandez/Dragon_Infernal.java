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
public class Dragon_Infernal extends Carta {

    public Dragon_Infernal() {
        super();
    }

    public Dragon_Infernal(String nombre) {
        super(nombre);
    }
    

    public Dragon_Infernal(String nombre, double daño, int pts_vida, String objetivo, String velocidad, int coste_elixir, String tipo) {
        super(nombre, daño, pts_vida, "Aereos y Terrestres", "Media", 4, "Legendaria");

    }

    @Override
    public String toString() {
        return super.toString();
    }

}
