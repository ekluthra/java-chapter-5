import java.util.Scanner;

public class SwitchCase { 
    public static void main(String[] args) { 
        
        int category;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("What category is the hurricane?");
        category = scan.nextInt();
        
        //if you don't type "break;", it executes the next case
        switch(category){
            case 1:
                System.out.println("Category 1: 74-95 mph");
                break;
            case 2:
                System.out.println("Category 2: 96-110 mph");
                break;
            case 3: 
                System.out.println("Cateory 3: 111-130 mph");
                break;
            case 4: 
                System.out.println("Category 4: 131-155 mph");
                break;
            case 5: 
                System.out.println("Category 5: >155 mph");
                break;
            default:
                System.out.println("That's not a valid category");
                break;
        }
        scan.close();
    }
}
