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

    public Usuario validarUsuario(String nombre_usuario, String contrasenia) {
        
        List <Usuario> listaUsuarios = control.traerUsuarios();
        Usuario user=null;
       
       if(listaUsuarios!=null){
           for (Usuario usuario : listaUsuarios) {
               if (usuario.getNombre().equals(nombre_usuario)) {
                   user = usuario;
                   return user;
               }
           }
       }
       return user;
    }
    
}
