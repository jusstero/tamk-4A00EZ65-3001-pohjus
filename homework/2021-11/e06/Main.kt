
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyWindow(title: String) : JFrame(title) {
    private val changeTitle : JButton = JButton("change title");
    private val animate : JButton = JButton("animate");
    var animating : Boolean = false

    init {
        setLayout(FlowLayout());
        add(changeTitle);
        add(animate);

        this.changeTitle.addActionListener() {
            this.title = "Hello World"
        }

        this.animate.addActionListener() {
            if (!animating) animating = true else animating = false

            if(animating) {
                Thread() {
                    while (animating) {
                        var area = 300..600
                        this.setLocation(area.random(), area.random())
                        println(Thread.currentThread().name)
                        Thread.sleep(2000)
                    }
                }.start()
            }
        }
    }
}

fun main() {
    val window : MyWindow = MyWindow("Kotlin is Fun!");
    window.pack();
    window.setVisible(true);
}