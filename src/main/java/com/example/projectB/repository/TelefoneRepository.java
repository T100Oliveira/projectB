package com.example.projectB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tharsis.tharsis.infrastructure.entity.Telefone;
@Repository
public interface TelefoneRepository extends JpaRepository <Telefone,Long>{
}
