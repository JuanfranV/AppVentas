package org.example.dao.impl;

import org.example.dao.clienteDAO;
import org.example.modelos.clienteModel;

import java.util.ArrayList;
import java.util.List;

public class clienteDAOImpl implements clienteDAO {

    private List<clienteModel> clientes = new ArrayList<>();

    @Override
    public void crear(clienteModel clienteModel){
        clientes.add(clienteModel);
    }

    @Override
    public clienteModel leer (int id){
        return clientes.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void actualizar (clienteModel clienteModel){
        clienteModel existencia = leer(clienteModel.getId());
        if (existencia != null){
            existencia.setNombre(clienteModel.getNombre());
        }
    }

    @Override
    public void eliminar (int id){
        clientes.removeIf(c -> c.getId() == id);
    }

    @Override
    public List<clienteModel> listaTodos(){
        return new ArrayList<>(clientes);
    }

}
