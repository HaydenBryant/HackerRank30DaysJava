package ProblemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day28 {
    import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

    public class Solution {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();

            String emailRegEx = "[a-z]+@gmail\\.com$";
            Pattern pattern = Pattern.compile(emailRegEx);

            List<String> list = new ArrayList();

            for (int i = 0; i < num; i++){
                String name = scanner.next();
                String email = scanner.next();
                Matcher matcher = pattern.matcher(email);
                if (matcher.find()){
                    list.add(name);
                }
            }

            Collections.sort(list);
            for (String name : list){
                System.out.println(name);
            }
        }
    }

}
