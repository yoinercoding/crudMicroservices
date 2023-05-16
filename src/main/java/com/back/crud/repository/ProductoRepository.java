package com.back.crud.repository;

import com.back.crud.entity.Producto;
import org.springframework.data.repository.Repository;
import java.util.List;

public interface ProductoRepository extends Repository<Producto, Integer> {
    List<Producto>findAll();
    List<Producto>findByOrderByPrecioAsc();
    Producto findById(int ind);
    Producto save(Producto p);
    void delete(Producto p);
}
