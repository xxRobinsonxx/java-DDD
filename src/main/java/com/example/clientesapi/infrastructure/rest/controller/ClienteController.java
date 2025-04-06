package com.example.clientesapi.infrastructure.rest.controller;

import com.example.clientesapi.application.usecase.CreateClienteUseCase;
import com.example.clientesapi.application.usecase.GetClienteUseCase;
import com.example.clientesapi.application.usecase.UpdateClienteUseCase;
import com.example.clientesapi.domain.model.Cliente;
import com.example.clientesapi.infrastructure.persistence.mapper.ClienteMapper;
import com.example.clientesapi.infrastructure.rest.dto.*;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * Controlador REST para operaciones de Productos
 */
@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final CreateClienteUseCase createClienteUseCase;
    private final GetClienteUseCase getClienteUseCase;
    private final UpdateClienteUseCase updateClienteUseCase;
    private final ClienteMapper mapper;

    /**
     * Crea un nuevo cliente
     */
    @PostMapping
    public ResponseEntity<ClienteResponse> crearCliente(@Valid @RequestBody ClienteRequest request) {
        Cliente cliente = mapper.toDomain(request);
        Cliente creado = createClienteUseCase.execute(cliente);
        return new ResponseEntity<>(mapper.toResponse(creado), HttpStatus.CREATED);
    }

    /**
     * Obtiene un producto por su ID
     */
    @GetMapping("/{id}")
    public ResponseEntity<ClienteResponse> obtenerCliente(@PathVariable UUID id) {
        Cliente cliente = getClienteUseCase.executeById(id);
        return ResponseEntity.ok(mapper.toResponse(cliente));
    }

    /**
     * Obtiene un producto por su código
     */
    @GetMapping("/dni/{dni}")
    public ResponseEntity<ClienteResponse> obtenerProductoPorDni(@PathVariable String dni) {
        Cliente cliente = getClienteUseCase.executeByDni(dni);
        return ResponseEntity.ok(mapper.toResponse(cliente));
    }

    /**
     * Obtiene todos los productos
     */
    @GetMapping
    public ResponseEntity<List<ClienteResponse>> obtenerTodosLosClientes() {
        List<Cliente> clientes = getClienteUseCase.executeAll();
        return ResponseEntity.ok(mapper.toResponseList(clientes));
    }

    /**
     * Actualiza un producto existente
     */
    @PutMapping("/{id}")
    public ResponseEntity<ClienteResponse> actualizarCliente(
            @PathVariable UUID id,
            @Valid @RequestBody ClienteUpdateRequest request) {

        Cliente actualizado = updateClienteUseCase.execute(
                id,
                request.getNombres(),
                request.getApellidos(),
                request.getDni(),
                request.getCorreo(),
                request.getTelefono()
        );

        return ResponseEntity.ok(mapper.toResponse(actualizado));
    }

}