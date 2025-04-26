package org.example.vistas.productoVista;

import javax.swing.*;

public class productoFormulario extends JDialog{
    private JPanel panelProducto;
    private JButton buttonVolver;
    private JButton buttonAgreagarProducto;
    private JTable table1;
    private JTextField txtId;
    private JTextField txtNombre;
    private JButton buttonEditar;
    private JButton buttonEliminar;
    private JTextField txtEdOEl;
    private JTextField textPrecio;
    private JTextArea textDescripcion;

    public productoFormulario(){
        setContentPane(panelProducto);
        setSize(900, 600);
        setLocationRelativeTo(null);
        setModal(true);


    }

    public static void main(String [] args){
        productoFormulario dialog = new productoFormulario();
        dialog.setVisible(true);
    }
}
