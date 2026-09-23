import javax.swing.*;
import java.awt.*;

class Demo{
    public static void main(String args[]){
        
        JLabel myLabel = new JLabel();
        myLabel.setText("Hi");
        myLabel.setVerticalAlignment(JLabel.TOP);
        
        JLabel monday = new JLabel();
        monday.setText("monday");
        monday.setHorizontalAlignment(JLabel.RIGHT);
        
        JPanel myPanel = new JPanel();
        myPanel.setBackground(Color.red);
        myPanel.setBounds(0,0,250,250); //X-coordi, Y-coord, width, height
        
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);
        bluePanel.setLayout(new BorderLayout());
        
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(new BorderLayout());
        
        JFrame frame = new JFrame();
        frame.setTitle("test");
        frame.setSize(740,740); //X DIMENSION Y DIMENSION
        frame.setDefaultCloseOperation(frame.HIDE_ON_CLOSE);
        frame.setResizable(true);
       // frame.getContentPane().setBackground(new Color(34,34,34));
        frame.setLayout(null);
        
        frame.setVisible(true);
        frame.add(myPanel);
         //myPanel.add(myLabel);
        frame.add(bluePanel);
        bluePanel.add(monday);
        frame.add(greenPanel);
        greenPanel.add(myLabel);
        
        }
    }
