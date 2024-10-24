package com.mycompany.login.persistencia;

import com.mycompany.login.logica.Usuario;
import java.util.List;

public class ControladoraPersistencia {
    
    UsuarioJpaController usuario = new UsuarioJpaController();
    RolJpaController rol = new RolJpaController();
    
    //Usuario
    
    public void crearUsuario (Usuario usu){
        usuario.create(usu);
    }
    
    public Usuario traerUsuario(int id){
        return usuario.findUsuario(id);
    }
    
    public List <Usuario> traerUsuarios(){
        return usuario.findUsuarioEntities();
    }
    
    //Rol
    
    
    
}
