package com.prueba.mx.prueba.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RegistroRequest(@NotBlank(message = "El nombre es obligatorio")
                              @Size(message = "max caracteres", max = 200)
                              String nombre,
                              @NotBlank(message = "El email es obligatorio")
                              @Email(message = "Error en el formato")
                              @Size(message = "max caracteres", max = 200)
                              String email,
                              @NotBlank(message = "El mensaje es obligatorio")
                              @Size(message = "max caracteres", max = 200)
                              String mensaje) {
}
