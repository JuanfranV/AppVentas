package org.example.vistas.productoVista;

import javax.swing.*;

public class productoEditar extends JDialog{
    private JTextField textPrecio;
    private JTextField textNombre;
    private JButton buttonEditar;
    private JPanel panelEditar;
    private JTextArea textArea1;

    public productoEditar(){
        setContentPane(panelEditar);
        setSize(600, 400);
        setModal(true);
        setLocationRelativeTo(null);


    }

    public static void main(String [] args){
        productoEditar dialog = new productoEditar();
        dialog.setVisible(true);
    }
}
