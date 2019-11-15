/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_josehernandez;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jrdjh
 */
public class Clan {

    private String nombre;
    private Date fecha_creacion;
    private String usuario_lider;
    private String tipo;
    private ArrayList<Usuario> miembros;

    public Clan() {
    }

    public Clan(String nombre, Date fecha_creacion, String usuario_lider, String tipo, ArrayList<Usuario> miembros) {
        this.nombre = nombre;
        this.fecha_creacion = fecha_creacion;
        this.usuario_lider = usuario_lider;
        this.tipo = tipo;
        this.miembros = miembros;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getUsuario_lider() {
        return usuario_lider;
    }

    public void setUsuario_lider(String usuario_lider) {
        this.usuario_lider = usuario_lider;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Usuario> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Usuario> miembros) {
        this.miembros = miembros;
    }
    
    
    
    

    @Override
    public String toString() {
        return nombre;
    }

}
