/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author juan_jose.viveros
 */
public class Estudiante extends Persona{
    
    private String codigo;
    private String carrera;

    public Estudiante(String codigo, String carrera) {
        this.codigo = codigo;
        this.carrera = carrera;
    }

    public Estudiante(String codigo, String carrera, String nombre, String telefono, String email) {
        super(nombre, telefono, email);
        this.codigo = codigo;
        this.carrera = carrera;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "codigo=" + codigo + ", carrera=" + carrera + '}';
    }
    
    
}
