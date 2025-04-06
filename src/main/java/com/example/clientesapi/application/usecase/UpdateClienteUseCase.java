package com.example.clientesapi.application.usecase;

import com.example.clientesapi.domain.model.Cliente;
import com.example.clientesapi.domain.service.ClienteService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Caso de uso para actualizar productos
 */
@Component
@RequiredArgsConstructor
public class UpdateClienteUseCase {

    private final ClienteService clienteService;

    /**
     * Actualiza un producto existente
     * @param id ID del producto a actualizar
     * @param nombres nuevo nombre
     * @param apellidos nueva descripción
     * @param dni nuevo precio
     * @param correo nuevo stock
     * @param telefono nueva categoría
     * @return el producto actualizado
     */
    public Cliente execute(UUID id, String nombres, String apellidos,
                           String dni , String correo , String telefono) {
        return clienteService.actualizarCliente(id, nombres, apellidos, dni, correo, telefono);
    }

}