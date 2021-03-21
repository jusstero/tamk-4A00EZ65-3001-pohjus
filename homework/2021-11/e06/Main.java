
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyWindow extends JFrame {
    private JButton changeTitle = new JButton("change title");
    private JButton animate = new JButton("animate");

    public MyWindow(String title) {
        super(title);
        setLayout(new FlowLayout());
        add(changeTitle);
        add(animate);
    }
}
class Main {
    public static void main(String [] args) {
        MyWindow window = new MyWindow("Kotlin is Fun!");
        window.pack();
        window.setVisible(true);
    }
}