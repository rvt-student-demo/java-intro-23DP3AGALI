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

    public static void Tringle(int number) {
        for(int i=0; i<number;i++){
        printStars(i);
        System.out.println();
        // call the print command n times
        // in the end print a line break with the comand
        // System.out.println("");
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
