package com.example.clientesapi.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

/**
 * Entidad de dominio para representar un Producto.
 * Esta clase sigue los principios de inmutabilidad de DDD.
 */
@Getter
@ToString
@Builder
public class Cliente {
    private final UUID id;
    private final String nombres;
    private final String apellidos;
    private final String dni;
    private final String correo;
    private final String telefono;

    /**
     * Método para actualizar un producto con nuevos valores
     */
    public Cliente actualizar(String nombres, String apellidos, String dni , String correo , String telefono  ) {
        return Cliente.builder()
                .id(this.id)
                .nombres(nombres)
                .apellidos(apellidos)
                .dni(dni)
                .correo(correo)
                .telefono(telefono)
                .build();
    }

}