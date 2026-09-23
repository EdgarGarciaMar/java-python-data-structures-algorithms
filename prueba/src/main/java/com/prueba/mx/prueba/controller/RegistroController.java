package com.prueba.mx.prueba.controller;

import com.prueba.mx.prueba.dto.RegistroRequest;
import com.prueba.mx.prueba.dto.RegistroResponse;
import com.prueba.mx.prueba.service.RegistroService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/v1/registros")
public class RegistroController {

    private final RegistroService registroService;

    public RegistroController (RegistroService registroService){
        this.registroService = registroService;
    }

    @PostMapping
    public ResponseEntity<RegistroResponse> crear(@Valid @RequestBody RegistroRequest request) {
        RegistroResponse creado = registroService.crear(request);
        return ResponseEntity
                .created(URI.create("/api/v1/registros/" + creado.id()))
                .body(creado);
    }

    @GetMapping()
    public List<RegistroResponse> getRegistros(){
        return registroService.listar();
    }

    @GetMapping("/{id}")
    public RegistroResponse getRegistro(@PathVariable Long id) {
        return registroService.obtener(id);
    }

}