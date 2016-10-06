package talab;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final App app = new App();

        for (int i = 0; i < 10; i++) {
            final int value = scanner.nextInt();
            System.out.println(value);

            new Thread()
            {
                public void run() {
                    try {
                        System.out.println(app.factorial(value));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();

        }
    }

    public double factorial(int number) throws InterruptedException {
        double fact = 1.0;
        for (int i = 2; i <= number; i++) {
            fact *= i;
            Thread.sleep(1000);
        }
        return fact;
    }
}
