package com.examen.tendenciasrecuperacion.examenrecuperaciontendencias.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "maquina")
public class Maquina {
    private String nombre;
    private String marca;
    private String modelo;
    private Integer precio;
    private String description;


}
