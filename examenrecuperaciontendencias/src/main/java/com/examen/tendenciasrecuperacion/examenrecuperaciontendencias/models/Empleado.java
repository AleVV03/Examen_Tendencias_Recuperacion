package com.examen.tendenciasrecuperacion.examenrecuperaciontendencias.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "empleado")
public class Empleado {
    @Id
    private Long id;
    private String nombre;

    private String apellido;

    private String celular;

    private String correo;

    private String direccion;
    private Tipo_Empleado tipo_emplado;
    private Maquina maquina;
    private List<Fabrica> listaFabrica;

}
