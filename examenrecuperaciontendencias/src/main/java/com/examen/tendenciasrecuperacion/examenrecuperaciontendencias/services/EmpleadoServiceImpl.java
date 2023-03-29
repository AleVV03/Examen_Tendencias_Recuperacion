package com.examen.tendenciasrecuperacion.examenrecuperaciontendencias.services;

import com.examen.tendenciasrecuperacion.examenrecuperaciontendencias.models.Empleado;
import com.examen.tendenciasrecuperacion.examenrecuperaciontendencias.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceImpl extends GenericServiceImpl<Empleado, Long> implements EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;
    @Override
    public CrudRepository<Empleado, Long> getDao() { return empleadoRepository;
    }
}

