import java.util.Random;
import java.lang.Math;

public class RandomClass {

    public static void main(String[] args) {
        
//50 is the max (inclusive, in this case only though) value and 1 is the min (inclusive) (Random x = new Random(), then int n = rand.nextInt(50)+1)
        Random rand = new Random();
        int i = rand.nextInt(50)+1;
        System.out.println(i); 

//50 is the max (inclusive) value and 1 is the min (inclusive) 
//typecasting is done because the math class picks a random number from 0.0 to 1.0
        int b = (int)(Math.random() * 50 + 1);
        System.out.println(b);
        
//this is just a differnt way of typing out the previous program  
//this way, your min number doesnt have to be 1 (int n = (int)(max-min+1)*Math.random()+min)
        int d = (int)((50-1+1)*Math.random()+1);
        System.out.println(d);
        
//same thing but for doubles
        double f = Math.random() * 49 + 1;
        System.out.println(f);
    }
}
