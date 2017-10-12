/**
 * Created by Серов on 12.10.2017.
 */
import java.util.*;
import java.lang.Math;

public class Fibona4i {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println(FibArray(n));
    }

    static int FibArray(int number) {
        int [] F = new int[number+1];
        int last = 0;
        if (number <= 1) {
            return F[number]=number;
        } else {
            for (int i = 2; i<F.length; i++) {
                F[0]= 0; F[1]= 1;
                F[i]= ((F[i-1])%10+(F[i-2]%10))%10;
            }
        }
        return F[number];
    }
}
