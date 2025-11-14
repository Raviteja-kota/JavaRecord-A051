import javax.swing.*;
import java.awt.event.*;
public class SwingEventDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setSize(200,200); f.setVisible(true);
    }
}
