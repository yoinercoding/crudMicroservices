package com.back.crud.services.Proveedor;

import com.back.crud.entities.Proveedor;
import java.util.List;
public interface IProveedorService {

    List<Proveedor>list();
    Proveedor listId(int id);
    Proveedor add(Proveedor p);
    Proveedor edit(Proveedor p);
    Proveedor delete(int id);

}
