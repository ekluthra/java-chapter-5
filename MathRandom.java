/*Math.random picks a random number between 0 and 1.0*/
import java.lang.Math; 

public class MathRandom {
    public static void main(String[] args) { 
        
        System.out.format("First number: %f\n", Math.random());
        System.out.format("Second number: %f\n", Math.random());
        System.out.format("Third number: %f\n", Math.random());
        System.out.format("Fourth number: %f\n", Math.random());
        System.out.format("Fifth number: %f\n", Math.random());
        System.out.format("Sixth number: %f\n", Math.random());
        
        //random numbers in a certain range (doubles/floats): (highnum - lownum + 1) * Math.random() + lownum
        
        System.out.format("Random between 5 and 10: %f\n", (10 - 5 +1)*Math.random() + 5);
        System.out.format("Random between 5 and 10: %f\n", (6)*Math.random() + 5);
    }
}
