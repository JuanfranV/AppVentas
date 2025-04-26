package org.example.vistas.ventaVista;

import javax.swing.*;

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
    private JTextField txtEdOEl;
    private JButton buttonListarProductos;
    private JButton buttonListarVentas;

    public ventaFormulario (){
        setContentPane(panelVenta);
        setSize(900, 600);
        setLocationRelativeTo(null);
        setModal(true);


    }

    public static void main(String [] args){
        ventaFormulario dialog = new ventaFormulario();
        dialog.setVisible(true);
    }
}
