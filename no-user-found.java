import javax.swing.*;
import java.awt.*;

public class FRAME_NO_USER extends JFrame
{
    JLabel notfound;
    FRAME_NO_USER()
    {
        setBounds(400,300,500,100);                                           //WINDOW CREATION
        getContentPane().setBackground(Color.WHITE);
        setResizable(false);
        setLayout(null);
        JLabel notfound=new JLabel("Incorrect username or password, PLEASE RETRY...!!!");
        notfound.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        notfound.setForeground(Color.BLACK);
        notfound.setBounds(30,-20,500,100);
        add(notfound);
        setVisible(true);
    }
    

    public static void main(String args[])
    {
        new FRAME_NO_USER();
    }
}
