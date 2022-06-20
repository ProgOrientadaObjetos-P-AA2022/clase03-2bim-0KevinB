/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDocente extends Reporte {

    double promedioSueldos;
    ArrayList<Docente> lista;

    public ReporteDocente(String c) {
        super(c);

    }

    public void establecerListaDocentes(ArrayList<Docente> x) {
        lista = x;
    }

    public void calcularPromedioSueldos() {
        for (int i = 0; i < lista.size(); i++) {
            promedioSueldos = promedioSueldos + lista.get(i).getSueldo();
        }
    }

    public ArrayList<Docente> obtenerListaDocentes() {
        return lista;
    }

    public double obtenerPromedioSueldos() {
        return promedioSueldos;
    }

    @Override

    public String toString() {

        String cadena = String.format("DATOS DOCENTE");
        for (int i = 0; i < obtenerListaDocentes().size(); i++) {
            cadena = String.format("%s\n%s - código: ",
                    cadena, lista.get(i), super.toString());
        }
        cadena = String.format("%s\nPromedio total sueldos: %.2f\n", cadena,
                obtenerPromedioSueldos());
        return cadena;
    }
}
