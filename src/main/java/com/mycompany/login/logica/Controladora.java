package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia control = new ControladoraPersistencia();
    
    public void crearUsuario(String nombre, String contrasenia, String rolRecibido){
        Usuario usuario = new Usuario();
        usuario.setNombreUsuario(nombre);
        usuario.setContrasenia(contrasenia);
        Rol rolEncontrado = new Rol();
        rolEncontrado = this.traerRol(rolRecibido);
        if(rolEncontrado!=null){
            usuario.setUnRol(rolEncontrado);
        }
        
        int id = buscarUltimoIdUsuario();
        usuario.setId(id+1);
        control.crearUsuario(usuario);
        
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
               if (usuario.getNombreUsuario().equals(nombre_usuario)) {
                   user = usuario;
                   return user;
               }
           }
       }
       return user;
    }

    public List<Rol> traerRoles() {
        return control.traerRoles();
    }

    private Rol traerRol(String rolRecibido) {
        List <Rol> listaRoles = control.traerRoles();
        for (Rol rol : listaRoles) {
            if (rol.getNombreRol().equals(rolRecibido)) {
                return rol;
            }
        }
        return null;
    }

    private int buscarUltimoIdUsuario() {
        List <Usuario> listaUsuarios = this.traerUsuarios();
        Usuario usuario = listaUsuarios.get(listaUsuarios.size() - 1);
        return usuario.getId();
    }

    public void eliminarUsuario(int id_usuario) {
        control.eliminarUsuario(id_usuario);
    }

    public void editarUsuario(Usuario usuario, String nombre, String contrasenia, String rolRecibido) {
        usuario.setNombreUsuario(nombre);
        usuario.setContrasenia(contrasenia);
        Rol rolEncontrado = new Rol();
        rolEncontrado = this.traerRol(rolRecibido);
        if(rolEncontrado!=null){
            usuario.setUnRol(rolEncontrado);
        }
        
        control.editarUsuario(usuario);
    }
    
}
