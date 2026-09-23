package com.prueba.mx.prueba.service;

import com.prueba.mx.prueba.dto.RegistroRequest;
import com.prueba.mx.prueba.dto.RegistroResponse;
import com.prueba.mx.prueba.entity.Registro;
import com.prueba.mx.prueba.repository.RegistroRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RegistroService {
    private final RegistroRepository registroRepository;
    private static final Logger logger = LoggerFactory.getLogger(RegistroService.class);

    public RegistroService (RegistroRepository registroRepository){
        this.registroRepository = registroRepository;
    }

    @Transactional
    public RegistroResponse crear(RegistroRequest request) {
        // 1. DTO -> entidad
        Registro registro = new Registro(request.nombre(), request.email(), request.mensaje());

        // 2. guardar; 'guardado' ya trae id y fechaCreacion
        Registro guardado = registroRepository.save(registro);

        // 3. imprimir en consola
        logger.info("Registro almacenado: {}", guardado);

        // 4. entidad -> DTO de respuesta
        return RegistroResponse.from(guardado);
    }

    @Transactional(readOnly = true)
    public List<RegistroResponse> listar() {
        // repository.findAll() te da List<Registro>; conviértela a List<RegistroResponse>
        // pista: .stream().map(RegistroResponse::from).toList()
        List <RegistroResponse> response = registroRepository.findAll().stream().map(RegistroResponse::from).toList();
        return  response;
    }

    @Transactional(readOnly = true)
    public RegistroResponse obtener(Long id) {
        // repository.findById(id) te da Optional<Registro>
        // pista: .map(RegistroResponse::from).orElseThrow(...)
        RegistroResponse response = registroRepository.findById(id).map(RegistroResponse::from).orElseThrow(() -> new RuntimeException("No existe el registro " + id));
        return  response;
    }
}
