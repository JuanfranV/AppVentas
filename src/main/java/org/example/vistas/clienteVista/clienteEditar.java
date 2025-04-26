package org.example.vistas.clienteVista;

import org.example.dao.impl.clienteDAOImpl;
import org.example.modelos.clienteModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class clienteEditar extends JDialog{
    private JTextField textNombreEditar;
    private JTextField textTelefonoEditar;
    private JButton buttonEditar;
    private JPanel panelEditarCliente;

    private clienteDAOImpl clienteDAOImpl = new clienteDAOImpl();
    private clienteModel clienteModel = new clienteModel();
    public clienteEditar(){
    setContentPane(panelEditarCliente);
    setModal(true);
    setLocationRelativeTo(null);
    setSize(600, 400);


        buttonEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clienteModel.setNombre(textNombreEditar.getText());
                clienteModel.setTelefono(textTelefonoEditar.getText());
                clienteDAOImpl.actualizar(clienteModel);

                clienteFormulario clienteFormulario = new clienteFormulario();
                clienteFormulario.setVisible(true);
                setVisible(false);
            }
        });
    }

    public static void main(String [] args){
        clienteEditar dialog = new clienteEditar();
        dialog.setVisible(true);

    }
}
