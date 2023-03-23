package combinatorics;

import java.util.Scanner;

import static combinatorics.functions.*;

public class Main {
    public static void main(String[] args) {
        int choice,n,r;
        Scanner scan =new Scanner(System.in);
        while (true){
            menu();
            try {
                choice=scan.nextInt();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            switch (choice){
                case 1:
                    input();
                    n=scan.nextInt();
                    r=scan.nextInt();
                    System.out.println(permutation(n,r));
                    break;
                case 2:
                    input();
                    n=scan.nextInt();
                    r=scan.nextInt();
                    System.out.println(combination(n,r));
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Wrong choice, please try again");
            }
        }
    }
}
