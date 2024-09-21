import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

public class Bullet extends Rectangle {
    double degrees = 0;
    int rotateX = 0;
    int rotateY = 0;
    int mouseX;
    int mouseY;

    Bullet(int x, int y, int width, int height, int rotateX, int rotateY, double degrees) {
        super(x, y, width, height);
        // this.degrees = degrees;
        this.rotateX = rotateX;
        this.rotateY = rotateY;
    }

    public void draw(Graphics2D g) {
        g.rotate(Math.toRadians(degrees),width/2, height/2);
        g.translate(GamePanel.player.x, GamePanel.player.y);
        g.drawImage(new ImageIcon("BulletImage.jpg").getImage(),x,y,null);
        // // System.out.println(rotateX + " draw " + rotateY + " draw " + degrees);
        // g.setColor(Color.yellow);
        // g.fillRect(x, y, width, height);
        // g.translate(mouseX, mouseY);
    }

    public void move() {
        // x += 10 * Math.cos(Math.toRadians(degrees));
        // y += 10 * Math.sin(Math.toRadians(degrees));
    }

    public void checkCollisions(int i) {
        if (x > GamePanel.SCREEN_WIDTH - width) {
            GamePanel.bulletsArray.remove(i);
        }
        if (x < 0) {
            GamePanel.bulletsArray.remove(i);
        }
        if (y > GamePanel.SCREEN_HEIGHT - height) {
            GamePanel.bulletsArray.remove(i);
        }
        if (y < 0) {
            GamePanel.bulletsArray.remove(i);
        }
    }

    public void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
    }

    public void rotateBullet(MouseEvent e) {
        int mouseX = e.getX();
        int mouseY = e.getY();
        int bulletX = x + width / 2;
        int bulletY = y + height / 2;
        double angle = 0;
        if (bulletX != mouseX) {
            angle = Math.toDegrees(Math.atan((double) (mouseY - bulletY) / (mouseX - bulletX)));
        }
        if (bulletX == mouseX && mouseY > bulletY) {
            angle = 90;
        }
        if (bulletX == mouseX && mouseY < bulletY) {
            angle = -90;
        }
        if (bulletX > mouseX) {
            angle = Math.toDegrees(Math.atan((double) (mouseY - bulletY) / (mouseX - bulletX)));
            angle += 180;
        }
        degrees = angle;
    }
}
