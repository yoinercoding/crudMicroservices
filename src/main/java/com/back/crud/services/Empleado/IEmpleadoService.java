package com.back.crud.services.Empleado;

import com.back.crud.entities.Empleado;
import java.util.List;
public interface IEmpleadoService {

    List<Empleado>list();
    Empleado listId(int id);
    Empleado add(Empleado p);
    Empleado edit(Empleado p);
    Empleado delete(int id);

}
