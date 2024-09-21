import java.awt.*;
import javax.swing.*;

public class CalculatorFrame extends JFrame {
    Buttons number1;

    CalculatorFrame() {
        number1 = new Buttons(20, 20, 1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setTitle("Matrices Calculator");
        this.add(number1);
        number1.setText("1");
    }
}
