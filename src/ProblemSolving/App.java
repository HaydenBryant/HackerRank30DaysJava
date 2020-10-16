import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        int iterations = in.nextInt();
        ArrayList<Integer> primes = new ArrayList<Integer>();

        for(int i = iterations; i > 0; i--){
            int possPrime = in.nextInt();
            if(possPrime == 1 || possPrime == 2 || possPrime == 3){
                System.out.println("Prime");
                continue;
            }
            if(possPrime % 2 != 0){
                for(int prime : primes){
                    if(possPrime % prime == 0){
                        System.out.println("Not prime");
                        break;
                    }
                }
                System.out.println("Prime");
                primes.add(possPrime);
                continue;
            }
            System.out.println("Not prime");
        }
    }
}