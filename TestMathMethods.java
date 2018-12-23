import java.lang.Math;
import java.text.DecimalFormat;

public class TestMathMethods{
    public static void main (String[] args){
        
        DecimalFormat formatter = new DecimalFormat("#0.0");
        
        int posNum = 12;
        int negNum = -12;
        int square = 49;
        int num1 = 2;
        int num2 = 6;
        
        //Math.abs can take an int or a double
        System.out.format("The absolute value of %d is %d\n", posNum, Math.abs(posNum));
        System.out.format("The absolute value of %d is %d\n", negNum, Math.abs(negNum));
        
        //the output of Math.pow is a double, it automatically converts the inputs to doubles as well
        //I wrote %s on the last one because DecimalFormat turns the double into a string 
        System.out.format("%d raised to the exponent of %d is %s\n", num1, num2, formatter.format(Math.pow(num1,num2)));
        
        //agian, the DecimalFormat class turns it into a string, hence the %s
        System.out.format("The square root of %d is %s\n", square, formatter.format(Math.sqrt(square)));
    }
}