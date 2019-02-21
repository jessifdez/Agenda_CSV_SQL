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
public class EntradaSalida {

    static void mostrarContactos(ArrayList<Contacto> c) {
    {  System.out.println("NOMBRE"+"\t"+"TELEFONO");
       for(int i=0;i<c.size();i++) 
       {
           c.get(i);
           System.out.println(c.get(i).getNombre()+"\t"+c.get(i).getTelefono());
       }
    }
    }
    
}
