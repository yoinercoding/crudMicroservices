package com.back.crud.controller;
import com.back.crud.entities.Empleado;
import com.back.crud.services.Empleado.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class EmpleadoController {

    @Autowired
    IEmpleadoService service;

    @GetMapping("/api/empleado")
    public List<Empleado>listar() {
        return service.list();
    }

    @GetMapping("/api/empleado/listarId")
    public Empleado listarId(@Param("id") int id) {
        return service.listId(id);
    }

    @PostMapping("/api/empleado/agregar")
    public Empleado agregar(@RequestBody Empleado e) {
        return service.add(e);
    }

    @PutMapping("/api/empleado/editar")
    public Empleado editar(@RequestBody Empleado e, @Param("id") int id) {
        e.setId(id);
        return service.edit(e);
    }

    @DeleteMapping("/api/empleado/delete")
    public Empleado delete(@Param("id") int id) {
        return service.delete(id);
    }
}
