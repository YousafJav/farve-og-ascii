import java.util.Scanner;
import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Teknologi {

    public static void main(String[] args) {
        int asciiCharacter = 13183;
        String z = Character.toString( asciiCharacter );
        System.out.println(z);
        System.out.println("\u00A9");
        writeName();


    }


    public static void writeName(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Write your name?");
        String name = scan.next();
        char[] characters = name.toCharArray();

        for (Character chr : characters){
            int asciivalue = (int) chr;
            System.out.println(chr + " And the ascii value is: " + asciivalue);
        }


        ColorExample c = new ColorExample();
    }




}


