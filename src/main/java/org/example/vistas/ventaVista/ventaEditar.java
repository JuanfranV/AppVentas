package org.example.vistas.ventaVista;

import javax.swing.*;

public class ventaEditar extends JDialog{
    private JPanel panelEditar;
    private JTextField textProducto;
    private JTextField textCantidad;
    private JButton buttonEditar;

    public ventaEditar(){
        setContentPane(panelEditar);
        setModal(true);
        setSize(600, 400);
        setLocationRelativeTo(null);
    }

    public static void main(String [] args){
        ventaEditar dialog = new ventaEditar();
        dialog.setVisible(true);
    }
}
