package com.back.crud.service;

import java.util.List;

import com.back.crud.entity.Producto;
import com.back.crud.repository.ProductoRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ProductoServiceImp implements ProductoService{

    @Autowired
    private ProductoRepository repository;

    @Override
    public List<Producto> list() {
        return repository.findAll();
    }
    @Override
    public List<Producto> listByOrderPrice() {
        return repository.findByOrderByPrecioAsc();
    }
    @Override
    public Producto listId(int id) {
        return repository.findById(id);
    }

    @Override
    public Producto add(Producto p) {
        return repository.save(p);
    }

    @Override
    public Producto edit(Producto p) {
        return repository.save(p);
    }

    @Override
    public Producto delete(int id) {
        Producto p = repository.findById(id);
        if(p!=null) {
            repository.delete(p);
        }
        return p;
    }
}
