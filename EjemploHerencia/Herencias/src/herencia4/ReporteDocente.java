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
        String cadena = "";
        cadena = String.format("%s%s\n", cadena, super.toString());
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s\nNombre: %s\nApellido: %s\n"
                    + "Edad: %s\nMatricula: %.2f\n", cadena,lista.get(i).getNombre(),
            lista.get(i).getApellido(), lista.get(i).getEdad(), lista.get(i).getSueldo());
        }
        cadena = String.format("%s\nPromedio de matriculas: %.2f", cadena, 
                promedioSueldos);
        return cadena;
    }
}
