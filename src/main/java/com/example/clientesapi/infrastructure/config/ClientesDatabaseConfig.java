package com.example.clientesapi.infrastructure.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Configuración de la base de datos y JPA
 */
@Configuration
@EnableTransactionManagement
@EntityScan(basePackages = "com.example.clientesapi.infrastructure.persistence.entity")
@EnableJpaRepositories(basePackages = "com.example.clientesapi.infrastructure.persistence.repository")
public class ClientesDatabaseConfig {
    // La configuración se establece mediante anotaciones y properties
}