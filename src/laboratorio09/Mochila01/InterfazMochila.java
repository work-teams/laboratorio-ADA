
package laboratorio09.Mochila01;

import laboratorio09.Mochila01.Backtraking;
import laboratorio09.Mochila01.Inicio;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.System.exit;
import javax.swing.*;
import javax.swing.JScrollPane;

public class InterfazMochila extends JFrame implements ActionListener{
    
private int p1[];
    private int b12[];
    private int M;
    private int numeroPesos;
    
    public InterfazMochila(){
        JScrollPane scrollPane;
        setSize(500, 400);
        setResizable(true);
        setLocationRelativeTo(null);
        
        setTitle("Backtracking");
        p = new JPanel();

        scrollPane = new JScrollPane();
        scrollPane.setBounds(80, 100, 500, 770);

        p.setLayout(null);
        l0 = new JLabel("Mochila 01");
        l0.setBounds(200, 20, 230, 20);
        p.add(l0);

        l1 = new JLabel("Cantidad de Pesos a ingresar: ");
        l1.setBounds(10, 40, 180, 20);
        p.add(l1);

        field1 = new JTextField();
        field1.setBounds(200, 60, 150, 20);
        p.add(field1);
        
        l4 = new JLabel("Capacidad de la Mochila: ");
        l4.setBounds(10, 80, 180, 20);
        p.add(l4);

        field3 = new JTextField();
        field3.setBounds(200, 100, 150, 20);
        p.add(field3);
        
        p.setPreferredSize(new  Dimension(500,770));
        scrollPane.setViewportView(p);

        Ingresar = new JButton("Aplicar # de Pesos");
        Ingresar.setBounds(120, 160, 200, 20);
        Ingresar.addActionListener(new NumPesos(field1));
        p.add(Ingresar);
        
        Ingresar3 = new JButton("Aplicar Peso de la Mochila");
        Ingresar3.setBounds(120, 190, 200, 20);
        Ingresar3.addActionListener(new Cap(field3));
        p.add(Ingresar3);
        
        Ingresar2 = new JButton("Ingresar Pesos");
        Ingresar2.setBounds(120, 220, 200, 20);
        Ingresar2.addActionListener(new ingresar());
        p.add(Ingresar2);
        

        Añadir = new JButton("Ingresar Beneficios");
        Añadir.setBounds(120, 250, 200, 20);
        Añadir.addActionListener(new ingresar2());
        p.add(Añadir);

        Calcular = new JButton("Calcular");
        Calcular.setBounds(120, 280, 200, 20);
        Calcular.addActionListener(new calcular());
        p.add(Calcular);
        
        add(scrollPane);
        //add(p);
        setVisible(true);
    }
    class NumPesos implements ActionListener {

        private JTextField field21 ;
           
        public NumPesos(JTextField fi1) {
            field21 = fi1;
        }
       
        public void actionPerformed(ActionEvent e){
          
                String texto = field1.getText();
                numeroPesos = Integer.parseInt(texto);
                System.out.println(numeroPesos);
 
        }
}
    class Cap implements ActionListener {

        private JTextField field212 ;
           
        public Cap(JTextField fi2) {
            field212 = fi2;
        }
       
        public void actionPerformed(ActionEvent e){
          
                String texto = field3.getText();
                M = Integer.parseInt(texto);
                System.out.println(M);
 
        }
}
    class ingresar implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            p1 = new int[numeroPesos ];
            for (int i = 0; i < numeroPesos; i++) {
                    int n=i+1;
                    p1[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Peso [" + n + "]" ));
           
                }
            }
        }

    class ingresar2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            b12 = new int[numeroPesos ];
            for (int i = 0; i < numeroPesos; i++) {
                    int m=i+1;
                    b12[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Beneficio [" + m + "]" ));
       
                }
            }
        }
    

    class calcular implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Backtraking a = new Backtraking(p1,b12,M);
            a.hallarSubconjunto();
            a.mostrarSolucion();
        }

    }
    private JLabel l0, l1, l2, l3,l4,l5;
    private JLabel n1;
    private JPanel p;
    private JButton b1;
    private String cadena = "<html><body>";
    public JTextField field1;
    public JTextField field2;
    public JTextField field3;
    public JTextField field4;
    public JButton Añadir,Ingresar, Calcular,Ingresar2,Ingresar3;

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.dispose();
        if (ae.getSource() == b1) {//podemos comparar por el nombre del objeto del boton
            this.setVisible(false);
            Inicio ip = new Inicio();
             ip.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
        }

    }
}
