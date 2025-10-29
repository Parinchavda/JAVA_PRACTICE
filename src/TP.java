//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TP extends JFrame implements ActionListener {
    JFrame f = new JFrame("Title");
    JButton b1 = new JButton("+");
    JTextArea t1;
    JTextArea t2;
    JTextArea t3;

    public TP() {
        this.b1.addActionListener(this);
        this.t1 = new JTextArea(1, 18);
        this.t2 = new JTextArea(1, 18);
        this.t3 = new JTextArea(1, 18);
        this.f.add(this.t1);
        this.f.add(this.t2);
        this.f.add(this.t3);
        this.f.add(this.b1);
        this.f.setLayout(new FlowLayout());
        this.f.setSize(300, 300);
        this.f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        double v1 = Double.parseDouble(this.t1.getText());
        double v2 = Double.parseDouble(this.t2.getText());
        double sum = v1 + v2;
        if (ae.getSource() == this.b1) {
            this.t3.setText(String.valueOf(sum));
        }

    }

    public static void main(String[] args) {
        new TP();
    }
}
