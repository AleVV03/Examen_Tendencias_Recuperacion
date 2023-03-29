package com.examen.tendenciasrecuperacion.examenrecuperaciontendencias.repository;

import com.examen.tendenciasrecuperacion.examenrecuperaciontendencias.models.Empleado;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmpleadoRepository extends MongoRepository<Empleado, Long> {
}
