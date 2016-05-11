import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.util.Scanner;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
public class FractalTree {
    private static final int WIDTH = 1000;
    private static final int HEIGHT = 800;

    private static FractalPanel drawing;
    private static JFrame frame;
    
    static final int NUMBER_OF_ANIMATIONS = 400;
    
    private static final double BASE_X = 450, BASE_Y = 700, TIP_Y = 450;
    /**
     * Creates the window and repaints it.
     */
    public static void main(String[] args) {
        FractalPanel panel = new FractalPanel(BASE_X, BASE_Y, TIP_Y);
        frame = new JFrame();
        frame.setSize(WIDTH /* x */, HEIGHT /* y */);
        frame.setTitle("I AM THE DANCING TREE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(panel);
        frame.setVisible(true);
        for(int seconds = 0; seconds < (NUMBER_OF_ANIMATIONS*2); seconds++ )
        {
            frame.repaint();
            try {
                Thread.sleep(16);
            } catch(Exception e) {}
        } 
    }
}