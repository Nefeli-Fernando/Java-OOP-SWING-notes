import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
    
class GridLayout{
    public static void main(String args[]){
        JFrame frame = new JFrame(); //this is for creating a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);c
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(3,3,10,10)); //this is for creating a grid layout with 3 rows and 3 columns and 10 pixels of horizontal and vertical gap between the components
        //JButton button1 = new JButton("1");
        //frame.add(button1);
        
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3")); //this is for adding a button to the frame with the text "3"
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        
        frame.setVisible(true);
        }
    }