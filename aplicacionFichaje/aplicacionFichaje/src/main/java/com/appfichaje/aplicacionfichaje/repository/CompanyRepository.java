package com.appfichaje.aplicacionfichaje.repository;

import com.appfichaje.aplicacionfichaje.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Record,Long> {
}
