package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    

    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last number? ");

        
        
        int i=0;
        int sum=0;
        int odd=0;
        int even=0;
        System.out.println("Give numbers:");

    while (true) {
        
        int sk = Integer.valueOf(scanner.nextLine());
        
        
        if (sk==-1) {
            System.out.println("Thx! Bye!");
            break;
        }
        if (sk%2!=0) {
            odd++;
        }
        else {
            even++;
        }
        
        i++;
        sum=sum+sk;
        continue;
    }
    double vid = (double)sum / i;
    System.out.println("Sum: "+ sum);
    System.out.println("Numbers: " + i);
    System.out.println("Average:" + vid);
    System.out.println("Odd: " + odd);
    System.out.println("Even: " + even);

    }
}