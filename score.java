import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FRAME__SCORE extends JFrame implements ActionListener
{
    JButton b1,b2;
    JLabel l1,l2,l3,l4,l5,borderup,borderdown;
    String username;
    int score;
    FRAME__SCORE(String username,int score)
    {
       this.username=username;
       setBounds(400,200,800,400);                                             //WINDOW CREATION
       getContentPane().setBackground(Color.WHITE);
       setExtendedState(JFrame.MAXIMIZED_BOTH);
       
       setResizable(false);
       setLayout(null);
        
       setTitle("U N I V E R S I T Y    O F    G E O R G I A");                   //TITLE NAME 
            
       ImageIcon image1=new ImageIcon("color_g_logo.jpg");                        //ICON CHANGE
       setIconImage(image1.getImage());
        
       ImageIcon usideborder=new ImageIcon("bluebackground.png");                 //LEFT BORDER                           
       borderup=new JLabel("",usideborder,JLabel.LEFT);
       borderup.setBounds(0,-20,1300,50);
       add(borderup);
       ImageIcon dsideborder=new ImageIcon("bluebackground.png");                 //RIGHT BORDER                  
       JLabel borderdown=new JLabel("",dsideborder,JLabel.LEFT);
       borderdown.setBounds(0,670,1300,50);
       add(borderdown);
       
       l5=new JLabel("developed by Anirban Ghosh");                               //login text
       l5.setFont(new Font("Mongolian Baiti",Font.BOLD,12));
       l5.setForeground(Color.BLACK);
       l5.setBounds(1116,630,400,60);
       add(l5);
       
       l1=new JLabel("--------------------------------------------------------");
       l1.setFont(new Font("Mongolian Baiti",Font.BOLD,28));
       l1.setForeground(Color.BLACK);               
       l1.setBounds(330,115,700,30);
       add(l1);
        
       l2 = new JLabel("THANK YOU FOR ANSWERING THE QUIZ");
       l2.setBounds(335,100,700,30);
       l2.setFont(new Font("", Font.BOLD, 28));
       l2.setForeground(Color.RED);
       add(l2);
        
       l3 = new JLabel("SCORE    :      "+score);
       l3.setBounds(390,300,300,30);
       l3.setFont(new Font("Mongolian Baiti", Font.BOLD, 28));
       l3.setForeground(Color.BLACK);
       add(l3);
       
       JLabel l4 = new JLabel("NAME     :      "+username);
       l4.setBounds(390,250,1000,30);
       l4.setFont(new Font("Mongolian Baiti", Font.BOLD, 28));
       l4.setForeground(Color.BLACK);
       add(l4);
       
       //Try again button 
       b1=new JButton("TRY AGAIN");
       b1.setForeground(Color.WHITE);
       b1.setBackground(Color.RED);
       b1.setFont(new Font("Mongolian Baiti",Font.BOLD,27));
       b1.setBounds(350,500,200,35);
       b1.addActionListener(this);
       b1.setFocusable(false);
       add(b1);
       
       //close button
       b2=new JButton("CLOSE");
       b2.setForeground(Color.WHITE);
       b2.setBackground(Color.RED);
       b2.setFont(new Font("Mongolian Baiti",Font.BOLD,27));
       b2.setBounds(650,500,200,35);
       b2.addActionListener(this);
       b2.setFocusable(false);
       add(b2);
    }
    public void actionPerformed(ActionEvent ae)
    {
        
        if(ae.getSource()==b2)
        {
            
            System.exit(0);
        }
        else if(ae.getSource()==b1)
        {
            
            this.setVisible(false);
            new FRAME__START().setVisible(true);
        }
    }
    public static void main(String[] args)
    {
        new FRAME__SCORE("", 0).setVisible(true);
    }
}
