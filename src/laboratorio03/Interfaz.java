package laboratorio03;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.System.exit;
import javax.swing.*;
import javax.swing.JScrollPane;


public final class Interfaz extends JFrame implements ActionListener{

    public Interfaz() {      
        
        JScrollPane scrollPane;
        setSize(630,500);
        setResizable(true);
        setLocationRelativeTo(null);
        
        setTitle("Laboratorio 04");
        p = new JPanel();
        
        scrollPane= new JScrollPane();
        scrollPane.setBounds(50, 60, 500, 770);
        
        p.setLayout(null);
        l = new JLabel("Método de la Burbuja");
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
        Empresa miEmpresa1 = new Empresa();
        miEmpresa1.OrdenBurbuja();
        //Método Burbuja

        for (int i = 0; i < miEmpresa1.getNumeroDeEmpleados(); i++) {
            
            cadena += "<div  style=\"overflow: auto\">";
            cadena += "<table>";
            cadena += "<div  style=\"overflow: auto\">";
            cadena +="<tr style=\"border: hidden\">";
            
            cadena += "<td width=\"200\"  rowspan=\"60\"> Código : ";
            cadena += String.valueOf(miEmpresa1.getCodigoDelEmpleado(i));
            cadena +="</td>";
            
            cadena += "<td width=\"200\"  rowspan=\"60\"> Nombre : ";
            cadena += String.valueOf(miEmpresa1.getNombreDelEmpleado(i));
            cadena += " </td> ";
 
            cadena += "<td width=\"200\"  rowspan=\"60\"> Sueldo : ";
            cadena += String.valueOf(miEmpresa1.getSueldoDelEmpleado(i));
            cadena += " </td> ";         
            cadena += "</tr>";
            cadena+="</table>";
           // System.out.printf("%10d%10s%10.2f\n", miEmpresa1.getCodigoDelEmpleado(i), miEmpresa1.getNombreDelEmpleado(i), miEmpresa1.getSueldoDelEmpleado(i));
            cadena+="</br>";
        //        
        }
         cadena += "<table>";    
        cadena += "<tr>";
        cadena += "<td width=\\\"200\\\"  rowspan=\\\"60\\\">  Número de comparaciones : ";
        cadena += String.valueOf(miEmpresa1.getComparaciones());
        cadena +="</td>";
        cadena += "</tr>";
        cadena += "<tr>";
        cadena += "<td width=\\\"200\\\"  rowspan=\\\"60\\\"> Número de intercambios : ";
        cadena += String.valueOf(miEmpresa1.getIntercambios());
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
        
    }
}
