
package laboratorio09.Mochila01;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import laboratorio09.Mochila01.InterfazMochila;

public class Inicio extends JFrame implements ActionListener {
 public Inicio() {
        setSize(300, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Backtracking");
        p = new JPanel();
        p.setLayout(null);
        
        l = new JLabel("Backtracking");
        l.setBounds(110, 50, 230, 80);
        p.add(l);
        
        b1 = new JButton("Mochila 01");
        b1.setBounds(100, 150, 100, 20);
        b1.addActionListener(this);
        p.add(b1);

        add(p);
        setVisible(true);
    }

    private JLabel l, l2;
    private JPanel p;
    private JButton b1, b2, b3;
    private double codigo;
    private String cadena = "<html><body>";

    @Override

    public void actionPerformed(ActionEvent vo) {
         this.setVisible(false);
         
     if (vo.getSource() == b1) {
            this.setVisible(false);
            InterfazMochila v2 = new InterfazMochila();
            v2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}
}

   

