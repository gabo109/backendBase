package com.sistema.backendBase.repositorios;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.backendBase.modelo.Rol;

public interface RolRepository extends JpaRepository<Rol,Long> {
}
