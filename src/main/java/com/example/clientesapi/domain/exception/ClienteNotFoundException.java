package com.example.clientesapi.domain.exception;

import java.util.UUID;

/**
 * Excepción de dominio para cuando no se encuentra un producto
 */
public class ClienteNotFoundException extends BusinessException {

    public ClienteNotFoundException(UUID id) {
        super("No se encontró el cliente con ID: " + id);
    }

    public ClienteNotFoundException(String dni) {
        super("No se encontró el cliente con dni: " + dni);
    }
}