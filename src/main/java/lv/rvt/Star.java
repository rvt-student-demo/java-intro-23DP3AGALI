package lv.rvt;

public class Star {
    public static void printStars(int number) {
        for(int i=0; i<number;i++){
        System.out.print("*");
        // call the print command n times
        // in the end print a line break with the comand
        // System.out.println("");
        }
        
    }

    public static void printSpaces(int number) {
        for(int i=0; i<number;i++){
        System.out.print(" ");
        // call the print command n times
        // in the end print a line break with the comand
        // System.out.println("");
        }
        
    }

    public static void Tringle(int number) {
        int b=number*(-1);
        int x=1;
        for(int i=number; i>=b;i--){
        if (x>number) {
            break;
        }
            printSpaces(i);
            printStars(x);
        System.out.println();
        // call the print command n times
        // in the end print a line break with the comand
        // System.out.println("");
        x++;
        
        }
        
    }

    public static void Square(int number) {
        for(int i=0; i<number;i++){
        printStars(number);
        System.out.println();
        // call the print command n times
        // in the end print a line break with the comand
        // System.out.println("");
        }
        
    }

    public static void rectangle(int number, int hight) {
        for(int i=0; i<hight;i++){
        printStars(number);
        System.out.println();
      
        }
        
    }
    
}
