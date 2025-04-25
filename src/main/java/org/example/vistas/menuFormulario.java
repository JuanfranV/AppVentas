package org.example.vistas;

import com.formdev.flatlaf.FlatLightLaf;
import org.example.vistas.clienteVista.clienteFormulario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menuFormulario extends JDialog{
    private JPanel panelmenu;
    private JButton buttonClientes;
    private JButton buttonProductos;
    private JButton buttonVentas;

    public menuFormulario (){
        setSize(600,400);
        setLocationRelativeTo(null);
        setContentPane(panelmenu);

        buttonClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clienteFormulario clienteFormulario = new clienteFormulario();
                clienteFormulario.setVisible(true);
            }
        });
    }

    public static void main(String[] args){
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }

        menuFormulario dialog = new menuFormulario();
        dialog.setVisible(true);
    }
}
