package com.prueba.mx.prueba.repository;


import com.prueba.mx.prueba.entity.Registro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistroRepository extends JpaRepository <Registro,Long> {
}
