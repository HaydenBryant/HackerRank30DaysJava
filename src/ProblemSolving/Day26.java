package ProblemSolving;

import java.util.ArrayList;
import java.util.Scanner;

public class Day26 {

    public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner in = new Scanner(System.in);
            ArrayList<Integer> returnedDate = new ArrayList<>();
            ArrayList<Integer> dueDate = new ArrayList<>();
            int hackos = 0;

            for (int i = 0; i < 3; i++) {
                returnedDate.add(in.nextInt());
            }
            for (int i = 0; i < 3; i++) {
                dueDate.add(in.nextInt());
            }

            if (returnedDate.get(2) >= dueDate.get(2)) {
                if (returnedDate.get(2) > dueDate.get(2)) {
                    hackos = 10000;
                }

                if (returnedDate.get(1) > dueDate.get(1) && hackos == 0) {
                    hackos = (500 * (returnedDate.get(1) - dueDate.get(1)));
                }

                if (returnedDate.get(0) > dueDate.get(0) && hackos == 0) {
                    hackos = (15 * (returnedDate.get(0) - dueDate.get(0)));
                }
            }

            System.out.println(hackos);
        }

    }

}
