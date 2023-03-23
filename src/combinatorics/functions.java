package combinatorics;

public class functions {
    public static  int factorial(int number){
        if (number<0){
            return -1;
        }
        else if (number==0){
            return 1;
        }
        else {
            return number*factorial(number-1);
        }
    }

    public static void menu(){
        System.out.println("Welcome to the combinatorics calculator. Choose an option to continue" +
                "\n1.\tPermutation\n2.\tCombination\n3.\tExit");
    }
    public static void input(){
        System.out.println("Enter n and r");
    }
    public static int permutation(int x,int y){
        return factorial(x)/(factorial(x-y));
    }
    public static int combination(int x,int y){

        return factorial(x) / (factorial(y)*factorial(x-y));
    }
}
