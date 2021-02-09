package ProblemSolving;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import java.io.*;
import java.util.*;

public class Day18 {


    public class Solution {
        // Write your code here.
        Stack<Character> stack = new Stack<Character>();
        Queue<Character> queue = new LinkedList<Character>();
        void pushCharacter(char ch)
        {
            stack.push(ch);
        }
        void enqueueCharacter(char ch){
            queue.add(ch);
        }
        char popCharacter() {
            return stack.pop();
        }

        char dequeueCharacter()
        {
            return queue.remove();
        }

        public static void main(String[] args) {
}
