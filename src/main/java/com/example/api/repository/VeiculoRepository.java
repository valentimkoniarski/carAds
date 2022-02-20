package com.example.api.repository;

import com.example.api.model.Usuario;
import com.example.api.model.Veiculo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

    Veiculo findByModelo(String nome);

    Usuario findByUsuario(String username);
}
