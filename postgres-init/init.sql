-- Table: productos
-- DROP TABLE IF EXISTS public.productos;
CREATE TABLE IF NOT EXISTS productos
(
    id uuid NOT NULL,
    codigo character varying(50) COLLATE pg_catalog."default" NOT NULL,
    nombre character varying(100) COLLATE pg_catalog."default" NOT NULL,
    descripcion text COLLATE pg_catalog."default",
    precio numeric(10,2) NOT NULL,
    stock integer NOT NULL,
    categoria character varying(50) COLLATE pg_catalog."default",
    activo boolean DEFAULT true,
    fecha_creacion timestamp without time zone NOT NULL,
    fecha_actualizacion timestamp without time zone NOT NULL,
    CONSTRAINT productos_pkey PRIMARY KEY (id),
    CONSTRAINT productos_codigo_key UNIQUE (codigo)
    )

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS productos
    OWNER to postgres;
-- Index: idx_productos_categoria

-- DROP INDEX IF EXISTS public.idx_productos_categoria;

CREATE INDEX IF NOT EXISTS idx_productos_categoria
    ON productos USING btree
    (categoria COLLATE pg_catalog."default" ASC NULLS LAST)
    TABLESPACE pg_default;
-- Index: idx_productos_codigo

-- DROP INDEX IF EXISTS public.idx_productos_codigo;

CREATE INDEX IF NOT EXISTS idx_productos_codigo
    ON productos USING btree
    (codigo COLLATE pg_catalog."default" ASC NULLS LAST)
    TABLESPACE pg_default;
-- Index: idx_productos_nombre

-- DROP INDEX IF EXISTS public.idx_productos_nombre;

CREATE INDEX IF NOT EXISTS idx_productos_nombre
    ON productos USING btree
    (nombre COLLATE pg_catalog."default" ASC NULLS LAST)
    TABLESPACE pg_default;

INSERT INTO productos(
    codigo, nombre, descripcion, precio, stock, categoria, activo, fecha_creacion, fecha_actualizacion)
VALUES ('PROD-001', 'Laptop Gamer', 'Laptop de alto rendimiento con GPU dedicada.', 4599.99, 10, 'Tecnologia', true, '2025-03-21 22:54:24.935957', '2025-03-21 22:54:24.935957');


-- Table: public.clientes

-- DROP TABLE IF EXISTS public.clientes;

CREATE TABLE IF NOT EXISTS clientes
(
    id uuid NOT NULL,
    nombres character varying(100) COLLATE pg_catalog."default" NOT NULL,
    apellidos character varying(100) COLLATE pg_catalog."default" NOT NULL,
    dni character varying(8) COLLATE pg_catalog."default" NOT NULL,
    correo character varying(50) COLLATE pg_catalog."default" NOT NULL,
    telefono character varying(10) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT clientes_pkey PRIMARY KEY (id)
    )

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS clientes
    OWNER to postgres;
-- Index: idx_clientes_apellidos

-- DROP INDEX IF EXISTS public.idx_clientes_apellidos;

CREATE INDEX IF NOT EXISTS idx_clientes_apellidos
    ON clientes USING btree
    (apellidos COLLATE pg_catalog."default" ASC NULLS LAST)
    TABLESPACE pg_default;
-- Index: idx_clientes_dni

-- DROP INDEX IF EXISTS public.idx_clientes_dni;

CREATE INDEX IF NOT EXISTS idx_clientes_dni
    ON clientes USING btree
    (dni COLLATE pg_catalog."default" ASC NULLS LAST)
    TABLESPACE pg_default;
-- Index: idx_clientes_nombres

-- DROP INDEX IF EXISTS public.idx_clientes_nombres;

CREATE INDEX IF NOT EXISTS idx_clientes_nombres
    ON clientes USING btree
    (nombres COLLATE pg_catalog."default" ASC NULLS LAST)
    TABLESPACE pg_default;

INSERT INTO public.clientes(
    nombres, apellidos, dni, correo, telefono)
VALUES ( 'Robinson', 'Santillan Fonseca', '42814546', 'robinson@example.com', '992541789');