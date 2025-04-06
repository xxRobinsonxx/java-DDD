package com.example.clientesapi.domain.repository;

import com.example.clientesapi.domain.model.Cliente;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Interfaz del repositorio de dominio para Productos.
 * Define las operaciones de persistencia sin detalles de implementación.
 */
public interface ClienteRepository {

    /**
     * Guarda un nuevo producto o actualiza uno existente
     * @param cliente el producto a guardar
     * @return el producto guardado
     */
    Cliente save(Cliente cliente);

    /**
     * Busca un producto por su ID
     * @param id el ID del producto
     * @return un Optional con el producto si existe
     */
    Optional<Cliente> findById(UUID id);

    /**
     * Obtiene todos los productos
     * @return lista de productos
     */
    List<Cliente> findAll();

    /**
     * Busca productos por categoría
     * @param dni la categoría a buscar
     * @return lista de productos que pertenecen a la categoría
     */
    Optional<Cliente> findByDni(String dni);

      /**
     * Verifica si existe un producto con el código proporcionado
     * @param dni el código a verificar
     * @return true si existe, false en caso contrario
     */
    boolean existsByDni(String dni);
}