import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 1;


        do {

            System.out.println("Press  1 to convert a shekels to dollars");

            System.out.println("Press  2 to convert a dollars to shekels");

            System.out.println("Press  3 to convert a euro to shekels");

            System.out.println("Press  4 to convert a shekels to euros");

            System.out.println("press 0 to exit");


            number = scanner.nextInt();


            double amoutType;

            switch (number) {

                case 1:

                    System.out.println("An amount must be entered in dollars");

                    amoutType = scanner.nextFloat();

                    amoutType = (amoutType * 3.5260);//סכום בדולרים

                    System.out.println(amoutType);

                    break;

                case 2:

                    System.out.println("An amount in shekels must be entered");

                    amoutType = scanner.nextFloat();

                    amoutType = (amoutType / 3.5260);//סכום בשקלים

                    System.out.println(amoutType);

                    break;

                case 3:

                    System.out.println("An amount must be entered in Euros");

                    amoutType = scanner.nextFloat();

                    amoutType = (amoutType * 3.6850);//סכום יורו

                    System.out.println(amoutType);

                    break;

                case 4:

                    System.out.println("An amount must be entered in Euros");

                    amoutType = scanner.nextFloat();

                    amoutType = (amoutType / 3.6850);//סכום יורו

                    System.out.println(amoutType);

                    break;

                default:

                    System.out.println("None Valid Number");

                    break;

            }

        } while (number !=0);

}

}


