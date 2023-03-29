package com.examen.tendenciasrecuperacion.examenrecuperaciontendencias.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "fabrica")
public class Fabrica {
    private String nombre;
    private String ruc;
    private String direccion;
    private Parqueadero parqueadero;
}
