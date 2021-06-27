/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio03;

/**
 *
 * @author Pc
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class InterfazPrincipal extends JFrame implements ActionListener {

    public InterfazPrincipal() {
        setSize(600, 500);
        setResizable(true);
        setLocationRelativeTo(null);
        setTitle("Laboratorio 04");
        p = new JPanel();
        p.setLayout(null);

        b1 = new JButton("Método de la Burbuja");
        b1.setBounds(180, 100, 230, 20);
        b1.addActionListener(this);
        p.add(b1);

        b2 = new JButton("Método de Insercción Directa");
        b2.setBounds(180, 150, 230, 20);
        b2.addActionListener(this);
        p.add(b2);

        b3 = new JButton("Método de Selección Directa");
        b3.setBounds(180, 200, 230, 20);
        b3.addActionListener(this);
        p.add(b3);

        b4 = new JButton("Método QuickSort");
        b4.setBounds(180, 250, 230, 20);
        b4.addActionListener(this);
        p.add(b4);

        add(p);
        setVisible(true);
    }

    private JLabel l, l2;
    private JPanel p;
    private JButton b1, b2, b3, b4;
    private double vuelto;
    private String cadena = "<html><body>";

    @Override

    public void actionPerformed(ActionEvent ae) {
         this.setVisible(false);
        if (ae.getSource() == b1) {//podemos comparar por el nombre del objeto del boton
            this.setVisible(false);  
            Interfaz v1 = new Interfaz();
            v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cambiamos el tamaño de la ventana
        }

        if (ae.getSource() == b2) {//podemos comparar por el nombre del objeto del boton
            this.setVisible(false);
            Interfaz2 v2 = new Interfaz2();
            v2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        if (ae.getSource() == b3) {//podemos comparar por el nombre del objeto del boton
            this.setVisible(false);
            Interfaz3 v3 = new Interfaz3();
            v3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        if (ae.getSource() == b4) {//podemos comparar por el nombre del objeto del boton
            this.setVisible(false);
            Interfaz4 v4 = new Interfaz4();
            v4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    }
}
