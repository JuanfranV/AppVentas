package org.example.dao;

import org.example.modelos.productoModel;

import java.util.List;

public interface productoDAO {

    void crear (productoModel productoModel);
    productoModel leer (int id);
    void actualizar (productoModel productoModel);
    void eliminar (int id);
    List<productoModel> listaTodos();
}
