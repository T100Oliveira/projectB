package com.example.projectB.repository;

import com.example.projectB.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.Optional;

@Repository
public interface UsuarioRepositoy extends JpaRepository<Usuario,Long> {

    boolean existsByEmail(String email);

    Optional<Usuario> findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
}
