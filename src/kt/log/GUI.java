package kt.log;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;


public class GUI extends MouseInputAdapter implements KeyListener {

    private static JButton runButton;
    //public static JPanel panel;
    private static JFrame frame;
    private static JButton cancelButton;


    Kanwa kan = new Kanwa();
    Random rand = new Random();

    int x =200, y = 200;
    int xmyszki, ymyszki;

    public void openGui(){

        kan = new Kanwa();
        frame = new JFrame();
        frame.setSize(680,428);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(kan);


        kan.setLayout(null);

        kan.addMouseListener(this);
        kan.addKeyListener(this);
        kan.setFocusable(true);


        runButton = new JButton("RUN!");
        runButton.setFocusable(false);
        runButton.setBounds(10,300,165,75);
        kan.add(runButton);
        runButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                int x = rand.nextInt(490);
                int y = rand.nextInt(300);
                if(!(runButton.getMousePosition().getX() <=20)){
                    runButton.setLocation(x, y);
                 }
            }
        });


        cancelButton = new JButton("Cancel");
        cancelButton.setFocusable(false);
        cancelButton.setBounds(490,300,165,75);
        kan.add(cancelButton);
    }


    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        super.mouseMoved(e);
    }
    @Override
    public void mouseClicked(MouseEvent e){
        super.mouseClicked(e);
        xmyszki = e.getX();
        ymyszki = e.getY();
        System.out.println(xmyszki + " , " + ymyszki);
        kan.druk();
    }
    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

        if(keyEvent.getKeyCode() == KeyEvent.VK_K){
            kan.dane.pointsk.add(new Point(xmyszki,ymyszki));


        }else if(keyEvent.getKeyCode() == KeyEvent.VK_O){
            kan.dane.pointso.add(new Point(xmyszki, ymyszki));

        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
