package org.example.dao.impl;

import org.example.dao.productoDAO;
import org.example.modelos.productoModel;

import java.util.ArrayList;
import java.util.List;

public class productoDAOImpl implements productoDAO {

    private List<productoModel> productos = new ArrayList<>();

    @Override
    public void crear(productoModel productoModel){
        productos.add(productoModel);
    }

    @Override
    public productoModel leer (int id){
        return productos.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void actualizar (productoModel productoModel){
        productoModel existencia = leer(productoModel.getId());
        if (existencia != null){
            existencia.setNombre(productoModel.getNombre());
        }

    }

    @Override
    public void eliminar (int id){
        productos.removeIf(c -> c.getId() == id);
    }

    @Override
    public List<productoModel> listaTodos(){

        return new ArrayList<>(productos);
    }
}
