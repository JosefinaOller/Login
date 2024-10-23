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
    
}
