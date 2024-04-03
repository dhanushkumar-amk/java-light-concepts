
import javax.swing.*;
public class passwordfiledExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Password Example");
        JLabel l = new JLabel("Password");
        JPasswordField p = new JPasswordField(5);
        l.setBounds(20,100,80,30);
        p.setBounds(100,100,100,30);
        f.add(p);
        f.add(l);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }


}
