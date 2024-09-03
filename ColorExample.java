import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

class ColorExample extends JFrame
{
    ColorExample()
    {
        super("color");
        Scanner scan = new Scanner(System.in);
        System.out.println("first num");
        int firstNum = scan.nextInt();
        System.out.println("second num");
        int secondNum = scan.nextInt();
        System.out.println("third num");
        int thirdNum = scan.nextInt();
        Color c1 = new Color(firstNum, secondNum, thirdNum);

        /* create an instance of JPanel. */
        JPanel p = new JPanel();

        /* Set the background of the JPanel to the specified Color. */
        p.setBackground(c1);

        setSize(200, 200);
        add(p);
        show();
    }

    /* Driver Code */
    public static void main(String args[])
    {
        ColorExample c = new ColorExample();
        // hvis man ønsker at skifte farven ColorExample c2 = new ColorExample();
    }
}