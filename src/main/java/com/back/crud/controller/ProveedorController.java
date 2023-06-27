package com.back.crud.controller;
import com.back.crud.entities.Proveedor;
import com.back.crud.service.IProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ProveedorController {

    @Autowired
    IProveedorService service;

    @GetMapping("/api/proveedor")
    public List<Proveedor>listar() {
        return service.list();
    }

    @GetMapping("/api/proveedor/listarId")
    public Proveedor listarId(@Param("id") int id) {
        return service.listId(id);
    }

    @PostMapping("/api/proveedor/agregar")
    public Proveedor agregar(@RequestBody Proveedor pro) {
        return service.add(pro);
    }

    @PutMapping("/api/proveedor/editar")
    public Proveedor editar(@RequestBody Proveedor pro, @Param("id") int id) {
        pro.setId(id);
        return service.edit(pro);
    }

    @DeleteMapping("/api/proveedor/delete")
    public Proveedor delete(@Param("id") int id) {
        return service.delete(id);
    }
}
