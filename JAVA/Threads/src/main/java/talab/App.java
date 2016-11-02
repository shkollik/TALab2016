package talab;

import java.io.InputStream;
import java.util.Scanner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            final int value = scanner.nextInt();

            new Thread(new Runnable() {
                public void run() {
                    try {
                        double fact = factorial(value);
                        synchronized (System.out){
                            System.out.print("Factorial of number " + value);
                            System.out.println("result is " + fact);
                        }

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                }
            }).start();

        }
    }

    public static double   factorial(int number) throws InterruptedException {
        double fact = 1.0;
        for (int i = 2; i <= number; i++) {
            fact *= i;
            Thread.sleep(200);
        }
        return fact;
    }
}
