/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte {

    double promedioEdades = 0;
    ArrayList<Policia> lista;

    public ReportePolicia(String c) {
        super(c);
    }

    public void establecerLista(ArrayList<Policia> listado) {
        lista = listado;
    }

    public ArrayList<Policia> obtenerLista() {
        return lista;
    }

    public double calcularPromedioEdad() {
        for (int i = 0; i < lista.size(); i++) {
            promedioEdades = promedioEdades + lista.get(i).getEdad();
        }
        promedioEdades = promedioEdades / lista.size();
        return promedioEdades;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena = String.format("%s%s\n", cadena, super.toString());
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s\nNombre: %s\nApellido: %s\n"
                    + "Edad: %s\nMatricula: %s\n", cadena, lista.get(i).getNombre(),
                    lista.get(i).getApellido(), lista.get(i).getEdad(), lista.get(i).getRango());
        }
        cadena = String.format("%s\nPromedio de matriculas: %.2f", cadena,
                promedioEdades);
        return cadena;
    }
}
