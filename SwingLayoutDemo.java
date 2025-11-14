import javax.swing.*;
import java.awt.*;
public class SwingLayoutDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());
        f.add(new JButton("Click"));
        f.setSize(200,200); f.setVisible(true);
    }
}
