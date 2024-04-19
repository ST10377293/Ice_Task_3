/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ice_task_3;

/**
 *
 * @author uthac
 */
public class Main {

       public static void main(String[] args) {

        //Question 1:
        String case1 = "{}{)}";
        String case2 = "";
        String case3 = "{[}]";
        String case4 = "()";
        String case5 = "({[]})";

        System.out.println(case1 + " - " + (isValid(case1) ? "valid" : "invalid"));
        System.out.println(case2 + " - " + (isValid(case2) ? "valid" : "invalid"));
        System.out.println(case3 + " - " + (isValid(case3) ? "valid" : "invalid"));
        System.out.println(case4 + " - " + (isValid(case4) ? "valid" : "invalid"));
        System.out.println(case5 + " - " + (isValid(case5) ? "valid" : "invalid"));

        //Question 2
        int limit = 10;
        System.out.println("Sum of square of odd numbers" + odd_squares_sum(limit));

        //Question 3
        int a = 10;
        int b = 15;
        int value = greatest_common_divisor(a, b);
        System.out.println(value);
    }

    public static boolean isValid(String s) {
        int i = -1;
        boolean bracketsFound = false; // Flag to track if any brackets are found
        StringBuilder sb = new StringBuilder(s);

        for (int j = 0; j < sb.length(); j++) {
            char ch = sb.charAt(j);
            if (ch == '(' || ch == '{' || ch == '[') {
                bracketsFound = true; // Set flag to true if any bracket is found
                sb.setCharAt(++i, ch);
            } else {
                if (i >= 0 && ((sb.charAt(i) == '(' && ch == ')') || (sb.charAt(i) == '{' && ch == '}') || (sb.charAt(i) == '[' && ch == ']'))) {
                    i--;
                } else {
                    return false;
                }
            }
        }
        // Return false if no brackets are found
        return bracketsFound && i == -1;
    }


    public static double odd_squares_sum(int limit){
        double sum = 0;
        for (int i = 0; i < limit; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static int greatest_common_divisor(int a, int b){
        if(a < b){
            int temp = a;
            a = b;
            b = temp;
        }

        while (b != 0){
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }
    
}
