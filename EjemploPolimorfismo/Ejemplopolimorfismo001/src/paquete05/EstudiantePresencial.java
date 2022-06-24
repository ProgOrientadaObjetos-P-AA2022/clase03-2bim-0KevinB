/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

public class EstudiantePresencial extends Estudiante {

    int numeroCreditos;
    double costoCredito;

    public void establecerNumeroCreditos(int numero) {
        numeroCreditos = numero;
    }

    public void establecerCostoCredito(double valor) {
        costoCredito = valor;
    }

    @Override
    public void calcularMatricula() {
        matricula = numeroCreditos * costoCredito;
    }

    public int obtenerNumeroCreditos() {
        return numeroCreditos;
    }

    public double obtenerCostoCredito() {
        return costoCredito;
    }
    @Override
    public String toString() {
        String cadena = "";
        cadena = String.format("Datos Estudiante Presencial\n"
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
