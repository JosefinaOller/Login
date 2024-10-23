package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia control = new ControladoraPersistencia();
    
    public void crearUsuario(Usuario use){
        control.crearUsuario(use);
    }
    
    public Usuario traerUsuario(int id){
        return control.traerUsuario(id);
    }
    
    public List <Usuario> traerUsuarios(){
        return control.traerUsuarios();
    }

    public String validarUsuario(String nombre_usuario, String contrasenia) {
        
        List <Usuario> listaUsuarios = control.traerUsuarios();
        String mensaje = "";
       
       if(listaUsuarios!=null){
           for (Usuario usuario : listaUsuarios) {
               if (usuario.getNombre().equalsIgnoreCase(nombre_usuario)) {
                   if (usuario.getContrasenia().equals(contrasenia)) {
                       mensaje = "¡Bienvenido " + nombre_usuario + "!";
                   }
                   else {
                       mensaje =  "Error, la contraseña es incorrecta. ";
                   }
                   
               }
               else{
                   mensaje = "Error, no es encontrado el usuario. ";

               }
               
               
           }
       }
       return mensaje;
    }
    
}
