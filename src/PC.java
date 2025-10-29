//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PC extends JFrame implements ActionListener {
    JFrame f = new JFrame("Title");
    JCheckBox c1;
    JCheckBox c2;
    JCheckBox c3;
    JButton b1 = new JButton("ok");
    JButton b2 = new JButton("cancle");

    public PC() {
        this.b1.addActionListener(this);
        this.b2.addActionListener(this);
        this.c1 = new JCheckBox("TEA");
        this.c2 = new JCheckBox("COFEE");
        this.c3 = new JCheckBox("WATER");
        this.f.add(this.c1);
        this.f.add(this.c2);
        this.f.add(this.c3);
        this.f.add(this.b1);
        this.f.add(this.b2);
        this.f.setLayout(new FlowLayout());
        this.f.setSize(300, 300);
        this.f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        int a = 0;
        String s = " ";
        if (this.c1.isSelected()) {
            a += 200;
            s = s + "TEA\n";
        }

        if (this.c2.isSelected()) {
            a += 150;
            s = s + "COFEE\n";
        }

        if (this.c3.isSelected()) {
            a += 10;
            s = s + "WATER\n";
        }

        if (ae.getSource() == this.b2) {
            System.exit(0);
        }

        JOptionPane.showMessageDialog(this, s + "amount:" + a);
    }

    public static void main(String[] args) {
        new PC();
    }
}
