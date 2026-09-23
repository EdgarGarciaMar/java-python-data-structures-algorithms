package com.prueba.mx.prueba.exception;

public class RegistroNotFoundException extends RuntimeException {

    public RegistroNotFoundException (Long id){
        super("No existe un registro con id: " + id);
    }
}
