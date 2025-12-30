package com.appfichaje.aplicacionfichaje.repository;

import com.appfichaje.aplicacionfichaje.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {
    // Aquí podrías añadir métodos como buscar los fichajes de hoy de un usuario
}
