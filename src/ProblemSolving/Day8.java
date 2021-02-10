package ProblemSolving;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 {
    class Solution{
        public static void main(String []argh){
            Map<String, Integer> phoneBook = new HashMap<String, Integer>();

            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for(int i = 0; i < n; i++){
                String name = in.next();
                int phone = in.nextInt();
                // Write code here
                phoneBook.put(name, phone);
            }
            while(in.hasNext()){
                String s = in.next();
                // Write code here
                Integer number = phoneBook.get(s);
                if(number != null)
                {
                    System.out.println(s + "=" + number);
                }
                else
                {
                    System.out.println("Not found");
                }
            }
            in.close();
        }
    }
}
