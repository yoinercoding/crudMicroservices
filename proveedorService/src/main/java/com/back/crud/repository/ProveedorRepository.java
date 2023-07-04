package com.back.crud.repository;

import com.back.crud.entities.Proveedor;
import org.springframework.data.repository.Repository;
import java.util.List;

public interface ProveedorRepository extends Repository<Proveedor, Integer> {
    List<Proveedor>findAll();
    Proveedor findById(int ind);
    Proveedor save(Proveedor p);
    void delete(Proveedor p);
}
