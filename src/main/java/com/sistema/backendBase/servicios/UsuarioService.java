package com.sistema.backendBase.servicios;

import java.util.Set;

import com.sistema.backendBase.modelo.Usuario;
import com.sistema.backendBase.modelo.UsuarioRol;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    public Usuario obtenerUsuario(String username);

    public void eliminarUsuario(Long usuarioId);
}
