/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;


/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {

    double promedioMatriculas = 0;
    ArrayList<Estudiante> lista;

    public ReporteEstudiante(String c) {
        super(c);
    }

    public void establecerLista(ArrayList<Estudiante> listado) {
        lista = listado;
    }

    public ArrayList<Estudiante> obtenerLista() {
        return lista;
    }

    public double calcularMatriculas() {
        for (int i = 0; i < lista.size(); i++) {
            promedioMatriculas = promedioMatriculas + lista.get(i).getMatricula();
        }
        return promedioMatriculas;
    }
    @Override
    public String toString() {
        String cadena = "";
        cadena = String.format("%s%s\n", cadena, super.toString());
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s\nNombre: %s\nApellido: %s\n"
                    + "Edad: %s\nMatricula: %.2f\n", cadena,lista.get(i).getNombre(),
            lista.get(i).getApellido(), lista.get(i).getEdad(), lista.get(i).getMatricula());
        }
        cadena = String.format("%s\nPromedio de matriculas: %.2f", cadena, 
                promedioMatriculas);
        return cadena;
    }
}
