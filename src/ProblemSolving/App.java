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
        // List<Long> minMax = new ArrayList<>();
        long[] minMax = new long[arr.length];

        // minMax.add(Collections.max(Arrays.asList(arr)));

        // long max = Arrays.stream(arr)
        //     .max()
        //     .getAsLong();

        // minMax[0] = max;

        List<Long> minimums = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            long current = arr[i];
            for(int j = 0; j < i + 1; j++){
                if(arr[j] < current){
                    current = arr[j];
                }
                if(j + 1 == i + 1){
                    minimums.add(current);
                }
            }
            long maxMin = Collections.min(minimums);
            minMax[i] = maxMin;

        }
        // long[] itemsArray = new long[arr.length];
        // itemsArray = minMax.toArray(itemsArray);

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