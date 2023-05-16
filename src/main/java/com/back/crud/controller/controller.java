package com.back.crud.controller;

import com.back.crud.entity.Producto;
import com.back.crud.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controller {

    @Autowired
    ProductoService service;

    @GetMapping("/producto")
    public List<Producto>listar() {
        return service.list();
    }

    @GetMapping("/listarPrecio")
    public List <Producto> listarPrecio() {
        return service.listByOrderPrice();
    }
    @GetMapping("/listarId")
    public Producto listarId(@Param("id") int id) {
        return service.listId(id);
    }
    @PostMapping("/agregar")
    public Producto agregar(@RequestBody Producto p) {
        return service.add(p);
    }
    @PutMapping("/editar")
    public Producto editar(@RequestBody Producto p, @Param("id") int id) {
        p.setId(id);
        return service.edit(p);
    }
    @DeleteMapping("/delete")
    public Producto delete(@Param("id") int id) {
        return service.delete(id);
    }
}
