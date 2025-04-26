package org.example.vistas;

import com.formdev.flatlaf.FlatLightLaf;
import org.example.vistas.clienteVista.clienteFormulario;
import org.example.vistas.productoVista.productoFormulario;
import org.example.vistas.ventaVista.ventaFormulario;

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
                setVisible(false);
            }
        });

        buttonProductos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                productoFormulario productoFormulario = new productoFormulario();
                productoFormulario.setVisible(true);
                setVisible(false);
            }
        });


        buttonVentas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventaFormulario ventaFormulario = new ventaFormulario();
                ventaFormulario.setVisible(true);
                setVisible(false);
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
