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

        HashMap<long, ArrayList<long>> map = new HashMap<long, ArrayList<long>>();

        long length = arr.length;

        long saved = 0;
        for(long i = 0; i < length; i++){
            if(itemsList == null) {
                map = new ArrayList<Item>();
                map.add(myItem);
                map.put(mapKey, itemsList);
            } else {
                // add if item is not already in list
                if(!itemsList.contains(myItem)) itemsList.add(myItem);
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
