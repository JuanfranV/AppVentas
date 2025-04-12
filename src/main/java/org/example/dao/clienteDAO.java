package org.example.dao;

import org.example.modelos.clienteModel;

import java.util.List;

public interface clienteDAO {

    void crear (clienteModel clienteModel);
    clienteModel leer (int id);
    void actualizar (clienteModel clienteModel);
    void eliminar (int id);
    List<clienteModel> listaTodos();
}
