package com.prueba.mx.prueba.dto;

import com.prueba.mx.prueba.entity.Registro;
import java.time.LocalDateTime;

public record RegistroResponse(Long id, String nombre, String email, String mensaje, LocalDateTime fechaCreacion) {

    public static RegistroResponse from(Registro registro) {
        return new RegistroResponse(registro.getId(), registro.getNombre(),registro.getEmail(), registro.getMensaje(), registro.getFechaCreacion());
    }
}
