package org.example.dao.impl;

import org.example.dao.ventaDAO;
import org.example.modelos.ventaModel;

import java.util.ArrayList;
import java.util.List;

public class ventaDAOImpl implements ventaDAO {

    private List<ventaModel> ventas = new ArrayList<>();

    @Override
    public void crear(ventaModel ventaModel){
        ventas.add(ventaModel);
    }

    @Override
    public ventaModel leer (int id){
        return ventas.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void actualizar (ventaModel ventaModel){
        ventaModel existencia = leer(ventaModel.getId());
        if (existencia != null){
            existencia.setProducto(ventaModel.getProducto());
        }

    }

    @Override
    public void eliminar (int id){
        ventas.removeIf(c -> c.getId() == id);
    }

    @Override
    public List<ventaModel> listaTodos(){
        return new ArrayList<>(ventas);
    }


}
