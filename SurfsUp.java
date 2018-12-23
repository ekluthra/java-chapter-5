import java.util.Scanner;

public class SurfsUp {
    public static void main(String[] args) { 
        
        int waveHeight;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("What is the height of the waves?");
        waveHeight = scan.nextInt();
        
        if (waveHeight >= 6){
            System.out.println("Great day for surfing!");
        } 
        else if (waveHeight <= 3 && waveHeight >= 0)  {
            System.out.println("Go body boarding!");
        }
        else{
            System.out.println("What kind of surf is that?");
        }
        
        scan.close();
    }
}
