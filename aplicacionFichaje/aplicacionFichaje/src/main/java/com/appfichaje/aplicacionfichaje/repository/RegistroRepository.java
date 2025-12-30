package com.appfichaje.aplicacionfichaje.repository;

@Repository
public interface RegistroRepository extends JpaRepository<Registro, Long> {
    // Aquí podrías añadir métodos como buscar los fichajes de hoy de un usuario
}
