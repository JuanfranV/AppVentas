package org.example.vistas.ventaVista;

import org.example.dao.impl.productoDAOImpl;
import org.example.dao.impl.ventaDAOImpl;
import org.example.modelos.productoModel;
import org.example.modelos.ventaModel;
import org.example.vistas.menuFormulario;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventaFormulario extends JDialog{
    private JPanel panelVenta;
    private JButton buttonVolver;
    private JButton buttonAgreagarVenta;
    private JTextField textCantidad;
    private JTable table1;
    private JTextField txtId;
    private JTextField txtProducto;
    private JButton buttonEditar;
    private JButton buttonEliminar;
    private JButton buttonListarProductos;
    private JButton buttonListarVentas;

    private productoDAOImpl productoDAOImpl = new productoDAOImpl();
    private ventaDAOImpl ventaDAOImpl = new ventaDAOImpl();
    private ventaModel ventaModel = new ventaModel();

    public ventaFormulario (){
        setContentPane(panelVenta);
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
        buttonListarProductos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
            }
        });
        buttonListarVentas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("Id");
                model.addColumn("Producto");
                model.addColumn("Cantidad");

                if (ventaDAOImpl.listaTodos() != null){
                    for (ventaModel fila: ventaDAOImpl.listaTodos()){
                        model.addRow(new Object[]{
                                fila.getId(),
                                fila.getProducto(),
                                fila.getCantidad(),
                        });
                    }
                }
                table1.setModel(model);
            }
        });
        buttonAgreagarVenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventaModel = new ventaModel();
                ventaModel.setId(Integer.parseInt(txtId.getText()));
                ventaModel.setProducto(txtProducto.getText());
                ventaModel.setCantidad(Integer.parseInt(textCantidad.getText()));
                ventaDAOImpl.crear(ventaModel);

                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("Id");
                model.addColumn("Producto");
                model.addColumn("Cantidad");

                if (ventaDAOImpl.listaTodos() != null){
                    for (ventaModel fila: ventaDAOImpl.listaTodos()){
                        model.addRow(new Object[]{
                                fila.getId(),
                                fila.getProducto(),
                                fila.getCantidad(),
                        });
                    }
                }
                table1.setModel(model);
                txtProducto.setText("");
                txtId.setText("");
                textCantidad.setText("");
            }
        });
        buttonEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventaDAOImpl.eliminar(Integer.parseInt(txtId.getText()));

                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("Id");
                model.addColumn("Producto");
                model.addColumn("Cantidad");

                if (ventaDAOImpl.listaTodos() != null){
                    for (ventaModel fila: ventaDAOImpl.listaTodos()){
                        model.addRow(new Object[]{
                                fila.getId(),
                                fila.getProducto(),
                                fila.getCantidad(),
                        });
                    }
                }
                table1.setModel(model);
                txtProducto.setText("");
                txtId.setText("");
                textCantidad.setText("");
                JOptionPane.showMessageDialog(null, "Se eliminó de la lista", "Sistema", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        buttonEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventaModel.setId(Integer.parseInt(txtId.getText()));
                ventaModel.setProducto(txtProducto.getText());
                ventaModel.setCantidad(Integer.parseInt(textCantidad.getText()));
                ventaDAOImpl.actualizar(ventaModel);

                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("Id");
                model.addColumn("Producto");
                model.addColumn("Cantidad");

                if (ventaDAOImpl.listaTodos() != null){
                    for (ventaModel fila: ventaDAOImpl.listaTodos()){
                        model.addRow(new Object[]{
                                fila.getId(),
                                fila.getProducto(),
                                fila.getCantidad(),
                        });
                    }
                }
                table1.setModel(model);
                txtProducto.setText("");
                txtId.setText("");
                textCantidad.setText("");
            }
        });
    }

    public static void main(String [] args){
        ventaFormulario dialog = new ventaFormulario();
        dialog.setVisible(true);
    }
}
