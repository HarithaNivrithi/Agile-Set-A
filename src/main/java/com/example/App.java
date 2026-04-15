package com.example;

public class App {
    
    public static void main(String[] args) {
        int num = 1234;

        System.out.println("Number: " + num);
        System.out.println("Even or Odd: " + (num % 2 == 0 ? "Even" : "Odd"));
        System.out.println("Sum of digits: " + sumOfDigits(num));
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}