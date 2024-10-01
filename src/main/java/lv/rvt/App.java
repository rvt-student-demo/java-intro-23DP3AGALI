package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi jebkuru pozitivu skaitlu: ");
        int user = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;

        for (int i = 1; i <= user; i++) {
            sum += i;
        }

        System.out.println(sum);
        
        



    }

    

}