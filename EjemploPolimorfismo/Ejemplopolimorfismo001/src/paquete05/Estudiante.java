/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

public abstract class Estudiante {

    protected String nombresEstudiante;
    protected String apellidosEstudiante;
    protected String identificacionEstudiante;
    protected int edadEstudiante;
    protected double matricula;

    public void establecerNombresEstudiante(String nom) {
        nombresEstudiante = nom;
    }

    public void establecerApellidoEstudiante(String ape) {
        apellidosEstudiante = ape;
    }

    public void establecerIdentificacionEstudiante(String iden) {
        identificacionEstudiante = iden;
    }

    public void establecerEdadEstudiante(int ed) {
        edadEstudiante = ed;
    }

    public abstract void calcularMatricula();

    public String obtenerNombresEstudiante() {
        return nombresEstudiante;
    }

    public String obtenerApellidoEstudiante() {
        return apellidosEstudiante;
    }

    public String obtenerIdentificacionEstudiante() {
        return identificacionEstudiante;
    }

    public int obtenerEdadEstudiante() {
        return edadEstudiante;
    }

    public double obtenerMatricula() {
        return matricula;
    }
}
