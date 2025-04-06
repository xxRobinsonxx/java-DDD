package com.example.clientesapi.infrastructure.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * DTO para enviar datos de productos en las respuestas
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteResponse {
    private UUID id;
    private String nombres;
    private String apellidos;
    private String dni;
    private String correo;
    private String telefono;
}