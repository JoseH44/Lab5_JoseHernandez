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
public class Pandilla_de_Duendes extends Carta {

    public Pandilla_de_Duendes() {
    }

    public Pandilla_de_Duendes(String nombre) {
        super(nombre);
    }
    
    

    public Pandilla_de_Duendes(String nombre, double daño, int pts_vida, String objetivo, String velocidad, int coste_elixir, String tipo) {
        super(nombre, daño, pts_vida, "Aereos y Terrestres", "Alta", 3, "Comun");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
