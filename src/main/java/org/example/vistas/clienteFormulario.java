package org.example.vistas;

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
    private JTextField textField1;

    public clienteFormulario () {
        setContentPane(panelCliente);
        setModal(true);
        setSize(600, 400);
        setLocationRelativeTo(null);
    }

    public static void main(String [] args){
        clienteFormulario dialog = new clienteFormulario();
        dialog.setVisible(true);
    }
}
