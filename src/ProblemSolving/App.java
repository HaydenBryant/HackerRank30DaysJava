import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        int iterations = in.nextInt();

        for(int i = iterations; i > 0; i--){
            int possPrime = in.nextInt();
            if(possPrime == 1 || possPrime == 2 || possPrime == 3){
                System.out.println("Prime");
                continue;
            }
            if((possPrime - 1) != -1 % possPrime ||
                    (possPrime - 1) != (possPrime-1) % possPrime){
                System.out.println("Prime");
                continue;
            }
            System.out.println("Not prime");
        }
    }
}