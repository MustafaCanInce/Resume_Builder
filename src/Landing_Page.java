import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Landing_Page extends JFrame {//implements ActionListener
    public JLabel label_one;

    public JLabel background_one, background_two;

    public Font font_one;

    public Landing_Page()
    {

        ImageIcon image = new ImageIcon("logo.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color());

    }

}
