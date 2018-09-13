/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmenuswing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author MSI
 */
/**
 * @param args the command line arguments
 */
public class JMenuDemo extends JFrame {
asdsadsadsad
    private JMenuBar menuBar;
    private JMenu menu_1;
    private JMenu menu_2;
    private JMenu menu_3;
    private JMenuItem menuItem_1;
    private JMenuItem menuItem_2;
    private JMenuItem menuItem_3;
    private JMenuItem menuItem_4;
    private JMenuItem menuItem_5;

    public JMenuDemo() {
        this.setSize(800, 800);
        this.setLayout(null);
        this.setBackground(Color.decode("#78B43D"));
        this.setLocationRelativeTo(null);

        this.menuBar = new JMenuBar();
        this.menuBar.setBackground(Color.decode("#3B5998"));
        //this.menuBar.setBounds(0, 0, 500, 40);
        this.setJMenuBar(menuBar);

        this.menu_1 = new JMenu("StudentMenager");
        this.menu_1.setForeground(Color.white);

        this.menu_2 = new JMenu("Class Room");
        this.menu_2.setForeground(Color.orange);

        this.menu_3 = new JMenu("About me");
        this.menu_3.setForeground(Color.CYAN);

        this.menuItem_1 = new JMenuItem("Add Student");
        this.menuItem_1.setBackground(Color.decode("#78B43D"));
        this.menuItem_1.setForeground(Color.BLACK);

        this.menuItem_2 = new JMenuItem("List Student");
        this.menuItem_2.setBackground(Color.decode("#4AF441"));
        this.menuItem_2.setForeground(Color.BLACK);

        this.menuItem_3 = new JMenuItem("Add Class");
        this.menuItem_3.setBackground(Color.decode("#78B43D"));
        this.menuItem_3.setForeground(Color.BLACK);

        this.menuItem_4 = new JMenuItem("List Class");
        this.menuItem_4.setBackground(Color.decode("#4AF441"));
        this.menuItem_4.setForeground(Color.BLACK);

        this.menuItem_5 = new JMenuItem("Is me");
        this.menuItem_5.setBackground(Color.decode("#78B43D"));

        this.menuItem_1.addActionListener(new MenuHadle());
        this.menuItem_2.addActionListener(new MenuHadle2());
        this.menuItem_3.addActionListener(new MenuHadle3());
        this.menuItem_4.addActionListener(new MenuHadle4());
        this.menuItem_5.addActionListener(new MenuHadle5());

        this.menu_1.add(this.menuItem_1);
        this.menu_1.add(this.menuItem_2);

        this.menu_2.add(this.menuItem_3);
        this.menu_2.add(this.menuItem_4);

        this.menu_3.add(this.menuItem_5);

        this.menuBar.add(this.menu_1);
        this.menuBar.add(this.menu_2);
        this.menuBar.add(this.menu_3);

        //this.add(this.menuBar);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    class MenuHadle implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            JOptionPane.showConfirmDialog(null, "Hello");
        }
    }

    class MenuHadle2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //JOptionPane.showMessageDialog(null, "Hi....");
            JOptionPane.showInputDialog("Moi nhap password");
        }

    }

    class MenuHadle3 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Huuuuuuuuuuu''''''''''");
        }

    }

    class MenuHadle4 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Sorry");

        }
    }

    class MenuHadle5 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Tran Quoc Toan");
        }
    }

    public static void main(String[] args) {
        JMenuDemo jm = new JMenuDemo();
    }
}
// comment
