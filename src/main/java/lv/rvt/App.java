package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
  
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Give speed: ");
        // int speed = scanner.nextInt();
        // if (speed > 120) {
        //     System.out.println("Speeding ticket");
        
        
        
        // }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi savu balle");
        int ball = scanner.nextInt();
        if (ball < 0) {
            System.out.println("Nevar būt!");
        

        } else if (0 < ball && ball <= 49) {
            System.out.println("Nav sekmīgs");

        } else if (50 <= ball && ball <= 59) {
            System.out.println("1");

        } else if (60 <= ball && ball <= 69) {
            System.out.println("2");

        } else if (70 <= ball && ball <= 79) {
            System.out.println("3");
        } else if (80 <= ball && ball <= 89) {
            System.out.println("4");
        } else if (90 <= ball && ball <= 100) {
            System.out.println("5");
        } else if (100 <= ball) {
            System.out.println("INSANE!");
        }




    }

    

}