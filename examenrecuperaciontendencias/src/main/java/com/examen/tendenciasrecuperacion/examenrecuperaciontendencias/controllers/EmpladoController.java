package com.examen.tendenciasrecuperacion.examenrecuperaciontendencias.controllers;

import com.examen.tendenciasrecuperacion.examenrecuperaciontendencias.models.Empleado;
import com.examen.tendenciasrecuperacion.examenrecuperaciontendencias.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/examenrecuperacion")
public class EmpladoController {
    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/listar")
    public ResponseEntity<List<Empleado>> listarempleado() {
        return new ResponseEntity<List<Empleado>>(empleadoService.findByAll(),
                HttpStatus.OK);
    }
    @PostMapping("/crear")
    public ResponseEntity<Empleado> crearempleado(
            @RequestBody Empleado p) {
        return new ResponseEntity<>(empleadoService.save(p),
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Empleado> actualizarempleado(@PathVariable Long id, @RequestBody Empleado p) {
        Empleado r = empleadoService.findById(id);
        if (r == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                r.setNombre(p.getNombre());
                r.setApellido(p.getApellido());
                r.setCelular(p.getCelular());
                r.setCorreo(p.getCorreo());
                r.setCorreo(p.getCorreo());
                r.setListaFabrica(p.getListaFabrica());
                r.setMaquina(p.getMaquina());
                r.setTipo_emplado(p.getTipo_emplado());
                return new ResponseEntity<>(empleadoService.save(r), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Empleado> eliminarempleado(@PathVariable Long id) {
        empleadoService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

