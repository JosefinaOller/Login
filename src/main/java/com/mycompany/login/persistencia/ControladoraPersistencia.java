package com.mycompany.login.persistencia;

import com.mycompany.login.logica.Rol;
import com.mycompany.login.logica.Usuario;
import com.mycompany.login.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public List<Rol> traerRoles() {
        return rol.findRolEntities();
    }

    public void eliminarUsuario(int id_usuario) {
        try {
            usuario.destroy(id_usuario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarUsuario(Usuario usu) {
        try {
            usuario.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
 
}
