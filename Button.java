import javax.swing.*; //this is for importing the swing package
import java.awt.*; //it contains all the classes for creating user interface and for painting graphics and images
import java.awt.event.*; //it contains all the classes for creating user interface and for painting graphics and images
import java.util.*; //it contains items such as collections framework, legacy collection classes, event model, date and time facilities, internationalization, and miscellaneous utility classes (a string tokenizer, a random-number generator, and a bit array).

class MyFrame extends JFrame implements ActionListener{
    
    JButton button;
    
    MyFrame(){//this is for creating a constructor
    
    button = new JButton(); //this is for creating a button
    button.setText("Heyy");
    button.addActionListener(this); //this is for action listener
    button.setFocusable(false); //this is for removing the border when clicking
    button.setBackground(Color.green); //this is for changing the background color of the button
    button.setBounds(100,100,250,100); //X-coord, Y-coord, width, height
    button.setVerticalAlignment(JButton.CENTER);    //this is for changing the vertical alignment of the button
    button.setFont(new Font(Font.SANS_SERIF,Font.BOLD,19));
    button.setForeground(Color.cyan);  //this is for changing the text color of the button
    button.setBackground(Color.lightGray); //this is for changing the background color of the button
    button.setBorder(BorderFactory.createEtchedBorder()); //this is for changing the border of the button
    button.setEnabled(true);//u can use this when clicking
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
    setSize(500,500);
    setVisible(true);
    add(button);
    }
    @Override  //this is for overriding the method
    public void actionPerformed(ActionEvent e){ //this is for creating a method for action listener
    Scanner input = new Scanner(System.in);
        if(e.getSource()==button){ //this is for checking if the button is clicked
            System.out.println("What is your name? : ");
            String name = input.nextLine();
            }
        }
}
    
class Demo{
    public static void main(String args[]){
        
        new MyFrame().setVisible(true);
        }
    }
