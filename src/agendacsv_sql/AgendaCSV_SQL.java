/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendacsv_sql;

import java.util.ArrayList;

/**
 *
 * @author Mañanas
 */
public class AgendaCSV_SQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AccesoBD.crearTabla();
        ArrayList<Contacto> c=AccesoFichero.leerContactos();
        EntradaSalida.mostrarContactos(c);
        AccesoBD.pasarContactos(c);
    }
    
}
