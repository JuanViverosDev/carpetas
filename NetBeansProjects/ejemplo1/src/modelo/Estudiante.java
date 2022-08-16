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
public class Estudiante extends Persona {

    private String codigoE;
    private String carreraE;

    public Estudiante() {
    }

    public Estudiante(String codigoE, String carreraE, String nombrePersona, String telefono, String correoPersona) {
        super(nombrePersona, telefono, correoPersona);
        this.codigoE = codigoE;
        this.carreraE = carreraE;
    }

    
    
    
    /**
     * Get the value of carreraE
     *
     * @return the value of carreraE
     */
    public String getCarreraE() {
        return carreraE;
    }

    /**
     * Set the value of carreraE
     *
     * @param carreraE new value of carreraE
     */
    public void setCarreraE(String carreraE) {
        this.carreraE = carreraE;
    }

    /**
     * Get the value of codigoE
     *
     * @return the value of codigoE
     */
    public String getCodigoE() {
        return codigoE;
    }

    /**
     * Set the value of codigoE
     *
     * @param codigoE new value of codigoE
     */
    public void setCodigoE(String codigoE) {
        this.codigoE = codigoE;
    }

    @Override
    public String toString() {
        return super.toString() + " Estudiante{" + "codigoE=" + codigoE + ", carreraE=" + carreraE + '}';
    }

    
    
}
