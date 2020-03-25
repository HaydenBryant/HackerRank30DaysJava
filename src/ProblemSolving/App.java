import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        if(s.contains("AM"))
        {
            String[] arr = s.substring(0, 8).split(":", 2);
            if(arr[0].contains("12")){
                arr[0] = "00";
            }
            return(arr[0]+":"+arr[1]);
        } else{
            String[] arr = s.substring(0, 8).split(":", 2);
            if(arr[0].contains("12")){
                return(arr[0]+":"+arr[1]);
            }
            int hour = Integer.parseInt(arr[0]);
            hour += 12;
            return(hour+":"+arr[1]);
        }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
