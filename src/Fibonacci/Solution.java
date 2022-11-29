package Fibonacci;

import java.util.Scanner;

class Solution {
    public int fib(int n) {
        if (n == 0)
            return 0;

        int firstNumber = 0;
        int secondNumber = 1;

        while (n > 1) {
            int tempNumber = secondNumber;
            secondNumber = secondNumber + firstNumber;
            firstNumber = tempNumber;
            n--;
        }
        return secondNumber;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Solution solution = new Solution();
        solution.fib(num);
        System.out.println(solution.fib(num));
    }
}