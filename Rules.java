import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FRAME__RULES extends JFrame implements ActionListener
{
    JButton b1;
    JLabel l1,l2,l3,l4,l6;
    String username;
    FRAME__RULES(String username)
    {
        setTitle("U N I V E R S I T Y    O F    G E O R G I A");                //TITLE NAME 
        
        setResizable(false);
        ImageIcon image1=new ImageIcon("color_g_logo.jpg");                     //ICON CHANGE
        setIconImage(image1.getImage());
        
        //borders
        ImageIcon usideborder=new ImageIcon("bluebackground.png");             //LEFT BORDER                          
        JLabel borderup=new JLabel("",usideborder,JLabel.LEFT);
        borderup.setBounds(0,-20,850,50);
        add(borderup);
        ImageIcon dsideborder=new ImageIcon("bluebackground.png");             //RIGHT BORDER                  
        JLabel borderdown=new JLabel("",dsideborder,JLabel.LEFT);
        borderdown.setBounds(0,620,825,500);
        add(borderdown);
        
        setBounds(-8,29,835,720);
        getContentPane().setBackground(Color.WHITE);                           //color of rules window
        setLayout(null);
        
        l1=new JLabel("!!!  WELCOME TO UNIVERSITY OF GEORGIA  !!!");
        l1.setFont(new Font("Mongolian Baiti",Font.BOLD,30));
        l1.setForeground(Color.RED);                     
        l1.setBounds(60,60,835,30);
        add(l1);
        
        l1=new JLabel("-----------------------------------------------------------------");
        l1.setFont(new Font("Mongolian Baiti",Font.BOLD,30));
        l1.setForeground(Color.RED);               
        l1.setBounds(60,75,1000,30);
        add(l1);
        
        
        l3=new JLabel("QUIZ   RULES");
        l3.setFont(new Font("Mongolian Baiti",Font.BOLD,26));
        l3.setForeground(Color.BLACK);                     
        l3.setBounds(326,120,700,30);
        add(l3);
        
        l2=new JLabel();
        l2.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        l2.setForeground(Color.BLACK);
        l2.setBounds(40,40,680,600);
        l2.setText(
            "<html>"+
                      "1.There are total 10 questions in this QUIZ."+"<br><br>"+
                      "2.Each question is of 10 marks and total marks of the QUIZ is 100."+"<br><br>"+
                      "3.Each question has a time limit of 15 seconds to answer."+"<br><br>"+
                      "4.Once the time is over you will be automatically provided with the next question else select 'NEXT' if you are done before time."+"<br><br>"+
                      "5.There is no negative marking."+"<br><br>"+
                      "6.Click on 'SUBMIT' button to submit the QUIZ and get the results."+"<br><br>"+
            "<html>");                        //html code to wrie rules in proper formatted and indented manner
       add(l2);
       
       l4=new JLabel("ALL THE BEST");
       l4.setFont(new Font("Mongolian Baiti",Font.BOLD,22));
       l4.setForeground(Color.BLACK);
       l4.setBounds(330,210,680,600);
       add(l4);
       
       
       //NEXT BUTTON
       b1=new JButton("BACK");              
       b1.setForeground(Color.WHITE);
       b1.setBackground(Color.RED);
       b1.setFont(new Font("Mongolian Baiti",Font.BOLD,25));
       b1.setBounds(350,550,120,35);
       b1.addActionListener(this);
       b1.setFocusable(false);
       add(b1);

       setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b1)
        {
            this.setVisible(false);
        }
    }
    public static void main(String[] args)
    {
        new FRAME__RULES("");
    }
}
