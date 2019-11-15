/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_josehernandez;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author jrdjh
 */
public class Usuario {

    private String nombre;
    private String apellido;
    private String nom_usuario;
    private String contraseña;
    private Date fecha_nacimiento;
    private Color color_favotiro;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String nom_usuario, String contraseña, Date fecha_nacimiento, Color color_favotiro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nom_usuario = nom_usuario;
        this.contraseña = contraseña;
        this.fecha_nacimiento = fecha_nacimiento;
        this.color_favotiro = color_favotiro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNom_usuario() {
        return nom_usuario;
    }

    public void setNom_usuario(String nom_usuario) {
        this.nom_usuario = nom_usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Color getColor_favotiro() {
        return color_favotiro;
    }

    public void setColor_favotiro(Color color_favotiro) {
        this.color_favotiro = color_favotiro;
    }

    @Override
    public String toString() {
        return nom_usuario;
    }

}
