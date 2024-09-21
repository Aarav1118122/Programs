import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;

public class GamePanel extends JPanel implements Runnable {
    static final int SCREEN_HEIGHT = 700;
    static final int SCREEN_WIDTH = 1300;
    final double UPDATE_RATE = 1.0 / 60.0;
    static final int BULLET_WIDTH = 45;
    static final int BULLET_HEIGHT = 10;
    static final int PLAYER_DIMENSION = 90;
    static double lastFire;
    boolean running = false;
    static boolean shooting = false;
    boolean newGraphics = false;
    MouseEvent event;
    static Player player;
    static Bullet bullet;
    static Zombie zombie;
    Thread thread;
    Image image;
    Graphics graphicsP, graphicsB, graphicsZ;
    static ArrayList<Bullet> bulletsArray = new ArrayList<Bullet>();
    static ArrayList<Zombie> zombieArray = new ArrayList<Zombie>();
    Timer timer = new Timer(500, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            player.newBullet();
            bullet.rotateBullet(event);
        }

    });

    GamePanel() {
        this.setVisible(true);
        this.setFocusable(true);
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        newPlayer();
        thread = new Thread(this);
        thread.start();
        this.addKeyListener(new keyListener());
        this.addMouseMotionListener(new mouseListener());
        this.addMouseListener(new mouseListener());
    }

    public void newPlayer() {
        player = new Player(200, 290, PLAYER_DIMENSION, PLAYER_DIMENSION);
    }

    public static void newBullet(int x, int y, int rotateX, int rotateY, double degrees) {
        if (System.currentTimeMillis() >= lastFire + 500) {
            bullet = new Bullet(x, y, BULLET_WIDTH, BULLET_HEIGHT, rotateX, rotateY, degrees);
            bulletsArray.add(bullet);
            lastFire = System.currentTimeMillis();
            shooting = true;
        }
    }

    public void newZombie() {
        Random random = new Random();
        zombie = new Zombie(SCREEN_WIDTH - 200, random.nextInt(SCREEN_HEIGHT), PLAYER_DIMENSION, PLAYER_DIMENSION);
        zombieArray.add(zombie);
    };

    public void paint(Graphics g) {
        image = createImage(getWidth(), getHeight());
        graphicsP = image.getGraphics();
        graphicsB = image.getGraphics();
        graphicsZ = image.getGraphics();
        draw(graphicsP,graphicsB, graphicsZ);
        g.drawImage(image, 0, 0, null);
    }

    public void draw(Graphics g, Graphics g2,Graphics g3) {
        Graphics2D g2D = (Graphics2D) g;
        Graphics2D g2D2 = (Graphics2D) g2;
        Graphics2D g2D3 = (Graphics2D) g3;
        player.draw(g2D);
        if (shooting) {
            for(int i = 0;i < bulletsArray.size(); i++) {
                bulletsArray.get(i).draw(g2D2);
            }
        }
        for (int i = 0; i < zombieArray.size(); i++) {
            zombieArray.get(i).draw(g2D3);
        }
    }

    public void move() {
        player.move();
        if (shooting) {
            for (int i = 0; i < bulletsArray.size(); i++) {
                bulletsArray.get(i).move();

            }
        }
    }

    public void rotatePlayer() {
        player.rotatePlayer();
    }

    public void checkCollisions() {
        player.checkCollisions();
        if (shooting) {
            for (int i = 0; i < bulletsArray.size(); i++) {
                bulletsArray.get(i).checkCollisions(i);
            }
        }
    }

    public void run() {
        running = true;
        double lastTime = System.nanoTime() / 1000000000.0;
        double firstTime = 0;
        double passedTime = 0;
        double unprocessedTime = 0;
        while (running) {
            firstTime = System.nanoTime() / 1000000000.0;
            passedTime = firstTime - lastTime;
            unprocessedTime += passedTime;
            lastTime = firstTime;
            while (unprocessedTime >= UPDATE_RATE) {
                unprocessedTime -= UPDATE_RATE;
                move();
                rotatePlayer();
                checkCollisions();
                repaint();
                // newZombie();
            }
        }
    }

    public class keyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            player.keyPressed(e);
            if (e.getKeyCode() == KeyEvent.VK_C) {
                for (int i = 0; i < bulletsArray.size(); i++) {
                    bulletsArray.remove(i);
                }
            }
        }

        public void keyReleased(KeyEvent e) {
            player.keyReleased(e);
        }
    }

    public class mouseListener extends MouseAdapter {
        public void mouseMoved(MouseEvent e) {
            player.mouseMoved(e);
        }
        public void mousePressed(MouseEvent e) {
            event = e;
            timer.setInitialDelay(0);
            timer.start();
        }

        public void mouseReleased(MouseEvent e) {
            timer.stop();
            newGraphics = false;
        }

        
    }
}
