// package Unit02.Xtras;

// import javax.swing.*;
// import java.awt.*;
// import java.awt.geom.Ellipse2D;
// import java.awt.geom.Rectangle2D;

// public class GeomSandbox extends JPanel {

//     public void paintComponent(Graphics g) {
//         super.paintComponent(g);
//         Graphics2D g2d = (Graphics2D) g;

//         // Draw a rectangle
//         Rectangle2D rectangle = new Rectangle2D.Double(50, 50, 100, 50);
//         g2d.draw(rectangle);

//         // Draw an ellipse
//         Ellipse2D ellipse = new Ellipse2D.Double(200, 50, 100, 50);
//         g2d.draw(ellipse);
//     }

//     public static void main(String[] args) {
//         JFrame frame = new JFrame("Geom Sandbox");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(400, 200);
//         frame.add(new GeomSandbox());
//         frame.setVisible(true);
//     }
// }
