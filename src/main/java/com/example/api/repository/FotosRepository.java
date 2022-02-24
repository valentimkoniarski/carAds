package com.example.api.repository;

import com.example.api.model.Fotos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FotosRepository extends JpaRepository<Fotos, Long> {



}
