// package Unit02.Xtras;

// import javax.swing.*;
// import java.awt.*;
// import java.util.Arrays;


// public class ColorFontSandbox extends JPanel {

//     public void paintComponent(Graphics g) {
//         super.paintComponent(g);
//         // Set color

//         String[] availableFonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
//         System.out.println(Arrays.toString(availableFonts));

//         // Font f1 = new Font("Arial", Font.BOLD, 24);
        


//         g.setColor(new Color(255, 0, 0)); // Red color
//         // Set font
//         g.setFont(new Font("Arial", Font.BOLD, 24));

//         // Draw text
//         g.drawString("Hello, World!", 20, 50);
//     }

//     public static void main(String[] args) {
//         JFrame frame = new JFrame("Color and Font Sandbox");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(400, 200);
//         frame.add(new ColorFontSandbox());
//         frame.setVisible(true);
//     }
// }
