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

        JOptionPane.showMessageDialog(null, "Solo se necesita el Id para Eliminar, el Id no se puede Actualizar", "Id: Agrega, Elimina, Actualiza", JOptionPane.INFORMATION_MESSAGE);
JOptionPane.showMessageDialog(null, "Los mismos campos es para todo", "Id: Agrega, Elimina, Actualiza", JOptionPane.INFORMATION_MESSAGE);
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
