/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_parcial2.pkg1.arz;

/**
 *
 * @author ABITA
 */
public class Personas {
    String nombre;
    String telefono;
    String correo;
    String profesion;

    public Personas(String nombre, String telefono, String correo, String profesion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.profesion = profesion;
    }

    public Personas() {
    }

    Personas(String javier, String javierpersonalcom, String estudiante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
}
