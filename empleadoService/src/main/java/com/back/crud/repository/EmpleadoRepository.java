package com.back.crud.repository;

import com.back.crud.entities.Empleado;
import org.springframework.data.repository.Repository;
import java.util.List;

public interface EmpleadoRepository extends Repository<Empleado, Integer> {
    List<Empleado>findAll();
    Empleado findById(int ind);
    Empleado save(Empleado p);
    void delete(Empleado p);
}
