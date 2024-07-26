package sh;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ShootingGame extends JPanel implements ActionListener, KeyListener {
    private Timer timer;
    private Player player;
    private ArrayList<Bullet> bullets;
    private ArrayList<Enemy> enemies;
    private int score;

    public ShootingGame() {
        setFocusable(true);
        setPreferredSize(new Dimension(800, 600));
        addKeyListener(this);
        player = new Player(400, 500);
        bullets = new ArrayList<>();
        enemies = new ArrayList<>();
        score = 0;

        timer = new Timer(10, this);
        timer.start();

        // 적 생성
        for (int i = 0; i < 10; i++) {
            enemies.add(new Enemy((i * 60) + 50, 50));
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        player.draw(g);

        for (Bullet bullet : bullets) {
            bullet.draw(g);
        }

        for (Enemy enemy : enemies) {
            enemy.draw(g);
        }

        g.drawString("Score: " + score, 10, 10);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        player.move();

        for (Bullet bullet : bullets) {
            bullet.move();
        }

        for (Enemy enemy : enemies) {
            enemy.move();
        }

        checkCollisions();

        repaint();
    }

    private void checkCollisions() {
        ArrayList<Bullet> bulletsToRemove = new ArrayList<>();
        ArrayList<Enemy> enemiesToRemove = new ArrayList<>();

        for (Bullet bullet : bullets) {
            for (Enemy enemy : enemies) {
                if (bullet.getBounds().intersects(enemy.getBounds())) {
                    bulletsToRemove.add(bullet);
                    enemiesToRemove.add(enemy);
                    score += 10;
                }
            }
        }

        bullets.removeAll(bulletsToRemove);
        enemies.removeAll(enemiesToRemove);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            player.setDx(-2);
        }

        if (key == KeyEvent.VK_RIGHT) {
            player.setDx(2);
        }

        if (key == KeyEvent.VK_SPACE) {
            bullets.add(new Bullet(player.getX() + 15, player.getY()));
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT) {
            player.setDx(0);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shooting Game");
        ShootingGame game = new ShootingGame();
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    class Player {
        private int x, y, dx;

        public Player(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void move() {
            x += dx;
            if (x < 0) x = 0;
            if (x > getWidth() - 30) x = getWidth() - 30;
        }

        public void setDx(int dx) {
            this.dx = dx;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void draw(Graphics g) {
            g.fillRect(x, y, 30, 30);
        }
    }

    class Bullet {
        private int x, y;

        public Bullet(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void move() {
            y -= 2;
        }

        public Rectangle getBounds() {
            return new Rectangle(x, y, 5, 10);
        }

        public void draw(Graphics g) {
            g.fillRect(x, y, 5, 10);
        }
    }

    class Enemy {
        private int x, y;

        public Enemy(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void move() {
            y += 1;
        }

        public Rectangle getBounds() {
            return new Rectangle(x, y, 30, 30);
        }

        public void draw(Graphics g) {
            g.fillRect(x, y, 30, 30);
        }
    }
}