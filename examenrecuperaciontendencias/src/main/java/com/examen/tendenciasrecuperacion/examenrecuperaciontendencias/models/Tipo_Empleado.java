package com.examen.tendenciasrecuperacion.examenrecuperaciontendencias.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "tipo_empleado")
public class Tipo_Empleado {
    private  String nombre_puesto;
    private String description;
}
