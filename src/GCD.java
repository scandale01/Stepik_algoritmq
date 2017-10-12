/**
 * Created by Серов on 12.10.2017.
 */
import java.util.*;


public class GCD
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter 2 values");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(CalculationEvklid(a,b));


    }
    static int CalculationEvklid (int a, int b) {
        int value = 0;

        if (a == 0) {
            value = b;}
        else if (b == 0) {
            value = a;}
        else if (a >= b) {
            return CalculationEvklid (a%b, b);}
        else if (b >= a) {
            return CalculationEvklid (a, b%a);}
        return value;
    }

}
