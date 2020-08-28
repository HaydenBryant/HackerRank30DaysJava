import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the riddle function below.
    static long[] riddle(long[] arr) {
        // complete this function
        long[] minMax = new long[arr.length];

        HashMap<Long, ArrayList<Long>> map = new HashMap<Long, ArrayList<Long>>();
        Array<Long> array = arr;
        long length = arr.length;

        for(int i = 0; i < length; i++){
            map.put((length - i), new ArrayList<Long>());
        }

        for(int i = 0; i < length; i++){

            for(int j = 0; j < array.length; j++){

                if(map.get(j) == null){
                    ArrayList<Long> list = new ArrayList<Long>();
                } else {
                    ArrayList<Long> list = map.get(stack.size() - j);
                }

                if(array[i + 1] != null){

                }
            }

        }

        return minMax;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long[] arr = new long[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            long arrItem = Long.parseLong(arrItems[i]);
            arr[i] = arrItem;
        }

        long[] res = riddle(arr);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
