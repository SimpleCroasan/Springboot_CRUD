-- Tabla: pais
CREATE TABLE pais (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL
);

-- Tabla: estado
CREATE TABLE estado (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    pais_id INTEGER,
    CONSTRAINT fk_estado_pais FOREIGN KEY (pais_id) REFERENCES pais(id)
);

-- Tabla: persona
CREATE TABLE persona (
    id SERIAL PRIMARY KEY,
    Nombre_Completo VARCHAR(255) NOT NULL,
    edad INT NOT NULL,
    Id_Pais INTEGER,
    Id_Estado INTEGER,
    CONSTRAINT fk_persona_pais FOREIGN KEY (Id_Pais) REFERENCES pais(id),
    CONSTRAINT fk_persona_estado FOREIGN KEY (Id_Estado) REFERENCES estado(id)
);
