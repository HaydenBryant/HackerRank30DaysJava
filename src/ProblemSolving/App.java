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
        Stack<Long> stack = new Stack<Long>();
        long length = arr.length;

        for(int i = 0; i < length; i++){
            map.put(i, new ArrayList<Long>());
            stack.push(arr[i]);
        }

        for(int i = 0; i < length; i++){
            long curr = stack.pop();
            for(int j = i; j >= 0; j--){
                if(j == 0){
                    addToList(j, curr);
                    return;
                }

                long lastMin = findLastMin(j-1);
                long min = findMin(curr, lastMin);
                addToList(j, min);
            }
        }

        int i = 0;
        for(int key : map.keySet()){
            long max = Collections.max(map.get(key));
            minMax[i] = max;
            i++;
        }

        return minMax;



    }

    public static ArrayList<Long> addToList(ArrayList<Long> list, long num){
        ArrayList<Long> list = list;

        list.add(num);

        return;
    }

    public static long findLastMin(HashMap map, long key){
        ArrayList<Long> list = map.get(key);

        long lastMin = list.get(list.size());

        return lastMin;
    }

    public static long findMin(long curr, long lastMin){
        if(curr < lastMin){
            return curr;
        }

        return lastMin;
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
