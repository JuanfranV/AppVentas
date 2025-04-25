package org.example.vistas.clienteVista;

import javax.swing.*;

public class clienteEditar extends JDialog{
    private JTextField textNombreEditar;
    private JTextField textTelefonoEditar;
    private JButton buttonEditar;
    private JPanel panelEditarCliente;

    public clienteEditar(){
    setContentPane(panelEditarCliente);
    setModal(true);
    setLocationRelativeTo(null);
    setSize(600, 400);


    }

    public static void main(String [] args){
        clienteEditar dialog = new clienteEditar();
        dialog.setVisible(true);

    }
}
