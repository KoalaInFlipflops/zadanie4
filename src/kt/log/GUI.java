package kt.log;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class GUI implements MouseListener {

    private static JButton runButton;
    private static JPanel panel;
    private static JFrame frame;
    private static JButton cancelButton;

    Random rand = new Random();



    public void openGui(){

        panel = new JPanel();
        frame = new JFrame();
        frame.setSize(680,428);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);


        runButton = new JButton("RUN!");
        runButton.setBounds(10,300,165,75);
        panel.add(runButton);
        runButton.addMouseListener(this);


        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(490,300,165,75);
        panel.add(cancelButton);
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        int x = rand.nextInt(490);
        int y = rand.nextInt(300);
        if(!(runButton.getMousePosition().getX() <=20)){
            runButton.setLocation(x, y);
        }

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
