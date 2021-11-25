package kt.log;

import javax.swing.*;
import java.awt.*;

public class Kanwa extends JPanel {


    Dane dane = new Dane();
     @Override
     public void paintComponent(Graphics g) {
             super.paintComponent(g);
             Graphics2D g2d = (Graphics2D) g;

             g2d.setColor(Color.BLUE);
             drawRectangles(g2d);

             g2d.setColor(Color.ORANGE);
             drawOval(g2d);
             repaint();
     }

     public void druk(){
         for(Point p: dane.pointsk){
             System.out.println(p.getX() + " , " + p.getY());
         }
     }

    private void drawOval(Graphics2D g2d2) {
        int x,y;
        for(Point p : dane.pointso){
            x = (int) p.getX();
            y = (int) p.getY();
            g2d2.fillOval(x,y,15,10);

        }
    }

    private void drawRectangles(Graphics2D g2d){
        int x,y;
        for(Point p : dane.pointsk){
            x = (int) p.getX();
            y = (int) p.getY();
            g2d.fillRect(x,y,15,15);

         }
     }
}
