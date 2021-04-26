import java.util.Scanner;

public class Calculations {

    public void fixedMultiplicationTable() {

        int a;
        int b;
        for (a = 1; a <= 10; a++) {
            for (b = 1; b <= 10; b++) {
                System.out.print(a * b + " ");
            }
            System.out.println();
        }
    }
    public void multiplicationTable() {

        Scanner input = new Scanner(System.in);

        System.out.println("Which number would you like to multiply? Write here:     ");
        int number = input.nextInt();

        System.out.println("How many time would you like to multiply this number? Write here:  ");
        int numberTimes = input.nextInt();
        int i = 1;

        while (i <= numberTimes) {
            i++;
            System.out.printf("%d * %d = %d \n", number, i, number * i);
        }
    }
}


