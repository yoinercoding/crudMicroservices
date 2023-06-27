package com.back.crud.services.Empleado;

import java.util.List;
import com.back.crud.entities.Empleado;
import com.back.crud.repository.EmpleadoRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class EmpleadoService implements IEmpleadoService {

    @Autowired
    private EmpleadoRepository repository;

    @Override
    public List<Empleado> list() {
        return repository.findAll();
    }
    @Override
    public Empleado listId(int id) {
        return repository.findById(id);
    }

    @Override
    public Empleado add(Empleado e) {
        return repository.save(e);
    }

    @Override
    public Empleado edit(Empleado e) {
        return repository.save(e);
    }

    @Override
    public Empleado delete(int id) {
        Empleado e = repository.findById(id);
        if(e!=null) {
            repository.delete(e);
        }
        return e;
    }
}
