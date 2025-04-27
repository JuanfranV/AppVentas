package org.example.vistas.productoVista;

import org.example.dao.impl.productoDAOImpl;
import org.example.modelos.productoModel;
import org.example.vistas.menuFormulario;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class productoFormulario extends JDialog{
    private JPanel panelProducto;
    private JButton buttonVolver;
    private JButton buttonAgreagarProducto;
    private JTable table1;
    private JTextField txtId;
    private JTextField txtNombre;
    private JButton buttonEditar;
    private JButton buttonEliminar;
    private JTextField textPrecio;
    private JTextArea textDescripcion;

    private productoModel productoModel = new productoModel();
    private productoDAOImpl productoDAOImpl = new productoDAOImpl();

    public productoFormulario(){
        setContentPane(panelProducto);
        setSize(900, 600);
        setLocationRelativeTo(null);


        buttonVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuFormulario menuFormulario = new menuFormulario();
                menuFormulario.setVisible(true);
                dispose();
            }
        });
        buttonAgreagarProducto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                productoModel = new productoModel();
                productoModel.setId(Integer.parseInt(txtId.getText()));
                productoModel.setNombre(txtNombre.getText());
                productoModel.setDescripcion(textDescripcion.getText());
                productoModel.setPrecio(Double.parseDouble(textPrecio.getText()));
                productoDAOImpl.crear(productoModel);

                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("Id");
                model.addColumn("Nombre");
                model.addColumn("Descripción");
                model.addColumn("Precio");

                if (productoDAOImpl.listaTodos() != null){
                    for (productoModel fila: productoDAOImpl.listaTodos()){
                        model.addRow(new Object[]{
                                fila.getId(),
                                fila.getNombre(),
                                fila.getDescripcion(),
                                fila.getPrecio()
                        });
                    }
                }

                table1.setModel(model);
                txtId.setText("");
                txtNombre.setText("");
                textDescripcion.setText("");
                textPrecio.setText("");
            }
        });
        buttonEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                productoDAOImpl.eliminar(Integer.parseInt(txtId.getText()));

                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("Id");
                model.addColumn("Nombre");
                model.addColumn("Descripción");
                model.addColumn("Precio");

                if (productoDAOImpl.listaTodos() != null){
                    for (productoModel fila: productoDAOImpl.listaTodos()){
                        model.addRow(new Object[]{
                                fila.getId(),
                                fila.getNombre(),
                                fila.getDescripcion(),
                                fila.getPrecio()
                        });
                    }
                }

                table1.setModel(model);
                txtId.setText("");
                txtNombre.setText("");
                textDescripcion.setText("");
                textPrecio.setText("");
                JOptionPane.showMessageDialog(null, "Se eliminó de la lista", "Sistema", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        buttonEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                productoModel.setId(Integer.parseInt(txtId.getText()));
                productoModel.setNombre(txtNombre.getText());
                productoModel.setDescripcion(textDescripcion.getText());
                productoModel.setPrecio(Double.parseDouble(textPrecio.getText()));
                productoDAOImpl.actualizar(productoModel);

                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("Id");
                model.addColumn("Nombre");
                model.addColumn("Descripción");
                model.addColumn("Precio");

                if (productoDAOImpl.listaTodos() != null){
                    for (productoModel fila: productoDAOImpl.listaTodos()){
                        model.addRow(new Object[]{
                                fila.getId(),
                                fila.getNombre(),
                                fila.getDescripcion(),
                                fila.getPrecio()
                        });
                    }
                }

                table1.setModel(model);
                txtId.setText("");
                txtNombre.setText("");
                textDescripcion.setText("");
                textPrecio.setText("");
            }
        });
    }

    public static void main(String [] args){
        productoFormulario dialog = new productoFormulario();
        dialog.setVisible(true);
    }
}
