/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_parcial2.pkg1.arz;

import com.google.gson.Gson;

/**
 *
 * @author ABITA
 */
public class Proyecto_Parcial21ARZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
new FrmPrincipal().setVisible(true);
        
        Personas personas = new Personas("Javier","5534215678","personal@personal.com","estudiante");
        Gson gson = new Gson();
        String cadena  = gson.toJson(personas);
        System.out.println("Nombre" + personas.getNombre());
       System.out.println("telefono" +  String.valueOf(personas.getNombre()));
        System.out.println("Correo" + personas.getCorreo());
        System.out.println("Profesion" + personas.getProfesion());
        
        System.out.println("La cadena contiene ->" + cadena);
    }
    
}
