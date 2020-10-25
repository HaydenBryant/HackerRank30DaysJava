import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        int iterations = in.nextInt();

        for(int i = iterations; i > 0; i--){
            int possPrime = in.nextInt();
            if(possPrime == 1){
                System.out.println("Not prime");
                continue;
            }
            if(possPrime == 2 || possPrime == 3){
                System.out.println("Prime");

                continue;
            }
            if(possPrime % 2 == 0){
                System.out.println("Not prime");
                continue;
            }
            Boolean isPrime = true;
            for(long j = Math.round(Math.sqrt(possPrime)); j > 2; j--){
                if(possPrime % j == 0){
                    System.out.println("Not prime");
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == false){
                continue;
            }
            System.out.println("Prime");
        }
    }
}