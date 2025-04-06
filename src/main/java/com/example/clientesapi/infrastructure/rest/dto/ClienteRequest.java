package com.example.clientesapi.infrastructure.rest.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO para recibir datos de productos en las peticiones
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteRequest {

    @NotBlank(message = "Los nombres son obligatorios")
    @Size(min = 3, max = 100, message = "El nombre debe tener entre 3 y 100 caracteres")
    private String nombres;

    @NotBlank(message = "Los apellidos son obligatorios")
    @Size(min = 3, max = 100, message = "El código debe tener entre 3 y 100 caracteres")
    private String apellidos;

    @NotBlank(message = "El dni es obligatorio")
    @Size(min = 3, max = 8, message = "El código debe tener entre 3 y 8 caracteres")
    private String dni;

    @NotBlank(message = "El correo es obligatorio")
    @Size(min = 3, max = 50, message = "El código debe tener entre 3 y 50 caracteres")
    private String correo;

    @NotBlank(message = "El telefono es obligatorio")
    @Size(min = 3, max = 10, message = "El código debe tener entre 3 y 10 caracteres")
    private String telefono;




}