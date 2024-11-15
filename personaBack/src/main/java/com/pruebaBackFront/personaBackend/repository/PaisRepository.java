package com.pruebaBackFront.personaBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruebaBackFront.personaBackend.model.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long> {

}
