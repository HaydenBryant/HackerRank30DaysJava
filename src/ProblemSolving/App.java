import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isValid function below.
    static String isValid(String s) {
        HashMap<String, Integer> letterFreq = new HashMap<String, Integer>();

        String[] arr = s.split("");

        for(String letter : arr){
            if(!letterFreq.containsKey(letter)){
                letterFreq.put(letter, 1);
            } else {
                letterFreq.put(letter, letterFreq.get(letter) + 1);
            }
        }

        int last = 0;
        int edit = 0;
        for(String letter : letterFreq.keySet()){
            int v = letterFreq.get(letter);
            if(last == 0){
                last = v;
                continue;
            }
            if(v == last){
                continue;
            }

            if(edit == 0 && (v - 1 == last || v - 1 == 0)){
                edit++;
                continue;
            }

            if(edit == 0 && (last - 1 == v || last - 1 == 0)){
                edit++;
                last = v;
                continue;
            }

            return "NO";
        }

        // for(String letter : letterFreq.keySet()){
        //     System.out.println(letter + " " + letterFreq.get(letter));
        // }

        return "YES";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
