import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FRAME__START extends JFrame implements ActionListener
{
    JButton b1,b2,b3;
    JTextField t1;
    JPasswordField pass;
    String names[]={"Anirban Ghosh","Ayushi Ghosh","Sourav","Gaurav","Sunny"};
    String password[]={"1111","2222","3333","4444","5555"};
    String name,chk_pass;
    
    
    FRAME__START()
    {
        setBounds(400,200,800,400);                                           //WINDOW CREATION
        getContentPane().setBackground(Color.BLACK);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        //setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);               
        setResizable(false);
        setLayout(null);
        
        setTitle("U N I V E R S I T Y    O F    G E O R G I A");              //TITLE NAME 
        
        ImageIcon image1=new ImageIcon("color_g_logo.jpg");                   //ICON CHANGE
        setIconImage(image1.getImage());
        
        ImageIcon image4=new ImageIcon("aaaa1.jpg");                          //COLLEGE band type logo
        JLabel background2=new JLabel("",image4,JLabel.LEFT);
        background2.setBounds(825,0,500,150);
        add(background2);
        
        ImageIcon image3=new ImageIcon("university-of-georgia-logo-6.jpg");   //COLLEGE LOGO TOP LEFT
        JLabel background1=new JLabel("",image3,JLabel.LEFT);
        background1.setBounds(0,0,200,222);
        add(background1);
        
        ImageIcon image2=new ImageIcon("university_of_georgia.jpeg");                          //COLLEGE PIC BACKGROUND
        JLabel background=new JLabel("",image2,JLabel.LEFT);
        background.setBounds(100,100,800,500);
        add(background);
        
        ImageIcon image5=new ImageIcon("userbluelogo70x70.png");   //login logo
        JLabel background3=new JLabel("",image5,JLabel.LEFT);
        background3.setBounds(1010,240,70,70);
        add(background3);
        
       JLabel l1=new JLabel("LOGIN");                                   //login text
       l1.setFont(new Font("Plain",Font.BOLD,30));
       l1.setForeground(Color.WHITE);
       l1.setBounds(1000,295,400,60);
       add(l1);
       
       t1=new JTextField("");            //name text box
       t1.setBounds(980,390,290, 25);
       t1.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
       add(t1);
       
       JLabel Lpassword=new JLabel("Password ");
        Lpassword.setFont(new Font("Mongolian Baiti",Font.BOLD,27));
        Lpassword.setForeground(Color.WHITE);
        Lpassword.setBounds(850,430,180,30);
        add(Lpassword);
        
       pass=new JPasswordField();
        pass.setEchoChar('*');
        pass.setBounds(980,430,290,30);
        pass.setForeground(Color.BLACK);
        pass.setFont(new Font("Mongolian Baiti",Font.PLAIN,20));
        add(pass);
       
       JLabel l2=new JLabel("  Username ");                                   //login text
       l2.setFont(new Font("Mongolian Baiti",Font.BOLD,27));
       l2.setForeground(Color.WHITE);
       l2.setBounds(830,373,400,60);
       add(l2);
       
       JLabel l3=new JLabel("developed by Anirban Ghosh");                                   //login text
       l3.setFont(new Font("Mongolian Baiti",Font.BOLD,12));
       l3.setForeground(Color.WHITE);
       l3.setBounds(1116,630,400,60);
       add(l3);
       
       JLabel l5=new JLabel("*Read the rules carefully");                                                                                                                                                                                                                                                                         //login text
       l5.setFont(new Font("Mongolian Baiti",Font.BOLD,15));
       l5.setForeground(Color.WHITE);
       l5.setBounds(827,550,400,20);
       add(l5);
       
       //ImageIcon icon=new ImageIcon("userbluelogo70x70.png");
       b1=new JButton("RULES");
       //b1.setIcon(icon);
       b1.setForeground(Color.WHITE);
       b1.setBackground(Color.RED);
       b1.setFont(new Font("Mongolian Baiti",Font.BOLD,25));
       b1.setBounds(827,480,140,45);
       b1.addActionListener(this);
       b1.setFocusable(false);                                           //remove rectangle on pressing button
       add(b1);
       
       b2=new JButton("START  QUIZ");
       b2.setForeground(Color.WHITE);
       b2.setBackground(Color.RED);
       b2.setFont(new Font("Mongolian Baiti",Font.BOLD,25));
       b2.setBounds(980,480,290,45);
       b2.addActionListener(this);
       b2.setFocusable(false);
       add(b2);
       
       b3=new JButton("CLOSE");
       b3.setForeground(Color.WHITE);
       b3.setBackground(Color.RED);
       b3.setFont(new Font("Mongolian Baiti",Font.BOLD,25));
       b3.setBounds(1155,150,120,35);
       b3.addActionListener(this);
       b3.setFocusable(false);
       add(b3);
       
       setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            name=t1.getText();
            int c=0;
            chk_pass=String.valueOf(pass.getPassword());
            //System.out.println(name);
            //System.out.println(chk_pass);
            
            
            new FRAME__RULES(name);
        }
            else if(ae.getSource() == b2)
        {
            name=t1.getText();
            int c=0;
            chk_pass=String.valueOf(pass.getPassword());
            //System.out.println(name);
            //System.out.println(chk_pass);
            
            for(int i=0;i<5;i++)
            {
                if(names[i].equals(name) && password[i].equals(chk_pass))
                {
                c=1;
                break;
                }
            }
            if(c==1)
            {
                this.setVisible(false);
                new FRAME__QUIZ(name).setVisible(true); 
                //System.out.println("found");
            }
            else
            {
                new FRAME_NO_USER().setVisible(true);
                //System.out.println("not found");
                   
            }
        }
            else if(ae.getSource()==b3)
            {
            System.exit(0);                 //DIRECTS JVM TO CLOSE THE WINDOW
        }
    }
    public static void main(String[] args) 
    {
        new FRAME__START();
    }
}  
