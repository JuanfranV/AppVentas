package org.example.vistas;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;

public class menuFormulario extends JDialog{
    private JPanel panelmenu;
    private JButton buttonClientes;
    private JButton buttonProductos;
    private JButton buttonVentas;

    public menuFormulario (){
        setSize(600,400);
        setLocationRelativeTo(null);
        setContentPane(panelmenu);
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
