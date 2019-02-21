/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendacsv_sql;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mañanas
 */
public class AccesoFichero {
    static File archivo=new File("C:\\Jessica\\agenda.csv");
    static private String separador=",";
    Contacto c=new Contacto(null, null);
    //Entre () lo que le pasas es un objeto tipo Contacto llamado c por ejemplo
    

    public static ArrayList<Contacto> leerContactos() 
    {
        ArrayList<Contacto> lista_contactos=new ArrayList ();
        try 
        {   //Entre () puedo pasar un nombre de fichero o un file
            FileReader lector=new FileReader(archivo);
            BufferedReader br=new BufferedReader(lector);
            String linea=br.readLine();
            while (linea!=null)
            {//El split deuelve un array de String
                String[] campos=linea.split(separador);
                Contacto c=new Contacto(campos[0],campos[1]);
                lista_contactos.add(c);
                linea=br.readLine();
            }
       
        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) 
        {
            Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista_contactos;
        
    }
}
