// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;
// import javax.swing.Timer;

// public class TestPanel extends JPanel {
//     TestPanel() {
//         this.addMouseListener(new mouseListener());
//     }

//     Timer timer = new Timer(500, new ActionListener() {
//         int i = 0;

//         @Override
//         public void actionPerformed(ActionEvent e) {
//             System.out.println("This is the swing timer " + i);
//             i++;
//         }

//     });

//     public void paint(Graphics g) {
//         Graphics2D g2d = (Graphics2D) g;
//         g2d.setColor(Color.white);
//         g2d.fillRect(200, 100, 100, 100);
//         g2d.rotate(Math.PI / 4);
//     }

//     public class mouseListener extends MouseAdapter {
//         public void mousePressed(MouseEvent e) {
//             timer.setInitialDelay(0);
//             timer.start();
//         }

//         public void mouseReleased(MouseEvent e) {
//             timer.stop();
//         }
//     }

// }