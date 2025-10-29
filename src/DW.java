//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class DW extends JFrame implements ActionListener {
    FileWriter fw;
    JFrame f = new JFrame("demonstraction");
    JButton b1 = new JButton("save");
    JLabel l1;
    JTextArea t1;

    public DW() {
        this.b1.addActionListener(this);
        this.l1 = new JLabel("Enter name:");
        this.t1 = new JTextArea(1, 18);
        this.f.add(this.l1);
        this.f.add(this.t1);
        this.f.add(this.b1);
        this.f.setLayout(new FlowLayout());
        this.f.setSize(300, 300);
        this.f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            this.fw = new FileWriter("ABC.txt");
            String s = this.t1.getText();
            this.fw.write(s);
            this.fw.close();
        } catch (Exception var3) {
            System.out.println(var3);
        }

    }

    public static void main(String[] args) {
        new DW();
    }
}
