//imports
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        //Objects
        JLabel label = new JLabel();
        JFrame frame = new JFrame();
        //image icon
        ImageIcon image = new ImageIcon("diamond_sword.png");

        //JLabel Functions
        label.setText("Hello, I am Minecraft");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setIconTextGap(100);
        label.setFont(new Font("Hello",Font.ITALIC,105));
        label.setIcon(image);


        //JFrame
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        frame.setIconImage(image.getImage());
        frame.setVisible(true);
        //make sure to add this or your labels will not show up
        frame.add(label);



    }
}
