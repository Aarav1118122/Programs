import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Zombie extends Rectangle {
    Zombie(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public void draw(Graphics2D g) {
        g.setColor(Color.black);
        // The outer circle
        g.fillOval(x, y, width, height);
        // The arms
        g.setStroke(new BasicStroke(10));
        g.drawLine(x + (width / 2 + 10), y + 7, x + (width + 40), y + 25);
        g.drawLine(x + (width / 2 + 10), y + height - 6, x + (width + 40), y + height - 25);
        g.setColor(Color.green);
        // The inner circle
        g.fillOval(x + 10, y + 10, width - 20, height - 20);
    }

    public void move() {

    }

    public void checkCollisions() {

    }
}
