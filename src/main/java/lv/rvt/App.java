package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        // Make your first Hello World app!

        // Scanner scanner = new Scanner(System.in);
      
      
        // String input = scanner.nextLine();

        // System.out.println("Sveiks " + input + "!");

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Ievadi savu vārdu: ");

        // String name = scanner.nextLine();

        // System.out.println();
        // String lastname = scanner.nextLine();

        // System.out.println();
        // String group = scanner.nextLine();

        // System.out.println();


        // String text = "kaudkads teksts";
        // int WholeNumber = 123;
        // double floatingPoint = 3.141592653;
        // boolean tureOrFalse = true;

        // System.out.println("Musu teksts: " + text);
        // System.out.println("Cipari:" + WholeNumber);
        // System.out.println("Pi skaitlis: " + floatingPoint);
        // System.out.println("True or false: " + tureOrFalse);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet 1.skaitlis:");
        int number1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Ievadiet 2.skaitli:");
        int number2 = Integer.valueOf(scanner.nextLine());
        int summa = number1 + number2;
        int starp = number1 - number2;
        int reiz = number1 * number2;
        System.out.println(number1 + "+" + number2 + "=" + summa);
        System.out.println(number1 + "-" + number2 + "=" + starp);
        System.out.println(number1 + "*" + number2 + "=" + reiz);
        double average = (number1 + number2)/2;
        System.out.println("(" + number1 + "+"+number2 + ")/2=" + average);



    }

}
