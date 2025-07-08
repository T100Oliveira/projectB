package com.example.projectB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tharsis.tharsis.infrastructure.entity.Endereco;
@Repository
public interface EnderecoRepository extends JpaRepository<Endereco,Long> {
}
  