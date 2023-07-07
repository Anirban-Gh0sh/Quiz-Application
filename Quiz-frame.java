import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FRAME__QUIZ extends JFrame implements ActionListener
{
    String q[][] = new String[10][5];
    String pa[][] = new String[10][1];
    String qa[][] = new String[10][2];
    JButton next, submit;
    public static int count = 0;
    public static int timer = 15;
    public static int ans_given = 0;
    public static int score = 0;
    JLabel qno, question,question_img,question_no1;
    
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup options;
    
    String username;
    FRAME__QUIZ(String username)
    {
        this.username=username;
        setTitle("U N I V E R S I T Y    O F    G E O R G I A");                //TITLE NAME    
        setBounds(400,200,800,400);                                             //WINDOW CREATION
        getContentPane().setBackground(Color.WHITE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);
        setLayout(null);

        ImageIcon image1=new ImageIcon("color_g_logo.jpg");                      //ICON CHANGE
        setIconImage(image1.getImage());
        
        ImageIcon lsideborder=new ImageIcon("bluebackground2.png");             //LEFT BORDER                         
        JLabel borderleft=new JLabel("",lsideborder,JLabel.LEFT);
        borderleft.setBounds(-20,0,50,900);
        add(borderleft);
        ImageIcon rsideborder=new ImageIcon("bluebackground2.png");             //RIGHT BORDER                  
        JLabel borderright=new JLabel("",rsideborder,JLabel.LEFT);
        borderright.setBounds(1250,0,50,900);
        add(borderright);
        
        ImageIcon usideborder=new ImageIcon("bluebackground.png");             //LEFT BORDER                          
        JLabel borderup=new JLabel("",usideborder,JLabel.LEFT);
        borderup.setBounds(0,-20,1300,50);
        add(borderup);
        ImageIcon dsideborder=new ImageIcon("bluebackground.png");             //RIGHT BORDER                  
        JLabel borderdown=new JLabel("",dsideborder,JLabel.LEFT);
        borderdown.setBounds(0,670,1300,50);
        add(borderdown);
        
       question_img=new JLabel("QUESTION   ");
       question_img.setBounds(100,150,400,40);
       question_img.setFont(new Font("Tahoma", Font.BOLD,28));
       question_img.setForeground(Color.RED);
       add(question_img);
       
       question_no1=new JLabel();
       question_no1.setBounds(250,155,100,30);
       question_no1.setFont(new Font("Tahoma",Font.BOLD,28));
       question_no1.setForeground(Color.RED);
       add(question_no1);
       
       question_img=new JLabel("TIME LEFT-");
       question_img.setBounds(550,155,200,30);
       question_img.setFont(new Font("Tahoma", Font.BOLD,28));
       question_img.setForeground(Color.RED);
       add(question_img);

        qno = new JLabel("");
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        qno.setBounds(100, 280, 50, 30);
        add(qno);
        
        question = new JLabel("");
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        question.setBounds(150, 280, 900, 30);
        add(question);
        
        //questions,options and answers
        q[0][0] = "Which is the smallest data type in java...?";
        q[0][1] = "nibble";
        q[0][2] = "byte";
        q[0][3] = "boolean";
        q[0][4] = "int";

        q[1][0] = "What is the return type of the sqrt method in java?";
        q[1][1] = "int";
        q[1][2] = "double";
        q[1][3] = "long";
        q[1][4] = "void";

        q[2][0] = "Which package contains the Scanner class?";
        q[2][1] = "java.util package";
        q[2][2] = "java.lang package";
        q[2][3] = "java.awt package";
        q[2][4] = "java.io package";

        q[3][0] = "An interface with no fields or methods is known as?";
        q[3][1] = "Runnable Interface";
        q[3][2] = "Abstract Interface";
        q[3][3] = "Marker Interface";
        q[3][4] = "CharSequence Interface";

        q[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        q[4][1] = "Stack";
        q[4][2] = "String memory";
        q[4][3] = "Random storage space";
        q[4][4] = "Heap memory";

        q[5][0] = "Which of the following is not a type of inheritance?";
        q[5][1] = "single";
        q[5][2] = "multi level";
        q[5][3] = "hybrid";
        q[5][4] = "overloaded";

        q[6][0] = "Which keyword is used for accessing the features of a package?";
        q[6][1] = "import";
        q[6][2] = "package";
        q[6][3] = "extends";
        q[6][4] = "export";

        q[7][0] = "In java, jar stands for?";
        q[7][1] = "Java Archive Runner";
        q[7][2] = "Java Archive";
        q[7][3] = "Java Application Resource";
        q[7][4] = "Java Application Runner";

        q[8][0] = "Which of the following package is imported by deafult ?";
        q[8][1] = "java.math";
        q[8][2] = "java.util";
        q[8][3] = "java.io";
        q[8][4] = "java.lang";

        q[9][0] = "Which of the following option is not a principle of OOP..?";
        q[9][1] = "Encapsulation";
        q[9][2] = "polymorphism";
        q[9][3] = "string handling";
        q[9][4] = "inheritance";
        
        qa[0][1] = "boolean";
        qa[1][1] = "double";
        qa[2][1] = "java.util package";
        qa[3][1] = "Marker Interface";
        qa[4][1] = "Heap memory";
        qa[5][1] = "overloaded";
        qa[6][1] = "import";
        qa[7][1] = "Java Archive";
        qa[8][1] = "java.lang";
        qa[9][1] = "string handling";
        
        
        opt1 = new JRadioButton("");
        opt1.setBounds(150, 360, 700, 30);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt1.setBackground(Color.WHITE);
        add(opt1);
        
        opt2 = new JRadioButton("");
        opt2.setBounds(150, 390, 700, 30);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt2.setBackground(Color.WHITE);
        add(opt2);
        
        opt3 = new JRadioButton("");
        opt3.setBounds(150, 420, 700, 30);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt3.setBackground(Color.WHITE);
        add(opt3);
        
        opt4 = new JRadioButton("");
        opt4.setBounds(150, 450, 700, 30);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt4.setBackground(Color.WHITE);
        add(opt4);
        
        options = new ButtonGroup();
        options.add(opt1);
        options.add(opt2);
        options.add(opt3);
        options.add(opt4);
        
        next = new JButton("NEXT");
        next.setFont(new Font("Mongolian Baiti", Font.PLAIN, 22));
        next.setBackground(Color.RED/*new Color(30, 144, 255)*/);
        next.setForeground(Color.WHITE);
        next.setFocusable(false);
        next.addActionListener(this);
        next.setBounds(150, 530, 200, 40);
        add(next);
        
        submit = new JButton("SUBMIT");
        submit.setFont(new Font("Mongolian Baiti", Font.PLAIN, 22));
        submit.setEnabled(false);
        submit.setFocusable(false);
        submit.setBackground(Color.RED);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setBounds(550,530, 200, 40);
        add(submit);
        
        start(0);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == next)
        {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            if(options.getSelection() == null)
            {
                pa[count][0] = "";
            }
            else
            {
                pa[count][0] = options.getSelection().getActionCommand();
            }
            if(count == 8)
            {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            count=count+1;
            start(count);
        }
        else if(ae.getSource() == submit)
        {
            ans_given = 1;
            if(options.getSelection() == null)
            {
                pa[count][0] = "";
            }
            else 
            {
                pa[count][0] = options.getSelection().getActionCommand();
            }
            for(int i =0 ; i < pa.length ; i++)
            {
                if(pa[i][0].equals(qa[i][1]))
                {
                    score=score+10;
                }
                else
                {
                    score=score+0;
                }
            }
            this.setVisible(false);
            new FRAME__SCORE(username,score).setVisible(true);
        }
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        String time=" "+timer;
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 28));
        
        if(timer>0) 
        {
            g.drawString(time,715,211);
        }
        else 
        {
            g.drawString("Times Up!!",715,211);
        }
        
        timer--;                                    // decrement of time
        
        try{
            Thread.sleep(1000);
            repaint();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        if(ans_given == 1){
            ans_given = 0;
            timer = 15;
        }
        else if(timer < 0)
        {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if(count == 8)
            {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if(count == 9){
                if(options.getSelection() == null)
                {
                    pa[count][0] = "";
                }
                else 
                {
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                
                for(int i =0 ; i < pa.length ; i++){
                    if(pa[i][0].equals(qa[i][1])){
                        score+=10;
                    }else{
                        score+=0;
                    }
                }
                this.setVisible(false);
                new FRAME__SCORE(username, score).setVisible(true);        //sending name and score to resut class
            }
            else
            {
                if(options.getSelection() == null)
                {
                    pa[count][0] = "";
                }
                else 
                {
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                count++;
                start(count);
            }
        }
    }
    public void start(int count)
    {
        question_no1.setText("   "+(count+1)+"");
        qno.setText("" + (count + 1) + ". ");
        question.setText(q[count][0]);
        opt1.setLabel(q[count][1]);
        opt1.setActionCommand(q[count][1]);
        opt2.setLabel(q[count][2]);
        opt2.setActionCommand(q[count][2]);
        opt3.setLabel(q[count][3]);
        opt3.setActionCommand(q[count][3]);
        opt4.setLabel(q[count][4]);
        opt4.setActionCommand(q[count][4]);
        options.clearSelection();
    }
    public static void main(String[] args)
    {
        
        new FRAME__QUIZ("").setVisible(true);
    }
}
