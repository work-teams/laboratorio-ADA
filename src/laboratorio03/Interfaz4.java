/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio03;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.System.exit;
import javax.swing.*;
import javax.swing.JScrollPane;

public final class Interfaz4 extends JFrame implements ActionListener{

    public Interfaz4() {
        
        JScrollPane scrollPane;
        setSize(630,500);
        setResizable(true);
        setLocationRelativeTo(null);
        
        setTitle("Laboratorio 04");
        p = new JPanel();
        
        scrollPane= new JScrollPane();
        scrollPane.setBounds(50, 60, 500, 770);
        
        p.setLayout(null);
        l = new JLabel("Método de QuickSort");
        l.setBounds(240,30,230,20);
        p.add(l);
        
        l2 = new JLabel(resultado());
        l2.setBounds(50,0,600,770);
        p.add(l2);
        
        p.setPreferredSize(new  Dimension(500,770));
        scrollPane.setViewportView(p);
        
        b1 = new JButton("Volver al menu");
        b1.setBounds(270,700,120,20);
        b1.addActionListener(this);
        p.add(b1);
        
       
        add(scrollPane);
        //add(p);
        setVisible(true);
    }
    
    public String resultado() {
        //Metodo seleccionDirecta        
              
        Empresa miEmpresa4 = new Empresa();
            miEmpresa4.QuickSort(0, 19);
            for (int i = 0; i < miEmpresa4.getNumeroDeEmpleados(); i++) {
            
            cadena += "<table center>";

            cadena +="<tr style=\"border: hidden\">";
            
            cadena += "<td width=\"200\"  rowspan=\"60\"> Código : ";
            cadena += String.valueOf(miEmpresa4.getCodigoDelEmpleado(i));
            cadena +="</td>";
            
            cadena += "<td width=\"200\"  rowspan=\"60\"> Nombre : ";
            cadena += String.valueOf(miEmpresa4.getNombreDelEmpleado(i));
            cadena += " </td> ";
 
            cadena += "<td width=\"200\"  rowspan=\"60\"> Sueldo : ";
            cadena += String.valueOf(miEmpresa4.getSueldoDelEmpleado(i));
            cadena += " </td> ";         
            cadena += "</tr>";
            cadena+="</table>";        
            }    
         cadena += "<table>";    
        cadena += "<tr>";
        cadena += "<td width=\\\"200\\\"  rowspan=\\\"60\\\">  Número de comparaciones : ";
        cadena += String.valueOf(miEmpresa4.getComparaciones1());
        cadena +="</td>";
        cadena += "</tr>";
        cadena += "<tr>";
        cadena += "<td width=\\\"200\\\"  rowspan=\\\"60\\\"> Número de intercambios : ";
        cadena += String.valueOf(miEmpresa4.getIntercambios1());
        cadena +="</td>";
        cadena += "</tr>";
        cadena += "</body></html>";
        return cadena;
    }

    private JLabel l, l2;
    private JPanel p;
    private JButton b1;
    private String cadena = "<html><body>";
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        this.dispose();
        if (ae.getSource() == b1) {//podemos comparar por el nombre del objeto del boton
            this.setVisible(false);
            InterfazPrincipal ip = new InterfazPrincipal();
            ip.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cambiamos el tamaño de la ventana
        }
        //exit(0);
    }
}