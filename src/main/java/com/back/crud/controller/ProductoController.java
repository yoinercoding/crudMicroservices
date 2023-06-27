package com.back.crud.controller;
import com.back.crud.entities.Producto;
import com.back.crud.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    IProductoService service;

    @GetMapping("/api/producto")
    public List<Producto>listar() {
        return service.list();
    }

    @GetMapping("/api/producto/listarPrecio")
    public List <Producto> listarPrecio() {
        return service.listByOrderPrice();
    }

    @GetMapping("/api/producto/listarId")
    public Producto listarId(@Param("id") int id) {
        return service.listId(id);
    }

    @PostMapping("/api/producto/agregar")
    public Producto agregar(@RequestBody Producto p) {
        return service.add(p);
    }

    @PutMapping("/api/producto/editar")
    public Producto editar(@RequestBody Producto p, @Param("id") int id) {
        p.setId(id);
        return service.edit(p);
    }

    @DeleteMapping("/api/producto/delete")
    public Producto delete(@Param("id") int id) {
        return service.delete(id);
    }
}
