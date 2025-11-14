import javax.swing.*;
public class SwingControlDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JTextField tf = new JTextField("Type here");
        f.add(tf);
        f.setSize(200,200); f.setVisible(true);
    }
}
