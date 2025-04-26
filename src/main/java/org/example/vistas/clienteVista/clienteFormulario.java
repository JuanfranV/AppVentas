package org.example.vistas.clienteVista;

import org.example.dao.impl.clienteDAOImpl;
import org.example.modelos.clienteModel;
import org.example.vistas.menuFormulario;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    private clienteDAOImpl clienteDAOImpl = new clienteDAOImpl();
    private clienteModel clienteModel = new clienteModel();

    public clienteFormulario () {
        setContentPane(panelCliente);
        setSize(900, 600);
        setLocationRelativeTo(null);
        setModal(true);


        buttonVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuFormulario menuFormulario = new menuFormulario();
                menuFormulario.setVisible(true);
                dispose();
            }
        });

        buttonAgreagarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clienteModel = new clienteModel();
                clienteModel.setId(Integer.parseInt(txtId.getText()));
                clienteModel.setNombre(txtNombre.getText());
                clienteModel.setTelefono(txtTelefono.getText());
                clienteDAOImpl.crear(clienteModel);

                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("Id");
                model.addColumn("Nombre");
                model.addColumn("Teléfono");

                if (clienteDAOImpl.listaTodos() != null){
                    for (clienteModel fila: clienteDAOImpl.listaTodos()){
                        model.addRow(new Object[]{
                                fila.getId(),
                                fila.getNombre(),
                                fila.getTelefono()
                        });
                    }
                }

                table1.setModel(model);
                txtId.setText("");
                txtNombre.setText("");
                txtTelefono.setText("");
            }
        });
    }

    public static void main(String [] args){
        clienteFormulario dialog = new clienteFormulario();
        dialog.setVisible(true);
    }
}
