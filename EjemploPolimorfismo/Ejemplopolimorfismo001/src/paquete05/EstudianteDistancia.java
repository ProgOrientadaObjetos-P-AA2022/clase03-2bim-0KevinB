/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

public class EstudianteDistancia extends Estudiante {

    int numeroAsignaturas;
    double costoAsignatura;

    public void establecerNumeroAsginaturas(int numero) {
        numeroAsignaturas = numero;
    }

    public void establecerCostoAsignatura(double valor) {
        costoAsignatura = valor;
    }

    @Override
    public void calcularMatricula() {
        matricula = numeroAsignaturas * costoAsignatura;
    }

    public int obtenerNumeroAsignaturas() {
        return numeroAsignaturas;
    }

    public double obtenerCostoAsignatura() {
        return costoAsignatura;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena = String.format("Datos Estudiante Distancia\n"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Identificación: %s\n"
                + "Edad: %d\n"
                + "Costo Matricula: %.2f\n",
                super.nombresEstudiante,
                super.apellidosEstudiante,
                super.identificacionEstudiante,
                super.edadEstudiante,
                matricula);
        return cadena;
    }
}
