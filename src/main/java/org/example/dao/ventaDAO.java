package org.example.dao;

import org.example.modelos.ventaModel;

import java.util.List;

public interface ventaDAO {

    void crear (ventaModel ventaModel);
    ventaModel leer (int id);
    void actualizar (ventaModel ventaModel);
    void eliminar (int id);
    List<ventaModel> listaTodos();
}
