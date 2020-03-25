package day1;

import java.util.Scanner;

public class CounterBackFromScanner {
    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter timer start in Minute");
        int time = scan.nextInt();

        for (int i = time - 1; i >= 0; i--) {
            for (int j = 59; j >= 0; j--) {
                if (j < 10)
                    System.out.print(i + ":0" + j + " left");
                else
                    System.out.print(i + ":" + j + " left");
                Thread.sleep(1000);
                System.out.println();
            }
        }
    }
}
