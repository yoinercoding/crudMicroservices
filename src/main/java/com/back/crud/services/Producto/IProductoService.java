package com.back.crud.services.Producto;

import com.back.crud.entities.Producto;
import java.util.List;


public interface IProductoService {

    List<Producto>list();
    List<Producto>listByOrderPrice();
    Producto listId(int id);
    Producto add(Producto p);
    Producto edit(Producto p);
    Producto delete(int id);

}
