/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author dacastro
 */
public class Persona {

    private String nombrePersona;
    private String telefono;
    private String correoPersona;

    public Persona() {
    }

    public Persona(String nombrePersona, String telefono, String correoPersona) {
        this.nombrePersona = nombrePersona;
        this.telefono = telefono;
        this.correoPersona = correoPersona;
    }

    
    
    /**
     * Get the value of correoPersona
     *
     * @return the value of correoPersona
     */
    public String getCorreoPersona() {
        return correoPersona;
    }

    /**
     * Set the value of correoPersona
     *
     * @param correoPersona new value of correoPersona
     */
    public void setCorreoPersona(String correoPersona) {
        this.correoPersona = correoPersona;
    }

    /**
     * Get the value of telefono
     *
     * @return the value of telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Set the value of telefono
     *
     * @param telefono new value of telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Get the value of nombrePersona
     *
     * @return the value of nombrePersona
     */
    public String getNombrePersona() {
        return nombrePersona;
    }

    /**
     * Set the value of nombrePersona
     *
     * @param nombrePersona new value of nombrePersona
     */
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombrePersona=" + nombrePersona + ", telefono=" + telefono + ", correoPersona=" + correoPersona + '}';
    }

}
