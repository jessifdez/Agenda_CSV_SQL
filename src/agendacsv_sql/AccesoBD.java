/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendacsv_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mañanas
 */
public class AccesoBD {
    
    public static void crearTabla(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda_csv_sql?serverTimezone=UTC", "root","");
            Statement stmt=connection.createStatement();
            String query_crea_contactos="CREATE TABLE  if not exists contactos "
                +"( nombre varchar(50), telefono varchar(20))";
            stmt.executeUpdate(query_crea_contactos);
            stmt.close();
            connection.close();
        }   catch (ClassNotFoundException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void pasarContactos(ArrayList<Contacto> lista_contactos) {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda_csv_sql?serverTimezone=UTC", "root","");
            Statement stmt=connection.createStatement();
            //Para insertar
            for(int i=0;i<lista_contactos.size();i++)
            {
                lista_contactos.get(i);
                String query="INSERT INTO contactos VALUES('"+lista_contactos.get(i).getNombre()+"', '"+lista_contactos.get(i).getTelefono()+"')";
                stmt.executeUpdate(query);
            }
            stmt.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
}
