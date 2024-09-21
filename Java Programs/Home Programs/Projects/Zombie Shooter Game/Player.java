import java.awt.*;
import java.awt.event.*;

public class Player extends Rectangle {
    static double degrees = 0;
    int xVelocity = 0;
    int yVelocity = 0;
    int playerSpeed = 10;
    int rotateSpeed = 0;
    static int rotateX;
    static int rotateY;

    Player(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public void draw(Graphics2D g) {
        rotateX = x + width / 2;
        rotateY = y + height / 2;
        g.rotate(Math.toRadians(degrees), rotateX, rotateY);
        g.setColor(Color.black);
        // The outer circle of the player
        g.fillOval(x, y, width, height);
        g.fillRect(x + (width + 40), y + ((height / 2) - 12), 50, 25);
        // The arms
        g.setStroke(new BasicStroke(10));
        g.drawLine(x + (width / 2 + 10), y + 7, x + (width + 50), y + ((height / 2)));
        g.drawLine(x + (width / 2 + 10), y + height - 6, x + (width + 50), y + ((height / 2)));
        // The inner circle of the player
        g.setColor(Color.white);
        g.fillOval(x + 10, y + 10, width - 20, height - 20);
    }

    public void move() {
        x += xVelocity;
        y += yVelocity;
    }

    public void rotatePlayer() {
        degrees += rotateSpeed;
    }

    public void checkCollisions() {
        if (x < 0) {
            x = 0;
        }
        if (x > GamePanel.SCREEN_WIDTH - (width + 90)) {
            x = GamePanel.SCREEN_WIDTH - (width + 90);
        }
        if (y < 0) {
            y = 0;
        }
        if (y > GamePanel.SCREEN_HEIGHT - height) {
            y = GamePanel.SCREEN_HEIGHT - height;
        }
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            this.yVelocity = -playerSpeed;
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            this.yVelocity = playerSpeed;
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            this.xVelocity = playerSpeed;
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            this.xVelocity = -playerSpeed;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            rotateSpeed = -10;
            rotatePlayer();
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            rotateSpeed = 10;
            rotatePlayer();
        }
    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            this.yVelocity = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            this.yVelocity = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            this.xVelocity = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            this.xVelocity = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            rotateSpeed = 0;
            rotatePlayer();
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            rotateSpeed = 0;
            rotatePlayer();
        }
    }

    public void mouseMoved(MouseEvent e) {
        int mouseX = e.getX();
        int mouseY = e.getY();
        int playerX = x + width / 2;
        int playerY = y + height / 2;
        double angle = 0;
        if (playerX != mouseX) {
            angle = Math.toDegrees(Math.atan((double) (mouseY - playerY) / (mouseX - playerX)));
        }
        if (playerX == mouseX && mouseY > playerY) {
            angle = 90;
        }
        if (playerX == mouseX && mouseY < playerY) {
            angle = -90;
        }
        if (playerX > mouseX) {
            angle = Math.toDegrees(Math.atan((double) (mouseY - playerY) / (mouseX - playerX)));
            angle += 180;
        }
        degrees = angle;
    }

    public void newBullet() {
        GamePanel.newBullet(x + 170, (y + (width / 2) - 5), rotateX, rotateY, degrees);
    }
}