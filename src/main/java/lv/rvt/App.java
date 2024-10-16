package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
public class App 
{
   
    
   public static void main(String[] args) {
    ArrayList<String> wordList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    
    while(true){
      String sk = scanner.nextLine();
      wordList.add(sk);
      if(sk == ""){
        break;
      }
    }

    System.out.println(wordList.get(2));
    


  }
        
        

    
}