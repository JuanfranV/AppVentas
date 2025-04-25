package org.example.vistas.clienteVista;

import javax.swing.*;

public class clienteFormulario extends JDialog{

    private JPanel panelCliente;
    private JButton buttonVolver;
    private JButton buttonAgreagarCliente;
    private JTable table1;
    private JTextField txtTelefono;
    private JTextField txtId;
    private JTextField txtNombre;
    private JButton buttonEditar;
    private JButton buttonEliminar;
    private JTextField txtEdOEl;

    public clienteFormulario () {
        setContentPane(panelCliente);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setModal(true);


    }

    public static void main(String [] args){
        clienteFormulario dialog = new clienteFormulario();
        dialog.setVisible(true);
    }
}
