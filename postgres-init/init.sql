
-- Habilita la extensión para UUIDs
CREATE EXTENSION IF NOT EXISTS "pgcrypto";

-- Tabla de productos (según tu modelo Producto.java)
CREATE TABLE productos (
    id UUID PRIMARY KEY,
    codigo VARCHAR(255) NOT NULL,
    nombre VARCHAR(255) NOT NULL,
    descripcion TEXT,
    precio NUMERIC(10, 2),
    stock INTEGER,
    categoria VARCHAR(255),
    activo BOOLEAN DEFAULT true,
    fecha_creacion TIMESTAMP,
    fecha_actualizacion TIMESTAMP
);

-- Datos de prueba para productos
INSERT INTO productos (id, codigo, nombre, descripcion, precio, stock, categoria, activo, fecha_creacion, fecha_actualizacion) VALUES
(gen_random_uuid(), 'P001', 'Producto 1', 'Descripción del producto 1', 10.99, 100, 'Categoria 1', true, now(), now()),
(gen_random_uuid(), 'P002', 'Producto 2', 'Descripción del producto 2', 15.49, 50, 'Categoria 2', true, now(), now()),
(gen_random_uuid(), 'P003', 'Producto 3', 'Descripción del producto 3', 20.00, 200, 'Categoria 3', true, now(), now());

-- Tabla de clientes (según tu modelo Cliente.java)
CREATE TABLE clientes (
    id UUID PRIMARY KEY,
    nombres VARCHAR(255) NOT NULL,
    apellidos VARCHAR(255) NOT NULL,
    dni VARCHAR(20) NOT NULL UNIQUE,
    correo VARCHAR(255),
    telefono VARCHAR(20)
);

-- Datos de prueba para clientes
INSERT INTO clientes (id, nombres, apellidos, dni, correo, telefono) VALUES
(gen_random_uuid(), 'Juan', 'Pérez', '12345678', 'juan.perez@example.com', '987654321'),
(gen_random_uuid(), 'María', 'López', '87654321', 'maria.lopez@example.com', '123456789'),
(gen_random_uuid(), 'Carlos', 'Sánchez', '56781234', 'carlos.sanchez@example.com', '555666777');

