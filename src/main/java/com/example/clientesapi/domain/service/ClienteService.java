package com.example.clientesapi.domain.service;

import ch.qos.logback.core.net.server.Client;
import com.example.clientesapi.domain.model.Cliente;

import java.util.List;
import java.util.UUID;

/**
 * Servicio de dominio para la lógica de negocio relacionada con Clientes
 */
public interface ClienteService {

    /**
     * Crea un nuevo producto
     * @param cliente el producto a crear
     * @return el producto creado
     */
    Cliente crearCliente(Cliente cliente);

    /**
     * Obtiene un producto por su ID
     * @param id el ID del producto
     * @return el producto encontrado
     * @throws ClienteNotFoundException si no se encuentra el producto
     */
    Cliente obtenerClientePorId(UUID id);

    /**
     * Obtiene un producto por su código
     * @param dni el código del producto
     * @return el producto encontrado
     * @throws ClienteNotFoundException si no se encuentra el producto
     */
    Cliente obtenerClientePorDni(String dni);

    /**
     * Obtiene todos los productos
     * @return lista de productos
     */
    List<Cliente> obtenerTodosLosClientes();

    /**
     * Actualiza un producto existente
     * @param id el ID del producto a actualizar
     * @param nombres nuevo nombre
     * @param apellidos nueva descripción
     * @param dni nuevo precio
     * @param correo nuevo stock
     * @param telefono nueva categoría
     * @return el producto actualizado
     * @throws ClienteNotFoundException si no se encuentra el producto
     */
    Cliente actualizarCliente(UUID id, String nombres, String apellidos, String dni , String correo, String telefono );



}