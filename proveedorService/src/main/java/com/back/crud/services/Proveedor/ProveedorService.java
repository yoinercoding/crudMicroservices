package com.back.crud.services.Proveedor;

import java.util.List;
import com.back.crud.entities.Proveedor;
import com.back.crud.repository.ProveedorRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ProveedorService implements IProveedorService {

    @Autowired
    private ProveedorRepository repository;

    @Override
    public List<Proveedor> list() {
        return repository.findAll();
    }
    @Override
    public Proveedor listId(int id) {
        return repository.findById(id);
    }

    @Override
    public Proveedor add(Proveedor pro) {
        return repository.save(pro);
    }

    @Override
    public Proveedor edit(Proveedor pro) {
        return repository.save(pro);
    }

    @Override
    public Proveedor delete(int id) {
        Proveedor pro = repository.findById(id);
        if(pro!=null) {
            repository.delete(pro);
        }
        return pro;
    }
}
